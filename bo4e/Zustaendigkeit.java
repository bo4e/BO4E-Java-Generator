package placeholder;

import java.util.List;

/**
 * Enthält die zeitliche Zuordnung eines Ansprechpartners zu Abteilungen und
 * Zuständigkeiten.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zustaendigkeit.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zustaendigkeit JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zustaendigkeit.json>`_
 */
public class Zustaendigkeit {
    private String id;
    private String version;
    private String abteilung;
    private String position;
    private Themengebiet themengebiet;
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
     * Berufliche Rolle des Ansprechpartners/ der Person
     */
    public String getAbteilung() { return abteilung; }
    public void setAbteilung(String value) { this.abteilung = value; }

    /**
     * Berufliche Rolle des Ansprechpartners/ der Person
     */
    public String getPosition() { return position; }
    public void setPosition(String value) { this.position = value; }

    /**
     * Hier kann eine thematische Zuordnung des Ansprechpartners bzw. der Person angegeben werden
     */
    public Themengebiet getThemengebiet() { return themengebiet; }
    public void setThemengebiet(Themengebiet value) { this.themengebiet = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
