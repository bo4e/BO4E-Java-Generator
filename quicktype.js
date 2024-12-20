const {
    InputData, JSONSchemaInput, FetchingJSONSchemaStore, quicktypeMultiFile,
    JavaTargetLanguage, getOptionValues, JavaRenderer
} = require('quicktype-core');
const fs = require('node:fs');
const {BooleanOption, StringOption, EnumOption} = require('quicktype-core/dist/RendererOptions');
const {acronymOption, AcronymStyleOptions} = require('quicktype-core/dist/support/Acronyms');
const {JacksonRenderer} = require('quicktype-core/dist/language/Java');
const {SerializedRenderResult} = require('quicktype-core/dist/Source');
const commandLineArgs = require('command-line-args');
const commandLineUsage = require('command-line-usage');

let CURRENT_VERSION = '';
let URL_TEMPLATE = '';

let PACKAGE_NAME = '';
let TARGET_DIR_PATH = '';
let SOURCE_DIR_PATH = '';
let USE_ANNOTATIONS = false;
let VERBOSE = false;
let QUIET = false;
let REMOVE = false;
let CREATE = false;
let KEEP = false;

/**
 * array containing potentially missing parent classes and their path
 * @type {{fileName: string, pathToFile: string}[]}
 */
const MISSING_PARENT_CLASSES = [
    {fileName: 'Geschaeftsobjekt', pathToFile: 'bo/'},
    {fileName: 'COM', pathToFile: 'com/'}
];

const PARENT_FIELDS = [
    {name: 'id', type: 'String'},
    {name: 'typ', type: 'Typ'},
    {name: 'version', type: 'String'},
    {name: 'zusatzAttribute', type: 'List<ZusatzAttribut>'}
];

const CUSTOM_JAVA_OPTIONS = {
    useList: new EnumOption(
        'array-type',
        'Use T[] or List<T>',
        [
            ['array', false],
            ['list', true]
        ],
        'list'
    ),
    justTypes: new BooleanOption('just-types', 'Plain types only', true),
    dateTimeProvider: new EnumOption(
        'datetime-provider',
        'Date time provider type',
        [
            ['java8', 'java8'],
            ['legacy', 'legacy']
        ],
        'java8'
    ),
    acronymStyle: acronymOption(AcronymStyleOptions.Original),
    packageName: new StringOption('package', 'Generated package name', 'NAME', 'placeholder'),
    lombok: new BooleanOption('lombok', 'Use lombok', false, 'primary'),
    lombokCopyAnnotations: new BooleanOption('lombok-copy-annotations', 'Copy accessor annotations', false, 'secondary')
};

/**
 * the language used for generation, uses custom options
 */
class BO4EJavaTargetLanguage extends JavaTargetLanguage {
    constructor() {
        super();
    }

    getOptions() {
        return [
            CUSTOM_JAVA_OPTIONS.useList,
            CUSTOM_JAVA_OPTIONS.justTypes,
            CUSTOM_JAVA_OPTIONS.dateTimeProvider,
            CUSTOM_JAVA_OPTIONS.acronymStyle,
            CUSTOM_JAVA_OPTIONS.packageName,
            CUSTOM_JAVA_OPTIONS.lombok,
            CUSTOM_JAVA_OPTIONS.lombokCopyAnnotations
        ];
    }

    makeRenderer(renderContext, untypedOptionValues) {
        const options = getOptionValues(CUSTOM_JAVA_OPTIONS, untypedOptionValues);
        if (options.justTypes) {
            return new JavaRenderer(this, renderContext, options);
        }
        return new JacksonRenderer(this, renderContext, options);
    }
}

