package placeholder;

import java.util.List;

/**
 * Die Sigmoid-Funktion, beispielsweise zur Berechnung eines Leistungspreises hat die Form:
 * LP=A/(1+(P/B)^C)+D
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Sigmoidparameter.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Sigmoidparameter JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Sigmoidparameter.json>`_
 */
public class Sigmoidparameter {
    private String id;
    private String version;
    private Double a;
    private Double b;
    private Double c;
    private Double d;
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
     * Briefmarke Ortsverteilnetz (EUR/kWh)
     */
    public Double getA() { return a; }
    public void setA(Double value) { this.a = value; }

    /**
     * Briefmarke Ortsverteilnetz (EUR/kWh)
     */
    public Double getB() { return b; }
    public void setB(Double value) { this.b = value; }

    /**
     * Wendepunkt für die bepreiste Menge (kW)
     */
    public Double getC() { return c; }
    public void setC(Double value) { this.c = value; }

    /**
     * Exponent (einheitenlos)
     */
    public Double getD() { return d; }
    public void setD(Double value) { this.d = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
