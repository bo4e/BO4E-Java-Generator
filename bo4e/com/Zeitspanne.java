package bo4e.com;

import java.time.OffsetDateTime;

/**
 * Eine Zeitspanne ist definiert aus Start und/oder Ende.
 * Der Unterschied zur Menge (die auch zur Abbildung von Zeitmengen genutzt wird) ist, dass
 * konkrete Start- und Endzeitpunkte angegeben werden.
 * Die Zeitspanne ist aus dem COM Zeitraum hervorgegangen, das in Zeitspanne und Menge
 * aufgeteilt wurde.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitspanne.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitspanne JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zeitspanne.json>`_
 */
public class Zeitspanne extends COM {
    private OffsetDateTime ende;
    private OffsetDateTime start;

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
     * inklusiver Beginn
     */
    public OffsetDateTime getEnde() { return ende; }
    public void setEnde(OffsetDateTime value) { this.ende = value; }

    /**
     * inklusiver Beginn
     */
    public OffsetDateTime getStart() { return start; }
    public void setStart(OffsetDateTime value) { this.start = value; }

}
