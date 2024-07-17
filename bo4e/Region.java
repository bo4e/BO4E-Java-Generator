package placeholder;

import java.util.List;

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
public class Region {
    private String id;
    private Typ typ;
    private String version;
    private String bezeichnung;
    private List<Regionskriterium> negativListe;
    private List<Regionskriterium> positivListe;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Bezeichnung der Region
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Bezeichnung der Region
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Negativliste der Kriterien zur Definition der Region
     */
    public List<Regionskriterium> getNegativListe() { return negativListe; }
    public void setNegativListe(List<Regionskriterium> value) { this.negativListe = value; }

    /**
     * Positivliste der Kriterien zur Definition der Region
     */
    public List<Regionskriterium> getPositivListe() { return positivListe; }
    public void setPositivListe(List<Regionskriterium> value) { this.positivListe = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
