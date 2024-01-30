// const {JSONSchemaInput, FetchingJSONSchemaStore, InputData, quicktypeMultiFile,
//     javaOptions,
//     JavaTargetLanguage,
//     getOptionValues,
//     JavaRenderer
// } = require("quicktype-core");
// const fs = require("node:fs");
// const {BooleanOption, StringOption} = require("quicktype-core/dist/RendererOptions");
// const {JacksonRenderer} = require("quicktype-core/dist/language/Java");
//
// const packageName = "com.example";
// const targetDirName = "bo4e";
// const sourceDirName = "bo4e_schemas";
// const currentVersion = "202401.0.0";
// const newJavaOptions = {
//     useList: javaOptions.useList,
//     justTypes: new BooleanOption("just-types", "Plain types only", true),
//     dateTimeProvider: javaOptions.dateTimeProvider,
//     acronymStyle: javaOptions.acronymStyle,
//     packageName: new StringOption("package", "Generated package name", "NAME", packageName + "." + targetDirName),
//     lombok: javaOptions.lombok,
//     lombokCopyAnnotations: javaOptions.lombokCopyAnnotations
// }
// const baseclassForDir = [
//     {class: "Geschaeftsobjekt", dir: "bo"},
//     {class: "COM", dir: "com"}
// ]
//
// class NewJavaTargetLanguage extends JavaTargetLanguage {
//     constructor() {
//         super();
//     }
//
//     getOptions() {
//         return [
//             newJavaOptions.useList,
//             newJavaOptions.justTypes,
//             newJavaOptions.dateTimeProvider,
//             newJavaOptions.acronymStyle,
//             newJavaOptions.packageName,
//             newJavaOptions.lombok,
//             newJavaOptions.lombokCopyAnnotations
//         ];
//     }
//
//     makeRenderer(renderContext, untypedOptionValues) {
//         const options = getOptionValues(newJavaOptions, untypedOptionValues);
//         if (options.justTypes) {
//             return new JavaRenderer(this, renderContext, options);
//         }
//         return new JacksonRenderer(this, renderContext, options);
//     }
// }
//
// function generateConverter(target) {
//     const schemaInput = new JSONSchemaInput(new FetchingJSONSchemaStore());
//     schemaInput.addSourceSync({name: "StringOderNummer", schema: fs.readFileSync("resource_schemas/StringOderNummerTyp.json", "utf-8")});
//     const inputData = new InputData();
//     inputData.addInput(schemaInput);
//
//     quicktypeMultiFile({
//         inputData,
//         lang: new NewJavaTargetLanguage(),
//         allPropertiesOptional: true
//     }).then(javaClasses => {
//        javaClasses.forEach((javaClass, className) => {
//            if (className !== "StringOderNummer.java") {
//                fs.writeFileSync(target + "/" + className, javaClass.lines.join("\n"));
//            }
//        });
//     });
// }
//
// async function generateClasses(path, file) {
//     const schemaInput = new JSONSchemaInput(new FetchingJSONSchemaStore());
//     schemaInput.addSourceSync({name: "StringOderNummer", schema: fs.readFileSync("resource_schemas/StringOderNummerTyp.json", "utf-8")});
//     schemaInput.addSourceSync({ name: file.replace(".json", ""), schema: fs.readFileSync(path, 'utf-8')});
//     const inputData = new InputData();
//     inputData.addInput(schemaInput);
//
//     return await quicktypeMultiFile({
//         inputData,
//         lang: new NewJavaTargetLanguage()
//     });
// }
//
// async function generateFromFileMap(fileMap = new Map, source, target) {
//     fileMap.forEach((value, key) => {
//         generateClasses(`${value}/${key}.json`, key).then(classMap => {
//             let javaClass = classMap.get(`${key}.java`);
//             if (!javaClass) {
//                 classMap.forEach((value1, key1) => value1)
//             }
//         });
//     });
// }
//
// async function generateFromFiles(files, source, target, dirname, fileMap) {
//     let counter = 0;
//     for (const file of files) {
//         const path = source + '/' + file;
//         if (fs.statSync(path).isFile()) {
//             counter++;
//             const javaClasses = await generateClasses(path, file);
//             const className = file.replace(".json", "");
//             let javaClass = javaClasses.get(className);
//             if (!javaClass) {
//                 javaClasses.forEach((value, key) => {
//                     if (key.toLowerCase().replace(".java", "") === className.toLowerCase()) javaClass = value;
//                 });
//             }
//             if (dirname !== source) {
//                 const base = baseclassForDir.find(value => value.dir === dirname);
//                 if (base && base.class !== className) {
//                     const index = javaClass.lines.findIndex((value) => value.startsWith("public class"));
//                     javaClass.lines[index] = javaClass.lines[index].replace("{", "extend with " + base.class + " {");
//                 }
//                 if (!fs.existsSync(target + "/" + dirname)) {
//                     fs.mkdirSync(target + "/" + dirname);
//                 }
//                 const index = javaClass.lines.findIndex((value) => value.startsWith("package"));
//                 javaClass.lines[index] = javaClass.lines[index].substring(0, javaClass.lines[index].length - 1) + "." + dirname + ";";
//                 fs.writeFileSync(target + "/" + dirname + "/" + className, javaClass.lines.join("\n"));
//             } else {
//                 fs.writeFileSync(target + "/" + className, javaClass.lines.join("\n"));
//             }
//             console.log(className + " erstellt");
//         } else {
//             const newFiles = fs.readdirSync(path);
//             counter += await generateFromFiles(newFiles, path, target, file);
//         }
//     }
//     return counter;
// }
//
// function generateFileMap(source, fileMap = new Map) {
//     const files = fs.readdirSync(source);
//     for (const file of files) {
//         const path = source + '/' + file;
//         if (fs.statSync(path).isFile()) {
//             fileMap.set(file.replace(".json", "").toLowerCase(), source);
//         } else {
//             fileMap = generateFileMap(path, fileMap);
//         }
//     }
//     return fileMap;
// }
//
// function main(source = sourceDirName, target = targetDirName) {
//     const files = fs.readdirSync(source);
//     const fileMap = generateFileMap(source);
//     generateFromFiles(files, source, target, source, fileMap).then((counter) => {
//         output(counter, source, target);
//     });
// }
//
// function output(counter, source, target) {
//     const boCount = fs.readdirSync(source + "/bo").length;
//     const comCount = fs.readdirSync(source + "/com").length;
//     const enumCount = fs.readdirSync(source + "/enum").length;
//     const boCountG = fs.readdirSync(target + "/bo").length;
//     const comCountG = fs.readdirSync(target + "/com").length;
//     const enumCountG = fs.readdirSync(target + "/enums").length;
//     console.log("\nEinzulesende Dateien: " + (fs.readdirSync(source).length - 3 + boCount + comCount + enumCount));
//     console.log("Eingelesene Dateien: " + counter);
//     console.log("Erstellte Dateien: " + (fs.readdirSync(target).length - 3 + boCountG + comCountG + enumCountG));
//     console.log("Bo: " + boCountG + "/" + boCount);
//     console.log("Com: " + comCountG + "/" + comCount);
//     console.log("Enum: " + enumCountG + "/" + enumCount);
// }
//
// main("bo4e_schemas", "bo4e");
