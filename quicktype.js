const {
    InputData, JSONSchemaInput, FetchingJSONSchemaStore, quicktypeMultiFile,
    JavaTargetLanguage, getOptionValues, JavaRenderer
} = require("quicktype-core");
const fs = require("node:fs");
const {BooleanOption, StringOption, EnumOption} = require("quicktype-core/dist/RendererOptions");
const {acronymOption, AcronymStyleOptions} = require("quicktype-core/dist/support/Acronyms");
const {JacksonRenderer} = require("quicktype-core/dist/language/Java");
const {SerializedRenderResult} = require("quicktype-core/dist/Source");

let currentVersion = "";
let packageName = "";
let targetDirName = "bo4e";
let sourceDirName = "bo4e_schemas";
let urlTemplate = "";

/**
 * array containing potentially missing parent classes and their path
 * @type {{fileName: string, pathToFile: string}[]}
 */
const missingParentClasses = [
    {fileName: "Geschaeftsobjekt", pathToFile: "bo/"},
    {fileName: "COM", pathToFile: "com/"}
];

const parentFields = ["id", "typ", "version", "zusatzAttribute"];

const newJavaOptions = {
    useList: new EnumOption(
        "array-type",
        "Use T[] or List<T>",
        [
            ["array", false],
            ["list", true]
        ],
        "list"
    ),
    justTypes: new BooleanOption("just-types", "Plain types only", true),
    dateTimeProvider: new EnumOption(
        "datetime-provider",
        "Date time provider type",
        [
            ["java8", "java8"],
            ["legacy", "legacy"]
        ],
        "java8"
    ),
    acronymStyle: acronymOption(AcronymStyleOptions.Original),
    packageName: new StringOption("package", "Generated package name", "NAME", "placeholder"),
    lombok: new BooleanOption("lombok", "Use lombok", false, "primary"),
    lombokCopyAnnotations: new BooleanOption("lombok-copy-annotations", "Copy accessor annotations", false, "secondary")
};

/**
 * the language used for generation, uses custom options
 */
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

function processCommandLineArguments() {
    const flags = (process.argv[2] && process.argv[2].length > 1) ? process.argv[2].substring(1).split("") : [];
    for (let i = 0; i < flags.length; i++) {
        if (process.argv[3 + i]) {
            switch (flags[i]) {
                case 'p': {
                    packageName = process.argv[3 + i]
                    console.log("Using Package: " + packageName);
                    packageName += '.';
                    break;
                }
                case 't': {
                    targetDirName = process.argv[3 + i]
                    console.log("Using target directory: " + targetDirName);
                    break;
                }
                case 's': {
                    sourceDirName = process.argv[3 + i]
                    console.log("Using source directory: " + sourceDirName);
                    break;
                }
            }
        }
    }
}

/**
 * turns a file into a schema-property and adds it to the given array
 * @param allKnowingSchema {string[]} the array to add the property to
 * @param file {string} the file to add
 * @param path {string} the path to the file
 */
function addProperty(allKnowingSchema, file, path) {
    let url = retrieveSchemaUrl(path);
    if (url) {
        if (currentVersion === "") {
            currentVersion = getVersion(url);
            console.log("Using version: " + currentVersion);
        }
        if (urlTemplate === "") {
            urlTemplate = getUrlTemplate(url);
            console.log("Using template: " + urlTemplate);
        }
    }
    if (urlTemplate === "") {
        console.log("Could not find template, using default")
        url = "https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1/src/" + path;
    } else {
        url = urlTemplate + path;
    }
    const propertyName = file.replace(".json", "");
    const newProperty = createProperty(propertyName.toLowerCase(), url);
    allKnowingSchema.push(newProperty);
    console.log("Property " + propertyName + " added");
}

function createProperty(propertyName, propertyUrl) {
    return "        },\n" +
        "        \"" + propertyName + "\": {\n" +
        "            \"anyOf\": [\n" +
        "                {\n" +
        "                    \"$ref\": \"" + propertyUrl + "\"\n" +
        "                },\n" +
        "                {\n" +
        "                    \"type\": \"null\"\n" +
        "                }\n" +
        "            ],\n" +
        "            \"default\": null\n";
}

/**
 *
 * @param path {string}
 * @returns {undefined|string}
 */
function retrieveSchemaUrl(path) {
    const line = fs.readFileSync(path, "utf-8")
        .split("\n")
        .find(line => line.trim().startsWith("\"description\":") && line.includes("https://raw.githubusercontent"));
    if (line) {
        return line.match(RegExp("https://raw\.githubusercontent.*\.json"))["0"];
    } else {
        return undefined;
    }
}

