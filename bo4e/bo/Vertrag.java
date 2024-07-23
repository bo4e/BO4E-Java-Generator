package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Sparte;
import bo4e.com.Unterschrift;
import bo4e.enums.Vertragsart;
import bo4e.com.Vertragskonditionen;
import bo4e.enums.Vertragsstatus;
import bo4e.com.Vertragsteil;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Modell für die Abbildung von Vertragsbeziehungen;
 * Das Objekt dient dazu, alle Arten von Verträgen, die in der Energiewirtschaft Verwendung
 * finden, abzubilden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Vertrag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Vertrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Vertrag.json>`_
 */
public class Vertrag extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.VERTRAG;
    /**
     * Beschreibung zum Vertrag
     */
    private String beschreibung;
    /**
     * Unterscheidungsmöglichkeiten für die Sparte
     */
    private Sparte sparte;
    /**
     * Unterzeichner des Vertragspartners 1
     */
    private List<Unterschrift> unterzeichnervp1;
    /**
     * Unterzeichner des Vertragspartners 2
     */
    private List<Unterschrift> unterzeichnervp2;
    /**
     * Hier ist festgelegt, um welche Art von Vertrag es sich handelt.
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
    private Vertragskonditionen vertragskonditionen;
    /**
     * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
     */
    private String vertragsnummer;
    /**
     * Der "erstgenannte" Vertragspartner.
     * In der Regel der Aussteller des Vertrags.
     * Beispiel: "Vertrag zwischen Vertragspartner 1 ..."
     */
    private Geschaeftspartner vertragspartner1;
    /**
     * vertragsteile: Optional[list["Vertragsteil"]] = None
     */
    private Geschaeftspartner vertragspartner2;
    /**
     * Gibt den Status des Vertrags an
     */
    private Vertragsstatus vertragsstatus;
    /**
     * Beschreibung zum Vertrag
     */
    private List<Vertragsteil> vertragsteile;

    public Vertrag() {
    }

    private Vertrag(VertragBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
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
        this.vertragsteile = builder.vertragsteile;
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

    public Vertragskonditionen getVertragskonditionen() {
        return vertragskonditionen;
    }

    public void setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
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

    public List<Vertragsteil> getVertragsteile() {
        return vertragsteile;
    }

    public void setVertragsteile(List<Vertragsteil> vertragsteile) {
        this.vertragsteile = vertragsteile;
    }

    public static class VertragBuilder extends GeschaeftsobjektBuilder {
        /**
         * Beschreibung zum Vertrag
         */
        private String beschreibung;
        /**
         * Unterscheidungsmöglichkeiten für die Sparte
         */
        private Sparte sparte;
        /**
         * Unterzeichner des Vertragspartners 1
         */
        private List<Unterschrift> unterzeichnervp1;
        /**
         * Unterzeichner des Vertragspartners 2
         */
        private List<Unterschrift> unterzeichnervp2;
        /**
         * Hier ist festgelegt, um welche Art von Vertrag es sich handelt.
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
        private Vertragskonditionen vertragskonditionen;
        /**
         * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
         */
        private String vertragsnummer;
        /**
         * Der "erstgenannte" Vertragspartner.
         * In der Regel der Aussteller des Vertrags.
         * Beispiel: "Vertrag zwischen Vertragspartner 1 ..."
         */
        private Geschaeftspartner vertragspartner1;
        /**
         * vertragsteile: Optional[list["Vertragsteil"]] = None
         */
        private Geschaeftspartner vertragspartner2;
        /**
         * Gibt den Status des Vertrags an
         */
        private Vertragsstatus vertragsstatus;
        /**
         * Beschreibung zum Vertrag
         */
        private List<Vertragsteil> vertragsteile;
    
        public String getBeschreibung() {
            return beschreibung;
        }
    
        public VertragBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public VertragBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public List<Unterschrift> getUnterzeichnervp1() {
            return unterzeichnervp1;
        }
    
        public VertragBuilder setUnterzeichnervp1(List<Unterschrift> unterzeichnervp1) {
            this.unterzeichnervp1 = unterzeichnervp1;
            return this;
        }
    
        public List<Unterschrift> getUnterzeichnervp2() {
            return unterzeichnervp2;
        }
    
        public VertragBuilder setUnterzeichnervp2(List<Unterschrift> unterzeichnervp2) {
            this.unterzeichnervp2 = unterzeichnervp2;
            return this;
        }
    
        public Vertragsart getVertragsart() {
            return vertragsart;
        }
    
        public VertragBuilder setVertragsart(Vertragsart vertragsart) {
            this.vertragsart = vertragsart;
            return this;
        }
    
        public OffsetDateTime getVertragsbeginn() {
            return vertragsbeginn;
        }
    
        public VertragBuilder setVertragsbeginn(OffsetDateTime vertragsbeginn) {
            this.vertragsbeginn = vertragsbeginn;
            return this;
        }
    
        public OffsetDateTime getVertragsende() {
            return vertragsende;
        }
    
        public VertragBuilder setVertragsende(OffsetDateTime vertragsende) {
            this.vertragsende = vertragsende;
            return this;
        }
    
        public Vertragskonditionen getVertragskonditionen() {
            return vertragskonditionen;
        }
    
        public VertragBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }
    
        public String getVertragsnummer() {
            return vertragsnummer;
        }
    
        public VertragBuilder setVertragsnummer(String vertragsnummer) {
            this.vertragsnummer = vertragsnummer;
            return this;
        }
    
        public Geschaeftspartner getVertragspartner1() {
            return vertragspartner1;
        }
    
        public VertragBuilder setVertragspartner1(Geschaeftspartner vertragspartner1) {
            this.vertragspartner1 = vertragspartner1;
            return this;
        }
    
        public Geschaeftspartner getVertragspartner2() {
            return vertragspartner2;
        }
    
        public VertragBuilder setVertragspartner2(Geschaeftspartner vertragspartner2) {
            this.vertragspartner2 = vertragspartner2;
            return this;
        }
    
        public Vertragsstatus getVertragsstatus() {
            return vertragsstatus;
        }
    
        public VertragBuilder setVertragsstatus(Vertragsstatus vertragsstatus) {
            this.vertragsstatus = vertragsstatus;
            return this;
        }
    
        public List<Vertragsteil> getVertragsteile() {
            return vertragsteile;
        }
    
        public VertragBuilder setVertragsteile(List<Vertragsteil> vertragsteile) {
            this.vertragsteile = vertragsteile;
            return this;
        }
    
        public Vertrag build() {
            return new Vertrag(this);
        }
    }
}