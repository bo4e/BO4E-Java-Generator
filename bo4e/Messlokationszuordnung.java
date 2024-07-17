package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Mit dieser Komponente werden Messlokationen zu Marktlokationen zugeordnet.
 * Dabei kann eine arithmetische Operation (Addition, Subtraktion, Multiplikation, Division)
 * angegeben werden,
 * mit der die Messlokation zum Verbrauch der Marktlokation beiträgt.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Messlokationszuordnung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Messlokationszuordnung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Messlokationszuordnung.json>`_
 */
public class Messlokationszuordnung {
    private String id;
    private String version;
    private ArithmetischeOperation arithmetik;
    private OffsetDateTime gueltigBis;
    private OffsetDateTime gueltigSeit;
    private String messlokationsId;
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

    public ArithmetischeOperation getArithmetik() { return arithmetik; }
    public void setArithmetik(ArithmetischeOperation value) { this.arithmetik = value; }

    /**
     * exklusives Endedatum
     */
    public OffsetDateTime getGueltigBis() { return gueltigBis; }
    public void setGueltigBis(OffsetDateTime value) { this.gueltigBis = value; }

    /**
     * gueltig_bis: Optional[pydantic.AwareDatetime] = None
     */
    public OffsetDateTime getGueltigSeit() { return gueltigSeit; }
    public void setGueltigSeit(OffsetDateTime value) { this.gueltigSeit = value; }

    /**
     * arithmetik: Optional["ArithmetischeOperation"] = None
     *
     * gueltig_seit: Optional[pydantic.AwareDatetime] = None
     */
    public String getMesslokationsId() { return messlokationsId; }
    public void setMesslokationsId(String value) { this.messlokationsId = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
