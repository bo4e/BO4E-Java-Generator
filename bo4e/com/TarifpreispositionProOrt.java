package bo4e.com;

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen abgebildet werden
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/TarifpreispositionProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TarifpreispositionProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/TarifpreispositionProOrt.json>`_
 */
public class TarifpreispositionProOrt extends COM {
    private String netznr;
    private String ort;
    private String postleitzahl;
    private TarifpreisstaffelProOrt[] preisstaffeln;

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
     * ene't-Netznummer des Netzes in dem der Preis gilt
     */
    public String getNetznr() { return netznr; }
    public void setNetznr(String value) { this.netznr = value; }

    /**
     * Ort für den der Preis gilt
     */
    public String getOrt() { return ort; }
    public void setOrt(String value) { this.ort = value; }

    /**
     * Postleitzahl des Ortes für den der Preis gilt
     */
    public String getPostleitzahl() { return postleitzahl; }
    public void setPostleitzahl(String value) { this.postleitzahl = value; }

    public TarifpreisstaffelProOrt[] getPreisstaffeln() { return preisstaffeln; }
    public void setPreisstaffeln(TarifpreisstaffelProOrt[] value) { this.preisstaffeln = value; }

}
