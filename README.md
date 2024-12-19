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
| output   | o     | string    | The output directory (will be included in package signature).                   |    
| package  | p     | string... | Additional packages to add to the classes package signature.                    |                                        
| keep     | k     | boolean   | Prevent overwriting of existing files.                                          |
| remove   | r     | boolean   | Delete all existing files in output directory.                                  |
| create   | c     | boolean   | Create output directory if it does not exist.                                   |
| annotate | a     | boolean   | Add JsonInclude Annotations.                                                    |
| verbose  | v     | boolean   | Turn on debugging output.                                                       |                       
| quiet    | q     | boolean   | Silence output.                                                                 |                        
| help     | h     | boolean   | Display an usage guide.                                                         |
