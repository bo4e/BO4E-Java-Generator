package placeholder;

import java.util.List;

/**
 * Object containing information about a Messlokation
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Messlokation.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Messlokation JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Messlokation.json>`_
 */
public class Messlokation {
    private String id;
    private Typ typ;
    private String version;
    private Geokoordinaten geoadresse;
    private List<Geraet> geraete;
    private String grundzustaendigerMsbCodenr;
    private String grundzustaendigerMsbimCodenr;
    private Katasteradresse katasterinformation;
    private Adresse messadresse;
    private List<Dienstleistung> messdienstleistung;
    private String messgebietnr;
    private String messlokationsId;
    private List<Zaehler> messlokationszaehler;
    private Netzebene netzebeneMessung;
    private Sparte sparte;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * katasterinformation: Optional["Katasteradresse"] = None
     */
    public Geokoordinaten getGeoadresse() { return geoadresse; }
    public void setGeoadresse(Geokoordinaten value) { this.geoadresse = value; }

    /**
     * Liste der Geräte, die zu dieser Messstelle gehört
     */
    public List<Geraet> getGeraete() { return geraete; }
    public void setGeraete(List<Geraet> value) { this.geraete = value; }

    /**
     * grundzustaendiger_msbim_codenr: Optional[str] = None
     */
    public String getGrundzustaendigerMsbCodenr() { return grundzustaendigerMsbCodenr; }
    public void setGrundzustaendigerMsbCodenr(String value) { this.grundzustaendigerMsbCodenr = value; }

    /**
     * # only one of the following three optional address attributes can be set
     * messadresse: Optional["Adresse"] = None
     */
    public String getGrundzustaendigerMsbimCodenr() { return grundzustaendigerMsbimCodenr; }
    public void setGrundzustaendigerMsbimCodenr(String value) { this.grundzustaendigerMsbimCodenr = value; }

    /**
     * Alternativ zu einer postalischen Adresse und Geokoordinaten kann hier eine Ortsangabe
     * mittels Gemarkung und
     * Flurstück erfolgen.
     */
    public Katasteradresse getKatasterinformation() { return katasterinformation; }
    public void setKatasterinformation(Katasteradresse value) { this.katasterinformation = value; }

    /**
     * geoadresse: Optional["Geokoordinaten"] = None
     */
    public Adresse getMessadresse() { return messadresse; }
    public void setMessadresse(Adresse value) { this.messadresse = value; }

    /**
     * Liste der Messdienstleistungen, die zu dieser Messstelle gehört
     */
    public List<Dienstleistung> getMessdienstleistung() { return messdienstleistung; }
    public void setMessdienstleistung(List<Dienstleistung> value) { this.messdienstleistung = value; }

    /**
     * Die Nummer des Messgebietes in der ene't-Datenbank
     */
    public String getMessgebietnr() { return messgebietnr; }
    public void setMessgebietnr(String value) { this.messgebietnr = value; }

    /**
     * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
     */
    public String getMesslokationsId() { return messlokationsId; }
    public void setMesslokationsId(String value) { this.messlokationsId = value; }

    /**
     * Zähler, die zu dieser Messlokation gehören
     */
    public List<Zaehler> getMesslokationszaehler() { return messlokationszaehler; }
    public void setMesslokationszaehler(List<Zaehler> value) { this.messlokationszaehler = value; }

    /**
     * Spannungsebene der Messung
     */
    public Netzebene getNetzebeneMessung() { return netzebeneMessung; }
    public void setNetzebeneMessung(Netzebene value) { this.netzebeneMessung = value; }

    /**
     * Sparte der Messlokation, z.B. Gas oder Strom
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
