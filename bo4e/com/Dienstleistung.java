package bo4e.com;

import bo4e.enums.Dienstleistungstyp;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Abbildung einer abrechenbaren Dienstleistung.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Dienstleistung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Dienstleistung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Dienstleistung.json>`_
 */
public class Dienstleistung extends COM {
    /**
     * Bezeichnung der Dienstleistung
     */
    private String bezeichnung;
    /**
     * Kennzeichnung der Dienstleistung
     */
    private Dienstleistungstyp dienstleistungstyp;

    public Dienstleistung() {
    }

    private Dienstleistung(DienstleistungBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.dienstleistungstyp = builder.dienstleistungstyp;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Dienstleistungstyp getDienstleistungstyp() {
        return dienstleistungstyp;
    }

    public void setDienstleistungstyp(Dienstleistungstyp dienstleistungstyp) {
        this.dienstleistungstyp = dienstleistungstyp;
    }

    public static class DienstleistungBuilder extends COMBuilder {
        /**
         * Bezeichnung der Dienstleistung
         */
        private String bezeichnung;
        /**
         * Kennzeichnung der Dienstleistung
         */
        private Dienstleistungstyp dienstleistungstyp;
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public DienstleistungBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Dienstleistungstyp getDienstleistungstyp() {
            return dienstleistungstyp;
        }
    
        public DienstleistungBuilder setDienstleistungstyp(Dienstleistungstyp dienstleistungstyp) {
            this.dienstleistungstyp = dienstleistungstyp;
            return this;
        }
    
        public DienstleistungBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public DienstleistungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Dienstleistung build() {
            return new Dienstleistung(this);
        }
    }
}