const optionDefinitions = [
    {
        name: 'input',
        description: 'Path to the input directory that holds the json-schemas and defines the file structure.',
        alias: 'i',
        type: String,
        defaultOption: true,
        typeLabel: '{underline path}'
    },
    {
        name: 'output',
        description: 'Path to the output directory.',
        alias: 'o',
        type: String,
        typeLabel: '{underline path}'
    },
    {
        name: 'package',
        description: 'The package to put in the classes package signature (default: same as output).',
        alias: 'p',
        type: String,
        typeLabel: '{underline package}'
    },
    {
        name: 'keep',
        description: 'Prevent overwriting of existing files',
        alias: 'k',
        type: Boolean
    },
    {
        name: 'remove',
        description: 'Delete all existing files in output directory.',
        alias: 'r',
        type: Boolean
    },
    {
        name: 'create',
        description: 'Create output directory if it does not exist.',
        alias: 'c',
        type: Boolean
    },
    {
        name: 'annotate',
        description: 'Use JsonInclude Annotations.',
        alias: 'a',
        type: Boolean
    },
    {
        name: 'verbose',
        description: 'Turn on debugging output.',
        alias: 'v',
        type: Boolean
    },
    {
        name: 'quiet',
        description: 'Silence output.',
        alias: 'q',
        type: Boolean
    },
    {
        name: 'help',
        description: 'Display this usage guide.',
        alias: 'h',
        type: Boolean
    }
];

const sections = [
    {
        header: 'BO4E Java Generator',
        content: 'Generates java classes implementing the {bold BO4E-Standard}'
    },
    {
        header: 'Synopsis',
        content: [
            'node quicktype.js [{underline options}] {bold --output} {underline path} {bold --input} {underline path}',
            'node quicktype.js {bold --help}'
        ]
    },
    {
        header: 'Options',
        optionList: optionDefinitions
    },
    {
        header: 'Examples',
        content: [
            {
                desc: '1. Inputs from data/bo4e_schemas, outputs to bo4e/api',
                example: 'node quicktype.js -o bo4e/api data/bo4e_schemas'
            },
            {
                desc: '2. Outputs to "bo4e/api", package will be "bo4e.example.api"',
                example: 'node quicktype.js -o bo4e/api bo4e_schemas -p bo4e.example.api'
            },
            {
                desc: '3. Use annotations and enable debug output',
                example: 'node quicktype.js -avo bo4e bo4e_schemas'
            }
        ]
    },
    {
        content: 'Project home: {underline https://github.com/TimoMolls/BO4E-Java-Generator}'
    }
];

function log(msg) {
    if (!QUIET) {
        console.log(msg);
    }
}

function debug(msg) {
    if (VERBOSE && !QUIET) {
        console.log(msg);
    }
}

/**
 * adjusts global variables based on the command line arguments
 */
async function processCommandLineArguments() {
    const options = commandLineArgs(optionDefinitions);
    if (options['help']) {
        console.log(commandLineUsage(sections));
        process.exit();
    }
    if (!options['input']) {
        console.error('No input directory provided.');
        process.exit(1);
    }
    if (!options['output']) {
        console.error('No output directory provided.');
        process.exit(1);
    }
    else {
        TARGET_DIR_PATH = options['output'];
    }
    SOURCE_DIR_PATH = options['input'];
    PACKAGE_NAME = (options['package'] && options['package'].length > 0) ? options['package'].join('.') : TARGET_DIR_PATH.replaceAll('/', '.');
    USE_ANNOTATIONS = !!options['annotate'];
    VERBOSE = !!options['verbose'];
    QUIET = !!options['quiet'];
    KEEP = !!options['keep'];
    REMOVE = !!options['remove'];
    CREATE = !!options['create'];
}

function logSettings() {
    log(`Using source directory: ${SOURCE_DIR_PATH}`);
    log(`Using target directory: ${TARGET_DIR_PATH}`);
    log(`Using package: ${PACKAGE_NAME}`);
    log(`Prevent overwriting existing files: ${KEEP}`);
    log(`Delete files in output: ${REMOVE}`);
    log(`Create output directory: ${CREATE}`);
    log(`Using annotations: ${USE_ANNOTATIONS}`);
}

/**
 * turns a file into a schema-property and adds it to the allKnowingSchema
 * @param allKnowingSchema {string[]} the list containing references to the json-schemas
 * @param file {string} the file containing the json-schema
 * @param path {string} the path to the file
 */
