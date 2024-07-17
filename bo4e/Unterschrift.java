package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Modellierung einer Unterschrift, z.B. für Verträge, Angebote etc.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Unterschrift.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Unterschrift JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Unterschrift.json>`_
 */
public class Unterschrift {
    private String id;
    private String version;
    private OffsetDateTime datum;
    private String name;
    private String ort;
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
     * Ort, an dem die Unterschrift geleistet wird
     */
    public OffsetDateTime getDatum() { return datum; }
    public void setDatum(OffsetDateTime value) { this.datum = value; }

    /**
     * Name des Unterschreibers
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * Ort, an dem die Unterschrift geleistet wird
     */
    public String getOrt() { return ort; }
    public void setOrt(String value) { this.ort = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
