package bo4e.com;

import java.util.List;

/**
 * Die Sigmoid-Funktion, beispielsweise zur Berechnung eines Leistungspreises hat die Form:
 * LP=A/(1+(P/B)^C)+D
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Sigmoidparameter.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Sigmoidparameter JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Sigmoidparameter.json>`_
 */
public class Sigmoidparameter extends COM {
    /**
     * Briefmarke Ortsverteilnetz (EUR/kWh)
     */
    private Double a;
    /**
     * Briefmarke Ortsverteilnetz (EUR/kWh)
     */
    private Double b;
    /**
     * Wendepunkt für die bepreiste Menge (kW)
     */
    private Double c;
    /**
     * Exponent (einheitenlos)
     */
    private Double d;

    public Sigmoidparameter() {}
    private Sigmoidparameter(SigmoidparameterBuilder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public Double getA() {
        return a;
    }
    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }
    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }
    public void setC(Double c) {
        this.c = c;
    }

    public Double getD() {
        return d;
    }
    public void setD(Double d) {
        this.d = d;
    }

    public static class SigmoidparameterBuilder extends COMBuilder {
        /**
         * Briefmarke Ortsverteilnetz (EUR/kWh)
         */
        private Double a;
        /**
         * Briefmarke Ortsverteilnetz (EUR/kWh)
         */
        private Double b;
        /**
         * Wendepunkt für die bepreiste Menge (kW)
         */
        private Double c;
        /**
         * Exponent (einheitenlos)
         */
        private Double d;
    
        public Double getA() {
            return a;
        }
        public SigmoidparameterBuilder setA(Double a) {
            this.a = a;
            return this;
        }
    
        public Double getB() {
            return b;
        }
        public SigmoidparameterBuilder setB(Double b) {
            this.b = b;
            return this;
        }
    
        public Double getC() {
            return c;
        }
        public SigmoidparameterBuilder setC(Double c) {
            this.c = c;
            return this;
        }
    
        public Double getD() {
            return d;
        }
        public SigmoidparameterBuilder setD(Double d) {
            this.d = d;
            return this;
        }
    
        public Sigmoidparameter build() {
            return new Sigmoidparameter(this);
        }
    }
}