function addProperty(allKnowingSchema, file, path) {
    let url = getSchemaUrl(path);
    const urlPath = path.replace(SOURCE_DIR_PATH, '');
    if (url) {
        if (CURRENT_VERSION === '') {
            CURRENT_VERSION = getVersion(url);
            log('Using version: ' + CURRENT_VERSION);
        }
        if (URL_TEMPLATE === '') {
            URL_TEMPLATE = getUrlTemplate(url);
            log('Using template: ' + URL_TEMPLATE);
        }
    }
    if (URL_TEMPLATE === '') {
        log('Could not find template, using default');
        url = 'https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1/src/' + urlPath;
    }
    else {
        url = URL_TEMPLATE + urlPath;
    }
    const propertyName = file.replace('.json', '');
    const newProperty = createProperty(propertyName.toLowerCase(), url);
    allKnowingSchema.push(newProperty);
    debug('Property ' + propertyName + ' added');
}

/**
 * creates a property for the allKnowingSchema containing a reference to a json-schema
 * @param propertyName {string} the name of the json-schema
 * @param propertyUrl {string} the url of the json-schema
 * @return {string} the property to add to the allKnowingSchema
 */
function createProperty(propertyName, propertyUrl) {
    return '        },\n' +
        '        "' + propertyName + '": {\n' +
        '            "anyOf": [\n' +
        '                {\n' +
        '                    "$ref": "' + propertyUrl + '"\n' +
        '                },\n' +
        '                {\n' +
        '                    "type": "null"\n' +
        '                }\n' +
        '            ],\n' +
        '            "default": null\n';
}

/**
 * retrieves the url of the json-schema located at the given path
 * @param path {string} path to the file containing the json-schema
 * @return {undefined|string} the url of the json-schema
 */
function getSchemaUrl(path) {
    const line = fs.readFileSync(path, 'utf-8')
        .split('\n')
        .find(line => line.trim().startsWith('"description":') && line.includes('https://raw.githubusercontent'));
    if (line) {
        return line.match(RegExp('https://raw\.githubusercontent.*\.json'))['0'];
    }
    return undefined;
}

/**
 * creates a template for json-schema urls based on an actual json-schema url
 * @param url {string} the url of a json-schema
 * @return {string} the template for json-schema urls
 */
function getUrlTemplate(url) {
    const beginning = url.substring(0, url.indexOf('BO4E-Schemas/')) + 'BO4E-Schemas/v';
    const end = url.substring(url.indexOf('/src/'), url.indexOf('bo4e_schemas/')) + 'bo4e_schemas/';
    return beginning + CURRENT_VERSION + end;
}

/**
 * retrieves the version of the json-schema from the given url
 * @param url {string} the url of a json-schema
 * @return {string} the version of the json-schema
 */
function getVersion(url) {
    try {
        const tmp = url.match(RegExp('/v[0-9]*\.[0-9]*\.[0-9]*.*/src'))['0']
            .replace('/v', '')
            .replace('/src', '');
        if (tmp.endsWith('-')) {
            return tmp.substring(0, tmp.length - 1);
        }
        else {
            return tmp;
        }
    }
    catch (err) {
        return '';
    }
}

/**
 * iterates through the given directory and all subdirectories and adds all files as schema-property-elements to the given array
 * @param allKnowingSchema {string[]} the schema to add the files to
 * @param source {string} the path to the source directory
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 * @return {Map<string, {jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} A map of all added files with their fileData
 */
function addToSchema(allKnowingSchema, source = SOURCE_DIR_PATH, fileMap = new Map) {
    const files = fs.readdirSync(source);
    for (const file of files) {
        const path = source + '/' + file;
        const targetPath = path.replace(SOURCE_DIR_PATH, TARGET_DIR_PATH).replace('enum', 'enums');
        if (fs.statSync(path).isFile()) {
            addProperty(allKnowingSchema, file, path);
            const fileName = file.replace('.json', '');
            const fileData = {
                jsonFileName: fileName,
                jsonFilePath: source,
                javaFileName: fileName,
                javaFilePath: targetPath.replace('/' + file, '')
            };
            fileMap.set(file.replace('.json', '').toLowerCase(), fileData);
        }
        else {
            if (!fs.existsSync(targetPath)) {
                fs.mkdirSync(targetPath);
            }
            fileMap = addToSchema(allKnowingSchema, path, fileMap);
        }
    }
    return fileMap;
}

