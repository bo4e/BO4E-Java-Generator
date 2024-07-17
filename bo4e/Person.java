package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Object containing information about a Person
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Person.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Person JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Person.json>`_
 */
public class Person {
    private String id;
    private Typ typ;
    private String version;
    private Adresse adresse;
    private Anrede anrede;
    private OffsetDateTime geburtsdatum;
    private String individuelleAnrede;
    private String kommentar;
    private List<Kontaktweg> kontaktwege;
    private String nachname;
    private Titel titel;
    private String vorname;
    private List<ZusatzAttribut> zusatzAttribute;
    private List<Zustaendigkeit> zustaendigkeiten;

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
     * Adresse der Person, falls diese von der Adresse des Geschäftspartners abweicht
     */
    public Adresse getAdresse() { return adresse; }
    public void setAdresse(Adresse value) { this.adresse = value; }

    /**
     * Mögliche Anrede der Person
     */
    public Anrede getAnrede() { return anrede; }
    public void setAnrede(Anrede value) { this.anrede = value; }

    /**
     * Geburtsdatum der Person
     */
    public OffsetDateTime getGeburtsdatum() { return geburtsdatum; }
    public void setGeburtsdatum(OffsetDateTime value) { this.geburtsdatum = value; }

    /**
     * Im Falle einer nicht standardisierten Anrede kann hier eine frei definierbare Anrede
     * vorgegeben werden.
     * Beispiel: "Vereinsgemeinschaft", "Pfarrer", "Hochwürdigster Herr Abt".
     */
    public String getIndividuelleAnrede() { return individuelleAnrede; }
    public void setIndividuelleAnrede(String value) { this.individuelleAnrede = value; }

    /**
     * Weitere Informationen zur Person
     */
    public String getKommentar() { return kommentar; }
    public void setKommentar(String value) { this.kommentar = value; }

    /**
     * Kontaktwege der Person
     */
    public List<Kontaktweg> getKontaktwege() { return kontaktwege; }
    public void setKontaktwege(List<Kontaktweg> value) { this.kontaktwege = value; }

    /**
     * Nachname (Familienname) der Person
     */
    public String getNachname() { return nachname; }
    public void setNachname(String value) { this.nachname = value; }

    /**
     * Möglicher Titel der Person
     */
    public Titel getTitel() { return titel; }
    public void setTitel(Titel value) { this.titel = value; }

    /**
     * Vorname der Person
     */
    public String getVorname() { return vorname; }
    public void setVorname(String value) { this.vorname = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }

    /**
     * Liste der Abteilungen und Zuständigkeiten der Person
     */
    public List<Zustaendigkeit> getZustaendigkeiten() { return zustaendigkeiten; }
    public void setZustaendigkeiten(List<Zustaendigkeit> value) { this.zustaendigkeiten = value; }
}
