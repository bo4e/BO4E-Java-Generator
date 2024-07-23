package bo4e.com;

import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.Waehrungseinheit;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Differenzierung der zu betrachtenden Produkte anhand der preiserhöhenden (Aufschlag)
 * bzw. preisvermindernden (Abschlag) Zusatzvereinbarungen,
 * die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen werden
 * können.
 * Es können mehrere Auf-/Abschläge gleichzeitig ausgewählt werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/PositionsAufAbschlag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PositionsAufAbschlag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/PositionsAufAbschlag.json>`_
 */
public class PositionsAufAbschlag extends COM {
    /**
     * Typ des AufAbschlages
     */
    private AufAbschlagstyp aufAbschlagstyp;
    /**
     * Einheit, in der der Auf-/Abschlag angegeben ist (z.B. ct/kWh).
     */
    private Waehrungseinheit aufAbschlagswaehrung;
    /**
     * Höhe des Auf-/Abschlages
     */
    private Double aufAbschlagswert;
    /**
     * Beschreibung zum Auf-/Abschlag
     */
    private String beschreibung;
    /**
     * Bezeichnung des Auf-/Abschlags
     */
    private String bezeichnung;

    public PositionsAufAbschlag() {
    }

    private PositionsAufAbschlag(PositionsAufAbschlagBuilder builder) {
        super(builder);
        this.aufAbschlagstyp = builder.aufAbschlagstyp;
        this.aufAbschlagswaehrung = builder.aufAbschlagswaehrung;
        this.aufAbschlagswert = builder.aufAbschlagswert;
        this.beschreibung = builder.beschreibung;
        this.bezeichnung = builder.bezeichnung;
    }

    public AufAbschlagstyp getAufAbschlagstyp() {
        return aufAbschlagstyp;
    }

    public void setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
        this.aufAbschlagstyp = aufAbschlagstyp;
    }

    public Waehrungseinheit getAufAbschlagswaehrung() {
        return aufAbschlagswaehrung;
    }

    public void setAufAbschlagswaehrung(Waehrungseinheit aufAbschlagswaehrung) {
        this.aufAbschlagswaehrung = aufAbschlagswaehrung;
    }

    public Double getAufAbschlagswert() {
        return aufAbschlagswert;
    }

    public void setAufAbschlagswert(Double aufAbschlagswert) {
        this.aufAbschlagswert = aufAbschlagswert;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public static class PositionsAufAbschlagBuilder extends COMBuilder {
        /**
         * Typ des AufAbschlages
         */
        private AufAbschlagstyp aufAbschlagstyp;
        /**
         * Einheit, in der der Auf-/Abschlag angegeben ist (z.B. ct/kWh).
         */
        private Waehrungseinheit aufAbschlagswaehrung;
        /**
         * Höhe des Auf-/Abschlages
         */
        private Double aufAbschlagswert;
        /**
         * Beschreibung zum Auf-/Abschlag
         */
        private String beschreibung;
        /**
         * Bezeichnung des Auf-/Abschlags
         */
        private String bezeichnung;
    
        public AufAbschlagstyp getAufAbschlagstyp() {
            return aufAbschlagstyp;
        }
    
        public PositionsAufAbschlagBuilder setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
            this.aufAbschlagstyp = aufAbschlagstyp;
            return this;
        }
    
        public Waehrungseinheit getAufAbschlagswaehrung() {
            return aufAbschlagswaehrung;
        }
    
        public PositionsAufAbschlagBuilder setAufAbschlagswaehrung(Waehrungseinheit aufAbschlagswaehrung) {
            this.aufAbschlagswaehrung = aufAbschlagswaehrung;
            return this;
        }
    
        public Double getAufAbschlagswert() {
            return aufAbschlagswert;
        }
    
        public PositionsAufAbschlagBuilder setAufAbschlagswert(Double aufAbschlagswert) {
            this.aufAbschlagswert = aufAbschlagswert;
            return this;
        }
    
        public String getBeschreibung() {
            return beschreibung;
        }
    
        public PositionsAufAbschlagBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public PositionsAufAbschlagBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public PositionsAufAbschlagBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public PositionsAufAbschlagBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public PositionsAufAbschlag build() {
            return new PositionsAufAbschlag(this);
        }
    }
}