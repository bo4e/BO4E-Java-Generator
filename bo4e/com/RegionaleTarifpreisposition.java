package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preistyp;

import java.util.List;

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen im Zusammenhang mit
 * regionalen Gültigkeiten abgebildet
 * werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionaleTarifpreisposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionaleTarifpreisposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionaleTarifpreisposition.json>`_
 */
public class RegionaleTarifpreisposition extends COM {
    /**
     * Größe, auf die sich die Einheit bezieht, beispielsweise kWh, Jahr
     */
    private Mengeneinheit bezugseinheit;
    /**
     * Einheit des Preises (z.B. EURO)
     */
    private Waehrungseinheit einheit;
    /**
     * Gibt an, nach welcher Menge die vorgenannte Einschränkung erfolgt (z.B.
     * Jahresstromverbrauch in kWh)
     */
    private Mengeneinheit mengeneinheitstaffel;
    /**
     * Hier sind die Staffeln mit ihren Preisangaben und regionalen Gültigkeiten definiert
     */
    private List<RegionalePreisstaffel> preisstaffeln;
    /**
     * Angabe des Preistypes (z.B. Grundpreis)
     */
    private Preistyp preistyp;

    public RegionaleTarifpreisposition() {
    }

    private RegionaleTarifpreisposition(RegionaleTarifpreispositionBuilder builder) {
        super(builder);
        this.bezugseinheit = builder.bezugseinheit;
        this.einheit = builder.einheit;
        this.mengeneinheitstaffel = builder.mengeneinheitstaffel;
        this.preisstaffeln = builder.preisstaffeln;
        this.preistyp = builder.preistyp;
    }

    public Mengeneinheit getBezugseinheit() {
        return bezugseinheit;
    }

    public void setBezugseinheit(Mengeneinheit bezugseinheit) {
        this.bezugseinheit = bezugseinheit;
    }

    public Waehrungseinheit getEinheit() {
        return einheit;
    }

    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    public Mengeneinheit getMengeneinheitstaffel() {
        return mengeneinheitstaffel;
    }

    public void setMengeneinheitstaffel(Mengeneinheit mengeneinheitstaffel) {
        this.mengeneinheitstaffel = mengeneinheitstaffel;
    }

    public List<RegionalePreisstaffel> getPreisstaffeln() {
        return preisstaffeln;
    }

    public void setPreisstaffeln(List<RegionalePreisstaffel> preisstaffeln) {
        this.preisstaffeln = preisstaffeln;
    }

    public Preistyp getPreistyp() {
        return preistyp;
    }

    public void setPreistyp(Preistyp preistyp) {
        this.preistyp = preistyp;
    }

    public static class RegionaleTarifpreispositionBuilder extends COMBuilder {
        /**
         * Größe, auf die sich die Einheit bezieht, beispielsweise kWh, Jahr
         */
        private Mengeneinheit bezugseinheit;
        /**
         * Einheit des Preises (z.B. EURO)
         */
        private Waehrungseinheit einheit;
        /**
         * Gibt an, nach welcher Menge die vorgenannte Einschränkung erfolgt (z.B.
         * Jahresstromverbrauch in kWh)
         */
        private Mengeneinheit mengeneinheitstaffel;
        /**
         * Hier sind die Staffeln mit ihren Preisangaben und regionalen Gültigkeiten definiert
         */
        private List<RegionalePreisstaffel> preisstaffeln;
        /**
         * Angabe des Preistypes (z.B. Grundpreis)
         */
        private Preistyp preistyp;
    
        public Mengeneinheit getBezugseinheit() {
            return bezugseinheit;
        }
    
        public RegionaleTarifpreispositionBuilder setBezugseinheit(Mengeneinheit bezugseinheit) {
            this.bezugseinheit = bezugseinheit;
            return this;
        }
    
        public Waehrungseinheit getEinheit() {
            return einheit;
        }
    
        public RegionaleTarifpreispositionBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public Mengeneinheit getMengeneinheitstaffel() {
            return mengeneinheitstaffel;
        }
    
        public RegionaleTarifpreispositionBuilder setMengeneinheitstaffel(Mengeneinheit mengeneinheitstaffel) {
            this.mengeneinheitstaffel = mengeneinheitstaffel;
            return this;
        }
    
        public List<RegionalePreisstaffel> getPreisstaffeln() {
            return preisstaffeln;
        }
    
        public RegionaleTarifpreispositionBuilder setPreisstaffeln(List<RegionalePreisstaffel> preisstaffeln) {
            this.preisstaffeln = preisstaffeln;
            return this;
        }
    
        public Preistyp getPreistyp() {
            return preistyp;
        }
    
        public RegionaleTarifpreispositionBuilder setPreistyp(Preistyp preistyp) {
            this.preistyp = preistyp;
            return this;
        }
    
        public RegionaleTarifpreisposition build() {
            return new RegionaleTarifpreisposition(this);
        }
    }
}