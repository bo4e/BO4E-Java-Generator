package placeholder;

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
public class Angebotsposition {
    private String id;
    private String version;
    private String positionsbezeichnung;
    private Betrag positionskosten;
    private Menge positionsmenge;
    private Preis positionspreis;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * zusatz_attribute: Optional[list["ZusatzAttribut"]] = None
     *
     * # pylint: disable=duplicate-code
     * model_config = ConfigDict(
     * alias_generator=camelize,
     * populate_by_name=True,
     * extra="allow",
     * # json_encoders is deprecated, but there is no easy-to-use alternative. The best way
     * would be to create
     * # an annotated version of Decimal, but you would have to use it everywhere in the
     * pydantic models.
     * # See this issue for more info: https://github.com/pydantic/pydantic/issues/6375
     * json_encoders={Decimal: str},
     * )
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Bezeichnung der jeweiligen Position des Angebotsteils
     */
    public String getPositionsbezeichnung() { return positionsbezeichnung; }
    public void setPositionsbezeichnung(String value) { this.positionsbezeichnung = value; }

    /**
     * Kosten (positionspreis * positionsmenge) für diese Angebotsposition
     */
    public Betrag getPositionskosten() { return positionskosten; }
    public void setPositionskosten(Betrag value) { this.positionskosten = value; }

    /**
     * Menge des angebotenen Artikels (z.B. Wirkarbeit in kWh), in dieser Angebotsposition
     */
    public Menge getPositionsmenge() { return positionsmenge; }
    public void setPositionsmenge(Menge value) { this.positionsmenge = value; }

    /**
     * Preis pro Einheit/Stückpreis des angebotenen Artikels.
     */
    public Preis getPositionspreis() { return positionspreis; }
    public void setPositionspreis(Preis value) { this.positionspreis = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