/**
 *
 * @param url {string}
 * @returns {string}
 */
function getUrlTemplate(url) {
    const beginning = url.substring(0, url.indexOf("BO4E-Schemas/")) + "BO4E-Schemas/v"
    const end = url.substring(url.indexOf("/src/"), url.indexOf("bo4e_schemas/"));
    return beginning + currentVersion + end
}

/**
 *
 * @param url {string}
 * @returns {string}
 */
function getVersion(url) {
    try {
        const tmp = url.match(RegExp("/v[0-9]*\.[0-9]*\.[0-9]*.*/src"))["0"]
            .replace("/v", "")
            .replace("/src", "");
        if (tmp.endsWith("-")) {
            return tmp.substring(0, tmp.length - 1);
        } else {
            return tmp;
        }
    } catch (err) {
        return "";
    }
}

/**
 * iterates through the given directory and all subdirectories and adds all files as schema-property-elements to the given array
 * @param allKnowingSchema {string[]} the schema to add the files to
 * @param source {string} the path to the source directory
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} a map to add the files with the path to their directory to, creates one if none is given
 * @returns {Map<string, {jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} A map of all added files with the path to their directory
 */
function addToSchema(allKnowingSchema, source = sourceDirName, fileMap = new Map) {
    const files = fs.readdirSync(source);
    for (const file of files) {
        const path = source + '/' + file;
        const targetPath = path.replace(sourceDirName, targetDirName).replace("enum", "enums");
        if (fs.statSync(path).isFile()) {
            addProperty(allKnowingSchema, file, path);
            const fileName = file.replace(".json", "");
            const fileData = {
                jsonFileName: fileName,
                jsonFilePath: source,
                javaFileName: fileName,
                javaFilePath: targetPath.replace("/" + file, "")
            }
            fileMap.set(file.replace(".json", "").toLowerCase(), fileData);
        } else {
            fs.mkdirSync(targetPath);
            fileMap = addToSchema(allKnowingSchema, path, fileMap);
        }
    }
    return fileMap;
}

/**
 * creates the basic skeleton of a schema that can be used to generate all classes at once
 * @returns {string[]} an array containing the beginning and the end of the schema, leaving space to add properties
 */
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

/**
 * retrieves the correct property name based on the generated property
 * @param property {string} the property to search for
 * @param jsonFile {string} the file containing the schema
 * @param filePath {string} the path to the directory of the file
 * @returns {string} the correct name of the property
 */
function getPropertyName(property, jsonFile, filePath) {
    const content = fs.readFileSync(filePath + jsonFile, "utf-8").replaceAll(" ", "").split("\n");
    const line = content.find(value => value.toLowerCase() === `\"${property.toLowerCase()}\":{`);
    if (line) {
        return line.substring(1, line.length - 3);
    } else {
        return property;
    }
}

function findFile(fileName, searchDirectory, fileType = ".json") {
    const searchFiles = fs.readdirSync(searchDirectory);
    const file = searchFiles.find(value => {
        return fs.statSync(searchDirectory + '/' + value).isFile() && value.replace(fileType, "").toLowerCase() === fileName.toLowerCase();
    });
    if (!file) {
        console.warn("Cannot find " + fileName);
    }
    return file;
}

/**
 *
 * @param classBody{string[]}
 * @param fieldName {string}
 * @returns {string|undefined}
 */
function getFieldDescription(classBody, fieldName) {
    const methodIndex = classBody.findIndex(value => value.trim().toLowerCase().includes(`get${fieldName.toLowerCase()}()`));
    if (classBody[methodIndex - 1].trim().startsWith("*/")) {
        let j = 2;
        while (!classBody[methodIndex - j].trim().startsWith("/*")) {
            j++;
        }
        return classBody.slice(methodIndex - j, methodIndex).join("\n");
    }
    return undefined;
}

/**
 *
 * @param classBody{string[]}
 * @returns {{name: string, type: string, description: string}[]}
 */
function getClassFields(classBody) {
    const fieldList = [];
    for (let i = 0; i < classBody.length; i++) {
        const line = classBody[i];
        const trimmed_line = line.trim();
        if (trimmed_line.startsWith("private")) {
            const fieldElements = trimmed_line.split(" ");
            const fieldName = fieldElements[2].replace(";", "");
            const field = {
                name: fieldName,
                type: fieldElements[1],
                description: getFieldDescription(classBody, fieldName)
            };
            fieldList.push(field);
        }
    }
    return fieldList
}