/**
 * creates the basic skeleton of a schema that can be used to generate all classes at once
 * @return {string[]} an array containing the beginning and the end of the schema, leaving space to add properties
 */
function generateAllKnowingSchema() {
    return ['{\n' +
    '  "additionalProperties": true,\n' +
    '  "description": "Alles auf einen Blick",\n' +
    '  "properties": {\n' +
    '    "stringOderNummer": {\n' +
    '      "anyOf": [\n' +
    '        {\n' +
    '          "type": "number"\n' +
    '        },\n' +
    '        {\n' +
    '          "type": "string"\n' +
    '        },\n' +
    '        {\n' +
    '          "type": "null"\n' +
    '        }\n' +
    '      ],\n' +
    '      "default": null,\n' +
    '      "title": "StringOderNummer"\n',
        '    }\n' +
        '  },\n' +
        '  "title": "AllKnowing",\n' +
        '  "type": "object"\n' +
        '}'];
}

/**
 * retrieves the description of the given field, if it exists
 * @param classBody{string[]} a list containing the lines of the body of the java class
 * @param fieldName {string} the name of the field
 * @return {string|undefined} the description of the given field, if it exists
 */
function getFieldDescription(classBody, fieldName) {
    const methodIndex = classBody.findIndex(value => value.trim().toLowerCase().includes(`get${fieldName.toLowerCase()}()`));
    if (classBody[methodIndex - 1].trim().startsWith('*/')) {
        let j = 2;
        while (!classBody[methodIndex - j].trim().startsWith('/*')) {
            j++;
        }
        return classBody.slice(methodIndex - j, methodIndex).join('\n');
    }
    return undefined;
}

/**
 * creates a list containing the fields of the java class
 * @param classBody{string[]} a list containing the lines of the body of the java class
 * @return {{name: string, type: string, description: string}[]} a list containing the fields of the java class
 */
function getClassFields(classBody) {
    const fieldList = [];
    for (let i = 0; i < classBody.length; i++) {
        const line = classBody[i];
        const trimmed_line = line.trim();
        if (trimmed_line.startsWith('private')) {
            const fieldElements = trimmed_line.split(' ');
            const fieldName = fieldElements[2].replace(';', '');
            const field = {
                name: fieldName,
                type: fieldElements[1],
                description: getFieldDescription(classBody, fieldName)
            };
            fieldList.push(field);
        }
    }
    return fieldList;
}

/**
 * removes the fields belonging to the parent class from the given list of fields
 * @param fieldList {{name: string, type: string, description: string}[]} contains the fields of the java class
 * @return the fieldList without the fields belonging to the parent class
 */
function removeParentClassFields(fieldList) {
    const hasOwnVersionProperty = fieldList.slice(0, PARENT_FIELDS.length).findIndex(value => value.name === 'version') < 0;
    let fieldFilter = PARENT_FIELDS.map(value => value.name);
    if (hasOwnVersionProperty) {
        fieldFilter = fieldFilter.filter(value => value !== 'version');
    }
    return fieldList.filter(value => !fieldFilter.includes(value.name));
}

/**
 * creates java statements for the given fields
 * @param fieldList {{name: string, type: string, description: string}[]} contains the fields of the java class
 * @return {string[]} a list containing the fields as java statements
 */
function turnFieldListToJava(fieldList) {
    const javaList = [];
    for (const field of fieldList) {
        if (field.type === 'Typ') {
            javaList.push(`private final ${field.type} ${field.name};`);
        }
        else {
            javaList.push(`private ${field.type} ${field.name};`);
        }
    }
    return javaList;
}

/**
 * applies inheritance to the head of the java class
 * @param classHead {string} contains the head of the java class: (public class ...)
 * @param classDirPath {string} path to the directory containing the java class
 * @return {string} the head of the java class with inheritance
 */
function addParentToClass(classHead, classDirPath) {
    const obj = MISSING_PARENT_CLASSES.find(value => (classDirPath + '/').endsWith(value.pathToFile));
    if (obj !== undefined && !classHead.includes(obj.fileName)) {
        classHead = classHead.replace(' {', ` extends ${obj.fileName} {`);
    }
    return classHead;
}

