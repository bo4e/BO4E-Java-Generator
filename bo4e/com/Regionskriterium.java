package bo4e.com;

import bo4e.enums.Gueltigkeitstyp;
import bo4e.enums.Regionskriteriumtyp;

import java.util.List;

/**
 * Komponente zur Abbildung eines Regionskriteriums
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Regionskriterium.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Regionskriterium JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Regionskriterium.json>`_
 */
public class Regionskriterium extends COM {
    /**
     * Hier wird festgelegt, ob es sich um ein einschließendes oder ausschließendes Kriterium
     * handelt.
     */
    private Gueltigkeitstyp gueltigkeitstyp;
    /**
     * Hier wird das Kriterium selbst angegeben, z.B. Bundesland.
     */
    private Regionskriteriumtyp regionskriteriumtyp;
    /**
     * Der Wert, den das Kriterium annehmen kann, z.B. NRW.
     * Im Falle des Regionskriteriumstyp BUNDESWEIT spielt dieser Wert keine Rolle.
     */
    private String wert;

    public Regionskriterium() {}
    private Regionskriterium(RegionskriteriumBuilder builder) {
        this.gueltigkeitstyp = builder.gueltigkeitstyp;
        this.regionskriteriumtyp = builder.regionskriteriumtyp;
        this.wert = builder.wert;
    }

    public Gueltigkeitstyp getGueltigkeitstyp() {
        return gueltigkeitstyp;
    }
    public void setGueltigkeitstyp(Gueltigkeitstyp gueltigkeitstyp) {
        this.gueltigkeitstyp = gueltigkeitstyp;
    }

    public Regionskriteriumtyp getRegionskriteriumtyp() {
        return regionskriteriumtyp;
    }
    public void setRegionskriteriumtyp(Regionskriteriumtyp regionskriteriumtyp) {
        this.regionskriteriumtyp = regionskriteriumtyp;
    }

    public String getWert() {
        return wert;
    }
    public void setWert(String wert) {
        this.wert = wert;
    }

    public static class RegionskriteriumBuilder extends COMBuilder {
        /**
         * Hier wird festgelegt, ob es sich um ein einschließendes oder ausschließendes Kriterium
         * handelt.
         */
        private Gueltigkeitstyp gueltigkeitstyp;
        /**
         * Hier wird das Kriterium selbst angegeben, z.B. Bundesland.
         */
        private Regionskriteriumtyp regionskriteriumtyp;
        /**
         * Der Wert, den das Kriterium annehmen kann, z.B. NRW.
         * Im Falle des Regionskriteriumstyp BUNDESWEIT spielt dieser Wert keine Rolle.
         */
        private String wert;
    
        public Gueltigkeitstyp getGueltigkeitstyp() {
            return gueltigkeitstyp;
        }
        public RegionskriteriumBuilder setGueltigkeitstyp(Gueltigkeitstyp gueltigkeitstyp) {
            this.gueltigkeitstyp = gueltigkeitstyp;
            return this;
        }
    
        public Regionskriteriumtyp getRegionskriteriumtyp() {
            return regionskriteriumtyp;
        }
        public RegionskriteriumBuilder setRegionskriteriumtyp(Regionskriteriumtyp regionskriteriumtyp) {
            this.regionskriteriumtyp = regionskriteriumtyp;
            return this;
        }
    
        public String getWert() {
            return wert;
        }
        public RegionskriteriumBuilder setWert(String wert) {
            this.wert = wert;
            return this;
        }
    
        public Regionskriterium build() {
            return new Regionskriterium(this);
        }
    }
}