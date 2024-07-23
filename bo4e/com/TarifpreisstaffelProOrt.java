package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/TarifpreisstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TarifpreisstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/TarifpreisstaffelProOrt.json>`_
 */
public class TarifpreisstaffelProOrt extends COM {
    /**
     * Der Arbeitspreis in ct/kWh
     */
    private Double arbeitspreis;
    /**
     * Der Arbeitspreis für Verbräuche in der Niedertarifzeit in ct/kWh
     */
    private Double arbeitspreisNT;
    /**
     * Der Grundpreis in Euro/Jahr
     */
    private Double grundpreis;
    /**
     * Oberer Wert, bis zu dem die Staffel gilt (exklusive)
     */
    private Double staffelgrenzeBis;
    /**
     * Unterer Wert, ab dem die Staffel gilt (inklusive)
     */
    private Double staffelgrenzeVon;

    public TarifpreisstaffelProOrt() {
    }

    private TarifpreisstaffelProOrt(TarifpreisstaffelProOrtBuilder builder) {
        super(builder);
        this.arbeitspreis = builder.arbeitspreis;
        this.arbeitspreisNT = builder.arbeitspreisNT;
        this.grundpreis = builder.grundpreis;
        this.staffelgrenzeBis = builder.staffelgrenzeBis;
        this.staffelgrenzeVon = builder.staffelgrenzeVon;
    }

    public Double getArbeitspreis() {
        return arbeitspreis;
    }

    public void setArbeitspreis(Double arbeitspreis) {
        this.arbeitspreis = arbeitspreis;
    }

    public Double getArbeitspreisNT() {
        return arbeitspreisNT;
    }

    public void setArbeitspreisNT(Double arbeitspreisNT) {
        this.arbeitspreisNT = arbeitspreisNT;
    }

    public Double getGrundpreis() {
        return grundpreis;
    }

    public void setGrundpreis(Double grundpreis) {
        this.grundpreis = grundpreis;
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

    public static class TarifpreisstaffelProOrtBuilder extends COMBuilder {
        /**
         * Der Arbeitspreis in ct/kWh
         */
        private Double arbeitspreis;
        /**
         * Der Arbeitspreis für Verbräuche in der Niedertarifzeit in ct/kWh
         */
        private Double arbeitspreisNT;
        /**
         * Der Grundpreis in Euro/Jahr
         */
        private Double grundpreis;
        /**
         * Oberer Wert, bis zu dem die Staffel gilt (exklusive)
         */
        private Double staffelgrenzeBis;
        /**
         * Unterer Wert, ab dem die Staffel gilt (inklusive)
         */
        private Double staffelgrenzeVon;
    
        public Double getArbeitspreis() {
            return arbeitspreis;
        }
    
        public TarifpreisstaffelProOrtBuilder setArbeitspreis(Double arbeitspreis) {
            this.arbeitspreis = arbeitspreis;
            return this;
        }
    
        public Double getArbeitspreisNT() {
            return arbeitspreisNT;
        }
    
        public TarifpreisstaffelProOrtBuilder setArbeitspreisNT(Double arbeitspreisNT) {
            this.arbeitspreisNT = arbeitspreisNT;
            return this;
        }
    
        public Double getGrundpreis() {
            return grundpreis;
        }
    
        public TarifpreisstaffelProOrtBuilder setGrundpreis(Double grundpreis) {
            this.grundpreis = grundpreis;
            return this;
        }
    
        public Double getStaffelgrenzeBis() {
            return staffelgrenzeBis;
        }
    
        public TarifpreisstaffelProOrtBuilder setStaffelgrenzeBis(Double staffelgrenzeBis) {
            this.staffelgrenzeBis = staffelgrenzeBis;
            return this;
        }
    
        public Double getStaffelgrenzeVon() {
            return staffelgrenzeVon;
        }
    
        public TarifpreisstaffelProOrtBuilder setStaffelgrenzeVon(Double staffelgrenzeVon) {
            this.staffelgrenzeVon = staffelgrenzeVon;
            return this;
        }
    
        public TarifpreisstaffelProOrtBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public TarifpreisstaffelProOrtBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public TarifpreisstaffelProOrt build() {
            return new TarifpreisstaffelProOrt(this);
        }
    }
}