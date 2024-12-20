# BO4E-Java-Generator

This repository contains the code and workflow used to generate java classes implementing
the [BO4E-Standard](https://bo4e.github.io/BO4E-python/stable).
It uses the [BO4E-Schemas](https://github.com/bo4e/BO4E-Schemas) and the results are automatically published
to [BO4E-Java](https://github.com/TimoMolls/BO4E-Java).

## Synopsis

- node quicktype.js [*options*] **--output** *dir* **--input** *dir*
- node quicktype.js **--help**

## Options

| name     | alias | type      | description                                                                     |
|----------|-------|-----------|---------------------------------------------------------------------------------|
| input    | i     | string    | The input directory that holds the json-schemas and defines the file structure. |   
| output   | o     | string    | The output directory.                                                           |    
| package  | p     | string... | The package to put in the classes package signature (default: same as output).  |                                        
| keep     | k     | boolean   | Prevent overwriting of existing files.                                          |
| remove   | r     | boolean   | Delete all existing files in output directory.                                  |
| create   | c     | boolean   | Create output directory if it does not exist.                                   |
| annotate | a     | boolean   | Add JsonInclude Annotations.                                                    |
| verbose  | v     | boolean   | Turn on debugging output.                                                       |                       
| quiet    | q     | boolean   | Silence output.                                                                 |                        
| help     | h     | boolean   | Display an usage guide.                                                         |

## Important to note

- all fields are *nullable*
- *dates* are of type **OffsetDateTime**
- uses **List**, not *array*
- all classes in *bo* extend **Geschaeftsobjekt**
- all classes in *com* extend **COM**
- **Geschaeftsobjekt** and **COM** are added, even if not included in the *schemas*
- *version* was renamed to **boVersion** since there already is a version field in **Lastgang**
- every class has a *no-args-constructor* and a **Builder** but no *all-args-constructor*
- Comments are copied from the schemas, their correctness is not validated