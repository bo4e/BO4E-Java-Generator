package bo4e.com;

import bo4e.enums.Angebotsstatus;
import bo4e.ZusatzAttribut;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Führt die verschiedenen Ausprägungen der Angebotsberechnung auf
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Angebotsvariante.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebotsvariante JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Angebotsvariante.json>`_
 */
public class Angebotsvariante extends COM {
    /**
     * Gibt den Status eines Angebotes an.
     */
    private Angebotsstatus angebotsstatus;
    /**
     * Bis zu diesem Zeitpunkt gilt die Angebotsvariante
     */
    private OffsetDateTime bindefrist;
    /**
     * Datum der Erstellung der Angebotsvariante
     */
    private OffsetDateTime erstellungsdatum;
    /**
     * Aufsummierte Kosten aller Angebotsteile
     */
    private Betrag gesamtkosten;
    /**
     * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
     */
    private Menge gesamtmenge;
    /**
     * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
     */
    private List<Angebotsteil> teile;

    public Angebotsvariante() {
    }

    private Angebotsvariante(AngebotsvarianteBuilder builder) {
        super(builder);
        this.angebotsstatus = builder.angebotsstatus;
        this.bindefrist = builder.bindefrist;
        this.erstellungsdatum = builder.erstellungsdatum;
        this.gesamtkosten = builder.gesamtkosten;
        this.gesamtmenge = builder.gesamtmenge;
        this.teile = builder.teile;
    }

    public Angebotsstatus getAngebotsstatus() {
        return angebotsstatus;
    }

    public void setAngebotsstatus(Angebotsstatus angebotsstatus) {
        this.angebotsstatus = angebotsstatus;
    }

    public OffsetDateTime getBindefrist() {
        return bindefrist;
    }

    public void setBindefrist(OffsetDateTime bindefrist) {
        this.bindefrist = bindefrist;
    }

    public OffsetDateTime getErstellungsdatum() {
        return erstellungsdatum;
    }

    public void setErstellungsdatum(OffsetDateTime erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }

    public Betrag getGesamtkosten() {
        return gesamtkosten;
    }

    public void setGesamtkosten(Betrag gesamtkosten) {
        this.gesamtkosten = gesamtkosten;
    }

    public Menge getGesamtmenge() {
        return gesamtmenge;
    }

    public void setGesamtmenge(Menge gesamtmenge) {
        this.gesamtmenge = gesamtmenge;
    }

    public List<Angebotsteil> getTeile() {
        return teile;
    }

    public void setTeile(List<Angebotsteil> teile) {
        this.teile = teile;
    }

    public static class AngebotsvarianteBuilder extends COMBuilder {
        /**
         * Gibt den Status eines Angebotes an.
         */
        private Angebotsstatus angebotsstatus;
        /**
         * Bis zu diesem Zeitpunkt gilt die Angebotsvariante
         */
        private OffsetDateTime bindefrist;
        /**
         * Datum der Erstellung der Angebotsvariante
         */
        private OffsetDateTime erstellungsdatum;
        /**
         * Aufsummierte Kosten aller Angebotsteile
         */
        private Betrag gesamtkosten;
        /**
         * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
         */
        private Menge gesamtmenge;
        /**
         * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
         */
        private List<Angebotsteil> teile;
    
        public Angebotsstatus getAngebotsstatus() {
            return angebotsstatus;
        }
    
        public AngebotsvarianteBuilder setAngebotsstatus(Angebotsstatus angebotsstatus) {
            this.angebotsstatus = angebotsstatus;
            return this;
        }
    
        public OffsetDateTime getBindefrist() {
            return bindefrist;
        }
    
        public AngebotsvarianteBuilder setBindefrist(OffsetDateTime bindefrist) {
            this.bindefrist = bindefrist;
            return this;
        }
    
        public OffsetDateTime getErstellungsdatum() {
            return erstellungsdatum;
        }
    
        public AngebotsvarianteBuilder setErstellungsdatum(OffsetDateTime erstellungsdatum) {
            this.erstellungsdatum = erstellungsdatum;
            return this;
        }
    
        public Betrag getGesamtkosten() {
            return gesamtkosten;
        }
    
        public AngebotsvarianteBuilder setGesamtkosten(Betrag gesamtkosten) {
            this.gesamtkosten = gesamtkosten;
            return this;
        }
    
        public Menge getGesamtmenge() {
            return gesamtmenge;
        }
    
        public AngebotsvarianteBuilder setGesamtmenge(Menge gesamtmenge) {
            this.gesamtmenge = gesamtmenge;
            return this;
        }
    
        public List<Angebotsteil> getTeile() {
            return teile;
        }
    
        public AngebotsvarianteBuilder setTeile(List<Angebotsteil> teile) {
            this.teile = teile;
            return this;
        }
    
        public AngebotsvarianteBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public AngebotsvarianteBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Angebotsvariante build() {
            return new Angebotsvariante(this);
        }
    }
}