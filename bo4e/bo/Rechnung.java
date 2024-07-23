package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Betrag;
import bo4e.enums.NetznutzungRechnungsart;
import bo4e.enums.NetznutzungRechnungstyp;
import bo4e.com.Zeitraum;
import bo4e.com.Rechnungsposition;
import bo4e.enums.Rechnungsstatus;
import bo4e.enums.Rechnungstyp;
import bo4e.enums.Sparte;
import bo4e.com.Steuerbetrag;
import java.time.OffsetDateTime;

/**
 * Modell für die Abbildung von Rechnungen und Netznutzungsrechnungen im Kontext der
 * Energiewirtschaft;
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Rechnung.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Rechnung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Rechnung.json>`_
 */
public class Rechnung extends Geschaeftsobjekt {
    private final Typ _typ = Typ.RECHNUNG;
    private OffsetDateTime faelligkeitsdatum;
    private Betrag gesamtbrutto;
    private Betrag gesamtnetto;
    private Betrag gesamtsteuer;
    private Boolean istOriginal;
    private Boolean istSimuliert;
    private Boolean istStorno;
    private Marktlokation marktlokation;
    private Messlokation messlokation;
    private NetznutzungRechnungsart netznutzungrechnungsart;
    private NetznutzungRechnungstyp netznutzungrechnungstyp;
    private String originalRechnungsnummer;
    private Betrag rabattBrutto;
    private OffsetDateTime rechnungsdatum;
    private Geschaeftspartner rechnungsempfaenger;
    private Geschaeftspartner rechnungsersteller;
    private String rechnungsnummer;
    private Zeitraum rechnungsperiode;
    private Rechnungsposition[] rechnungspositionen;
    private Rechnungsstatus rechnungsstatus;
    private String rechnungstitel;
    private Rechnungstyp rechnungstyp;
    private Sparte sparte;
    private Steuerbetrag[] steuerbetraege;
    private Betrag vorausgezahlt;
    private Betrag zuZahlen;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Der Zeitraum der zugrunde liegenden Lieferung zur Rechnung
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Zu diesem Datum ist die Zahlung fällig
     */
    public OffsetDateTime getFaelligkeitsdatum() { return faelligkeitsdatum; }
    public void setFaelligkeitsdatum(OffsetDateTime value) { this.faelligkeitsdatum = value; }

    /**
     * Die Summe aus Netto- und Steuerbetrag
     */
    public Betrag getGesamtbrutto() { return gesamtbrutto; }
    public void setGesamtbrutto(Betrag value) { this.gesamtbrutto = value; }

    /**
     * Die Summe der Nettobeträge der Rechnungsteile
     */
    public Betrag getGesamtnetto() { return gesamtnetto; }
    public void setGesamtnetto(Betrag value) { this.gesamtnetto = value; }

    /**
     * Die Summe der Steuerbeträge der Rechnungsteile
     */
    public Betrag getGesamtsteuer() { return gesamtsteuer; }
    public void setGesamtsteuer(Betrag value) { this.gesamtsteuer = value; }

    /**
     * Kennzeichen, ob es sich um ein Original (true) oder eine Kopie handelt (false)
     */
    public Boolean getIstOriginal() { return istOriginal; }
    public void setIstOriginal(Boolean value) { this.istOriginal = value; }

    /**
     * Kennzeichen, ob es sich um eine simulierte Rechnung, z.B. zur Rechnungsprüfung handelt
     */
    public Boolean getIstSimuliert() { return istSimuliert; }
    public void setIstSimuliert(Boolean value) { this.istSimuliert = value; }

    /**
     * Eine im Verwendungskontext eindeutige Nummer für die Rechnung
     */
    public Boolean getIstStorno() { return istStorno; }
    public void setIstStorno(Boolean value) { this.istStorno = value; }

    /**
     * Marktlokation, auf die sich die Rechnung bezieht
     */
    public Marktlokation getMarktlokation() { return marktlokation; }
    public void setMarktlokation(Marktlokation value) { this.marktlokation = value; }

    /**
     * Messlokation, auf die sich die Rechnung bezieht
     */
    public Messlokation getMesslokation() { return messlokation; }
    public void setMesslokation(Messlokation value) { this.messlokation = value; }

