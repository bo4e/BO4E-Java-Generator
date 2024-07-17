package placeholder;

import java.util.List;

/**
 * Mit diesem BO werden alle Geräte modelliert, die keine Zähler sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geraet.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geraet JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Geraet.json>`_
 */
public class Geraet {
    private String id;
    private Typ typ;
    private String version;
    private String bezeichnung;
    private Geraeteklasse geraeteklasse;
    private String geraetenummer;
    private Geraetetyp geraetetyp;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Bezeichnung des Geräts
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Die übergreifende Klasse eines Geräts, beispielsweise Wandler
     */
    public Geraeteklasse getGeraeteklasse() { return geraeteklasse; }
    public void setGeraeteklasse(Geraeteklasse value) { this.geraeteklasse = value; }

    /**
     * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
     */
    public String getGeraetenummer() { return geraetenummer; }
    public void setGeraetenummer(String value) { this.geraetenummer = value; }

    /**
     * Der speziellere Typ eines Gerätes, beispielsweise Stromwandler
     */
    public Geraetetyp getGeraetetyp() { return geraetetyp; }
    public void setGeraetetyp(Geraetetyp value) { this.geraetetyp = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
