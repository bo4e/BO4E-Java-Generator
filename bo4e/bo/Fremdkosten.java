package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.com.Fremdkostenblock;
import bo4e.com.Betrag;

import java.util.List;

/**
 * Mit diesem BO werden die Fremdkosten, beispielsweise für eine Angebotserstellung oder
 * eine Rechnungsprüfung,
 * übertragen.
 * Die Fremdkosten enthalten dabei alle Kostenblöcke, die von anderen Marktteilnehmern oder
 * Instanzen erhoben werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Fremdkosten.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Fremdkosten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Fremdkosten.json>`_
 */
public class Fremdkosten extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.FREMDKOSTEN;
    /**
     * Für diesen Zeitraum wurden die Kosten ermittelt
     */
    private Zeitraum gueltigkeit;
    /**
     * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
     * Steuern etc
     */
    private List<Fremdkostenblock> kostenbloecke;
    /**
     * Die Gesamtsumme über alle Kostenblöcke und -positionen
     */
    private Betrag summeKosten;

    public Zeitraum getGueltigkeit() {
        return gueltigkeit;
    }
    public void setGueltigkeit(Zeitraum gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    public List<Fremdkostenblock> getKostenbloecke() {
        return kostenbloecke;
    }
    public void setKostenbloecke(List<Fremdkostenblock> kostenbloecke) {
        this.kostenbloecke = kostenbloecke;
    }

    public Betrag getSummeKosten() {
        return summeKosten;
    }
    public void setSummeKosten(Betrag summeKosten) {
        this.summeKosten = summeKosten;
    }
}