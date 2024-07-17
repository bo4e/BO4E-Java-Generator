package placeholder;

import java.util.List;

/**
 * Abbildung einer Menge mit Wert und Einheit.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Menge.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Menge JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Menge.json>`_
 */
public class Menge {
    private String id;
    private String version;
    private Mengeneinheit einheit;
    private Double wert;
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
     * Gibt die Einheit zum jeweiligen Wert an
     */
    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    /**
     * Gibt den absoluten Wert der Menge an
     */
    public Double getWert() { return wert; }
    public void setWert(Double value) { this.wert = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
