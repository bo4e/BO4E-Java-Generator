package bo4e.com;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Angebotsposition.json>`_
 */
public class Angebotsposition extends COM {
    private String positionsbezeichnung;
    private Betrag positionskosten;
    private Menge positionsmenge;
    private Preis positionspreis;

    public String getPositionsbezeichnung() { return positionsbezeichnung; }
    public void setPositionsbezeichnung(String value) { this.positionsbezeichnung = value; }

    public Betrag getPositionskosten() { return positionskosten; }
    public void setPositionskosten(Betrag value) { this.positionskosten = value; }

    public Menge getPositionsmenge() { return positionsmenge; }
    public void setPositionsmenge(Menge value) { this.positionsmenge = value; }

    public Preis getPositionspreis() { return positionspreis; }
    public void setPositionspreis(Preis value) { this.positionspreis = value; }

}
