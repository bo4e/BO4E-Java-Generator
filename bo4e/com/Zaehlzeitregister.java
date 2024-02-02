package com.example.bo4e.com;

/**
 * Mit dieser Komponente werden Zählzeitregister modelliert. Ein Zählzeitregister beschreibt
 * eine erweiterte Definition der Zählzeit
 * in Bezug auf ein Register. Dabei werden alle Codes dazu vom Netzbetreiber vergeben.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zaehlzeitregister.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zaehlzeitregister JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Zaehlzeitregister.json>`_
 */
public class Zaehlzeitregister extends COM {
    private Boolean istSchwachlastfaehig;
    private String zaehlzeitDefinition;
    private String zaehlzeitRegister;

    public Boolean getIstSchwachlastfaehig() { return istSchwachlastfaehig; }
    public void setIstSchwachlastfaehig(Boolean value) { this.istSchwachlastfaehig = value; }

    public String getZaehlzeitDefinition() { return zaehlzeitDefinition; }
    public void setZaehlzeitDefinition(String value) { this.zaehlzeitDefinition = value; }

    public String getZaehlzeitRegister() { return zaehlzeitRegister; }
    public void setZaehlzeitRegister(String value) { this.zaehlzeitRegister = value; }

}