/**
 *
 * @param fieldList {{name: string, type: string, description: string}[]}
 */
function removeParentClassFields(fieldList) {
    const hasOwnVersionProperty = fieldList.slice(0, parentFields.length).findIndex(value => value.name === "version") < 0;
    let fieldFilter = parentFields;
    if (hasOwnVersionProperty) {
        fieldFilter = parentFields.filter(value => value !== "version")
    }
    return fieldList.filter(value => !fieldFilter.includes(value.name));
}

/**
 *
 * @param fieldList {{name: string, type: string, description: string}[]}
 */
function turnFieldListToJava(fieldList) {
    const javaList = []
    for (const field of fieldList) {
        if (field.description !== undefined) {
            javaList.push(field.description);
        }
        javaList.push(`    private ${field.type} ${field.name};`);
    }
    return javaList;
}

function addParentToClass(classHead, classDirPath) {
    const obj = missingParentClasses.find(value => (classDirPath + "/").endsWith(value.pathToFile));
    if (obj !== undefined && !classHead.includes(obj.fileName)) {
        classHead = classHead.replace(" {", ` extends ${obj.fileName} {`);
    }
    return classHead;
}

/**
 *
 * @param field {{name: string, type: string, description: string}}
 */
function getJavaMethod(field) {
    const fieldName = field.name.charAt(0).toUpperCase() + field.name.slice(1);
    const lines = []
    lines.push(`    public ${field.type} get${fieldName}() {`);
    lines.push(`        return ${fieldName};`);
    lines.push(`    }`);
    lines.push(`    public void set${fieldName}(${field.type} ${field.name}) {`);
    lines.push(`        this.${field.name} = ${field.name};`);
    lines.push(`    }`);
    return lines.join("\n");
}

/**
 *
 * @param fieldList {{name: string, type: string, description: string}[]}
 */
function getJavaMethods(fieldList) {
    const methodList = [];
    for (const field of fieldList) {
        methodList.push("")
        methodList.push(getJavaMethod(field))
    }
    return methodList;
}

/**
 *
 * @param fieldList {{name: string, type: string, description: string}[]}
 * @param fileData {{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}}
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 */
function getImports(fieldList, fileData, fileMap) {
    const classPath = fileData.javaFilePath;
    const importList = [];
    for (const field of fieldList) {
        let fieldType = field.type;
        if (fieldType.startsWith("List<") && fieldType.endsWith(">")) {
            fieldType = fieldType.substring("List<".length, fieldType.length - 1);
        }
        const importData = fileMap.get(fieldType.toLowerCase());
        if (importData !== undefined && importData.javaFilePath !== classPath) {
            const importPackage = packageName + importData.javaFilePath.replaceAll("/", ".");
            importList.push(`import ${importPackage}.${importData.javaFileName};`);
        }
    }
    if (importList.length > 0) {
        importList.unshift("");
    }
    return importList;
}

/**
 *
 * @param fieldList {{name: string, type: string, description: string}[]}
 * @param fileData {{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}}
 */
function addTypeToFields(fieldList, fileData) {
    const file = fs.readFileSync(fileData.jsonFilePath + "/" + fileData.jsonFileName + ".json", "utf-8").replaceAll(" ", "").split("\n");
    let type = fileData.jsonFileName.toUpperCase();
    const hasExpectedType = file.findIndex(value => value.startsWith(`"default":"${type}"`)) !== -1;
    if (!hasExpectedType) {
        console.log("Unexpected type in: " + fileData.jsonFileName);
        const typeIndex = file.findIndex(value => value.startsWith("\"_typ\":"));
        const typeDefault = file.find((value, index) => index > typeIndex && value.startsWith("\"default\":"));
        if (typeDefault !== undefined) {
            type = typeDefault.split(":").at(1).replaceAll("\"", "").replace(",", "")
        }
    }
    const field = {
        name: `typ = Typ.${type}`,
        type: "Typ",
        description: "    /**\n     * Typ des Geschaeftsobjekts\n     */"
    }
    fieldList.unshift(field);
}

/**
 *
 * @param contentList {string[]}
 * @param fileData {{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}}
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 * @return {string}
 */
