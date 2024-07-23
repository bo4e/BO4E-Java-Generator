package bo4e.com;

/**
 * Mit dieser Komponente werden Zählzeitregister modelliert. Ein Zählzeitregister beschreibt
 * eine erweiterte Definition der Zählzeit
 * in Bezug auf ein Register. Dabei werden alle Codes dazu vom Netzbetreiber vergeben.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zaehlzeitregister.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zaehlzeitregister JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zaehlzeitregister.json>`_
 */
public class Zaehlzeitregister extends COM {
    private Boolean istSchwachlastfaehig;
    private String zaehlzeitDefinition;
    private String zaehlzeitRegister;

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
     * Zählzeitregister
     */
    public Boolean getIstSchwachlastfaehig() { return istSchwachlastfaehig; }
    public void setIstSchwachlastfaehig(Boolean value) { this.istSchwachlastfaehig = value; }

    /**
     * Zählzeitdefinition
     */
    public String getZaehlzeitDefinition() { return zaehlzeitDefinition; }
    public void setZaehlzeitDefinition(String value) { this.zaehlzeitDefinition = value; }

    /**
     * Zählzeitdefinition
     */
    public String getZaehlzeitRegister() { return zaehlzeitRegister; }
    public void setZaehlzeitRegister(String value) { this.zaehlzeitRegister = value; }

}
