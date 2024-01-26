const {JSONSchemaInput, FetchingJSONSchemaStore, InputData, quicktypeMultiFile,
    javaOptions,
    JavaTargetLanguage,
    getOptionValues,
    JavaRenderer
} = require("quicktype-core");
const fs = require("node:fs");
const {BooleanOption, StringOption} = require("quicktype-core/dist/RendererOptions");
const {JacksonRenderer} = require("quicktype-core/dist/language/Java");

const newJavaOptions = {
    useList: javaOptions.useList,
    justTypes: new BooleanOption("just-types", "Plain types only", true),
    dateTimeProvider: javaOptions.dateTimeProvider,
    acronymStyle: javaOptions.acronymStyle,
    packageName: new StringOption("package", "Generated package name", "NAME", "bo4e"),
    lombok: javaOptions.lombok,
    lombokCopyAnnotations: javaOptions.lombokCopyAnnotations
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

async function generateClasses(path, file) {
    const schemaInput = new JSONSchemaInput(new FetchingJSONSchemaStore());
    schemaInput.addSourceSync({name: "StringOderNummer", schema: fs.readFileSync("resource_schemas/StringOderNummerTyp.json", "utf-8")});
    schemaInput.addSourceSync({ name: file.substring(0, file.length - 5), schema: fs.readFileSync(path, 'utf-8')});
    const inputData = new InputData();
    inputData.addInput(schemaInput);

    return await quicktypeMultiFile({
        inputData,
        lang: new NewJavaTargetLanguage(),
        allPropertiesOptional: true
    });
}

async function generateFromFiles(files, source, target, dirname) {
    let counter = 0;
    for (const file of files) {
        const path = source + '/' + file;
        if (fs.statSync(path).isFile()) {
            counter++;
            const javaClasses = await generateClasses(path, file);
            const className = file.substring(0, file.length - 5) + ".java";
            let javaClass = javaClasses.get(className);
            if (!javaClass) {
                javaClasses.forEach((value, key) => {
                    if (key.toLowerCase() === className.toLowerCase()) javaClass = value;
                });
            }
            if (dirname !== source) {
                if (dirname === "com" && className !== "COM.java") {
                    const index = javaClass.lines.findIndex((value) => value.startsWith("public class"));
                    javaClass.lines[index] = javaClass.lines[index].substring(0, javaClass.lines[index].length - 1) + "extends COM {";
                }
                if (!fs.existsSync(target + "/" + dirname)) {
                    fs.mkdirSync(target + "/" + dirname);
                }
                const index = javaClass.lines.findIndex((value) => value.startsWith("package"));
                javaClass.lines[index] = javaClass.lines[index].substring(0, javaClass.lines[index].length - 1) + "." + dirname + ";";
                fs.writeFileSync(target + "/" + dirname + "/" + className, javaClass.lines.join("\n"));
            } else {
                fs.writeFileSync(target + "/" + className, javaClass.lines.join("\n"));
            }
            console.log(className + " erstellt");
        } else {
            const newFiles = fs.readdirSync(path);
            counter += await generateFromFiles(newFiles, path, target, file);
        }
    }
    return counter;
}

function main(source, target) {
    const files = fs.readdirSync(source);
    generateFromFiles(files, source, target, source).then((counter) => {
        // const boCount = fs.readdirSync(source + "/bo").length;
        // const comCount = fs.readdirSync(source + "/com").length;
        // const enumCount = fs.readdirSync(source + "/enum").length;
        // const boCountG = fs.readdirSync(target + "/bo").length;
        // const comCountG = fs.readdirSync(target + "/com").length;
        // const enumCountG = fs.readdirSync(target + "/enum").length;
        // console.log("\nEinzulesende Dateien: " + (fs.readdirSync(source).length - 3 + boCount + comCount + enumCount));
        // console.log("Eingelesene Dateien: " + counter);
        // console.log("Erstellte Dateien: " + (fs.readdirSync(target).length - 3 + boCountG + comCountG + enumCountG));
        // console.log("Bo: " + boCountG + "/" + boCount);
        // console.log("Com: " + comCountG + "/" + comCount);
        // console.log("Enum: " + enumCountG + "/" + enumCount);
        // generateConverter(target);
    });
}

main("bo4e_schemas", "bo4e");
