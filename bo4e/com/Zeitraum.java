package bo4e.com;

import bo4e.enums.Mengeneinheit;

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
public class Zeitraum extends COM {
    private Double dauer;
    private Mengeneinheit einheit;
    private OffsetDateTime enddatum;
    private OffsetDateTime endzeitpunkt;
    private OffsetDateTime startdatum;
    private OffsetDateTime startzeitpunkt;

    public Double getDauer() {
        return dauer;
    }
    public void setDauer(Double dauer) {
        this.dauer = dauer;
    }

    public Mengeneinheit getEinheit() {
        return einheit;
    }
    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    public OffsetDateTime getEnddatum() {
        return enddatum;
    }
    public void setEnddatum(OffsetDateTime enddatum) {
        this.enddatum = enddatum;
    }

    public OffsetDateTime getEndzeitpunkt() {
        return endzeitpunkt;
    }
    public void setEndzeitpunkt(OffsetDateTime endzeitpunkt) {
        this.endzeitpunkt = endzeitpunkt;
    }

    public OffsetDateTime getStartdatum() {
        return startdatum;
    }
    public void setStartdatum(OffsetDateTime startdatum) {
        this.startdatum = startdatum;
    }

    public OffsetDateTime getStartzeitpunkt() {
        return startzeitpunkt;
    }
    public void setStartzeitpunkt(OffsetDateTime startzeitpunkt) {
        this.startzeitpunkt = startzeitpunkt;
    }
}