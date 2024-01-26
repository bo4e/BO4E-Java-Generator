package bo4e.com;

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen im Zusammenhang
 * mit örtlichen Gültigkeiten abgebildet werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/AufAbschlagProOrt.json>`_
 */
public class AufAbschlagProOrt extends COM {
    private String netznr;
    private String ort;
    private String postleitzahl;
    private AufAbschlagstaffelProOrt[] staffeln;

    public String getNetznr() { return netznr; }
    public void setNetznr(String value) { this.netznr = value; }

    public String getOrt() { return ort; }
    public void setOrt(String value) { this.ort = value; }

    public String getPostleitzahl() { return postleitzahl; }
    public void setPostleitzahl(String value) { this.postleitzahl = value; }

    public AufAbschlagstaffelProOrt[] getStaffeln() { return staffeln; }
    public void setStaffeln(AufAbschlagstaffelProOrt[] value) { this.staffeln = value; }

}
