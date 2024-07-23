package bo4e.com;

/**
 * Informationen zum Marktgebiet im Gas.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/MarktgebietInfo.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `MarktgebietInfo JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/MarktgebietInfo.json>`_
 */
public class MarktgebietInfo extends COM {
    private String marktgebiet;
    private String marktgebietcode;

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
     * Der Name des Marktgebietes
     */
    public String getMarktgebiet() { return marktgebiet; }
    public void setMarktgebiet(String value) { this.marktgebiet = value; }

    /**
     * Der Name des Marktgebietes
     */
    public String getMarktgebietcode() { return marktgebietcode; }
    public void setMarktgebietcode(String value) { this.marktgebietcode = value; }

}
