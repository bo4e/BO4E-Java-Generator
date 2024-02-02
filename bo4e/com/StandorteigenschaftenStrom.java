package com.example.bo4e.com;

/**
 * Standorteigenschaften der Sparte Strom
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/StandorteigenschaftenStrom.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `StandorteigenschaftenStrom JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/StandorteigenschaftenStrom.json>`_
 */
public class StandorteigenschaftenStrom extends COM {
    private String bilanzierungsgebietEic;
    private String regelzone;
    private String regelzoneEic;

    public String getBilanzierungsgebietEic() { return bilanzierungsgebietEic; }
    public void setBilanzierungsgebietEic(String value) { this.bilanzierungsgebietEic = value; }

    public String getRegelzone() { return regelzone; }
    public void setRegelzone(String value) { this.regelzone = value; }

    public String getRegelzoneEic() { return regelzoneEic; }
    public void setRegelzoneEic(String value) { this.regelzoneEic = value; }

}
