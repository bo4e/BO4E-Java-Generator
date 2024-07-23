package bo4e.com;

import bo4e.bo.Marktlokation;

import java.util.List;

/**
 * Mit dieser Komponente wird ein Teil einer Angebotsvariante abgebildet.
 * Hier werden alle Angebotspositionen aggregiert.
 * Angebotsteile werden im einfachsten Fall für eine Marktlokation oder Lieferstellenadresse
 * erzeugt.
 * Hier werden die Mengen und Gesamtkosten aller Angebotspositionen zusammengefasst.
 * Eine Variante besteht mindestens aus einem Angebotsteil.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Angebotsteil.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebotsteil JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Angebotsteil.json>`_
 */
public class Angebotsteil extends COM {
    /**
     * Identifizierung eines Subkapitels einer Anfrage, beispielsweise das Los einer
     * Ausschreibung
     */
    private String anfrageSubreferenz;
    /**
     * Summe der Jahresenergiekosten aller in diesem Angebotsteil enthaltenen Lieferstellen
     */
    private Betrag gesamtkostenangebotsteil;
    /**
     * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
     */
    private Menge gesamtmengeangebotsteil;
    /**
     * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
     */
    private List<Marktlokation> lieferstellenangebotsteil;
    /**
     * Hier kann der Belieferungszeitraum angegeben werden, für den dieser Angebotsteil gilt
     */
    private Zeitraum lieferzeitraum;
    /**
     * Einzelne Positionen, die zu diesem Angebotsteil gehören
     */
    private List<Angebotsposition> positionen;

    public String getAnfrageSubreferenz() {
        return AnfrageSubreferenz;
    }
    public void setAnfrageSubreferenz(String anfrageSubreferenz) {
        this.anfrageSubreferenz = anfrageSubreferenz;
    }

    public Betrag getGesamtkostenangebotsteil() {
        return Gesamtkostenangebotsteil;
    }
    public void setGesamtkostenangebotsteil(Betrag gesamtkostenangebotsteil) {
        this.gesamtkostenangebotsteil = gesamtkostenangebotsteil;
    }

    public Menge getGesamtmengeangebotsteil() {
        return Gesamtmengeangebotsteil;
    }
    public void setGesamtmengeangebotsteil(Menge gesamtmengeangebotsteil) {
        this.gesamtmengeangebotsteil = gesamtmengeangebotsteil;
    }

    public List<Marktlokation> getLieferstellenangebotsteil() {
        return Lieferstellenangebotsteil;
    }
    public void setLieferstellenangebotsteil(List<Marktlokation> lieferstellenangebotsteil) {
        this.lieferstellenangebotsteil = lieferstellenangebotsteil;
    }

    public Zeitraum getLieferzeitraum() {
        return Lieferzeitraum;
    }
    public void setLieferzeitraum(Zeitraum lieferzeitraum) {
        this.lieferzeitraum = lieferzeitraum;
    }

    public List<Angebotsposition> getPositionen() {
        return Positionen;
    }
    public void setPositionen(List<Angebotsposition> positionen) {
        this.positionen = positionen;
    }
}