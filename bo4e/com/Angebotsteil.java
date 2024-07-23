package bo4e.com;

import bo4e.bo.Marktlokation;

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
    private String anfrageSubreferenz;
    private Betrag gesamtkostenangebotsteil;
    private Menge gesamtmengeangebotsteil;
    private Marktlokation[] lieferstellenangebotsteil;
    private Zeitraum lieferzeitraum;
    private Angebotsposition[] positionen;

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
     * Identifizierung eines Subkapitels einer Anfrage, beispielsweise das Los einer
     * Ausschreibung
     */
    public String getAnfrageSubreferenz() { return anfrageSubreferenz; }
    public void setAnfrageSubreferenz(String value) { this.anfrageSubreferenz = value; }

    /**
     * Summe der Jahresenergiekosten aller in diesem Angebotsteil enthaltenen Lieferstellen
     */
    public Betrag getGesamtkostenangebotsteil() { return gesamtkostenangebotsteil; }
    public void setGesamtkostenangebotsteil(Betrag value) { this.gesamtkostenangebotsteil = value; }

    /**
     * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
     */
    public Menge getGesamtmengeangebotsteil() { return gesamtmengeangebotsteil; }
    public void setGesamtmengeangebotsteil(Menge value) { this.gesamtmengeangebotsteil = value; }

    /**
     * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
     */
    public Marktlokation[] getLieferstellenangebotsteil() { return lieferstellenangebotsteil; }
    public void setLieferstellenangebotsteil(Marktlokation[] value) { this.lieferstellenangebotsteil = value; }

    /**
     * Hier kann der Belieferungszeitraum angegeben werden, für den dieser Angebotsteil gilt
     */
    public Zeitraum getLieferzeitraum() { return lieferzeitraum; }
    public void setLieferzeitraum(Zeitraum value) { this.lieferzeitraum = value; }

    /**
     * Einzelne Positionen, die zu diesem Angebotsteil gehören
     */
    public Angebotsposition[] getPositionen() { return positionen; }
    public void setPositionen(Angebotsposition[] value) { this.positionen = value; }

}
