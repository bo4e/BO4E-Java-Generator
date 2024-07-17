package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

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
public class Zeitraum {
    private String id;
    private String version;
    private Double dauer;
    private Mengeneinheit einheit;
    private OffsetDateTime enddatum;
    private OffsetDateTime endzeitpunkt;
    private OffsetDateTime startdatum;
    private OffsetDateTime startzeitpunkt;
    private List<ZusatzAttribut> zusatzAttribute;

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
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

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

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