/**
 * creates a getter and optionally a setter for a given field
 * @param field {{name: string, type: string, description: string}} the field that the method(s) belong to
 * @param addSetter {boolean} whether a setter method should be included
 * @param builderName {string|undefined} if set, creates the methods for the given builder class
 * @return a string containing the method(s)
 */
function getJavaMethod(field, addSetter = false, builderName = undefined) {
    const fieldName = field.name.charAt(0).toUpperCase() + field.name.slice(1);
    const lines = [];
    if (builderName !== undefined) {
        if (field.description !== undefined) {
            lines.push(field.description);
        }
        lines.push(`public ${builderName} set${fieldName}(${field.type} ${field.name}) {`);
        lines.push(`this.${field.name} = ${field.name};`);
        lines.push(`return this;`);
        lines.push(`}`);
    }
    else {
        if (field.description !== undefined) {
            lines.push(field.description);
        }
        lines.push(`public ${field.type} get${fieldName}() {`);
        lines.push(`return ${field.name};`);
        lines.push(`}`);
        if (addSetter) {
            lines.push('');
            if (field.description !== undefined) {
                lines.push(field.description);
            }
            lines.push(`public void set${fieldName}(${field.type} ${field.name}) {`);
            lines.push(`this.${field.name} = ${field.name};`);
            lines.push(`}`);
        }
    }
    return lines.join('\n');
}

/**
 * creates a method for the builder class that overwrites the setter method of the parent builder class
 * @param field {{name: string, type: string}} the field that the setter belongs to
 * @param builderName {string} name of the builder class
 * @return {string} the setter method overwriting the parent setter
 */
function overwriteParentSetter(field, builderName) {
    const fieldName = field.name.charAt(0).toUpperCase() + field.name.slice(1);
    const lines = [];
    lines.push(`public ${builderName} set${fieldName}(${field.type} ${field.name}) {`);
    lines.push(`super.set${fieldName}(${field.name});`);
    lines.push(`return this;`);
    lines.push(`}`);
    return lines.join('\n');
}

/**
 * creates java methods for the given fields
 * @param fieldList {{name: string, type: string, description: string}[]} contains the fields of the java class
 * @param builderName {string|undefined} name of the builder class
 * @return {string[]} a list of java methods
 */
function getJavaMethods(fieldList, builderName = undefined) {
    const methodList = [];
    for (const field of fieldList) {
        methodList.push('');
        methodList.push(getJavaMethod(field, true, builderName));
    }
    return methodList;
}

/**
 * adds an import statement of the given fieldType to the importList if necessary
 * @param fieldType {string} the type to import
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 * @param importList {string[]} list of import statements
 * @param classDirPath {string} path to the directory containing the java class
 */
function addImports(fieldType, fileMap, importList, classDirPath) {
    if (fieldType.startsWith('List<') && fieldType.endsWith('>')) {
        fieldType = fieldType.substring('List<'.length, fieldType.length - 1);
    }
    const importData = fileMap.get(fieldType.toLowerCase());
    if (importData !== undefined && importData.javaFilePath !== classDirPath) {
        const importPackage = importData.javaFilePath.replace(TARGET_DIR_PATH, PACKAGE_NAME).replaceAll('/', '.');
        const importString = `import ${importPackage}.${importData.javaFileName};`;
        if (!importList.includes(importString)) {
            importList.push(importString);
        }
    }
}

/**
 * creates a list of import statements for the java class
 * @param fieldList {{name: string, type: string, description: string}[]} contains the fields of the java class
 * @param fileData {{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}} information about the file containing the java class
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 * @param hasParent {boolean} whether the java class has a parent class
 * @return {string[]} a sorted list of import statements
 */
function getImports(fieldList, fileData, fileMap, hasParent) {
    const classPath = fileData.javaFilePath;
    const importList = [];
    if (USE_ANNOTATIONS) {
        importList.push('import com.fasterxml.jackson.annotation.JsonInclude;');
    }
    for (const field of fieldList) {
        addImports(field.type, fileMap, importList, classPath);
    }
    if (hasParent) {
        for (const parentField of PARENT_FIELDS) {
            if (parentField.name !== 'typ' && parentField.name !== 'version') {
                addImports(parentField.type, fileMap, importList, classPath);
            }
        }
    }
    if (importList.length > 0) {
        importList.sort();
        importList.unshift('');
    }
    return importList;
}

