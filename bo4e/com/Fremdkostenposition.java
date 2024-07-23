package bo4e.com;

import java.time.OffsetDateTime;
import java.util.List;

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
    /**
     * Bezeichnung für den Artikel für den die Kosten ermittelt wurden. Beispiel: Arbeitspreis HT
     */
    private String artikelbezeichnung;
    /**
     * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
     */
    private String artikeldetail;
    /**
     * Der errechnete Gesamtbetrag der Position als Ergebnis der Berechnung <Menge *
     * Einzelpreis> oder
     * <Einzelpreis / (Anzahl Tage Jahr) * zeitmenge>
     */
    private Betrag betragKostenposition;
    /**
     * exklusiver bis-Zeitpunkt der Kostenzeitscheibe
     */
    private OffsetDateTime bis;
    /**
     * Der Preis für eine Einheit. Beispiele: 5,8200 ct/kWh oder 55 €/Jahr.
     */
    private Preis einzelpreis;
    /**
     * EIC-Code des Regel- oder Marktgebietes eingetragen. Z.B. '10YDE-EON------1' für die
     * Regelzone TenneT
     */
    private String gebietcodeEic;
    /**
     * Link zum veröffentlichten Preisblatt
     */
    private String linkPreisblatt;
    /**
     * Die Codenummer (z.B. BDEW-Codenummer) des Marktpartners, der die Preise festlegt / die
     * Kosten in Rechnung stellt
     */
    private String marktpartnercode;
    /**
     * Der Name des Marktpartners, der die Preise festlegt, bzw. die Kosten in Rechnung stellt
     */
    private String marktpartnername;
    /**
     * Die Menge, die in die Kostenberechnung eingeflossen ist. Beispiel: 3.660 kWh
     */
    private Menge menge;
    /**
     * Ein Titel für die Zeile. Hier kann z.B. der Netzbetreiber eingetragen werden, wenn es
     * sich um Netzkosten handelt.
     */
    private String positionstitel;
    /**
     * inklusiver von-Zeitpunkt der Kostenzeitscheibe
     */
    private OffsetDateTime von;
    /**
     * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
     */
    private Menge zeitmenge;

    public String getArtikelbezeichnung() {
        return Artikelbezeichnung;
    }
    public void setArtikelbezeichnung(String artikelbezeichnung) {
        this.artikelbezeichnung = artikelbezeichnung;
    }

    public String getArtikeldetail() {
        return Artikeldetail;
    }
    public void setArtikeldetail(String artikeldetail) {
        this.artikeldetail = artikeldetail;
    }

    public Betrag getBetragKostenposition() {
        return BetragKostenposition;
    }
    public void setBetragKostenposition(Betrag betragKostenposition) {
        this.betragKostenposition = betragKostenposition;
    }

    public OffsetDateTime getBis() {
        return Bis;
    }
    public void setBis(OffsetDateTime bis) {
        this.bis = bis;
    }

    public Preis getEinzelpreis() {
        return Einzelpreis;
    }
    public void setEinzelpreis(Preis einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    public String getGebietcodeEic() {
        return GebietcodeEic;
    }
    public void setGebietcodeEic(String gebietcodeEic) {
        this.gebietcodeEic = gebietcodeEic;
    }

    public String getLinkPreisblatt() {
        return LinkPreisblatt;
    }
    public void setLinkPreisblatt(String linkPreisblatt) {
        this.linkPreisblatt = linkPreisblatt;
    }

    public String getMarktpartnercode() {
        return Marktpartnercode;
    }
    public void setMarktpartnercode(String marktpartnercode) {
        this.marktpartnercode = marktpartnercode;
    }

    public String getMarktpartnername() {
        return Marktpartnername;
    }
    public void setMarktpartnername(String marktpartnername) {
        this.marktpartnername = marktpartnername;
    }

    public Menge getMenge() {
        return Menge;
    }
    public void setMenge(Menge menge) {
        this.menge = menge;
    }

    public String getPositionstitel() {
        return Positionstitel;
    }
    public void setPositionstitel(String positionstitel) {
        this.positionstitel = positionstitel;
    }

    public OffsetDateTime getVon() {
        return Von;
    }
    public void setVon(OffsetDateTime von) {
        this.von = von;
    }

    public Menge getZeitmenge() {
        return Zeitmenge;
    }
    public void setZeitmenge(Menge zeitmenge) {
        this.zeitmenge = zeitmenge;
    }
}