    /**
     * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
     */
    public NetznutzungRechnungsart getNetznutzungrechnungsart() { return netznutzungrechnungsart; }
    public void setNetznutzungrechnungsart(NetznutzungRechnungsart value) { this.netznutzungrechnungsart = value; }

    /**
     * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
     */
    public NetznutzungRechnungstyp getNetznutzungrechnungstyp() { return netznutzungrechnungstyp; }
    public void setNetznutzungrechnungstyp(NetznutzungRechnungstyp value) { this.netznutzungrechnungstyp = value; }

    /**
     * Im Falle einer Stornorechnung (storno = true) steht hier die Rechnungsnummer der
     * stornierten Rechnung
     */
    public String getOriginalRechnungsnummer() { return originalRechnungsnummer; }
    public void setOriginalRechnungsnummer(String value) { this.originalRechnungsnummer = value; }

    /**
     * Gesamtrabatt auf den Bruttobetrag
     */
    public Betrag getRabattBrutto() { return rabattBrutto; }
    public void setRabattBrutto(Betrag value) { this.rabattBrutto = value; }

    /**
     * Ausstellungsdatum der Rechnung
     */
    public OffsetDateTime getRechnungsdatum() { return rechnungsdatum; }
    public void setRechnungsdatum(OffsetDateTime value) { this.rechnungsdatum = value; }

    /**
     * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
     * verlinkten Marktteilnehmer
     */
    public Geschaeftspartner getRechnungsempfaenger() { return rechnungsempfaenger; }
    public void setRechnungsempfaenger(Geschaeftspartner value) { this.rechnungsempfaenger = value; }

    /**
     * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
     * verlinkten Marktteilnehmer
     */
    public Geschaeftspartner getRechnungsersteller() { return rechnungsersteller; }
    public void setRechnungsersteller(Geschaeftspartner value) { this.rechnungsersteller = value; }

    /**
     * Eine im Verwendungskontext eindeutige Nummer für die Rechnung
     */
    public String getRechnungsnummer() { return rechnungsnummer; }
    public void setRechnungsnummer(String value) { this.rechnungsnummer = value; }

    /**
     * Der Zeitraum der zugrunde liegenden Lieferung zur Rechnung
     */
    public Zeitraum getRechnungsperiode() { return rechnungsperiode; }
    public void setRechnungsperiode(Zeitraum value) { this.rechnungsperiode = value; }

    /**
     * Die Rechnungspositionen
     */
    public Rechnungsposition[] getRechnungspositionen() { return rechnungspositionen; }
    public void setRechnungspositionen(Rechnungsposition[] value) { this.rechnungspositionen = value; }

    /**
     * Status der Rechnung zur Kennzeichnung des Bearbeitungsstandes
     */
    public Rechnungsstatus getRechnungsstatus() { return rechnungsstatus; }
    public void setRechnungsstatus(Rechnungsstatus value) { this.rechnungsstatus = value; }

    /**
     * Bezeichnung für die vorliegende Rechnung
     */
    public String getRechnungstitel() { return rechnungstitel; }
    public void setRechnungstitel(String value) { this.rechnungstitel = value; }

    /**
     * Ein kontextbezogender Rechnungstyp, z.B. Netznutzungsrechnung
     */
    public Rechnungstyp getRechnungstyp() { return rechnungstyp; }
    public void setRechnungstyp(Rechnungstyp value) { this.rechnungstyp = value; }

    /**
     * Sparte (Strom, Gas ...) für die die Rechnung ausgestellt ist
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    /**
     * Sparte (Strom, Gas ...) für die die Rechnung ausgestellt ist
     */
    public Steuerbetrag[] getSteuerbetraege() { return steuerbetraege; }
    public void setSteuerbetraege(Steuerbetrag[] value) { this.steuerbetraege = value; }

    /**
     * Die Summe evtl. vorausgezahlter Beträge, z.B. Abschläge. Angabe als Bruttowert
     */
    public Betrag getVorausgezahlt() { return vorausgezahlt; }
    public void setVorausgezahlt(Betrag value) { this.vorausgezahlt = value; }

    /**
     * Der zu zahlende Betrag, der sich aus (gesamtbrutto - vorausbezahlt - rabattBrutto) ergibt
     */
    public Betrag getZuZahlen() { return zuZahlen; }
    public void setZuZahlen(Betrag value) { this.zuZahlen = value; }
}
