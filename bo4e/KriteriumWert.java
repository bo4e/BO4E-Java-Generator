package placeholder;

import java.util.List;

/**
 * Mit dieser Komponente können Kriterien und deren Werte definiert werden
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/KriteriumWert.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `KriteriumWert JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/KriteriumWert.json>`_
 */
public class KriteriumWert {
    private String id;
    private String version;
    private Tarifregionskriterium kriterium;
    private String wert;
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
     * Hier steht, für welches Kriterium der Wert gilt. Z.B. Postleitzahlen
     */
    public Tarifregionskriterium getKriterium() { return kriterium; }
    public void setKriterium(Tarifregionskriterium value) { this.kriterium = value; }

    /**
     * Ein Wert, passend zum Kriterium. Z.B. eine Postleitzahl.
     */
    public String getWert() { return wert; }
    public void setWert(String value) { this.wert = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
