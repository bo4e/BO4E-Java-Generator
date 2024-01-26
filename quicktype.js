const {InputData, JSONSchemaInput, FetchingJSONSchemaStore, quicktypeMultiFile, javaOptions,
    JavaTargetLanguage,
    getOptionValues,
    JavaRenderer
} = require("quicktype-core");
const fs = require("node:fs");
const {BooleanOption, StringOption} = require("quicktype-core/dist/RendererOptions");
const {JacksonRenderer} = require("quicktype-core/dist/language/Java");

const packageName = "com.example";
const targetDirName = "bo4e";
const sourceDirName = "bo4e_schemas";
const currentVersion = "202401.0.0";
const newJavaOptions = {
    useList: javaOptions.useList,
    justTypes: new BooleanOption("just-types", "Plain types only", true),
    dateTimeProvider: javaOptions.dateTimeProvider,
    acronymStyle: javaOptions.acronymStyle,
    packageName: new StringOption("package", "Generated package name", "NAME", packageName + "." + targetDirName),
    lombok: javaOptions.lombok,
    lombokCopyAnnotations: javaOptions.lombokCopyAnnotations
}
const baseclassForDir = [
    {class: "Geschaeftsobjekt", dir: "bo"},
    {class: "COM", dir: "com"}
]

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

function addProperty(allKnowingSchema, path, file) {
    const newProperty =
            "        },\n"+
            "        \"" + file.charAt(0).toLowerCase() + file.substring(1, file.length - 5) + "\": {\n" +
            "            \"anyOf\": [\n" +
            "                {\n" +
            "                    \"$ref\": \"https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v" + currentVersion + "/src/" + path + "\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"type\": \"null\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"default\": null\n";
    allKnowingSchema.push(newProperty);
    console.log("Property " + file + " added");
}

function addToSchema(allKnowingSchema, files, source) {
    const fileMap = new Map();
    for (const file of files) {
        const path = source + '/' + file;
        if (fs.statSync(path).isFile()) {
            addProperty(allKnowingSchema, path, file);
            const dirLocation = source.replace(sourceDirName, targetDirName);
            fileMap.set(file.substring(0, file.length - 5).toLowerCase(), dirLocation.replace("enum", "enums") + "/");
        } else {
            const newFiles = fs.readdirSync(path);
            addToSchema(allKnowingSchema, newFiles, path).forEach((value, key) => {
                fileMap.set(key, value);
            });
        }
    }
    return fileMap;
}

function generateAllKnowingSchema() {
    return ["{\n" +
        "  \"additionalProperties\": true,\n" +
        "  \"description\": \"Alles auf einen Blick\",\n" +
        "  \"properties\": {\n" +
        "    \"stringOderNummer\": {\n" +
        "      \"anyOf\": [\n" +
        "        {\n" +
        "          \"type\": \"number\"\n" +
        "        },\n" +
        "        {\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        {\n" +
        "          \"type\": \"null\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"default\": null,\n" +
        "      \"title\": \"StringOderNummer\"\n",
        "    }\n" +
        "  },\n" +
        "  \"title\": \"AllKnowing\",\n" +
        "  \"type\": \"object\"\n" +
        "}"]
}

