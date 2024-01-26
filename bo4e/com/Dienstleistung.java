package bo4e.com;

import com.example.bo4e.enums.Dienstleistungstyp;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Dienstleistung.json>`_
 */
public class Dienstleistung extends COM {
    private String bezeichnung;
    private Dienstleistungstyp dienstleistungstyp;

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Dienstleistungstyp getDienstleistungstyp() { return dienstleistungstyp; }
    public void setDienstleistungstyp(Dienstleistungstyp value) { this.dienstleistungstyp = value; }

}
