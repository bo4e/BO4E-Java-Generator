package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Adresse;
import bo4e.enums.Anrede;
import bo4e.enums.Geschaeftspartnerrolle;
import bo4e.com.Kontaktweg;
import bo4e.enums.Organisationstyp;
import bo4e.enums.Titel;

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
public class Geschaeftspartner extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.GESCHAEFTSPARTNER;
    /**
     * Adresse des Geschäftspartners
     */
    private Adresse adresse;
    /**
     * Amtsgericht bzw Handelsregistergericht, das die Handelsregisternummer herausgegeben hat
     */
    private String amtsgericht;
    /**
     * Mögliche Anrede der Person
     */
    private Anrede anrede;
    private List<Person> ansprechpartner;
    /**
     * Rollen, die die Geschäftspartner inne haben (z.B. Interessent, Kunde)
     */
    private List<Geschaeftspartnerrolle> geschaeftspartnerrollen;
    /**
     * Die Gläubiger-ID welche im Zahlungsverkehr verwendet wird; Z.B. "DE 47116789"
     */
    private String glaeubigerId;
    /**
     * Handelsregisternummer des Geschäftspartners
     */
    private String handelsregisternummer;
    /**
     * Im Falle einer nicht standardisierten Anrede kann hier eine frei definierbare Anrede
     * vorgegeben werden.
     * Beispiel: "Vereinsgemeinschaft", "Pfarrer", "Hochwürdigster Herr Abt".
     */
    private String individuelleAnrede;
    /**
     * Kontaktwege des Geschäftspartners
     */
    private List<Kontaktweg> kontaktwege;
    /**
     * Nachname (Familienname) der Person
     */
    private String nachname;
    /**
     * Kontaktwege des Geschäftspartners
     */
    private String organisationsname;
    /**
     * organisationsname: Optional[str] = None
     */
    private Organisationstyp organisationstyp;
    /**
     * Möglicher Titel der Person
     */
    private Titel titel;
    /**
     * Die Steuer-ID des Geschäftspartners; Beispiel: "DE 813281825"
     */
    private String umsatzsteuerId;
    /**
     * Vorname der Person
     */
    private String vorname;
    /**
     * Internetseite des Marktpartners
     */
    private String website;

    public Typ getTyp() {
        return typ;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getAmtsgericht() {
        return amtsgericht;
    }
    public void setAmtsgericht(String amtsgericht) {
        this.amtsgericht = amtsgericht;
    }

    public Anrede getAnrede() {
        return anrede;
    }
    public void setAnrede(Anrede anrede) {
        this.anrede = anrede;
    }

    public List<Person> getAnsprechpartner() {
        return ansprechpartner;
    }
    public void setAnsprechpartner(List<Person> ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    public List<Geschaeftspartnerrolle> getGeschaeftspartnerrollen() {
        return geschaeftspartnerrollen;
    }
    public void setGeschaeftspartnerrollen(List<Geschaeftspartnerrolle> geschaeftspartnerrollen) {
        this.geschaeftspartnerrollen = geschaeftspartnerrollen;
    }

    public String getGlaeubigerId() {
        return glaeubigerId;
    }
    public void setGlaeubigerId(String glaeubigerId) {
        this.glaeubigerId = glaeubigerId;
    }

    public String getHandelsregisternummer() {
        return handelsregisternummer;
    }
    public void setHandelsregisternummer(String handelsregisternummer) {
        this.handelsregisternummer = handelsregisternummer;
    }

    public String getIndividuelleAnrede() {
        return individuelleAnrede;
    }
    public void setIndividuelleAnrede(String individuelleAnrede) {
        this.individuelleAnrede = individuelleAnrede;
    }

    public List<Kontaktweg> getKontaktwege() {
        return kontaktwege;
    }
    public void setKontaktwege(List<Kontaktweg> kontaktwege) {
        this.kontaktwege = kontaktwege;
    }

    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getOrganisationsname() {
        return organisationsname;
    }
    public void setOrganisationsname(String organisationsname) {
        this.organisationsname = organisationsname;
    }

    public Organisationstyp getOrganisationstyp() {
        return organisationstyp;
    }
    public void setOrganisationstyp(Organisationstyp organisationstyp) {
        this.organisationstyp = organisationstyp;
    }

    public Titel getTitel() {
        return titel;
    }
    public void setTitel(Titel titel) {
        this.titel = titel;
    }

    public String getUmsatzsteuerId() {
        return umsatzsteuerId;
    }
    public void setUmsatzsteuerId(String umsatzsteuerId) {
        this.umsatzsteuerId = umsatzsteuerId;
    }

    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
}