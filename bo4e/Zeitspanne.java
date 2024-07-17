package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

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
public class Zeitspanne {
    private String id;
    private String version;
    private OffsetDateTime ende;
    private OffsetDateTime start;
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
     * inklusiver Beginn
     */
    public OffsetDateTime getEnde() { return ende; }
    public void setEnde(OffsetDateTime value) { this.ende = value; }

    /**
     * inklusiver Beginn
     */
    public OffsetDateTime getStart() { return start; }
    public void setStart(OffsetDateTime value) { this.start = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