/**
 *  adds the field "typ" and corresponding methods to the fieldList and javaMethodList
 * @param fieldList {{name: string, type: string, description: string}[]} contains the fields of the java class
 * @param javaMethodList {string[]} contains the methods of the java class
 * @param fileData {{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}} information about the file containing the java class
 */
function addTypeToFieldsAndMethods(fieldList, javaMethodList, fileData) {
    const file = fs.readFileSync(fileData.jsonFilePath + '/' + fileData.jsonFileName + '.json', 'utf-8').replaceAll(' ', '').split('\n');
    let type = fileData.jsonFileName.toUpperCase();
    const hasExpectedType = file.findIndex(value => value.startsWith(`"default":"${type}"`)) !== -1;
    if (!hasExpectedType) {
        debug('Unexpected type in: ' + fileData.jsonFileName);
        const typeIndex = file.findIndex(value => value.startsWith('"_typ":'));
        const typeDefault = file.find((value, index) => index > typeIndex && value.startsWith('"default":'));
        if (typeDefault !== undefined) {
            type = typeDefault.split(':').at(1).replaceAll('"', '').replace(',', '');
        }
    }
    const field = {
        name: `typ = Typ.${type}`,
        type: 'Typ',
        description: '/**\n* Typ des Geschaeftsobjekts\n*/'
    };
    javaMethodList.unshift('', getJavaMethod({name: 'typ', type: 'Typ'}));
    fieldList.unshift(field);
}

/**
 * creates an inner builder class for the java class
 * @param classHead {string} contains the head of the java class: (public class ...)
 * @param fieldList {{name: string, type: string, description: string}[]} contains the fields of the java class
 * @param fileData {{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}} information about the file containing the java class
 * @param hasParent {boolean} whether the java class has a parent class
 * @return {string} a string containing the java classes inner builder class
 */
function getBuilderClass(classHead, fieldList, fileData, hasParent) {
    const builderName = fileData.javaFileName + 'Builder';
    let builderHead = classHead.replace('public', 'public static')
        .replace(fileData.javaFileName, builderName);
    for (const {fileName} of MISSING_PARENT_CLASSES) {
        builderHead = builderHead.replace(`${fileName} {`, `${fileName}Builder {`);
    }
    const builderFieldList = turnFieldListToJava(fieldList);
    const builderMethods = getJavaMethods(fieldList, builderName);
    const builderConstructor = [''];
    builderConstructor.push(`private ${builderName}() {`);
    builderConstructor.push('}');
    if (hasParent) {
        for (const parentField of PARENT_FIELDS) {
            if (parentField.name !== 'typ' && parentField.name !== 'version') {
                builderMethods.push('');
                builderMethods.push(overwriteParentSetter(parentField, builderName));
            }
        }
    }
    builderMethods.push('');
    builderMethods.push(`public ${fileData.javaFileName} build() {`);
    builderMethods.push(`return new ${fileData.javaFileName}(this);`);
    builderMethods.push('}');
    return ['\n' + builderHead].concat(builderFieldList, builderConstructor, builderMethods, '}')
        .join('\n').split('\n')
        .map(value => value.trimEnd()).join('\n');
}

/**
 * creates one or multiple constructors for the java class
 * @param fieldList {{name: string, type: string, description: string}[]} contains the fields of the java class
 * @param fileData {{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}} information about the file containing the java class
 * @param hasParent {boolean} whether the java class has a parent class
 * @return {string} a string containing the constructor(s)
 */
function getJavaConstructor(fieldList, fileData, hasParent) {
    const constructor = [''];
    constructor.push(`public ${fileData.javaFileName}() {`);
    constructor.push('}\n');
    constructor.push(`private ${fileData.javaFileName}(${fileData.javaFileName}Builder builder) {`);
    if (hasParent) {
        constructor.push('super(builder);');
    }
    for (const field of fieldList) {
        constructor.push(`this.${field.name} = builder.${field.name};`);
    }
    constructor.push('}');
    return constructor.join('\n');
}

