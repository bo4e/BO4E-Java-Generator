package com.example.bo4e.com;

/**
 * Standorteigenschaften der Sparte Gas
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/StandorteigenschaftenGas.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `StandorteigenschaftenGas JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/StandorteigenschaftenGas.json>`_
 */
public class StandorteigenschaftenGas extends COM {
    private MarktgebietInfo[] marktgebiete;
    private String[] netzkontonummern;

    public MarktgebietInfo[] getMarktgebiete() { return marktgebiete; }
    public void setMarktgebiete(MarktgebietInfo[] value) { this.marktgebiete = value; }

    public String[] getNetzkontonummern() { return netzkontonummern; }
    public void setNetzkontonummern(String[] value) { this.netzkontonummern = value; }

}
