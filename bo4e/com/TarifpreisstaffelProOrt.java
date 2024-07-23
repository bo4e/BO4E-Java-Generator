package bo4e.com;

import java.util.List;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/TarifpreisstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TarifpreisstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/TarifpreisstaffelProOrt.json>`_
 */
public class TarifpreisstaffelProOrt extends COM {
    /**
     * Der Arbeitspreis in ct/kWh
     */
    private Double arbeitspreis;
    /**
     * Der Arbeitspreis für Verbräuche in der Niedertarifzeit in ct/kWh
     */
    private Double arbeitspreisNT;
    /**
     * Der Grundpreis in Euro/Jahr
     */
    private Double grundpreis;
    /**
     * Oberer Wert, bis zu dem die Staffel gilt (exklusive)
     */
    private Double staffelgrenzeBis;
    /**
     * Unterer Wert, ab dem die Staffel gilt (inklusive)
     */
    private Double staffelgrenzeVon;

    public Double getArbeitspreis() {
        return arbeitspreis;
    }
    public void setArbeitspreis(Double arbeitspreis) {
        this.arbeitspreis = arbeitspreis;
    }

    public Double getArbeitspreisNT() {
        return arbeitspreisNT;
    }
    public void setArbeitspreisNT(Double arbeitspreisNT) {
        this.arbeitspreisNT = arbeitspreisNT;
    }

    public Double getGrundpreis() {
        return grundpreis;
    }
    public void setGrundpreis(Double grundpreis) {
        this.grundpreis = grundpreis;
    }

    public Double getStaffelgrenzeBis() {
        return staffelgrenzeBis;
    }
    public void setStaffelgrenzeBis(Double staffelgrenzeBis) {
        this.staffelgrenzeBis = staffelgrenzeBis;
    }

    public Double getStaffelgrenzeVon() {
        return staffelgrenzeVon;
    }
    public void setStaffelgrenzeVon(Double staffelgrenzeVon) {
        this.staffelgrenzeVon = staffelgrenzeVon;
    }
}