/**
 * adds indentation to the java class
 * @param classString {string} the java class as a single string
 * @return {string} the input classString, now with indentation
 */
function addIndentation(classString) {
    const classLines = classString.split('\n');
    let counter = 0;
    for (let i = 0; i < classLines.length; i++) {
        if (classLines[i].trim() === '') {
            continue;
        }
        if (counter > 0 && classLines[i].includes('}')) {
            counter--;
        }
        classLines[i] = '    '.repeat(counter) + classLines[i].trim();
        if (classLines[i].includes('{')) {
            counter++;
        }
    }
    return classLines.join('\n');
}

/**
 * adjusts and improves the generated java class
 * @param contentList {string[]} content of the java class
 * @param fileData {{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}} information about the file containing the java class
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 * @return {string} the improved content of the java class as a single string
 */
function completeJavaFile(contentList, fileData, fileMap) {
    const classFoot = '}';
    const newPackageName = fileData.javaFilePath.replace(TARGET_DIR_PATH, PACKAGE_NAME).replaceAll('/', '.');
    const newPackage = contentList[0].replace('placeholder', newPackageName);
    const classIndex = contentList.findIndex(value => value.startsWith('public class'));
    if (classIndex < 0) {
        return [newPackage].concat(contentList.slice(1, contentList.length)).join('\n');
    }
    const header = contentList.slice(1, classIndex);
    let classHead = '';
    if (USE_ANNOTATIONS) {
        classHead += '@JsonInclude(JsonInclude.Include.NON_NULL)\n';
    }
    classHead += addParentToClass(contentList[classIndex], fileData.javaFilePath);
    const hasParent = classHead.includes('extends');
    const classBody = contentList.slice(classIndex + 1, contentList.length - 1);
    let fieldList = getClassFields(classBody);
    if (fieldList.length > PARENT_FIELDS.length) {
        fieldList = removeParentClassFields(fieldList);
    }
    const javaMethodList = getJavaMethods(fieldList);
    javaMethodList.push('');
    const javaStaticBuilderMethod = getJavaMethod({name: 'builder', type: `static ${fileData.javaFileName}Builder`})
        .replace('builder', `new ${fileData.javaFileName}Builder()`)
        .replace('getBuilder', 'builder');
    const javaConstructor = getJavaConstructor(fieldList, fileData, hasParent);
    const builderClass = getBuilderClass(classHead, fieldList, fileData, hasParent);
    if (fileData.javaFilePath.endsWith('/bo')) {
        addTypeToFieldsAndMethods(fieldList, javaMethodList, fileData);
    }
    const javaFieldList = turnFieldListToJava(fieldList);
    const importList = getImports(fieldList, fileData, fileMap, hasParent);
    const newClass = [newPackage].concat(importList, header, classHead, javaFieldList, javaConstructor, javaMethodList, javaStaticBuilderMethod, builderClass, classFoot);
    return addIndentation(newClass.join('\n'));
}

/**
 * restores the parent classes that are missing in the newer bo4e-schemas
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} maps lowercase fileName to fileData
 */
function restoreMissingFiles(fileMap) {
    const zaImport = fileMap.get('zusatzattribut').javaFilePath.replace(TARGET_DIR_PATH, PACKAGE_NAME).replaceAll('/', '.');
    const typImport = fileMap.get('typ').javaFilePath.replace(TARGET_DIR_PATH, PACKAGE_NAME).replaceAll('/', '.');
    MISSING_PARENT_CLASSES.forEach(({fileName, pathToFile}) => {
        if (!fileMap.has(fileName.toLowerCase())) {
            const javaFileName = fileName + '.java';
            const classPackage = PACKAGE_NAME + '.' + pathToFile.substring(0, pathToFile.length - 1).replace('/', '.');
            let fileContent = fs.readFileSync('resource_schemas/' + javaFileName, 'utf-8');
            if (USE_ANNOTATIONS) {
                fileContent = fileContent
                    .replace('public abstract class', '@JsonInclude(JsonInclude.Include.NON_NULL)\npublic abstract class')
                    .replace('import typImportPlaceholder', 'import com.fasterxml.jackson.annotation.JsonInclude;\nimport typImportPlaceholder');
            }
            fileContent = fileContent
                .replace('packagePlaceholder', classPackage)
                .replace('zaImportPlaceholder', zaImport)
                .replace('typImportPlaceholder', typImport)
                .replace('versionPlaceholder', `"${CURRENT_VERSION}"`);
            fs.writeFileSync(TARGET_DIR_PATH + '/' + pathToFile + javaFileName, fileContent);
        }
    });
}

