package bo4e.com;

import bo4e.enums.Waehrungscode;

import java.util.List;

/**
 * Die Komponente wird dazu verwendet, Summenbeträge (beispielsweise in Angeboten und
 * Rechnungen) als Geldbeträge
 * abzubilden. Die Einheit ist dabei immer die Hauptwährung also Euro, Dollar etc…
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Betrag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Betrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Betrag.json>`_
 */
public class Betrag extends COM {
    /**
     * Gibt den Betrag des Preises an.
     */
    private Waehrungscode waehrung;
    /**
     * Gibt den Betrag des Preises an.
     */
    private Double wert;

    public Betrag() {
    }

    private Betrag(BetragBuilder builder) {
        super(builder);
        this.waehrung = builder.waehrung;
        this.wert = builder.wert;
    }

    public Waehrungscode getWaehrung() {
        return waehrung;
    }

    public void setWaehrung(Waehrungscode waehrung) {
        this.waehrung = waehrung;
    }

    public Double getWert() {
        return wert;
    }

    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static class BetragBuilder extends COMBuilder {
        /**
         * Gibt den Betrag des Preises an.
         */
        private Waehrungscode waehrung;
        /**
         * Gibt den Betrag des Preises an.
         */
        private Double wert;
    
        public Waehrungscode getWaehrung() {
            return waehrung;
        }
    
        public BetragBuilder setWaehrung(Waehrungscode waehrung) {
            this.waehrung = waehrung;
            return this;
        }
    
        public Double getWert() {
            return wert;
        }
    
        public BetragBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }
    
        public Betrag build() {
            return new Betrag(this);
        }
    }
}