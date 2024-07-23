package bo4e.com;

import bo4e.enums.Dienstleistungstyp;

import java.util.List;

/**
 * Abbildung einer abrechenbaren Dienstleistung.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Dienstleistung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Dienstleistung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Dienstleistung.json>`_
 */
public class Dienstleistung extends COM {
    /**
     * Bezeichnung der Dienstleistung
     */
    private String bezeichnung;
    /**
     * Kennzeichnung der Dienstleistung
     */
    private Dienstleistungstyp dienstleistungstyp;

    public String getBezeichnung() {
        return Bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Dienstleistungstyp getDienstleistungstyp() {
        return Dienstleistungstyp;
    }
    public void setDienstleistungstyp(Dienstleistungstyp dienstleistungstyp) {
        this.dienstleistungstyp = dienstleistungstyp;
    }
}