package bo4e.com;

import com.example.bo4e.bo.Marktlokation;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Angebotsteil.json>`_
 */
public class Angebotsteil extends COM {
    private String anfrageSubreferenz;
    private Betrag gesamtkostenangebotsteil;
    private Menge gesamtmengeangebotsteil;
    private Marktlokation[] lieferstellenangebotsteil;
    private Zeitraum lieferzeitraum;
    private Angebotsposition[] positionen;

    public String getAnfrageSubreferenz() { return anfrageSubreferenz; }
    public void setAnfrageSubreferenz(String value) { this.anfrageSubreferenz = value; }

    public Betrag getGesamtkostenangebotsteil() { return gesamtkostenangebotsteil; }
    public void setGesamtkostenangebotsteil(Betrag value) { this.gesamtkostenangebotsteil = value; }

    public Menge getGesamtmengeangebotsteil() { return gesamtmengeangebotsteil; }
    public void setGesamtmengeangebotsteil(Menge value) { this.gesamtmengeangebotsteil = value; }

    public Marktlokation[] getLieferstellenangebotsteil() { return lieferstellenangebotsteil; }
    public void setLieferstellenangebotsteil(Marktlokation[] value) { this.lieferstellenangebotsteil = value; }

    public Zeitraum getLieferzeitraum() { return lieferzeitraum; }
    public void setLieferzeitraum(Zeitraum value) { this.lieferzeitraum = value; }

    public Angebotsposition[] getPositionen() { return positionen; }
    public void setPositionen(Angebotsposition[] value) { this.positionen = value; }

}
