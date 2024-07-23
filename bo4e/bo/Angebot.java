package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Sparte;
import bo4e.com.Angebotsvariante;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Mit diesem BO kann ein Versorgungsangebot zur Strom- oder Gasversorgung oder die
 * Teilnahme an einer Ausschreibung
 * übertragen werden. Es können verschiedene Varianten enthalten sein (z.B. ein- und
 * mehrjährige Laufzeit).
 * Innerhalb jeder Variante können Teile enthalten sein, die jeweils für eine oder mehrere
 * Marktlokationen erstellt
 * werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Angebot.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebot JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Angebot.json>`_
 */
public class Angebot extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.ANGEBOT;
    /**
     * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
     */
    private String anfragereferenz;
    /**
     * Erstellungsdatum des Angebots
     */
    private OffsetDateTime angebotsdatum;
    /**
     * Ersteller des Angebots
     */
    private Geschaeftspartner angebotsgeber;
    /**
     * Empfänger des Angebots
     */
    private Geschaeftspartner angebotsnehmer;
    /**
     * Eindeutige Nummer des Angebotes
     */
    private String angebotsnummer;
    /**
     * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
     */
    private OffsetDateTime bindefrist;
    /**
     * Sparte, für die das Angebot abgegeben wird (Strom/Gas)
     */
    private Sparte sparte;
    /**
     * Person, die als Angebotsgeber das Angebots ausgestellt hat
     */
    private Person unterzeichnerAngebotsgeber;
    /**
     * Person, die als Angebotsnehmer das Angebot angenommen hat
     */
    private Person unterzeichnerAngebotsnehmer;
    /**
     * Eine oder mehrere Varianten des Angebots mit den Angebotsteilen;
     * Ein Angebot besteht mindestens aus einer Variante.
     */
    private List<Angebotsvariante> varianten;

    public Angebot() {}
    private Angebot(AngebotBuilder builder) {
        this.anfragereferenz = builder.anfragereferenz;
        this.angebotsdatum = builder.angebotsdatum;
        this.angebotsgeber = builder.angebotsgeber;
        this.angebotsnehmer = builder.angebotsnehmer;
        this.angebotsnummer = builder.angebotsnummer;
        this.bindefrist = builder.bindefrist;
        this.sparte = builder.sparte;
        this.unterzeichnerAngebotsgeber = builder.unterzeichnerAngebotsgeber;
        this.unterzeichnerAngebotsnehmer = builder.unterzeichnerAngebotsnehmer;
        this.varianten = builder.varianten;
    }

    public Typ getTyp() {
        return typ;
    }

    public String getAnfragereferenz() {
        return anfragereferenz;
    }
    public void setAnfragereferenz(String anfragereferenz) {
        this.anfragereferenz = anfragereferenz;
    }

    public OffsetDateTime getAngebotsdatum() {
        return angebotsdatum;
    }
    public void setAngebotsdatum(OffsetDateTime angebotsdatum) {
        this.angebotsdatum = angebotsdatum;
    }

    public Geschaeftspartner getAngebotsgeber() {
        return angebotsgeber;
    }
    public void setAngebotsgeber(Geschaeftspartner angebotsgeber) {
        this.angebotsgeber = angebotsgeber;
    }

    public Geschaeftspartner getAngebotsnehmer() {
        return angebotsnehmer;
    }
    public void setAngebotsnehmer(Geschaeftspartner angebotsnehmer) {
        this.angebotsnehmer = angebotsnehmer;
    }

    public String getAngebotsnummer() {
        return angebotsnummer;
    }
    public void setAngebotsnummer(String angebotsnummer) {
        this.angebotsnummer = angebotsnummer;
    }

    public OffsetDateTime getBindefrist() {
        return bindefrist;
    }
    public void setBindefrist(OffsetDateTime bindefrist) {
        this.bindefrist = bindefrist;
    }

    public Sparte getSparte() {
        return sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public Person getUnterzeichnerAngebotsgeber() {
        return unterzeichnerAngebotsgeber;
    }
    public void setUnterzeichnerAngebotsgeber(Person unterzeichnerAngebotsgeber) {
        this.unterzeichnerAngebotsgeber = unterzeichnerAngebotsgeber;
    }

    public Person getUnterzeichnerAngebotsnehmer() {
        return unterzeichnerAngebotsnehmer;
    }
    public void setUnterzeichnerAngebotsnehmer(Person unterzeichnerAngebotsnehmer) {
        this.unterzeichnerAngebotsnehmer = unterzeichnerAngebotsnehmer;
    }

    public List<Angebotsvariante> getVarianten() {
        return varianten;
    }
    public void setVarianten(List<Angebotsvariante> varianten) {
        this.varianten = varianten;
    }

    public static class AngebotBuilder extends GeschaeftsobjektBuilder {
        /**
         * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
         */
        private String anfragereferenz;
        /**
         * Erstellungsdatum des Angebots
         */
        private OffsetDateTime angebotsdatum;
        /**
         * Ersteller des Angebots
         */
        private Geschaeftspartner angebotsgeber;
        /**
         * Empfänger des Angebots
         */
        private Geschaeftspartner angebotsnehmer;
        /**
         * Eindeutige Nummer des Angebotes
         */
        private String angebotsnummer;
        /**
         * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
         */
        private OffsetDateTime bindefrist;
        /**
         * Sparte, für die das Angebot abgegeben wird (Strom/Gas)
         */
        private Sparte sparte;
        /**
         * Person, die als Angebotsgeber das Angebots ausgestellt hat
         */
        private Person unterzeichnerAngebotsgeber;
        /**
         * Person, die als Angebotsnehmer das Angebot angenommen hat
         */
        private Person unterzeichnerAngebotsnehmer;
        /**
         * Eine oder mehrere Varianten des Angebots mit den Angebotsteilen;
         * Ein Angebot besteht mindestens aus einer Variante.
         */
        private List<Angebotsvariante> varianten;
    
        public String getAnfragereferenz() {
            return anfragereferenz;
        }
        public AngebotBuilder setAnfragereferenz(String anfragereferenz) {
            this.anfragereferenz = anfragereferenz;
            return this;
        }
    
        public OffsetDateTime getAngebotsdatum() {
            return angebotsdatum;
        }
        public AngebotBuilder setAngebotsdatum(OffsetDateTime angebotsdatum) {
            this.angebotsdatum = angebotsdatum;
            return this;
        }
    
        public Geschaeftspartner getAngebotsgeber() {
            return angebotsgeber;
        }
        public AngebotBuilder setAngebotsgeber(Geschaeftspartner angebotsgeber) {
            this.angebotsgeber = angebotsgeber;
            return this;
        }
    
        public Geschaeftspartner getAngebotsnehmer() {
            return angebotsnehmer;
        }
        public AngebotBuilder setAngebotsnehmer(Geschaeftspartner angebotsnehmer) {
            this.angebotsnehmer = angebotsnehmer;
            return this;
        }
    
        public String getAngebotsnummer() {
            return angebotsnummer;
        }
        public AngebotBuilder setAngebotsnummer(String angebotsnummer) {
            this.angebotsnummer = angebotsnummer;
            return this;
        }
    
        public OffsetDateTime getBindefrist() {
            return bindefrist;
        }
        public AngebotBuilder setBindefrist(OffsetDateTime bindefrist) {
            this.bindefrist = bindefrist;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
        public AngebotBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public Person getUnterzeichnerAngebotsgeber() {
            return unterzeichnerAngebotsgeber;
        }
        public AngebotBuilder setUnterzeichnerAngebotsgeber(Person unterzeichnerAngebotsgeber) {
            this.unterzeichnerAngebotsgeber = unterzeichnerAngebotsgeber;
            return this;
        }
    
        public Person getUnterzeichnerAngebotsnehmer() {
            return unterzeichnerAngebotsnehmer;
        }
        public AngebotBuilder setUnterzeichnerAngebotsnehmer(Person unterzeichnerAngebotsnehmer) {
            this.unterzeichnerAngebotsnehmer = unterzeichnerAngebotsnehmer;
            return this;
        }
    
        public List<Angebotsvariante> getVarianten() {
            return varianten;
        }
        public AngebotBuilder setVarianten(List<Angebotsvariante> varianten) {
            this.varianten = varianten;
            return this;
        }
    
        public Angebot build() {
            return new Angebot(this);
        }
    }
}