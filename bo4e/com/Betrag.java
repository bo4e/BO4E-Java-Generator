package bo4e.com;

import bo4e.enums.Waehrungscode;

/**
 * Die Komponente wird dazu verwendet, Summenbeträge (beispielsweise in Angeboten und
 * Rechnungen) als Geldbeträge
 * abzubilden. Die Einheit ist dabei immer die Hauptwährung also Euro, Dollar etc…
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Betrag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Betrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Betrag.json>`_
 */
public class Betrag extends COM {
    private Waehrungscode waehrung;
    private Double wert;

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
     * Gibt den Betrag des Preises an.
     */
    public Waehrungscode getWaehrung() { return waehrung; }
    public void setWaehrung(Waehrungscode value) { this.waehrung = value; }

    /**
     * Gibt den Betrag des Preises an.
     */
    public Double getWert() { return wert; }
    public void setWert(Double value) { this.wert = value; }

}
