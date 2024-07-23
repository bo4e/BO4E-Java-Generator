package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Betrag;
import bo4e.com.Betrag;
import bo4e.com.Betrag;
import bo4e.enums.NetznutzungRechnungsart;
import bo4e.enums.NetznutzungRechnungstyp;
import bo4e.com.Betrag;
import bo4e.com.Zeitraum;
import bo4e.com.Rechnungsposition;
import bo4e.enums.Rechnungsstatus;
import bo4e.enums.Rechnungstyp;
import bo4e.enums.Sparte;
import bo4e.com.Steuerbetrag;
import bo4e.com.Betrag;
import bo4e.com.Betrag;

import java.time.OffsetDateTime;
import java.util.List;

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
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.RECHNUNG;
    /**
     * Zu diesem Datum ist die Zahlung fällig
     */
    private OffsetDateTime faelligkeitsdatum;
    /**
     * Die Summe aus Netto- und Steuerbetrag
     */
    private Betrag gesamtbrutto;
    /**
     * Die Summe der Nettobeträge der Rechnungsteile
     */
    private Betrag gesamtnetto;
    /**
     * Die Summe der Steuerbeträge der Rechnungsteile
     */
    private Betrag gesamtsteuer;
    /**
     * Kennzeichen, ob es sich um ein Original (true) oder eine Kopie handelt (false)
     */
    private Boolean istOriginal;
    /**
     * Kennzeichen, ob es sich um eine simulierte Rechnung, z.B. zur Rechnungsprüfung handelt
     */
    private Boolean istSimuliert;
    /**
     * Eine im Verwendungskontext eindeutige Nummer für die Rechnung
     */
    private Boolean istStorno;
    /**
     * Marktlokation, auf die sich die Rechnung bezieht
     */
    private Marktlokation marktlokation;
    /**
     * Messlokation, auf die sich die Rechnung bezieht
     */
    private Messlokation messlokation;
    /**
     * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
     */
    private NetznutzungRechnungsart netznutzungrechnungsart;
    /**
     * Aus der INVOIC entnommen, befüllt wenn es sich um eine Netznutzungsrechnung handelt
     */
    private NetznutzungRechnungstyp netznutzungrechnungstyp;
    /**
     * Im Falle einer Stornorechnung (storno = true) steht hier die Rechnungsnummer der
     * stornierten Rechnung
     */
    private String originalRechnungsnummer;
    /**
     * Gesamtrabatt auf den Bruttobetrag
     */
    private Betrag rabattBrutto;
    /**
     * Ausstellungsdatum der Rechnung
     */
    private OffsetDateTime rechnungsdatum;
    /**
     * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
     * verlinkten Marktteilnehmer
     */
    private Geschaeftspartner rechnungsempfaenger;
    /**
     * Der Aussteller der Rechnung, die Rollencodenummer kennt man über den im Geschäftspartner
     * verlinkten Marktteilnehmer
     */
    private Geschaeftspartner rechnungsersteller;
    /**
     * Eine im Verwendungskontext eindeutige Nummer für die Rechnung
     */
    private String rechnungsnummer;
    /**
     * Der Zeitraum der zugrunde liegenden Lieferung zur Rechnung
     */
    private Zeitraum rechnungsperiode;
    /**
     * Die Rechnungspositionen
     */
    private List<Rechnungsposition> rechnungspositionen;
    /**
     * Status der Rechnung zur Kennzeichnung des Bearbeitungsstandes
     */
    private Rechnungsstatus rechnungsstatus;
    /**
     * Bezeichnung für die vorliegende Rechnung
     */
    private String rechnungstitel;
    /**
     * Ein kontextbezogender Rechnungstyp, z.B. Netznutzungsrechnung
     */
    private Rechnungstyp rechnungstyp;
    /**
     * Sparte (Strom, Gas ...) für die die Rechnung ausgestellt ist
     */
    private Sparte sparte;
    /**
     * Sparte (Strom, Gas ...) für die die Rechnung ausgestellt ist
     */
    private List<Steuerbetrag> steuerbetraege;
    /**
     * Die Summe evtl. vorausgezahlter Beträge, z.B. Abschläge. Angabe als Bruttowert
     */
    private Betrag vorausgezahlt;
    /**
     * Der zu zahlende Betrag, der sich aus (gesamtbrutto - vorausbezahlt - rabattBrutto) ergibt
     */
    private Betrag zuZahlen;

    public OffsetDateTime getFaelligkeitsdatum() {
        return faelligkeitsdatum;
    }
    public void setFaelligkeitsdatum(OffsetDateTime faelligkeitsdatum) {
        this.faelligkeitsdatum = faelligkeitsdatum;
    }

    public Betrag getGesamtbrutto() {
        return gesamtbrutto;
    }
    public void setGesamtbrutto(Betrag gesamtbrutto) {
        this.gesamtbrutto = gesamtbrutto;
    }

    public Betrag getGesamtnetto() {
        return gesamtnetto;
    }
    public void setGesamtnetto(Betrag gesamtnetto) {
        this.gesamtnetto = gesamtnetto;
    }

    public Betrag getGesamtsteuer() {
        return gesamtsteuer;
    }
    public void setGesamtsteuer(Betrag gesamtsteuer) {
        this.gesamtsteuer = gesamtsteuer;
    }

    public Boolean getIstOriginal() {
        return istOriginal;
    }
    public void setIstOriginal(Boolean istOriginal) {
        this.istOriginal = istOriginal;
    }

    public Boolean getIstSimuliert() {
        return istSimuliert;
    }
    public void setIstSimuliert(Boolean istSimuliert) {
        this.istSimuliert = istSimuliert;
    }

    public Boolean getIstStorno() {
        return istStorno;
    }
    public void setIstStorno(Boolean istStorno) {
        this.istStorno = istStorno;
    }

    public Marktlokation getMarktlokation() {
        return marktlokation;
    }
    public void setMarktlokation(Marktlokation marktlokation) {
        this.marktlokation = marktlokation;
    }

    public Messlokation getMesslokation() {
        return messlokation;
    }
    public void setMesslokation(Messlokation messlokation) {
        this.messlokation = messlokation;
    }

    public NetznutzungRechnungsart getNetznutzungrechnungsart() {
        return netznutzungrechnungsart;
    }
    public void setNetznutzungrechnungsart(NetznutzungRechnungsart netznutzungrechnungsart) {
        this.netznutzungrechnungsart = netznutzungrechnungsart;
    }

    public NetznutzungRechnungstyp getNetznutzungrechnungstyp() {
        return netznutzungrechnungstyp;
    }
    public void setNetznutzungrechnungstyp(NetznutzungRechnungstyp netznutzungrechnungstyp) {
        this.netznutzungrechnungstyp = netznutzungrechnungstyp;
    }

    public String getOriginalRechnungsnummer() {
        return originalRechnungsnummer;
    }
    public void setOriginalRechnungsnummer(String originalRechnungsnummer) {
        this.originalRechnungsnummer = originalRechnungsnummer;
    }

    public Betrag getRabattBrutto() {
        return rabattBrutto;
    }
    public void setRabattBrutto(Betrag rabattBrutto) {
        this.rabattBrutto = rabattBrutto;
    }

    public OffsetDateTime getRechnungsdatum() {
        return rechnungsdatum;
    }
    public void setRechnungsdatum(OffsetDateTime rechnungsdatum) {
        this.rechnungsdatum = rechnungsdatum;
    }

    public Geschaeftspartner getRechnungsempfaenger() {
        return rechnungsempfaenger;
    }
    public void setRechnungsempfaenger(Geschaeftspartner rechnungsempfaenger) {
        this.rechnungsempfaenger = rechnungsempfaenger;
    }

    public Geschaeftspartner getRechnungsersteller() {
        return rechnungsersteller;
    }
    public void setRechnungsersteller(Geschaeftspartner rechnungsersteller) {
        this.rechnungsersteller = rechnungsersteller;
    }

    public String getRechnungsnummer() {
        return rechnungsnummer;
    }
    public void setRechnungsnummer(String rechnungsnummer) {
        this.rechnungsnummer = rechnungsnummer;
    }

    public Zeitraum getRechnungsperiode() {
        return rechnungsperiode;
    }
    public void setRechnungsperiode(Zeitraum rechnungsperiode) {
        this.rechnungsperiode = rechnungsperiode;
    }

    public List<Rechnungsposition> getRechnungspositionen() {
        return rechnungspositionen;
    }
    public void setRechnungspositionen(List<Rechnungsposition> rechnungspositionen) {
        this.rechnungspositionen = rechnungspositionen;
    }

    public Rechnungsstatus getRechnungsstatus() {
        return rechnungsstatus;
    }
    public void setRechnungsstatus(Rechnungsstatus rechnungsstatus) {
        this.rechnungsstatus = rechnungsstatus;
    }

    public String getRechnungstitel() {
        return rechnungstitel;
    }
    public void setRechnungstitel(String rechnungstitel) {
        this.rechnungstitel = rechnungstitel;
    }

    public Rechnungstyp getRechnungstyp() {
        return rechnungstyp;
    }
    public void setRechnungstyp(Rechnungstyp rechnungstyp) {
        this.rechnungstyp = rechnungstyp;
    }

    public Sparte getSparte() {
        return sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public List<Steuerbetrag> getSteuerbetraege() {
        return steuerbetraege;
    }
    public void setSteuerbetraege(List<Steuerbetrag> steuerbetraege) {
        this.steuerbetraege = steuerbetraege;
    }

    public Betrag getVorausgezahlt() {
        return vorausgezahlt;
    }
    public void setVorausgezahlt(Betrag vorausgezahlt) {
        this.vorausgezahlt = vorausgezahlt;
    }

    public Betrag getZuZahlen() {
        return zuZahlen;
    }
    public void setZuZahlen(Betrag zuZahlen) {
        this.zuZahlen = zuZahlen;
    }
}