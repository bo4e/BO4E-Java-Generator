package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Abbildung für einen Vertragsteil. Der Vertragsteil wird dazu verwendet,
 * eine vertragliche Leistung in Bezug zu einer Lokation (Markt- oder Messlokation)
 * festzulegen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Vertragsteil.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Vertragsteil JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Vertragsteil.json>`_
 */
public class Vertragsteil {
    private String id;
    private String version;
    private String lokation;
    private Menge maximaleAbnahmemenge;
    private Menge minimaleAbnahmemenge;
    private Menge vertraglichFixierteMenge;
    private OffsetDateTime vertragsteilbeginn;
    private OffsetDateTime vertragsteilende;
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
     * vertraglich_fixierte_menge: Optional["Menge"] = None
     */
    public String getLokation() { return lokation; }
    public void setLokation(String value) { this.lokation = value; }

    /**
     * Für die Lokation festgelegte maximale Abnahmemenge (exklusiv)
     */
    public Menge getMaximaleAbnahmemenge() { return maximaleAbnahmemenge; }
    public void setMaximaleAbnahmemenge(Menge value) { this.maximaleAbnahmemenge = value; }

    /**
     * maximale_abnahmemenge: Optional["Menge"] = None
     */
    public Menge getMinimaleAbnahmemenge() { return minimaleAbnahmemenge; }
    public void setMinimaleAbnahmemenge(Menge value) { this.minimaleAbnahmemenge = value; }

    /**
     * minimale_abnahmemenge: Optional["Menge"] = None
     */
    public Menge getVertraglichFixierteMenge() { return vertraglichFixierteMenge; }
    public void setVertraglichFixierteMenge(Menge value) { this.vertraglichFixierteMenge = value; }

    /**
     * vertragsteilende: Optional[pydantic.AwareDatetime] = None
     */
    public OffsetDateTime getVertragsteilbeginn() { return vertragsteilbeginn; }
    public void setVertragsteilbeginn(OffsetDateTime value) { this.vertragsteilbeginn = value; }

    /**
     * lokation: Optional[str] = None
     */
    public OffsetDateTime getVertragsteilende() { return vertragsteilende; }
    public void setVertragsteilende(OffsetDateTime value) { this.vertragsteilende = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
