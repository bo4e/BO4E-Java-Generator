package bo4e.com;

import bo4e.enums.Erzeugungsart;

import java.util.List;

/**
 * Abbildung einer Energieherkunft
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Energieherkunft.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energieherkunft JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Energieherkunft.json>`_
 */
public class Energieherkunft extends COM {
    /**
     * Prozentualer Anteil der jeweiligen Erzeugungsart.
     */
    private Double anteilProzent;
    /**
     * Art der Erzeugung der Energie.
     */
    private Erzeugungsart erzeugungsart;

    public Energieherkunft() {
    }

    private Energieherkunft(EnergieherkunftBuilder builder) {
        super(builder);
        this.anteilProzent = builder.anteilProzent;
        this.erzeugungsart = builder.erzeugungsart;
    }

    public Double getAnteilProzent() {
        return anteilProzent;
    }

    public void setAnteilProzent(Double anteilProzent) {
        this.anteilProzent = anteilProzent;
    }

    public Erzeugungsart getErzeugungsart() {
        return erzeugungsart;
    }

    public void setErzeugungsart(Erzeugungsart erzeugungsart) {
        this.erzeugungsart = erzeugungsart;
    }

    public static class EnergieherkunftBuilder extends COMBuilder {
        /**
         * Prozentualer Anteil der jeweiligen Erzeugungsart.
         */
        private Double anteilProzent;
        /**
         * Art der Erzeugung der Energie.
         */
        private Erzeugungsart erzeugungsart;
    
        public Double getAnteilProzent() {
            return anteilProzent;
        }
    
        public EnergieherkunftBuilder setAnteilProzent(Double anteilProzent) {
            this.anteilProzent = anteilProzent;
            return this;
        }
    
        public Erzeugungsart getErzeugungsart() {
            return erzeugungsart;
        }
    
        public EnergieherkunftBuilder setErzeugungsart(Erzeugungsart erzeugungsart) {
            this.erzeugungsart = erzeugungsart;
            return this;
        }
    
        public Energieherkunft build() {
            return new Energieherkunft(this);
        }
    }
}