package bo4e.com;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/StandorteigenschaftenStrom.json>`_
 */
public class StandorteigenschaftenStrom extends COM {
    /**
     * Die EIC-Nummer des Bilanzierungsgebietes
     */
    private String bilanzierungsgebietEic;
    /**
     * Der Name der Regelzone
     */
    private String regelzone;
    /**
     * De EIC-Nummer der Regelzone
     */
    private String regelzoneEic;

    public String getBilanzierungsgebietEic() {
        return BilanzierungsgebietEic;
    }
    public void setBilanzierungsgebietEic(String bilanzierungsgebietEic) {
        this.bilanzierungsgebietEic = bilanzierungsgebietEic;
    }

    public String getRegelzone() {
        return Regelzone;
    }
    public void setRegelzone(String regelzone) {
        this.regelzone = regelzone;
    }

    public String getRegelzoneEic() {
        return RegelzoneEic;
    }
    public void setRegelzoneEic(String regelzoneEic) {
        this.regelzoneEic = regelzoneEic;
    }
}