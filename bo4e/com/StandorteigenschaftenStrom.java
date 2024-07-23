package bo4e.com;

/**
 * Standorteigenschaften der Sparte Strom
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/StandorteigenschaftenStrom.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `StandorteigenschaftenStrom JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/StandorteigenschaftenStrom.json>`_
 */
public class StandorteigenschaftenStrom extends COM {
    private String bilanzierungsgebietEic;
    private String regelzone;
    private String regelzoneEic;

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
     * Die EIC-Nummer des Bilanzierungsgebietes
     */
    public String getBilanzierungsgebietEic() { return bilanzierungsgebietEic; }
    public void setBilanzierungsgebietEic(String value) { this.bilanzierungsgebietEic = value; }

    /**
     * Der Name der Regelzone
     */
    public String getRegelzone() { return regelzone; }
    public void setRegelzone(String value) { this.regelzone = value; }

    /**
     * De EIC-Nummer der Regelzone
     */
    public String getRegelzoneEic() { return regelzoneEic; }
    public void setRegelzoneEic(String value) { this.regelzoneEic = value; }

}
