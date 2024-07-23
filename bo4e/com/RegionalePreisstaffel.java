package bo4e.com;

import java.util.List;

/**
 * Abbildung einer Preisstaffel mit regionaler Abgrenzung
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionalePreisstaffel.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionalePreisstaffel JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionalePreisstaffel.json>`_
 */
public class RegionalePreisstaffel extends COM {
    /**
     * Preis pro abgerechneter Mengeneinheit
     */
    private Double einheitspreis;
    /**
     * Regionale Eingrenzung der Preisstaffel
     */
    private RegionaleGueltigkeit regionaleGueltigkeit;
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

    public RegionalePreisstaffel() {}
    private RegionalePreisstaffel(RegionalePreisstaffelBuilder builder) {
        this.einheitspreis = builder.einheitspreis;
        this.regionaleGueltigkeit = builder.regionaleGueltigkeit;
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

    public RegionaleGueltigkeit getRegionaleGueltigkeit() {
        return regionaleGueltigkeit;
    }
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
        this.regionaleGueltigkeit = regionaleGueltigkeit;
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

    public static class RegionalePreisstaffelBuilder extends COMBuilder {
        /**
         * Preis pro abgerechneter Mengeneinheit
         */
        private Double einheitspreis;
        /**
         * Regionale Eingrenzung der Preisstaffel
         */
        private RegionaleGueltigkeit regionaleGueltigkeit;
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
        public RegionalePreisstaffelBuilder setEinheitspreis(Double einheitspreis) {
            this.einheitspreis = einheitspreis;
            return this;
        }
    
        public RegionaleGueltigkeit getRegionaleGueltigkeit() {
            return regionaleGueltigkeit;
        }
        public RegionalePreisstaffelBuilder setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
            this.regionaleGueltigkeit = regionaleGueltigkeit;
            return this;
        }
    
        public Sigmoidparameter getSigmoidparameter() {
            return sigmoidparameter;
        }
        public RegionalePreisstaffelBuilder setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
            this.sigmoidparameter = sigmoidparameter;
            return this;
        }
    
        public Double getStaffelgrenzeBis() {
            return staffelgrenzeBis;
        }
        public RegionalePreisstaffelBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }
    
        public Double getStaffelgrenzeVon() {
            return staffelgrenzeVon;
        }
        public RegionalePreisstaffelBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }
    
        public RegionalePreisstaffel build() {
            return new RegionalePreisstaffel(this);
        }
    }
}