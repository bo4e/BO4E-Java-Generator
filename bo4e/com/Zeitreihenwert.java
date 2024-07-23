package bo4e.com;

import bo4e.enums.Messwertstatus;
import bo4e.enums.Messwertstatuszusatz;

/**
 * Abbildung eines Zeitreihenwertes bestehend aus Zeitraum, Wert und Statusinformationen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitreihenwert.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitreihenwert JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zeitreihenwert.json>`_
 */
public class Zeitreihenwert extends COM {
    private Messwertstatus status;
    private Messwertstatuszusatz statuszusatz;
    private Double wert;
    private Zeitspanne zeitspanne;

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
     * Der Status gibt an, wie der Wert zu interpretieren ist, z.B. in Berechnungen.
     */
    public Messwertstatus getStatus() { return status; }
    public void setStatus(Messwertstatus value) { this.status = value; }

    /**
     * Eine Zusatzinformation zum Status, beispielsweise ein Grund für einen fehlenden Wert.
     */
    public Messwertstatuszusatz getStatuszusatz() { return statuszusatz; }
    public void setStatuszusatz(Messwertstatuszusatz value) { this.statuszusatz = value; }

    /**
     * Zeitespanne für das Messintervall
     */
    public Double getWert() { return wert; }
    public void setWert(Double value) { this.wert = value; }

    /**
     * Zeitespanne für das Messintervall
     */
    public Zeitspanne getZeitspanne() { return zeitspanne; }
    public void setZeitspanne(Zeitspanne value) { this.zeitspanne = value; }

}
