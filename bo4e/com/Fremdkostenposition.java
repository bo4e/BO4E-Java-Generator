package bo4e.com;

import java.time.OffsetDateTime;

/**
 * Eine Kostenposition im Bereich der Fremdkosten
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Fremdkostenposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Fremdkostenposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Fremdkostenposition.json>`_
 */
public class Fremdkostenposition extends COM {
    private String artikelbezeichnung;
    private String artikeldetail;
    private Betrag betragKostenposition;
    private OffsetDateTime bis;
    private Preis einzelpreis;
    private String gebietcodeEic;
    private String linkPreisblatt;
    private String marktpartnercode;
    private String marktpartnername;
    private Menge menge;
    private String positionstitel;
    private OffsetDateTime von;
    private Menge zeitmenge;

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
     * EIC-Code des Regel- oder Marktgebietes eingetragen. Z.B. '10YDE-EON------1' für die
     * Regelzone TenneT
     */
    public String getGebietcodeEic() { return gebietcodeEic; }
    public void setGebietcodeEic(String value) { this.gebietcodeEic = value; }

    /**
     * Link zum veröffentlichten Preisblatt
     */
    public String getLinkPreisblatt() { return linkPreisblatt; }
    public void setLinkPreisblatt(String value) { this.linkPreisblatt = value; }

    /**
     * Die Codenummer (z.B. BDEW-Codenummer) des Marktpartners, der die Preise festlegt / die
     * Kosten in Rechnung stellt
     */
    public String getMarktpartnercode() { return marktpartnercode; }
    public void setMarktpartnercode(String value) { this.marktpartnercode = value; }

    /**
     * Der Name des Marktpartners, der die Preise festlegt, bzw. die Kosten in Rechnung stellt
     */
    public String getMarktpartnername() { return marktpartnername; }
    public void setMarktpartnername(String value) { this.marktpartnername = value; }

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

}