function cleanUp(files, source, target, root, dirname, fileMap) {
    for (const file of files) {
        const sourcePath = source + '/' + file;
        if (fs.statSync(sourcePath).isFile()) {
            if (root !== target) {
                let fileName = file.substring(0, file.length - 5) + ".java";
                if (!fs.existsSync(root + '/' + fileName)) {
                    const targetFiles = fs.readdirSync(root);
                    fileName = targetFiles.find(value => value.substring(0, value.length - 5).toLowerCase() === file.substring(0, file.length - 5).toLowerCase());
                }
                fs.renameSync(root + '/' + fileName, target + '/' + fileName);
                let newFile = fs.readFileSync(target + '/' + fileName, "utf-8");
                newFile = newFile.replace("package " + packageName + "." + root,"package " + target.replace("/", "."));
                const lines = newFile.split("\n");
                const importLines = [];
                lines.forEach((line, index) => {
                    const classAndDir = baseclassForDir.find(value => value.dir === dirname);
                    if (classAndDir !== undefined && fileName !== classAndDir.class + ".java") {
                        if (line.startsWith("public class")) {
                            const parent = classAndDir.class;
                            const ownVersionProperty = lines.slice(index, index + 4).findIndex(value => value.includes("private String version")) === -1;
                            if (!ownVersionProperty) {
                                lines[lines.findIndex(value => value.includes("private String version"))] = "#";
                                const lineIndex = lines.findIndex(value => value.includes("getVersion"));
                                lines.splice(lineIndex, 2, "#", "#");
                                if (lines[lineIndex + 2] === "") {
                                    lines[lineIndex + 2] = "#";
                                }
                            }
                            lines[index] = line.substring(0, line.length - 1) + "extends " + parent + " {";
                        } else if (line.includes("getID") || line.includes("getZusatzAttribute")) {
                            lines.splice(index, 2, "#", "#");
                            if (lines[index + 2] === "") {
                                lines[index + 2] = "#";
                            }
                        } else if (line.includes("private ZusatzAttribut")
                            || line.includes("private String id")) {
                            lines.splice(index, 1, "#");
                        }
                    } else if (classAndDir !== undefined && fileName === classAndDir.class + ".java") {
                        if (line.includes("setVersion")) {
                            lines.splice(index, 1, "#");
                        } else {
                            lines[index] = line
                                .replace(" version", " _version")
                                .replace("private String _version;", "private final String _version = \"" + currentVersion + "\";")
                                .replace(" id", " _id")
                                .replace("this.id", "this._id")
                                .replace("public class", "public abstract class")
                                .replace("getVersion", "getStructureVersion");
                        }
                    }
                    if (line.includes("setTyp")) {
                        lines.splice(index, 1, "#");
                    }
                    if (line.includes("private ")) {
                        const words = line.split(" ").filter(value => value !== "");
                        const type = words[1].replace("[]", "");
                        if (type !== "ZusatzAttribut" || (classAndDir !== undefined && fileName === classAndDir.class + ".java")) {
                            if (type === "Typ") {
                                const types = fs.readFileSync(sourceDirName + "/enum/typ.json")
                                lines[index] = line.replace("private", "private final").replace(";", " = Typ." + fileName.substring(0, fileName.length - 5).toUpperCase() + ";")
                            }
                            const typeFile = type + ".json";
                            if (!files.includes(typeFile)) {
                                if (fileMap.has(type.toLowerCase())) {
                                    const importLine = `import ${packageName}.${fileMap.get(type.toLowerCase()).replaceAll("/", ".")}${type};`;
                                    if (!importLines.includes(importLine)) {
                                        importLines.push(importLine);
                                    }
                                }
                            }
                        }
                    }
                });
                const newLines = lines.filter(value => value !== "#");
                if (importLines.length > 0) {
                    if (!lines[2].startsWith("import ")) {
                        newLines.splice(2, 0, importLines.join("\n"), "");
                    } else {
                        newLines.splice(2, 0, importLines.join("\n"));
                    }
                }
                fs.writeFileSync(target + '/' + fileName, newLines.join("\n"));
            }
        } else {
            dirname = file;
            if (file === "enum") {
                dirname += 's';
            }
            let targetPath =  target + '/' + dirname;

            const newFiles = fs.readdirSync(sourcePath);
            if (!fs.existsSync(targetPath)) {
                fs.mkdirSync(targetPath);
            }
            cleanUp(newFiles, sourcePath, targetPath, root, dirname, fileMap);
        }
    }

}

function main(source, target) {
    console.log("Preparing generation");
    const allKnowingSchema = generateAllKnowingSchema();
    const files = fs.readdirSync(source);
    console.log("Creating generation_schema");
    const fileMap = addToSchema(allKnowingSchema, files, source);
    const counter = fileMap.size;
    fileMap.set("stringodernummer", "");
    let schema = allKnowingSchema[0];
    for (let i = 2; i < allKnowingSchema.length; i++) {
        schema += allKnowingSchema[i];
    }
    schema += allKnowingSchema[1];
    console.log("Generation_schema complete");
    const inputData = new InputData();
    const schemaInput = new JSONSchemaInput(new FetchingJSONSchemaStore());
    schemaInput.addSourceSync({name: "StringOderNummer", schema: fs.readFileSync("resource_schemas/StringOderNummerTyp.json", "utf-8")});
    schemaInput.addSourceSync({name: "AllKnowing", schema: schema});
    inputData.addInput(schemaInput);
    console.log("Starting generation");
    quicktypeMultiFile({
        inputData,
        lang: new NewJavaTargetLanguage(),
        allPropertiesOptional: false
    }).then(javaClasses => {
        console.log("Generation complete");
        console.log("Starting output");
        javaClasses.forEach((javaClass, className) => {
            if (className !== "AllKnowing.java" && className !== "StringOderNummerTyp.java" && className !== "StringOderNummer.java") {
                fs.writeFileSync(target + "/" + className, javaClass.lines.join("\n"));
            }
        });
        console.log("Output complete");
        console.log("Starting cleanup");
        cleanUp(files, source, target, target, source, fileMap);
        console.log("Cleanup complete");
        output(counter, source, target);
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

// Typ.AUSSCHREIUNG zu Typ.AUSSCHREIBUNG umbenennen
// Doppelbelegung der Eigenschaft version
main(sourceDirName, targetDirName);
