package bo4e.com;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/StandorteigenschaftenGas.json>`_
 */
public class StandorteigenschaftenGas extends COM {
    /**
     * Netzkontonummern der Gasnetze
     */
    private List<MarktgebietInfo> marktgebiete;
    /**
     * Netzkontonummern der Gasnetze
     */
    private List<String> netzkontonummern;

    public List<MarktgebietInfo> getMarktgebiete() {
        return marktgebiete;
    }
    public void setMarktgebiete(List<MarktgebietInfo> marktgebiete) {
        this.marktgebiete = marktgebiete;
    }

    public List<String> getNetzkontonummern() {
        return netzkontonummern;
    }
    public void setNetzkontonummern(List<String> netzkontonummern) {
        this.netzkontonummern = netzkontonummern;
    }
}