package placeholder;

import java.util.List;

/**
 * Mit diesem Objekt können Geschäftspartner übertragen werden.
 * Sowohl Unternehmen, als auch Privatpersonen können Geschäftspartner sein.
 * Hinweis: "Marktteilnehmer" haben ein eigenes BO, welches sich von diesem BO ableitet.
 * Hier sollte daher keine Zuordnung zu Marktrollen erfolgen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geschaeftspartner.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geschaeftspartner JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Geschaeftspartner.json>`_
 */
public class Geschaeftspartner {
    private String id;
    private Typ typ;
    private String version;
    private Adresse adresse;
    private String amtsgericht;
    private Anrede anrede;
    private List<Person> ansprechpartner;
    private List<Geschaeftspartnerrolle> geschaeftspartnerrollen;
    private String glaeubigerId;
    private String handelsregisternummer;
    private String individuelleAnrede;
    private List<Kontaktweg> kontaktwege;
    private String nachname;
    private String organisationsname;
    private Organisationstyp organisationstyp;
    private Titel titel;
    private String umsatzsteuerId;
    private String vorname;
    private String website;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Mögliche Anrede der Person
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Adresse des Geschäftspartners
     */
    public Adresse getAdresse() { return adresse; }
    public void setAdresse(Adresse value) { this.adresse = value; }

    /**
     * Amtsgericht bzw Handelsregistergericht, das die Handelsregisternummer herausgegeben hat
     */
    public String getAmtsgericht() { return amtsgericht; }
    public void setAmtsgericht(String value) { this.amtsgericht = value; }

    /**
     * Mögliche Anrede der Person
     */
    public Anrede getAnrede() { return anrede; }
    public void setAnrede(Anrede value) { this.anrede = value; }

    public List<Person> getAnsprechpartner() { return ansprechpartner; }
    public void setAnsprechpartner(List<Person> value) { this.ansprechpartner = value; }

    /**
     * Rollen, die die Geschäftspartner inne haben (z.B. Interessent, Kunde)
     */
    public List<Geschaeftspartnerrolle> getGeschaeftspartnerrollen() { return geschaeftspartnerrollen; }
    public void setGeschaeftspartnerrollen(List<Geschaeftspartnerrolle> value) { this.geschaeftspartnerrollen = value; }

    /**
     * Die Gläubiger-ID welche im Zahlungsverkehr verwendet wird; Z.B. "DE 47116789"
     */
    public String getGlaeubigerId() { return glaeubigerId; }
    public void setGlaeubigerId(String value) { this.glaeubigerId = value; }

    /**
     * Handelsregisternummer des Geschäftspartners
     */
    public String getHandelsregisternummer() { return handelsregisternummer; }
    public void setHandelsregisternummer(String value) { this.handelsregisternummer = value; }

    /**
     * Im Falle einer nicht standardisierten Anrede kann hier eine frei definierbare Anrede
     * vorgegeben werden.
     * Beispiel: "Vereinsgemeinschaft", "Pfarrer", "Hochwürdigster Herr Abt".
     */
    public String getIndividuelleAnrede() { return individuelleAnrede; }
    public void setIndividuelleAnrede(String value) { this.individuelleAnrede = value; }

    /**
     * Kontaktwege des Geschäftspartners
     */
    public List<Kontaktweg> getKontaktwege() { return kontaktwege; }
    public void setKontaktwege(List<Kontaktweg> value) { this.kontaktwege = value; }

    /**
     * Nachname (Familienname) der Person
     */
    public String getNachname() { return nachname; }
    public void setNachname(String value) { this.nachname = value; }

    /**
     * Kontaktwege des Geschäftspartners
     */
    public String getOrganisationsname() { return organisationsname; }
    public void setOrganisationsname(String value) { this.organisationsname = value; }

    /**
     * organisationsname: Optional[str] = None
     */
    public Organisationstyp getOrganisationstyp() { return organisationstyp; }
    public void setOrganisationstyp(Organisationstyp value) { this.organisationstyp = value; }

    /**
     * Möglicher Titel der Person
     */
    public Titel getTitel() { return titel; }
    public void setTitel(Titel value) { this.titel = value; }

    /**
     * Die Steuer-ID des Geschäftspartners; Beispiel: "DE 813281825"
     */
    public String getUmsatzsteuerId() { return umsatzsteuerId; }
    public void setUmsatzsteuerId(String value) { this.umsatzsteuerId = value; }

    /**
     * Vorname der Person
     */
    public String getVorname() { return vorname; }
    public void setVorname(String value) { this.vorname = value; }

    /**
     * Internetseite des Marktpartners
     */
    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
