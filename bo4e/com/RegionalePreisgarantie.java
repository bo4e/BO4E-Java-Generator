package bo4e.com;

import bo4e.enums.Preisgarantietyp;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Abbildung einer Preisgarantie mit regionaler Abgrenzung
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionalePreisgarantie.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionalePreisgarantie JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionalePreisgarantie.json>`_
 */
public class RegionalePreisgarantie extends COM {
    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    private String beschreibung;
    /**
     * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
     */
    private Preisgarantietyp preisgarantietyp;
    /**
     * Regionale Eingrenzung der Preisgarantie.
     */
    private RegionaleGueltigkeit regionaleGueltigkeit;
    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    private Zeitraum zeitlicheGueltigkeit;

    public RegionalePreisgarantie() {
    }

    private RegionalePreisgarantie(RegionalePreisgarantieBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.preisgarantietyp = builder.preisgarantietyp;
        this.regionaleGueltigkeit = builder.regionaleGueltigkeit;
        this.zeitlicheGueltigkeit = builder.zeitlicheGueltigkeit;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Preisgarantietyp getPreisgarantietyp() {
        return preisgarantietyp;
    }

    public void setPreisgarantietyp(Preisgarantietyp preisgarantietyp) {
        this.preisgarantietyp = preisgarantietyp;
    }

    public RegionaleGueltigkeit getRegionaleGueltigkeit() {
        return regionaleGueltigkeit;
    }

    public void setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
        this.regionaleGueltigkeit = regionaleGueltigkeit;
    }

    public Zeitraum getZeitlicheGueltigkeit() {
        return zeitlicheGueltigkeit;
    }

    public void setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
        this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
    }

    public static class RegionalePreisgarantieBuilder extends COMBuilder {
        /**
         * Freitext zur Beschreibung der Preisgarantie.
         */
        private String beschreibung;
        /**
         * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
         */
        private Preisgarantietyp preisgarantietyp;
        /**
         * Regionale Eingrenzung der Preisgarantie.
         */
        private RegionaleGueltigkeit regionaleGueltigkeit;
        /**
         * Freitext zur Beschreibung der Preisgarantie.
         */
        private Zeitraum zeitlicheGueltigkeit;
    
        public String getBeschreibung() {
            return beschreibung;
        }
    
        public RegionalePreisgarantieBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }
    
        public Preisgarantietyp getPreisgarantietyp() {
            return preisgarantietyp;
        }
    
        public RegionalePreisgarantieBuilder setPreisgarantietyp(Preisgarantietyp preisgarantietyp) {
            this.preisgarantietyp = preisgarantietyp;
            return this;
        }
    
        public RegionaleGueltigkeit getRegionaleGueltigkeit() {
            return regionaleGueltigkeit;
        }
    
        public RegionalePreisgarantieBuilder setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
            this.regionaleGueltigkeit = regionaleGueltigkeit;
            return this;
        }
    
        public Zeitraum getZeitlicheGueltigkeit() {
            return zeitlicheGueltigkeit;
        }
    
        public RegionalePreisgarantieBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }
    
        public RegionalePreisgarantieBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public RegionalePreisgarantieBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public RegionalePreisgarantie build() {
            return new RegionalePreisgarantie(this);
        }
    }
}