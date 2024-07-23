package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Regionskriterium;

/**
 * Modellierung einer Region als Menge von Kriterien, die eine Region beschreiben
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Region.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Region JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Region.json>`_
 */
public class Region extends Geschaeftsobjekt {
    private final Typ _typ = Typ.REGION;
    private String bezeichnung;
    private Regionskriterium[] negativListe;
    private Regionskriterium[] positivListe;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Bezeichnung der Region
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Bezeichnung der Region
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Negativliste der Kriterien zur Definition der Region
     */
    public Regionskriterium[] getNegativListe() { return negativListe; }
    public void setNegativListe(Regionskriterium[] value) { this.negativListe = value; }

    /**
     * Positivliste der Kriterien zur Definition der Region
     */
    public Regionskriterium[] getPositivListe() { return positivListe; }
    public void setPositivListe(Regionskriterium[] value) { this.positivListe = value; }

}
