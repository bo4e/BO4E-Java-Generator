package bo4e.com;

/**
 * Standorteigenschaften der Sparte Gas
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/StandorteigenschaftenGas.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `StandorteigenschaftenGas JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/StandorteigenschaftenGas.json>`_
 */
public class StandorteigenschaftenGas extends COM {
    private MarktgebietInfo[] marktgebiete;
    private String[] netzkontonummern;

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
     * Netzkontonummern der Gasnetze
     */
    public MarktgebietInfo[] getMarktgebiete() { return marktgebiete; }
    public void setMarktgebiete(MarktgebietInfo[] value) { this.marktgebiete = value; }

    /**
     * Netzkontonummern der Gasnetze
     */
    public String[] getNetzkontonummern() { return netzkontonummern; }
    public void setNetzkontonummern(String[] value) { this.netzkontonummern = value; }

}