/**
 *
 */
function prepareDirectory() {
    if (!fs.existsSync(SOURCE_DIR_PATH)) {
        console.error(`Could not find input directory ${SOURCE_DIR_PATH}`);
        process.exit(1);
    }
    if (!fs.existsSync(TARGET_DIR_PATH)) {
        if (CREATE) {
            fs.mkdirSync(TARGET_DIR_PATH, {recursive: true});
        }
        else {
            console.error(`Could not find output directory ${TARGET_DIR_PATH}`);
            process.exit(1);
        }
    }
    else if (REMOVE) {
        fs.rmSync(TARGET_DIR_PATH, {recursive: true});
        fs.mkdirSync(TARGET_DIR_PATH, {recursive: true});
    }
}

/**
 * provides the data required for generation and output
 * @return {{inputData: InputData, fileMap: Map<string, {jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>}} the data used for generation and output
 */
function readInputData() {
    prepareDirectory();
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
        name: 'StringOderNummer',
        schema: fs.readFileSync('resource_schemas/StringOderNummerTyp.json', 'utf-8')
    });
    schemaInput.addSourceSync({name: 'AllKnowing', schema: schema});
    inputData.addInput(schemaInput);
    return {inputData, fileMap};
}

/**
 * Outputs the generated classes
 * @param javaClasses {ReadonlyMap<string, SerializedRenderResult>} Map containing the generated java classes
 * @param fileMap {Map<string,{jsonFileName: string, jsonFilePath: string, javaFileName: string, javaFilePath: string}>} Maps lowercase fileName to fileData
 * @return {number, number} Amount of written and skipped files
 */
function writeOutputData(javaClasses, fileMap) {
    let writtenFilesAmount = 0;
    let skippedFilesAmount = 0;
    javaClasses.forEach((javaClass, className) => {
        const searchName = className.replace('.java', '').toLowerCase();
        const fileData = fileMap.get(searchName);
        debug(`Looking for ${className}`);
        if (fileData) {
            debug(`Found ${className} in ${fileData.jsonFilePath}`);
            debug(`Writing ${className} to ${fileData.javaFilePath}`);
            fileData.javaFileName = className.replace('.java', '');
            const content = completeJavaFile(javaClass.lines, fileData, fileMap);
            if (!KEEP || !fs.existsSync(fileData.javaFilePath + '/' + className)) {
                fs.writeFileSync(fileData.javaFilePath + '/' + className, content);
                writtenFilesAmount++;
            }
            else {
                skippedFilesAmount++;
            }
        }
    });
    return {writtenFilesAmount, skippedFilesAmount};
}

async function main() {
    await processCommandLineArguments();
    log('Reading...');
    logSettings();
    const {inputData, fileMap} = readInputData();
    const readFilesAmount = fileMap.size;
    debug(`Read ${readFilesAmount} files`);
    log('Generating...');
    quicktypeMultiFile({
        inputData,
        lang: new BO4EJavaTargetLanguage(),
        allPropertiesOptional: false
    }).then(javaClasses => {
        log('Writing...');
        const {writtenFilesAmount, skippedFilesAmount} = writeOutputData(javaClasses, fileMap);
        log(`Finished: ${writtenFilesAmount}/${readFilesAmount} (Skipped: ${skippedFilesAmount})`);
        if (readFilesAmount - writtenFilesAmount - skippedFilesAmount !== 0) {
            log(`Missing: ${readFilesAmount - writtenFilesAmount - skippedFilesAmount}`);
        }
    });
}

main().then();
