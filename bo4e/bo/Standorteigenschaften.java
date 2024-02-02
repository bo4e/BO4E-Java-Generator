package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.StandorteigenschaftenGas;
import com.example.bo4e.com.StandorteigenschaftenStrom;

/**
 * Modelliert die regionalen und spartenspezifischen Eigenschaften einer gegebenen Adresse.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Standorteigenschaften.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Standorteigenschaften JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Standorteigenschaften.json>`_
 */
public class Standorteigenschaften extends Geschaeftsobjekt {
    private final Typ typ = Typ.STANDORTEIGENSCHAFTEN;
    private StandorteigenschaftenGas eigenschaftenGas;
    private StandorteigenschaftenStrom[] eigenschaftenStrom;

    public Typ getTyp() { return typ; }

    public StandorteigenschaftenGas getEigenschaftenGas() { return eigenschaftenGas; }
    public void setEigenschaftenGas(StandorteigenschaftenGas value) { this.eigenschaftenGas = value; }

    public StandorteigenschaftenStrom[] getEigenschaftenStrom() { return eigenschaftenStrom; }
    public void setEigenschaftenStrom(StandorteigenschaftenStrom[] value) { this.eigenschaftenStrom = value; }

}
