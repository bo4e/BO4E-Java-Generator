package bo4e.com;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/TarifpreispositionProOrt.json>`_
 */
public class TarifpreispositionProOrt extends COM {
    /**
     * ene't-Netznummer des Netzes in dem der Preis gilt
     */
    private String netznr;
    /**
     * Ort für den der Preis gilt
     */
    private String ort;
    /**
     * Postleitzahl des Ortes für den der Preis gilt
     */
    private String postleitzahl;
    private List<TarifpreisstaffelProOrt> preisstaffeln;

    public String getNetznr() {
        return netznr;
    }
    public void setNetznr(String netznr) {
        this.netznr = netznr;
    }

    public String getOrt() {
        return ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }
    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public List<TarifpreisstaffelProOrt> getPreisstaffeln() {
        return preisstaffeln;
    }
    public void setPreisstaffeln(List<TarifpreisstaffelProOrt> preisstaffeln) {
        this.preisstaffeln = preisstaffeln;
    }
}