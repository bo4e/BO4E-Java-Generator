package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisstaffel.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisstaffel JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preisstaffel.json>`_
 */
public class Preisstaffel extends COM {
    /**
     * Preis pro abgerechneter Mengeneinheit
     */
    private Double einheitspreis;
    /**
     * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
     * Parameter
     */
    private Sigmoidparameter sigmoidparameter;
    /**
     * Exklusiver oberer Wert, bis zu dem die Staffel gilt
     */
    private Double staffelgrenzeBis;
    /**
     * Inklusiver unterer Wert, ab dem die Staffel gilt
     */
    private Double staffelgrenzeVon;

    public Preisstaffel() {
    }

    private Preisstaffel(PreisstaffelBuilder builder) {
        super(builder);
        this.einheitspreis = builder.einheitspreis;
        this.sigmoidparameter = builder.sigmoidparameter;
        this.staffelgrenzeBis = builder.staffelgrenzeBis;
        this.staffelgrenzeVon = builder.staffelgrenzeVon;
    }

    public Double getEinheitspreis() {
        return einheitspreis;
    }

    public void setEinheitspreis(Double einheitspreis) {
        this.einheitspreis = einheitspreis;
    }

    public Sigmoidparameter getSigmoidparameter() {
        return sigmoidparameter;
    }

    public void setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
        this.sigmoidparameter = sigmoidparameter;
    }

    public Double getStaffelgrenzeBis() {
        return staffelgrenzeBis;
    }

    public void setStaffelgrenzeBis(Double staffelgrenzeBis) {
        this.staffelgrenzeBis = staffelgrenzeBis;
    }

    public Double getStaffelgrenzeVon() {
        return staffelgrenzeVon;
    }

    public void setStaffelgrenzeVon(Double staffelgrenzeVon) {
        this.staffelgrenzeVon = staffelgrenzeVon;
    }

    public static class PreisstaffelBuilder extends COMBuilder {
        /**
         * Preis pro abgerechneter Mengeneinheit
         */
        private Double einheitspreis;
        /**
         * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
         * Parameter
         */
        private Sigmoidparameter sigmoidparameter;
        /**
         * Exklusiver oberer Wert, bis zu dem die Staffel gilt
         */
        private Double staffelgrenzeBis;
        /**
         * Inklusiver unterer Wert, ab dem die Staffel gilt
         */
        private Double staffelgrenzeVon;
    
        public Double getEinheitspreis() {
            return einheitspreis;
        }
    
        public PreisstaffelBuilder setEinheitspreis(Double einheitspreis) {
            this.einheitspreis = einheitspreis;
            return this;
        }
    
        public Sigmoidparameter getSigmoidparameter() {
            return sigmoidparameter;
        }
    
        public PreisstaffelBuilder setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
            this.sigmoidparameter = sigmoidparameter;
            return this;
        }
    
        public Double getStaffelgrenzeBis() {
            return staffelgrenzeBis;
        }
    
        public PreisstaffelBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }
    
        public Double getStaffelgrenzeVon() {
            return staffelgrenzeVon;
        }
    
        public PreisstaffelBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }
    
        public PreisstaffelBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public PreisstaffelBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Preisstaffel build() {
            return new Preisstaffel(this);
        }
    }
}