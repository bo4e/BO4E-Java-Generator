const {JSONSchemaInput, FetchingJSONSchemaStore, InputData, quicktypeMultiFile, SerializedRenderResult,
    javaOptions, JavaTargetLanguage, getOptionValues, JavaRenderer} = require("quicktype-core");
const fs = require("node:fs");
const {BooleanOption, StringOption} = require("quicktype-core/dist/RendererOptions");
const {JacksonRenderer} = require("quicktype-core/dist/language/Java");
const {acronymOption, AcronymStyleOptions} = require("quicktype-core/dist/support/Acronyms");

const packageName = "com.example";
const targetDirName = "bo4e";
const sourceDirName = "bo4e_schemas";
const currentVersion = "202401.0.0";
const newJavaOptions = {
    useList: javaOptions.useList,
    justTypes: new BooleanOption("just-types", "Plain types only", true),
    dateTimeProvider: javaOptions.dateTimeProvider,
    acronymStyle: acronymOption(AcronymStyleOptions.Original),
    packageName: new StringOption("package", "Generated package name", "NAME", packageName + "." + targetDirName),
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

    cleanUpContent() {
        let lines = this.content;
        if (dirToClass.has(this.dirname)) {
            if (dirToClass.get(this.dirname) === this.name) {
                lines = this.cleanUpBaseClas();
            } else {
                lines = this.cleanUpClass();
            }
        }
        for (let i = 0; i < lines.length; i++) {
            if (lines[i].startsWith("package ")) {
                lines[i] = `package ${packageName}.${this.targetDirPath.replace("/", ".")};`;
                continue;
            }
        }
    }

    cleanUpClass() {
        const lines = this.content;
        for (let i = 0; i < lines.length; i++) {

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

function generateConverter(target) {
    const schemaInput = new JSONSchemaInput(new FetchingJSONSchemaStore());
    schemaInput.addSourceSync({name: "StringOderNummer", schema: fs.readFileSync("resource_schemas/StringOderNummerTyp.json", "utf-8")});
    const inputData = new InputData();
    inputData.addInput(schemaInput);

    quicktypeMultiFile({
        inputData,
        lang: new NewJavaTargetLanguage(),
        allPropertiesOptional: true
    }).then(javaClasses => {
        javaClasses.forEach((javaClass, className) => {
            if (className !== "StringOderNummer.java") {
                fs.writeFileSync(target + "/" + className, javaClass.lines.join("\n"));
            }
        });
    });
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
    for (const generationFile of fileMap.values()) {
        const classMap = await generateClasses(generationFile);
        const javaClass = classMap.get(generationFile.javaFile);
        if (javaClass) {
            generationFile.content = javaClass.lines;
            console.log(generationFile.name + " generated");
        } else {
            console.error("Could not find " + generationFile.name);
        }
    }
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

function main(source = sourceDirName, target = targetDirName) {
    const fileMap = generateFileMap(source, target);
    generateFromFileMap(fileMap).then(() => {
        fileMap.forEach(generationFile => {

        });
    });
}

function output(counter, source, target) {
    const boCount = fs.readdirSync(source + "/bo").length;
    const comCount = fs.readdirSync(source + "/com").length;
    const enumCount = fs.readdirSync(source + "/enum").length;
    const boCountG = fs.readdirSync(target + "/bo").length;
    const comCountG = fs.readdirSync(target + "/com").length;
    const enumCountG = fs.readdirSync(target + "/enums").length;
    console.log("\nEinzulesende Dateien: " + (fs.readdirSync(source).length - 3 + boCount + comCount + enumCount));
    console.log("Eingelesene Dateien: " + counter);
    console.log("Erstellte Dateien: " + (fs.readdirSync(target).length - 3 + boCountG + comCountG + enumCountG));
    console.log("Bo: " + boCountG + "/" + boCount);
    console.log("Com: " + comCountG + "/" + comCount);
    console.log("Enum: " + enumCountG + "/" + enumCount);
}

main("bo4e_schemas", "bo4e");
