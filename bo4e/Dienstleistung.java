package placeholder;

import java.util.List;

/**
 * Abbildung einer abrechenbaren Dienstleistung.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Dienstleistung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Dienstleistung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Dienstleistung.json>`_
 */
public class Dienstleistung {
    private String id;
    private String version;
    private String bezeichnung;
    private Dienstleistungstyp dienstleistungstyp;
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
     * Bezeichnung der Dienstleistung
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Kennzeichnung der Dienstleistung
     */
    public Dienstleistungstyp getDienstleistungstyp() { return dienstleistungstyp; }
    public void setDienstleistungstyp(Dienstleistungstyp value) { this.dienstleistungstyp = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
