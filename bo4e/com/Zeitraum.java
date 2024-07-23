package bo4e.com;

import bo4e.enums.Mengeneinheit;
import java.time.OffsetDateTime;

/**
 * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
 * Start und Ende verwendet.
 * Es muss daher eine der drei Möglichkeiten angegeben sein:
 * - Einheit und Dauer oder
 * - Zeitraum: Startdatum bis Enddatum oder
 * - Zeitraum: Startzeitpunkt (Datum und Uhrzeit) bis Endzeitpunkt (Datum und Uhrzeit)
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitraum.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitraum JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zeitraum.json>`_
 */
public class Zeitraum extends COM {
    private Double dauer;
    private Mengeneinheit einheit;
    private OffsetDateTime enddatum;
    private OffsetDateTime endzeitpunkt;
    private OffsetDateTime startdatum;
    private OffsetDateTime startzeitpunkt;

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
    public Double getDauer() { return dauer; }
    public void setDauer(Double value) { this.dauer = value; }

    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    public OffsetDateTime getEnddatum() { return enddatum; }
    public void setEnddatum(OffsetDateTime value) { this.enddatum = value; }

    public OffsetDateTime getEndzeitpunkt() { return endzeitpunkt; }
    public void setEndzeitpunkt(OffsetDateTime value) { this.endzeitpunkt = value; }

    public OffsetDateTime getStartdatum() { return startdatum; }
    public void setStartdatum(OffsetDateTime value) { this.startdatum = value; }

    public OffsetDateTime getStartzeitpunkt() { return startzeitpunkt; }
    public void setStartzeitpunkt(OffsetDateTime value) { this.startzeitpunkt = value; }

}
