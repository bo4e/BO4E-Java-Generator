package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Kostenposition verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kostenposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kostenposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Kostenposition.json>`_
 */
public class Kostenposition {
    private String id;
    private String version;
    private String artikelbezeichnung;
    private String artikeldetail;
    private Betrag betragKostenposition;
    private OffsetDateTime bis;
    private Preis einzelpreis;
    private Menge menge;
    private String positionstitel;
    private OffsetDateTime von;
    private Menge zeitmenge;
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

    /**
     * Bezeichnung für den Artikel für den die Kosten ermittelt wurden. Beispiel: Arbeitspreis HT
     */
    public String getArtikelbezeichnung() { return artikelbezeichnung; }
    public void setArtikelbezeichnung(String value) { this.artikelbezeichnung = value; }

    /**
     * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
     */
    public String getArtikeldetail() { return artikeldetail; }
    public void setArtikeldetail(String value) { this.artikeldetail = value; }

    /**
     * Der errechnete Gesamtbetrag der Position als Ergebnis der Berechnung <Menge *
     * Einzelpreis> oder
     * <Einzelpreis / (Anzahl Tage Jahr) * zeitmenge>
     */
    public Betrag getBetragKostenposition() { return betragKostenposition; }
    public void setBetragKostenposition(Betrag value) { this.betragKostenposition = value; }

    /**
     * exklusiver bis-Zeitpunkt der Kostenzeitscheibe
     */
    public OffsetDateTime getBis() { return bis; }
    public void setBis(OffsetDateTime value) { this.bis = value; }

    /**
     * Der Preis für eine Einheit. Beispiele: 5,8200 ct/kWh oder 55 €/Jahr.
     */
    public Preis getEinzelpreis() { return einzelpreis; }
    public void setEinzelpreis(Preis value) { this.einzelpreis = value; }

    /**
     * Die Menge, die in die Kostenberechnung eingeflossen ist. Beispiel: 3.660 kWh
     */
    public Menge getMenge() { return menge; }
    public void setMenge(Menge value) { this.menge = value; }

    /**
     * Ein Titel für die Zeile. Hier kann z.B. der Netzbetreiber eingetragen werden, wenn es
     * sich um Netzkosten handelt.
     */
    public String getPositionstitel() { return positionstitel; }
    public void setPositionstitel(String value) { this.positionstitel = value; }

    /**
     * inklusiver von-Zeitpunkt der Kostenzeitscheibe
     */
    public OffsetDateTime getVon() { return von; }
    public void setVon(OffsetDateTime value) { this.von = value; }

    /**
     * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
     */
    public Menge getZeitmenge() { return zeitmenge; }
    public void setZeitmenge(Menge value) { this.zeitmenge = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
