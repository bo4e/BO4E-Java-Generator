package bo4e.com;

import bo4e.enums.Marktrolle;
import bo4e.enums.Verwendungszweck;

/**
 * Dient zur Identifizierung des Verwendungszwecks der Marktrolle an der Marktlokation, der
 * die Werte zu übermitteln sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Verwendungszweck.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Verwendungszweck JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Verwendungszweck.json>`_
 */
public class VerwendungszweckProMarktrolle extends COM {
    private Marktrolle marktrolle;
    private Verwendungszweck[] zwecke;

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
     * Zwecke: Optional[list["Verwendungszweck"]] = None
     */
    public Marktrolle getMarktrolle() { return marktrolle; }
    public void setMarktrolle(Marktrolle value) { this.marktrolle = value; }

    /**
     * Verwendungszwecke
     */
    public Verwendungszweck[] getZwecke() { return zwecke; }
    public void setZwecke(Verwendungszweck[] value) { this.zwecke = value; }
}