function completeJavaFile(contentList, fileData, fileMap) {
    const classFoot = "}";
    const newPackageName = packageName + fileData.javaFilePath.replaceAll("/", ".");
    const newPackage = contentList[0].replace("placeholder", newPackageName);
    const classIndex = contentList.findIndex(value => value.startsWith("public class"));
    if (classIndex < 0) {
        return [newPackage].concat(contentList.slice(1, contentList.length)).join("\n");
    }
    const header = contentList.slice(1, classIndex);
    const classHead = addParentToClass(contentList[classIndex], fileData.javaFilePath);
    const classBody = contentList.slice(classIndex + 1, contentList.length - 1);
    let fieldList = getClassFields(classBody);
    if (fieldList.length > parentFields.length) {
        fieldList = removeParentClassFields(fieldList);
    }
    const javaMethodList = getJavaMethods(fieldList);
    if (fileData.javaFilePath.endsWith("/bo")) {
        addTypeToFields(fieldList, fileData);
    }
    const javaFieldList = turnFieldListToJava(fieldList);
    const importList = getImports(fieldList, fileData, fileMap);
    const newClass = [newPackage].concat(importList, header, classHead, javaFieldList, javaMethodList, classFoot);
    return newClass.join("\n");
}

/**
 *
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 */
function restoreMissingFiles(fileMap) {
    const zaImport = packageName + fileMap.get("zusatzattribut").javaFilePath.replaceAll("/", ".");
    const typImport = packageName + fileMap.get("typ").javaFilePath.replaceAll("/", ".");
    missingParentClasses.forEach(({fileName, pathToFile}) => {
        if (!fileMap.has(fileName.toLowerCase())) {
            const javaFileName = fileName + ".java";
            const classPackage = packageName + targetDirName + "." + pathToFile.substring(0, pathToFile.length - 1).replace("/", ".");
            const fileContent = fs.readFileSync("resource_schemas/" + javaFileName, "utf-8")
                .replace("packagePlaceholder",classPackage)
                .replace("zaImportPlaceholder", zaImport)
                .replace("typImportPlaceholder", typImport)
                .replace("versionPlaceholder", currentVersion);
            fs.writeFileSync(targetDirName + "/" + pathToFile + javaFileName, fileContent);
        }
    });
}

function setUp() {
    if (fs.existsSync(targetDirName)) {
        fs.rmSync(targetDirName, { recursive: true });
    }
    fs.mkdirSync(targetDirName);
    const allKnowingSchema = generateAllKnowingSchema();
    const fileMap = addToSchema(allKnowingSchema);
    restoreMissingFiles(fileMap);
    let schema = allKnowingSchema[0];
    for (let i = 2; i < allKnowingSchema.length; i++) {
        schema += allKnowingSchema[i];
    }
    schema += allKnowingSchema[1];
    const inputData = new InputData();
    const schemaInput = new JSONSchemaInput(new FetchingJSONSchemaStore());
    schemaInput.addSourceSync({
        name: "StringOderNummer",
        schema: fs.readFileSync("resource_schemas/StringOderNummerTyp.json", "utf-8")
    });
    schemaInput.addSourceSync({name: "AllKnowing", schema: schema});
    inputData.addInput(schemaInput);
    return {inputData, fileMap}
}

/**
 *
 * @param javaClasses {ReadonlyMap<string, SerializedRenderResult>}
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 * @return {number}
 */
function breakDown(javaClasses, fileMap) {
    let writtenFilesAmount = 0;
    console.log("Starting output");
    javaClasses.forEach((javaClass, className) => {
        const searchName = className.replace(".java", "").toLowerCase();
        const fileData = fileMap.get(searchName);
        if (fileData) {
            fileData.javaFileName = className.replace(".java", "");
            const content = completeJavaFile(javaClass.lines, fileData, fileMap);
            fs.writeFileSync(fileData.javaFilePath + "/" + className, content);
            writtenFilesAmount++;
        }
    });
    console.log("Output complete");
    return writtenFilesAmount;
}

function main() {
    console.log("Preparing generation");
    processCommandLineArguments();
    console.log("Creating generation_schema");
    const {inputData, fileMap} = setUp();
    const readFilesAmount = fileMap.size;
    console.log("Generation_schema complete");
    console.log("Starting generation");
    quicktypeMultiFile({
        inputData,
        lang: new NewJavaTargetLanguage(),
        allPropertiesOptional: false
    }).then(javaClasses => {
        console.log("Generation complete");
        const writtenFilesAmount = breakDown(javaClasses, fileMap);
        console.log(`Finished: ${writtenFilesAmount}/${readFilesAmount}`)
    });
}

main();
