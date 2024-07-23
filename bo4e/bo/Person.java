package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Adresse;
import bo4e.enums.Anrede;
import bo4e.com.Kontaktweg;
import bo4e.enums.Titel;
import bo4e.com.Zustaendigkeit;
import java.time.OffsetDateTime;

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
public class Person extends Geschaeftsobjekt {
    private final Typ _typ = Typ.PERSON;
    private Adresse adresse;
    private Anrede anrede;
    private OffsetDateTime geburtsdatum;
    private String individuelleAnrede;
    private String kommentar;
    private Kontaktweg[] kontaktwege;
    private String nachname;
    private Titel titel;
    private String vorname;
    private Zustaendigkeit[] zustaendigkeiten;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Mögliche Anrede der Person
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
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
    public Kontaktweg[] getKontaktwege() { return kontaktwege; }
    public void setKontaktwege(Kontaktweg[] value) { this.kontaktwege = value; }

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

    /**
     * Liste der Abteilungen und Zuständigkeiten der Person
     */
    public Zustaendigkeit[] getZustaendigkeiten() { return zustaendigkeiten; }
    public void setZustaendigkeiten(Zustaendigkeit[] value) { this.zustaendigkeiten = value; }
}
