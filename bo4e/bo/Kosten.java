package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.com.Kostenblock;
import bo4e.enums.Kostenklasse;
import bo4e.com.Betrag;

/**
 * Dieses BO wird zur Übertagung von hierarchischen Kostenstrukturen verwendet.
 * Die Kosten werden dabei in Kostenblöcke und diese wiederum in Kostenpositionen
 * strukturiert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Kosten.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kosten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Kosten.json>`_
 */
public class Kosten extends Geschaeftsobjekt {
    private final Typ _typ = Typ.KOSTEN;
    private Zeitraum gueltigkeit;
    private Kostenblock[] kostenbloecke;
    private Kostenklasse kostenklasse;
    private Betrag[] summeKosten;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Klasse der Kosten, beispielsweise Fremdkosten
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Für diesen Zeitraum wurden die Kosten ermittelt
     */
    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    /**
     * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
     * Steuern etc
     */
    public Kostenblock[] getKostenbloecke() { return kostenbloecke; }
    public void setKostenbloecke(Kostenblock[] value) { this.kostenbloecke = value; }

    /**
     * Klasse der Kosten, beispielsweise Fremdkosten
     */
    public Kostenklasse getKostenklasse() { return kostenklasse; }
    public void setKostenklasse(Kostenklasse value) { this.kostenklasse = value; }

    /**
     * Die Gesamtsumme über alle Kostenblöcke und -positionen
     */
    public Betrag[] getSummeKosten() { return summeKosten; }
    public void setSummeKosten(Betrag[] value) { this.summeKosten = value; }

}
