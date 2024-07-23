package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Adresse;
import bo4e.enums.Anrede;
import bo4e.com.Kontaktweg;
import bo4e.enums.Titel;
import bo4e.com.Zustaendigkeit;

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
public class Person extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.PERSON;
    /**
     * Adresse der Person, falls diese von der Adresse des Geschäftspartners abweicht
     */
    private Adresse adresse;
    /**
     * Mögliche Anrede der Person
     */
    private Anrede anrede;
    /**
     * Geburtsdatum der Person
     */
    private OffsetDateTime geburtsdatum;
    /**
     * Im Falle einer nicht standardisierten Anrede kann hier eine frei definierbare Anrede
     * vorgegeben werden.
     * Beispiel: "Vereinsgemeinschaft", "Pfarrer", "Hochwürdigster Herr Abt".
     */
    private String individuelleAnrede;
    /**
     * Weitere Informationen zur Person
     */
    private String kommentar;
    /**
     * Kontaktwege der Person
     */
    private List<Kontaktweg> kontaktwege;
    /**
     * Nachname (Familienname) der Person
     */
    private String nachname;
    /**
     * Möglicher Titel der Person
     */
    private Titel titel;
    /**
     * Vorname der Person
     */
    private String vorname;
    /**
     * Liste der Abteilungen und Zuständigkeiten der Person
     */
    private List<Zustaendigkeit> zustaendigkeiten;

    public Person() {}
    private Person(PersonBuilder builder) {
        this.adresse = builder.adresse;
        this.anrede = builder.anrede;
        this.geburtsdatum = builder.geburtsdatum;
        this.individuelleAnrede = builder.individuelleAnrede;
        this.kommentar = builder.kommentar;
        this.kontaktwege = builder.kontaktwege;
        this.nachname = builder.nachname;
        this.titel = builder.titel;
        this.vorname = builder.vorname;
        this.zustaendigkeiten = builder.zustaendigkeiten;
    }

    public Typ getTyp() {
        return typ;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Anrede getAnrede() {
        return anrede;
    }
    public void setAnrede(Anrede anrede) {
        this.anrede = anrede;
    }

    public OffsetDateTime getGeburtsdatum() {
        return geburtsdatum;
    }
    public void setGeburtsdatum(OffsetDateTime geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getIndividuelleAnrede() {
        return individuelleAnrede;
    }
    public void setIndividuelleAnrede(String individuelleAnrede) {
        this.individuelleAnrede = individuelleAnrede;
    }

    public String getKommentar() {
        return kommentar;
    }
    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
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

    public Titel getTitel() {
        return titel;
    }
    public void setTitel(Titel titel) {
        this.titel = titel;
    }

    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public List<Zustaendigkeit> getZustaendigkeiten() {
        return zustaendigkeiten;
    }
    public void setZustaendigkeiten(List<Zustaendigkeit> zustaendigkeiten) {
        this.zustaendigkeiten = zustaendigkeiten;
    }

    public static class PersonBuilder extends GeschaeftsobjektBuilder {
        /**
         * Adresse der Person, falls diese von der Adresse des Geschäftspartners abweicht
         */
        private Adresse adresse;
        /**
         * Mögliche Anrede der Person
         */
        private Anrede anrede;
        /**
         * Geburtsdatum der Person
         */
        private OffsetDateTime geburtsdatum;
        /**
         * Im Falle einer nicht standardisierten Anrede kann hier eine frei definierbare Anrede
         * vorgegeben werden.
         * Beispiel: "Vereinsgemeinschaft", "Pfarrer", "Hochwürdigster Herr Abt".
         */
        private String individuelleAnrede;
        /**
         * Weitere Informationen zur Person
         */
        private String kommentar;
        /**
         * Kontaktwege der Person
         */
        private List<Kontaktweg> kontaktwege;
        /**
         * Nachname (Familienname) der Person
         */
        private String nachname;
        /**
         * Möglicher Titel der Person
         */
        private Titel titel;
        /**
         * Vorname der Person
         */
        private String vorname;
        /**
         * Liste der Abteilungen und Zuständigkeiten der Person
         */
        private List<Zustaendigkeit> zustaendigkeiten;
    
        public Adresse getAdresse() {
            return adresse;
        }
        public PersonBuilder setAdresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }
    
        public Anrede getAnrede() {
            return anrede;
        }
        public PersonBuilder setAnrede(Anrede anrede) {
            this.anrede = anrede;
            return this;
        }
    
        public OffsetDateTime getGeburtsdatum() {
            return geburtsdatum;
        }
        public PersonBuilder setGeburtsdatum(OffsetDateTime geburtsdatum) {
            this.geburtsdatum = geburtsdatum;
            return this;
        }
    
        public String getIndividuelleAnrede() {
            return individuelleAnrede;
        }
        public PersonBuilder setIndividuelleAnrede(String individuelleAnrede) {
            this.individuelleAnrede = individuelleAnrede;
            return this;
        }
    
        public String getKommentar() {
            return kommentar;
        }
        public PersonBuilder setKommentar(String kommentar) {
            this.kommentar = kommentar;
            return this;
        }
    
        public List<Kontaktweg> getKontaktwege() {
            return kontaktwege;
        }
        public PersonBuilder setKontaktwege(List<Kontaktweg> kontaktwege) {
            this.kontaktwege = kontaktwege;
            return this;
        }
    
        public String getNachname() {
            return nachname;
        }
        public PersonBuilder setNachname(String nachname) {
            this.nachname = nachname;
            return this;
        }
    
        public Titel getTitel() {
            return titel;
        }
        public PersonBuilder setTitel(Titel titel) {
            this.titel = titel;
            return this;
        }
    
        public String getVorname() {
            return vorname;
        }
        public PersonBuilder setVorname(String vorname) {
            this.vorname = vorname;
            return this;
        }
    
        public List<Zustaendigkeit> getZustaendigkeiten() {
            return zustaendigkeiten;
        }
        public PersonBuilder setZustaendigkeiten(List<Zustaendigkeit> zustaendigkeiten) {
            this.zustaendigkeiten = zustaendigkeiten;
            return this;
        }
    
        public Person build() {
            return new Person(this);
        }
    }
}