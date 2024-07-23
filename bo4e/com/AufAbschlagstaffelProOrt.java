package bo4e.com;

import java.util.List;

/**
 * Gibt den Wert eines Auf- oder Abschlags und dessen Staffelgrenzen an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/AufAbschlagstaffelProOrt.json>`_
 */
public class AufAbschlagstaffelProOrt extends COM {
    /**
     * Oberer Wert, bis zu dem die Staffel gilt.
     */
    private Double staffelgrenzeBis;
    /**
     * Unterer Wert, ab dem die Staffel gilt.
     */
    private Double staffelgrenzeVon;
    /**
     * Der Wert für den Auf- oder Abschlag.
     */
    private Double wert;

    public AufAbschlagstaffelProOrt() {
    }

    private AufAbschlagstaffelProOrt(AufAbschlagstaffelProOrtBuilder builder) {
        super(builder);
        this.staffelgrenzeBis = builder.staffelgrenzeBis;
        this.staffelgrenzeVon = builder.staffelgrenzeVon;
        this.wert = builder.wert;
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

    public Double getWert() {
        return wert;
    }

    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static class AufAbschlagstaffelProOrtBuilder extends COMBuilder {
        /**
         * Oberer Wert, bis zu dem die Staffel gilt.
         */
        private Double staffelgrenzeBis;
        /**
         * Unterer Wert, ab dem die Staffel gilt.
         */
        private Double staffelgrenzeVon;
        /**
         * Der Wert für den Auf- oder Abschlag.
         */
        private Double wert;
    
        public Double getStaffelgrenzeBis() {
            return staffelgrenzeBis;
        }
    
        public AufAbschlagstaffelProOrtBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }
    
        public Double getStaffelgrenzeVon() {
            return staffelgrenzeVon;
        }
    
        public AufAbschlagstaffelProOrtBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }
    
        public Double getWert() {
            return wert;
        }
    
        public AufAbschlagstaffelProOrtBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }
    
        public AufAbschlagstaffelProOrt build() {
            return new AufAbschlagstaffelProOrt(this);
        }
    }
}