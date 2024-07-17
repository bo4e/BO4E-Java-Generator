package placeholder;

import java.util.List;

/**
 * Dient zur Identifizierung des Verwendungszwecks der Marktrolle an der Marktlokation, der
 * die Werte zu übermitteln sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Verwendungszweck.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Verwendungszweck JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Verwendungszweck.json>`_
 */
public class VerwendungszweckProMarktrolle {
    private String id;
    private String version;
    private Marktrolle marktrolle;
    private List<ZusatzAttribut> zusatzAttribute;
    private List<Verwendungszweck> zwecke;

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
     * Zwecke: Optional[list["Verwendungszweck"]] = None
     */
    public Marktrolle getMarktrolle() { return marktrolle; }
    public void setMarktrolle(Marktrolle value) { this.marktrolle = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }

    /**
     * Verwendungszwecke
     */
    public List<Verwendungszweck> getZwecke() { return zwecke; }
    public void setZwecke(List<Verwendungszweck> value) { this.zwecke = value; }
}
