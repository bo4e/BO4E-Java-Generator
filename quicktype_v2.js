const {JSONSchemaInput, FetchingJSONSchemaStore, InputData, quicktypeMultiFile, SerializedRenderResult,
    javaOptions, JavaTargetLanguage, getOptionValues, JavaRenderer} = require("quicktype-core");
const fs = require("node:fs");
const {BooleanOption, StringOption} = require("quicktype-core/dist/RendererOptions");
const {JacksonRenderer} = require("quicktype-core/dist/language/Java");
const {acronymOption, AcronymStyleOptions} = require("quicktype-core/dist/support/Acronyms");

const packageName = "com.example.";
const targetDirName = "bo4e";
const sourceDirName = "bo4e_schemas";
const currentVersion = "202401.0.0";
const newJavaOptions = {
    useList: javaOptions.useList,
    justTypes: new BooleanOption("just-types", "Plain types only", true),
    dateTimeProvider: javaOptions.dateTimeProvider,
    acronymStyle: acronymOption(AcronymStyleOptions.Original),
    packageName: new StringOption("package", "Generated package name", "NAME", "placeholder"),
    lombok: javaOptions.lombok,
    lombokCopyAnnotations: javaOptions.lombokCopyAnnotations
}
const dirToClass = new Map([
    ["bo", "Geschaeftsobjekt"],
    ["com", "COM"]
]);

class GenerationFile {
    name;
    javaFile;
    jsonFile;
    sourceDirPath;
    targetDirPath;
    sourceFilePath;
    targetFilePath;
    dirname;
    schema;
    content;

    /**
     *
     * @param name {string}
     * @param source {string}
     * @param target {string}
     * @param schema {string}
     */
    constructor(name, source, target, schema) {
        this.name = name.replace(".json", "").replace(".java", "");
        this.javaFile = this.name + ".java";
        this.jsonFile = this.name + ".json";
        this.sourceDirPath = source.replace(`/${this.jsonFile}`, "");
        this.targetDirPath = target.replace(`/${this.javaFile}`, "");
        this.sourceFilePath = `${this.sourceDirPath}/${this.jsonFile}`;
        this.targetFilePath = `${this.targetDirPath}/${this.javaFile}`;
        this.dirname = this.targetDirPath.substring(this.targetDirPath.lastIndexOf("/") + 1);
        this.schema = schema;
        this.content = [];
    }

    /**
     *
     * @param fileMap {Map<string, GenerationFile>}
     */
    cleanUpContent(fileMap) {
        let lines = this.content;
        if (dirToClass.has(this.dirname)) {
            if (dirToClass.get(this.dirname) === this.name) {
                lines = this.cleanUpBaseClas();
            } else {
                lines = this.cleanUpClass();
            }
        }
        const importLines = [];
        for (let i = 0; i < lines.length; i++) {
            if (lines[i].startsWith("package ")) {
                lines[i] = `package ${packageName}${this.targetDirPath.replace("generatedCode/", "").replace("/", ".")};`;
                continue;
            }
            if (lines[i].includes("setTyp")) {
                lines.splice(i, 1, "#");
                continue;
            }
            if (lines[i].includes("StringOderNummer")) {
                lines[i] = lines[i].replace("StringOderNummer", "String");
            }
            if (lines[i].includes("private ")) {
                const words = lines[i].trim().split(" ").filter(value => value !== "");
                const type = words[1].replace("[]", "");
                const property = words[2].replace(";", "");
                if (lines[i] !== "#" && property !== "_id" && property !== "String" && property !== "typ") {
                    // change property names to fit schema
                    const propertyName = this.getPropertyName(property);
                    lines[i] = lines[i].replace(` ${property};`, ` ${propertyName};`);
                    const getterIndex = lines.findIndex(value => value.toLowerCase().includes(`get${property.toLowerCase()}`));
                    if (getterIndex >= 0) {
                        lines[getterIndex] = lines[getterIndex].replace(`return ${property};`, `return ${propertyName};`);
                        lines[getterIndex + 1] = lines[getterIndex + 1].replace(`this.${property} = value;`, `this.${propertyName} = value;`);
                    } else {
                        console.error(`could not find get${property.toLowerCase()}`);
                    }
                }
                if (type !== "ZusatzAttribut" || (dirToClass.has(this.dirname) && dirToClass.get(this.dirname) === this.name)) {
                    if (type === "Typ") {
                        // add default value to property Typ
                        const fileContent = fs
                            .readFileSync(this.sourceFilePath, "utf-8")
                            .replaceAll(" ", "")
                            .split("\n");
                        const fileTyp = fileContent
                            .slice(fileContent.findIndex(value => value.includes("_typ")))
                            .find(value => value.includes("default"))
                            .replaceAll("\"", "")
                            .replace("default:", "");
                        lines[i] = lines[i].replace("private", "private final").replace(";", " = Typ." + fileTyp + ";")
                    }
                    // add import statements
                    const typeFile = fileMap.get(type.toLowerCase());
                    if (typeFile && typeFile.dirname !== this.dirname) {
                        const importLine = `import ${packageName}${typeFile.targetDirPath.replace("generatedCode/","").replaceAll("/", ".")}.${type};`;
                        if (!importLines.includes(importLine)) {
                            importLines.push(importLine);
                        }
                    }
                }
            }
        }
        const newLines = lines.filter(value => value !== "#");
        if (importLines.length > 0) {
            if (!lines[2].startsWith("import ")) {
                newLines.splice(2, 0, importLines.join("\n"), "");
            } else {
                newLines.splice(2, 0, importLines.join("\n"));
            }
        }
        this.content = newLines;
    }

