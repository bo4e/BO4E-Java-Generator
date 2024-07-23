package bo4e.com;

import bo4e.enums.Erzeugungsart;

/**
 * Abbildung einer Energieherkunft
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Energieherkunft.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energieherkunft JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Energieherkunft.json>`_
 */
public class Energieherkunft extends COM {
    private Double anteilProzent;
    private Erzeugungsart erzeugungsart;

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
    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Prozentualer Anteil der jeweiligen Erzeugungsart.
     */
    public Double getAnteilProzent() { return anteilProzent; }
    public void setAnteilProzent(Double value) { this.anteilProzent = value; }

    /**
     * Art der Erzeugung der Energie.
     */
    public Erzeugungsart getErzeugungsart() { return erzeugungsart; }
    public void setErzeugungsart(Erzeugungsart value) { this.erzeugungsart = value; }

}
