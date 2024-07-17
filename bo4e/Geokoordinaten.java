package placeholder;

import java.util.List;

/**
 * This component provides the geo-coordinates for a location.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Geokoordinaten.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geokoordinaten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Geokoordinaten.json>`_
 */
public class Geokoordinaten {
    private String id;
    private String version;
    private Double breitengrad;
    private Double laengengrad;
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

    public Double getBreitengrad() { return breitengrad; }
    public void setBreitengrad(Double value) { this.breitengrad = value; }

    public Double getLaengengrad() { return laengengrad; }
    public void setLaengengrad(Double value) { this.laengengrad = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
