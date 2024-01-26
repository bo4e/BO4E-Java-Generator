package bo4e.com;

/**
 * Informationen zum Marktgebiet im Gas.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/MarktgebietInfo.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `MarktgebietInfo JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/MarktgebietInfo.json>`_
 */
public class MarktgebietInfo extends COM {
    private String marktgebiet;
    private String marktgebietcode;

    public String getMarktgebiet() { return marktgebiet; }
    public void setMarktgebiet(String value) { this.marktgebiet = value; }

    public String getMarktgebietcode() { return marktgebietcode; }
    public void setMarktgebietcode(String value) { this.marktgebietcode = value; }

}
