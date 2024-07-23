package bo4e.com;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/AufAbschlagProOrt.json>`_
 */
public class AufAbschlagProOrt extends COM {
    /**
     * Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
     */
    private String netznr;
    /**
     * Der Ort für den der Aufschlag gilt.
     */
    private String ort;
    /**
     * Die Postleitzahl des Ortes für den der Aufschlag gilt.
     */
    private String postleitzahl;
    /**
     * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
     */
    private List<AufAbschlagstaffelProOrt> staffeln;

    public String getNetznr() {
        return Netznr;
    }
    public void setNetznr(String netznr) {
        this.netznr = netznr;
    }

    public String getOrt() {
        return Ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPostleitzahl() {
        return Postleitzahl;
    }
    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public List<AufAbschlagstaffelProOrt> getStaffeln() {
        return Staffeln;
    }
    public void setStaffeln(List<AufAbschlagstaffelProOrt> staffeln) {
        this.staffeln = staffeln;
    }
}