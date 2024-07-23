package bo4e.com;

import java.util.List;

/**
 * Unterhalb von Angebotsteilen sind die Angebotspositionen eingebunden.
 * Hier werden die angebotenen Bestandteile einzeln aufgeführt. Beispiel:
 * Positionsmenge: 4000 kWh
 * Positionspreis: 24,56 ct/kWh
 * Positionskosten: 982,40 EUR
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Angebotsposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebotsposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Angebotsposition.json>`_
 */
public class Angebotsposition extends COM {
    /**
     * Bezeichnung der jeweiligen Position des Angebotsteils
     */
    private String positionsbezeichnung;
    /**
     * Kosten (positionspreis * positionsmenge) für diese Angebotsposition
     */
    private Betrag positionskosten;
    /**
     * Menge des angebotenen Artikels (z.B. Wirkarbeit in kWh), in dieser Angebotsposition
     */
    private Menge positionsmenge;
    /**
     * Preis pro Einheit/Stückpreis des angebotenen Artikels.
     */
    private Preis positionspreis;

    public Angebotsposition() {
    }

    private Angebotsposition(AngebotspositionBuilder builder) {
        super(builder);
        this.positionsbezeichnung = builder.positionsbezeichnung;
        this.positionskosten = builder.positionskosten;
        this.positionsmenge = builder.positionsmenge;
        this.positionspreis = builder.positionspreis;
    }

    public String getPositionsbezeichnung() {
        return positionsbezeichnung;
    }

    public void setPositionsbezeichnung(String positionsbezeichnung) {
        this.positionsbezeichnung = positionsbezeichnung;
    }

    public Betrag getPositionskosten() {
        return positionskosten;
    }

    public void setPositionskosten(Betrag positionskosten) {
        this.positionskosten = positionskosten;
    }

    public Menge getPositionsmenge() {
        return positionsmenge;
    }

    public void setPositionsmenge(Menge positionsmenge) {
        this.positionsmenge = positionsmenge;
    }

    public Preis getPositionspreis() {
        return positionspreis;
    }

    public void setPositionspreis(Preis positionspreis) {
        this.positionspreis = positionspreis;
    }

    public static class AngebotspositionBuilder extends COMBuilder {
        /**
         * Bezeichnung der jeweiligen Position des Angebotsteils
         */
        private String positionsbezeichnung;
        /**
         * Kosten (positionspreis * positionsmenge) für diese Angebotsposition
         */
        private Betrag positionskosten;
        /**
         * Menge des angebotenen Artikels (z.B. Wirkarbeit in kWh), in dieser Angebotsposition
         */
        private Menge positionsmenge;
        /**
         * Preis pro Einheit/Stückpreis des angebotenen Artikels.
         */
        private Preis positionspreis;
    
        public String getPositionsbezeichnung() {
            return positionsbezeichnung;
        }
    
        public AngebotspositionBuilder setPositionsbezeichnung(String positionsbezeichnung) {
            this.positionsbezeichnung = positionsbezeichnung;
            return this;
        }
    
        public Betrag getPositionskosten() {
            return positionskosten;
        }
    
        public AngebotspositionBuilder setPositionskosten(Betrag positionskosten) {
            this.positionskosten = positionskosten;
            return this;
        }
    
        public Menge getPositionsmenge() {
            return positionsmenge;
        }
    
        public AngebotspositionBuilder setPositionsmenge(Menge positionsmenge) {
            this.positionsmenge = positionsmenge;
            return this;
        }
    
        public Preis getPositionspreis() {
            return positionspreis;
        }
    
        public AngebotspositionBuilder setPositionspreis(Preis positionspreis) {
            this.positionspreis = positionspreis;
            return this;
        }
    
        public Angebotsposition build() {
            return new Angebotsposition(this);
        }
    }
}