package bo4e.com;

/**
 * Dient der Adressierung über die Liegenschafts-Information.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Katasteradresse.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Katasteradresse JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Katasteradresse.json>`_
 */
public class Katasteradresse extends COM {
    private String flurstueck;
    private String gemarkungFlur;

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
    public String getFlurstueck() { return flurstueck; }
    public void setFlurstueck(String value) { this.flurstueck = value; }

    public String getGemarkungFlur() { return gemarkungFlur; }
    public void setGemarkungFlur(String value) { this.gemarkungFlur = value; }

}
