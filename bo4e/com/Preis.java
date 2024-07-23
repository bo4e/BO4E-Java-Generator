package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preisstatus;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Abbildung eines Preises mit Wert, Einheit, Bezugswert und Status.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preis.json>`_
 */
public class Preis extends COM {
    /**
     * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
     */
    private Mengeneinheit bezugswert;
    /**
     * Währungseinheit für den Preis, z.B. Euro oder Ct.
     */
    private Waehrungseinheit einheit;
    /**
     * Gibt den Status des veröffentlichten Preises an
     */
    private Preisstatus status;
    /**
     * Gibt die nominale Höhe des Preises an.
     */
    private Double wert;

    public Preis() {
    }

    private Preis(PreisBuilder builder) {
        super(builder);
        this.bezugswert = builder.bezugswert;
        this.einheit = builder.einheit;
        this.status = builder.status;
        this.wert = builder.wert;
    }

    public Mengeneinheit getBezugswert() {
        return bezugswert;
    }

    public void setBezugswert(Mengeneinheit bezugswert) {
        this.bezugswert = bezugswert;
    }

    public Waehrungseinheit getEinheit() {
        return einheit;
    }

    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    public Preisstatus getStatus() {
        return status;
    }

    public void setStatus(Preisstatus status) {
        this.status = status;
    }

    public Double getWert() {
        return wert;
    }

    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static class PreisBuilder extends COMBuilder {
        /**
         * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
         */
        private Mengeneinheit bezugswert;
        /**
         * Währungseinheit für den Preis, z.B. Euro oder Ct.
         */
        private Waehrungseinheit einheit;
        /**
         * Gibt den Status des veröffentlichten Preises an
         */
        private Preisstatus status;
        /**
         * Gibt die nominale Höhe des Preises an.
         */
        private Double wert;
    
        public Mengeneinheit getBezugswert() {
            return bezugswert;
        }
    
        public PreisBuilder setBezugswert(Mengeneinheit bezugswert) {
            this.bezugswert = bezugswert;
            return this;
        }
    
        public Waehrungseinheit getEinheit() {
            return einheit;
        }
    
        public PreisBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public Preisstatus getStatus() {
            return status;
        }
    
        public PreisBuilder setStatus(Preisstatus status) {
            this.status = status;
            return this;
        }
    
        public Double getWert() {
            return wert;
        }
    
        public PreisBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }
    
        public PreisBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public PreisBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Preis build() {
            return new Preis(this);
        }
    }
}