    cleanUpClass() {
        const lines = this.content;
        for (let i = 0; i < lines.length; i++) {
            if (lines[i].startsWith("public class")) {
                const parent = dirToClass.get(this.dirname);
                const ownVersionProperty = lines.slice(i, i + 4).findIndex(value => value.includes("private String version")) === -1;
                if (!ownVersionProperty) {
                    lines[lines.findIndex(value => value.includes("private String version"))] = "#";
                    const lineIndex = lines.findIndex(value => value.includes("getVersion"));
                    lines.splice(lineIndex, 2, "#", "#");
                    if (lines[lineIndex + 2] === "") {
                        lines[lineIndex + 2] = "#";
                    }
                }
                lines[i] = lines[i].substring(0, lines[i].length - 1) + "extends " + parent + " {";
            } else if (lines[i].includes("getid") || lines[i].includes("getZusatzAttribute")) {
                lines.splice(i, 2, "#", "#");
                if (lines[i + 2] === "") {
                    lines[i + 2] = "#";
                }
            } else if (lines[i].includes("private ZusatzAttribut")
                || lines[i].includes("private String id")) {
                lines.splice(i, 1, "#");
            }
        }
        return lines;
    }

    cleanUpBaseClas() {
        const lines = this.content;
        for (let i = 0; i < lines.length; i++) {
            if (lines[i].includes("setVersion")) {
                lines.splice(i, 1, "#");
                continue;
            }
            lines[i] = lines[i]
                .replace(" version", " _version")
                .replace("private String _version;", "private final String _version = \"" + currentVersion + "\";")
                .replace(" id", " _id")
                .replace("this.id", "this._id")
                .replace("public class", "public abstract class")
                .replace("getid", "getId")
                .replace("setid", "setId")
                .replace("getVersion", "getSchemaVersion");
        }
        return lines;
    }

    getPropertyName(property) {
        const content = fs.readFileSync(this.sourceFilePath, "utf-8").replaceAll(" ", "").split("\n");
        const line = content.find(value => value.toLowerCase() === `\"${property.toLowerCase()}\":{`);
        if (line) {
            return line.substring(1, line.length - 3);
        } else {
            console.error("property " + property + " not found");
            return property;
        }
    }
}

class NewJavaTargetLanguage extends JavaTargetLanguage {
    constructor() {
        super();
    }

    getOptions() {
        return [
            newJavaOptions.useList,
            newJavaOptions.justTypes,
            newJavaOptions.dateTimeProvider,
            newJavaOptions.acronymStyle,
            newJavaOptions.packageName,
            newJavaOptions.lombok,
            newJavaOptions.lombokCopyAnnotations
        ];
    }

    makeRenderer(renderContext, untypedOptionValues) {
        const options = getOptionValues(newJavaOptions, untypedOptionValues);
        if (options.justTypes) {
            return new JavaRenderer(this, renderContext, options);
        }
        return new JacksonRenderer(this, renderContext, options);
    }
}

/**
 *
 * @param generationFile {GenerationFile}
 * @returns {Promise<ReadonlyMap<string, SerializedRenderResult>>}
 */
async function generateClasses(generationFile) {
    const schemaInput = new JSONSchemaInput(new FetchingJSONSchemaStore());
    schemaInput.addSourceSync({name: "StringOderNummer", schema: fs.readFileSync("resource_schemas/StringOderNummerTyp.json", "utf-8")});
    schemaInput.addSourceSync({ name: generationFile.name, schema: generationFile.schema});
    const inputData = new InputData();
    inputData.addInput(schemaInput);
    return await quicktypeMultiFile({
        inputData,
        lang: new NewJavaTargetLanguage()
    });
}

/**
 *
 * @param fileMap {Map<string, GenerationFile>}
 * @returns {Promise<void>}
 */
async function generateFromFileMap(fileMap) {
    console.log("Generating:");
    let counter = 0;
    for (const generationFile of fileMap.values()) {
        const classMap = await generateClasses(generationFile);
        const javaClass = classMap.get(generationFile.javaFile);
        if (javaClass) {
            generationFile.content = javaClass.lines;
            generationFile.cleanUpContent(fileMap);
            if (!fs.existsSync(generationFile.targetDirPath)) {
                fs.mkdirSync(generationFile.targetDirPath, {recursive: true});
            }
            fs.writeFileSync(generationFile.targetFilePath, generationFile.content.join("\n"));
            counter++;
            console.log("# " + counter + ":\t" + generationFile.name);
        } else {
            console.error("Could not find " + generationFile.name);
        }
    }
    const output = `Finished: ${counter}/${fileMap.size}`;
    const separator = output.replaceAll(RegExp(".", "g"), "-");
    console.log(`\n${separator}\n${output}\n${separator}`);
}

/**
 *
 * @param source {string}
 * @param target {string}
 * @param fileMap {Map<string, GenerationFile>}
 * @returns {Map<string, GenerationFile>}
 */
function generateFileMap(source, target, fileMap = new Map) {
    const files = fs.readdirSync(source);
    for (const file of files) {
        const path = source + '/' + file;
        if (fs.statSync(path).isFile()) {
            const schema = fs.readFileSync(path, "utf-8");
            const generationFile = new GenerationFile(file, path, target, schema);
            fileMap.set(file.replace(".json", "").toLowerCase(), generationFile);
        } else {
            let targetPath = `${target}/${file}`;
            if (file === "enum") {
                targetPath += "s";
            }
            fileMap = generateFileMap(path, targetPath, fileMap);
        }
    }
    return fileMap;
}

function main(source = sourceDirName, target = "generatedCode/" + targetDirName) {
    const fileMap = generateFileMap(source, target);
    generateFromFileMap(fileMap).then();
}

main();
