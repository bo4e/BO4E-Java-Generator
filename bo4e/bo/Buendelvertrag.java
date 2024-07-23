package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Sparte;
import bo4e.com.Unterschrift;
import bo4e.enums.Vertragsart;
import bo4e.com.Vertragskonditionen;
import bo4e.enums.Vertragsstatus;
import bo4e.ZusatzAttribut;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Abbildung eines Bündelvertrags.
 * Es handelt sich hierbei um eine Liste von Einzelverträgen, die in einem Vertragsobjekt
 * gebündelt sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Buendelvertrag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Buendelvertrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Buendelvertrag.json>`_
 */
public class Buendelvertrag extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.BUENDELVERTRAG;
    /**
     * Beschreibung zum Vertrag
     */
    private String beschreibung;
    /**
     * Die Liste mit den Einzelverträgen zu den Abnahmestellen
     */
    private List<Vertrag> einzelvertraege;
    /**
     * Unterscheidungsmöglichkeiten für die Sparte
     */
    private Sparte sparte;
    /**
     * Unterzeichner des Vertragspartners1
     */
    private List<Unterschrift> unterzeichnervp1;
    /**
     * Unterzeichner des Vertragspartners2
     */
    private List<Unterschrift> unterzeichnervp2;
    /**
     * Hier ist festgelegt, um welche Art von Vertrag es sich handelt. Z.B. Netznutzungvertrag
     */
    private Vertragsart vertragsart;
    /**
     * Gibt an, wann der Vertrag beginnt (inklusiv)
     */
    private OffsetDateTime vertragsbeginn;
    /**
     * Gibt an, wann der Vertrag (voraussichtlich) endet oder beendet wurde (exklusiv)
     */
    private OffsetDateTime vertragsende;
    /**
     * Festlegungen zu Laufzeiten und Kündigungsfristen
     */
    private List<Vertragskonditionen> vertragskonditionen;
    /**
     * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
     */
    private String vertragsnummer;
    /**
     * Beispiel: "Vertrag zwischen Vertagspartner 1 ..."
     */
    private Geschaeftspartner vertragspartner1;
    /**
     * Beispiel "Vertrag zwischen Vertagspartner 1 und Vertragspartner 2"
     */
    private Geschaeftspartner vertragspartner2;
    /**
     * Gibt den Status des Vertrages an
     */
    private Vertragsstatus vertragsstatus;

    public Buendelvertrag() {
    }

    private Buendelvertrag(BuendelvertragBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.einzelvertraege = builder.einzelvertraege;
        this.sparte = builder.sparte;
        this.unterzeichnervp1 = builder.unterzeichnervp1;
        this.unterzeichnervp2 = builder.unterzeichnervp2;
        this.vertragsart = builder.vertragsart;
        this.vertragsbeginn = builder.vertragsbeginn;
        this.vertragsende = builder.vertragsende;
        this.vertragskonditionen = builder.vertragskonditionen;
        this.vertragsnummer = builder.vertragsnummer;
        this.vertragspartner1 = builder.vertragspartner1;
        this.vertragspartner2 = builder.vertragspartner2;
        this.vertragsstatus = builder.vertragsstatus;
    }

    public Typ getTyp() {
        return typ;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public List<Vertrag> getEinzelvertraege() {
        return einzelvertraege;
    }

    public void setEinzelvertraege(List<Vertrag> einzelvertraege) {
        this.einzelvertraege = einzelvertraege;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public List<Unterschrift> getUnterzeichnervp1() {
        return unterzeichnervp1;
    }

    public void setUnterzeichnervp1(List<Unterschrift> unterzeichnervp1) {
        this.unterzeichnervp1 = unterzeichnervp1;
    }

    public List<Unterschrift> getUnterzeichnervp2() {
        return unterzeichnervp2;
    }

    public void setUnterzeichnervp2(List<Unterschrift> unterzeichnervp2) {
        this.unterzeichnervp2 = unterzeichnervp2;
    }

    public Vertragsart getVertragsart() {
        return vertragsart;
    }

    public void setVertragsart(Vertragsart vertragsart) {
        this.vertragsart = vertragsart;
    }

    public OffsetDateTime getVertragsbeginn() {
        return vertragsbeginn;
    }

    public void setVertragsbeginn(OffsetDateTime vertragsbeginn) {
        this.vertragsbeginn = vertragsbeginn;
    }

    public OffsetDateTime getVertragsende() {
        return vertragsende;
    }

    public void setVertragsende(OffsetDateTime vertragsende) {
        this.vertragsende = vertragsende;
    }

    public List<Vertragskonditionen> getVertragskonditionen() {
        return vertragskonditionen;
    }

    public void setVertragskonditionen(List<Vertragskonditionen> vertragskonditionen) {
        this.vertragskonditionen = vertragskonditionen;
    }

    public String getVertragsnummer() {
        return vertragsnummer;
    }

    public void setVertragsnummer(String vertragsnummer) {
        this.vertragsnummer = vertragsnummer;
    }

    public Geschaeftspartner getVertragspartner1() {
        return vertragspartner1;
    }

    public void setVertragspartner1(Geschaeftspartner vertragspartner1) {
        this.vertragspartner1 = vertragspartner1;
    }

    public Geschaeftspartner getVertragspartner2() {
        return vertragspartner2;
    }

    public void setVertragspartner2(Geschaeftspartner vertragspartner2) {
        this.vertragspartner2 = vertragspartner2;
    }

    public Vertragsstatus getVertragsstatus() {
        return vertragsstatus;
    }

    public void setVertragsstatus(Vertragsstatus vertragsstatus) {
        this.vertragsstatus = vertragsstatus;
    }

    public static class BuendelvertragBuilder extends GeschaeftsobjektBuilder {
        /**
         * Beschreibung zum Vertrag
         */
        private String beschreibung;
        /**
         * Die Liste mit den Einzelverträgen zu den Abnahmestellen
         */
        private List<Vertrag> einzelvertraege;
        /**
         * Unterscheidungsmöglichkeiten für die Sparte
         */
        private Sparte sparte;
        /**
         * Unterzeichner des Vertragspartners1
         */
        private List<Unterschrift> unterzeichnervp1;
        /**
         * Unterzeichner des Vertragspartners2
         */
        private List<Unterschrift> unterzeichnervp2;
        /**
         * Hier ist festgelegt, um welche Art von Vertrag es sich handelt. Z.B. Netznutzungvertrag
         */
        private Vertragsart vertragsart;
        /**
         * Gibt an, wann der Vertrag beginnt (inklusiv)
         */
        private OffsetDateTime vertragsbeginn;
        /**
         * Gibt an, wann der Vertrag (voraussichtlich) endet oder beendet wurde (exklusiv)
         */
        private OffsetDateTime vertragsende;
        /**
         * Festlegungen zu Laufzeiten und Kündigungsfristen
         */
        private List<Vertragskonditionen> vertragskonditionen;
        /**
         * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
         */
        private String vertragsnummer;
        /**
         * Beispiel: "Vertrag zwischen Vertagspartner 1 ..."
         */
        private Geschaeftspartner vertragspartner1;
        /**
         * Beispiel "Vertrag zwischen Vertagspartner 1 und Vertragspartner 2"
         */
        private Geschaeftspartner vertragspartner2;
        /**
         * Gibt den Status des Vertrages an
         */
        private Vertragsstatus vertragsstatus;
    
        public String getBeschreibung() {
            return beschreibung;
        }
    
        public BuendelvertragBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }
    
        public List<Vertrag> getEinzelvertraege() {
            return einzelvertraege;
        }
    
        public BuendelvertragBuilder setEinzelvertraege(List<Vertrag> einzelvertraege) {
            this.einzelvertraege = einzelvertraege;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public BuendelvertragBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public List<Unterschrift> getUnterzeichnervp1() {
            return unterzeichnervp1;
        }
    
        public BuendelvertragBuilder setUnterzeichnervp1(List<Unterschrift> unterzeichnervp1) {
            this.unterzeichnervp1 = unterzeichnervp1;
            return this;
        }
    
        public List<Unterschrift> getUnterzeichnervp2() {
            return unterzeichnervp2;
        }
    
        public BuendelvertragBuilder setUnterzeichnervp2(List<Unterschrift> unterzeichnervp2) {
            this.unterzeichnervp2 = unterzeichnervp2;
            return this;
        }
    
        public Vertragsart getVertragsart() {
            return vertragsart;
        }
    
        public BuendelvertragBuilder setVertragsart(Vertragsart vertragsart) {
            this.vertragsart = vertragsart;
            return this;
        }
    
        public OffsetDateTime getVertragsbeginn() {
            return vertragsbeginn;
        }
    
        public BuendelvertragBuilder setVertragsbeginn(OffsetDateTime vertragsbeginn) {
            this.vertragsbeginn = vertragsbeginn;
            return this;
        }
    
        public OffsetDateTime getVertragsende() {
            return vertragsende;
        }
    
        public BuendelvertragBuilder setVertragsende(OffsetDateTime vertragsende) {
            this.vertragsende = vertragsende;
            return this;
        }
    
        public List<Vertragskonditionen> getVertragskonditionen() {
            return vertragskonditionen;
        }
    
        public BuendelvertragBuilder setVertragskonditionen(List<Vertragskonditionen> vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }
    
        public String getVertragsnummer() {
            return vertragsnummer;
        }
    
        public BuendelvertragBuilder setVertragsnummer(String vertragsnummer) {
            this.vertragsnummer = vertragsnummer;
            return this;
        }
    
        public Geschaeftspartner getVertragspartner1() {
            return vertragspartner1;
        }
    
        public BuendelvertragBuilder setVertragspartner1(Geschaeftspartner vertragspartner1) {
            this.vertragspartner1 = vertragspartner1;
            return this;
        }
    
        public Geschaeftspartner getVertragspartner2() {
            return vertragspartner2;
        }
    
        public BuendelvertragBuilder setVertragspartner2(Geschaeftspartner vertragspartner2) {
            this.vertragspartner2 = vertragspartner2;
            return this;
        }
    
        public Vertragsstatus getVertragsstatus() {
            return vertragsstatus;
        }
    
        public BuendelvertragBuilder setVertragsstatus(Vertragsstatus vertragsstatus) {
            this.vertragsstatus = vertragsstatus;
            return this;
        }
    
        public BuendelvertragBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public BuendelvertragBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Buendelvertrag build() {
            return new Buendelvertrag(this);
        }
    }
}