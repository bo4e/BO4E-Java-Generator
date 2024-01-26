package bo4e.com;

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen abgebildet werden
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/TarifpreispositionProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TarifpreispositionProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/TarifpreispositionProOrt.json>`_
 */
public class TarifpreispositionProOrt extends COM {
    private String netznr;
    private String ort;
    private String postleitzahl;
    private TarifpreisstaffelProOrt[] preisstaffeln;

    public String getNetznr() { return netznr; }
    public void setNetznr(String value) { this.netznr = value; }

    public String getOrt() { return ort; }
    public void setOrt(String value) { this.ort = value; }

    public String getPostleitzahl() { return postleitzahl; }
    public void setPostleitzahl(String value) { this.postleitzahl = value; }

    public TarifpreisstaffelProOrt[] getPreisstaffeln() { return preisstaffeln; }
    public void setPreisstaffeln(TarifpreisstaffelProOrt[] value) { this.preisstaffeln = value; }

}
