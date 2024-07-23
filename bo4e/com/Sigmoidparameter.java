package bo4e.com;

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
public class Sigmoidparameter extends COM {
    private Double A;
    private Double B;
    private Double C;
    private Double D;

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
    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Briefmarke Ortsverteilnetz (EUR/kWh)
     */
    public Double getA() { return A; }
    public void setA(Double value) { this.A = value; }

    /**
     * Briefmarke Ortsverteilnetz (EUR/kWh)
     */
    public Double getB() { return B; }
    public void setB(Double value) { this.B = value; }

    /**
     * Wendepunkt für die bepreiste Menge (kW)
     */
    public Double getC() { return C; }
    public void setC(Double value) { this.C = value; }

    /**
     * Exponent (einheitenlos)
     */
    public Double getD() { return D; }
    public void setD(Double value) { this.D = value; }

}
