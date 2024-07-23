package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Verbrauch;
import bo4e.enums.Lokationstyp;

import java.util.List;

/**
 * Abbildung von Mengen, die Lokationen zugeordnet sind
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Energiemenge.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energiemenge JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Energiemenge.json>`_
 */
public class Energiemenge extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.ENERGIEMENGE;
    /**
     * Gibt den Verbrauch in einer Zeiteinheit an
     */
    private List<Verbrauch> energieverbrauch;
    /**
     * Eindeutige Nummer der Marktlokation bzw. der Messlokation, zu der die Energiemenge gehört
     */
    private String lokationsId;
    /**
     * Gibt an, ob es sich um eine Markt- oder Messlokation handelt
     */
    private Lokationstyp lokationstyp;

    public Energiemenge() {}
    private Energiemenge(EnergiemengeBuilder builder) {
        this.energieverbrauch = builder.energieverbrauch;
        this.lokationsId = builder.lokationsId;
        this.lokationstyp = builder.lokationstyp;
    }

    public Typ getTyp() {
        return typ;
    }

    public List<Verbrauch> getEnergieverbrauch() {
        return energieverbrauch;
    }
    public void setEnergieverbrauch(List<Verbrauch> energieverbrauch) {
        this.energieverbrauch = energieverbrauch;
    }

    public String getLokationsId() {
        return lokationsId;
    }
    public void setLokationsId(String lokationsId) {
        this.lokationsId = lokationsId;
    }

    public Lokationstyp getLokationstyp() {
        return lokationstyp;
    }
    public void setLokationstyp(Lokationstyp lokationstyp) {
        this.lokationstyp = lokationstyp;
    }

    public static class EnergiemengeBuilder extends GeschaeftsobjektBuilder {
        /**
         * Gibt den Verbrauch in einer Zeiteinheit an
         */
        private List<Verbrauch> energieverbrauch;
        /**
         * Eindeutige Nummer der Marktlokation bzw. der Messlokation, zu der die Energiemenge gehört
         */
        private String lokationsId;
        /**
         * Gibt an, ob es sich um eine Markt- oder Messlokation handelt
         */
        private Lokationstyp lokationstyp;
    
        public List<Verbrauch> getEnergieverbrauch() {
            return energieverbrauch;
        }
        public EnergiemengeBuilder setEnergieverbrauch(List<Verbrauch> energieverbrauch) {
            this.energieverbrauch = energieverbrauch;
            return this;
        }
    
        public String getLokationsId() {
            return lokationsId;
        }
        public EnergiemengeBuilder setLokationsId(String lokationsId) {
            this.lokationsId = lokationsId;
            return this;
        }
    
        public Lokationstyp getLokationstyp() {
            return lokationstyp;
        }
        public EnergiemengeBuilder setLokationstyp(Lokationstyp lokationstyp) {
            this.lokationstyp = lokationstyp;
            return this;
        }
    
        public Energiemenge build() {
            return new Energiemenge(this);
        }
    }
}