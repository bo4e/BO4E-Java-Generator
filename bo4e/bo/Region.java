package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Regionskriterium;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Modellierung einer Region als Menge von Kriterien, die eine Region beschreiben
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Region.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Region JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Region.json>`_
 */
public class Region extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.REGION;
    /**
     * Bezeichnung der Region
     */
    private String bezeichnung;
    /**
     * Negativliste der Kriterien zur Definition der Region
     */
    private List<Regionskriterium> negativListe;
    /**
     * Positivliste der Kriterien zur Definition der Region
     */
    private List<Regionskriterium> positivListe;

    public Region() {
    }

    private Region(RegionBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.negativListe = builder.negativListe;
        this.positivListe = builder.positivListe;
    }

    public Typ getTyp() {
        return typ;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public List<Regionskriterium> getNegativListe() {
        return negativListe;
    }

    public void setNegativListe(List<Regionskriterium> negativListe) {
        this.negativListe = negativListe;
    }

    public List<Regionskriterium> getPositivListe() {
        return positivListe;
    }

    public void setPositivListe(List<Regionskriterium> positivListe) {
        this.positivListe = positivListe;
    }

    public static class RegionBuilder extends GeschaeftsobjektBuilder {
        /**
         * Bezeichnung der Region
         */
        private String bezeichnung;
        /**
         * Negativliste der Kriterien zur Definition der Region
         */
        private List<Regionskriterium> negativListe;
        /**
         * Positivliste der Kriterien zur Definition der Region
         */
        private List<Regionskriterium> positivListe;
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public RegionBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public List<Regionskriterium> getNegativListe() {
            return negativListe;
        }
    
        public RegionBuilder setNegativListe(List<Regionskriterium> negativListe) {
            this.negativListe = negativListe;
            return this;
        }
    
        public List<Regionskriterium> getPositivListe() {
            return positivListe;
        }
    
        public RegionBuilder setPositivListe(List<Regionskriterium> positivListe) {
            this.positivListe = positivListe;
            return this;
        }
    
        public RegionBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public RegionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Region build() {
            return new Region(this);
        }
    }
}