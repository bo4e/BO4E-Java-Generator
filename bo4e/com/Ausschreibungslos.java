package bo4e.com;

import bo4e.enums.Sparte;
import bo4e.enums.Preismodell;
import bo4e.enums.Rechnungslegung;
import bo4e.enums.Vertragsform;

import java.util.List;

/**
 * Eine Komponente zur Abbildung einzelner Lose einer Ausschreibung
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Ausschreibungslos.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Ausschreibungslos JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Ausschreibungslos.json>`_
 */
public class Ausschreibungslos extends COM {
    /**
     * Anzahl der Lieferstellen in dieser Ausschreibung
     */
    private Long anzahlLieferstellen;
    /**
     * Bemerkung des Kunden zum Los
     */
    private String bemerkung;
    /**
     * Name des Lizenzpartners
     */
    private String betreutDurch;
    /**
     * Bezeichnung der Ausschreibung
     */
    private String bezeichnung;
    /**
     * Unterscheidungsmöglichkeiten für die Sparte
     */
    private Sparte energieart;
    /**
     * Gibt den Gesamtjahresverbrauch (z.B. in kWh) aller in diesem Los enthaltenen
     * Lieferstellen an
     */
    private Menge gesamtMenge;
    /**
     * Die ausgeschriebenen Lieferstellen
     */
    private List<Ausschreibungsdetail> lieferstellen;
    /**
     * Zeitraum, für den die in diesem Los enthaltenen Lieferstellen beliefert werden sollen
     */
    private Zeitraum lieferzeitraum;
    /**
     * Laufende Nummer des Loses
     */
    private String losnummer;
    /**
     * Bezeichnung der Preismodelle in Ausschreibungen für die Energielieferung
     */
    private Preismodell preismodell;
    /**
     * Kundenwunsch zur Kündigungsfrist in der Ausschreibung
     */
    private Zeitraum wiederholungsintervall;
    /**
     * Kundenwunsch zur Kündigungsfrist in der Ausschreibung
     */
    private Zeitraum wunschKuendingungsfrist;
    /**
     * Maximalmenge Toleranzband (kWh, %)
     */
    private Menge wunschMaximalmenge;
    /**
     * Mindesmenge Toleranzband (kWh, %)
     */
    private Menge wunschMindestmenge;
    /**
     * Aufzählung der Möglichkeiten zur Rechnungslegung in Ausschreibungen
     */
    private Rechnungslegung wunschRechnungslegung;
    /**
     * Aufzählung der Möglichkeiten zu Vertragsformen in Ausschreibungen
     */
    private Vertragsform wunschVertragsform;
    /**
     * Kundenwunsch zum Zahlungsziel in der Ausschreibung
     */
    private Zeitraum wunschZahlungsziel;

    public Long getAnzahlLieferstellen() {
        return anzahlLieferstellen;
    }
    public void setAnzahlLieferstellen(Long anzahlLieferstellen) {
        this.anzahlLieferstellen = anzahlLieferstellen;
    }

    public String getBemerkung() {
        return bemerkung;
    }
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public String getBetreutDurch() {
        return betreutDurch;
    }
    public void setBetreutDurch(String betreutDurch) {
        this.betreutDurch = betreutDurch;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Sparte getEnergieart() {
        return energieart;
    }
    public void setEnergieart(Sparte energieart) {
        this.energieart = energieart;
    }

    public Menge getGesamtMenge() {
        return gesamtMenge;
    }
    public void setGesamtMenge(Menge gesamtMenge) {
        this.gesamtMenge = gesamtMenge;
    }

    public List<Ausschreibungsdetail> getLieferstellen() {
        return lieferstellen;
    }
    public void setLieferstellen(List<Ausschreibungsdetail> lieferstellen) {
        this.lieferstellen = lieferstellen;
    }

    public Zeitraum getLieferzeitraum() {
        return lieferzeitraum;
    }
    public void setLieferzeitraum(Zeitraum lieferzeitraum) {
        this.lieferzeitraum = lieferzeitraum;
    }

    public String getLosnummer() {
        return losnummer;
    }
    public void setLosnummer(String losnummer) {
        this.losnummer = losnummer;
    }

    public Preismodell getPreismodell() {
        return preismodell;
    }
    public void setPreismodell(Preismodell preismodell) {
        this.preismodell = preismodell;
    }

    public Zeitraum getWiederholungsintervall() {
        return wiederholungsintervall;
    }
    public void setWiederholungsintervall(Zeitraum wiederholungsintervall) {
        this.wiederholungsintervall = wiederholungsintervall;
    }

    public Zeitraum getWunschKuendingungsfrist() {
        return wunschKuendingungsfrist;
    }
    public void setWunschKuendingungsfrist(Zeitraum wunschKuendingungsfrist) {
        this.wunschKuendingungsfrist = wunschKuendingungsfrist;
    }

    public Menge getWunschMaximalmenge() {
        return wunschMaximalmenge;
    }
    public void setWunschMaximalmenge(Menge wunschMaximalmenge) {
        this.wunschMaximalmenge = wunschMaximalmenge;
    }

    public Menge getWunschMindestmenge() {
        return wunschMindestmenge;
    }
    public void setWunschMindestmenge(Menge wunschMindestmenge) {
        this.wunschMindestmenge = wunschMindestmenge;
    }

    public Rechnungslegung getWunschRechnungslegung() {
        return wunschRechnungslegung;
    }
    public void setWunschRechnungslegung(Rechnungslegung wunschRechnungslegung) {
        this.wunschRechnungslegung = wunschRechnungslegung;
    }

    public Vertragsform getWunschVertragsform() {
        return wunschVertragsform;
    }
    public void setWunschVertragsform(Vertragsform wunschVertragsform) {
        this.wunschVertragsform = wunschVertragsform;
    }

    public Zeitraum getWunschZahlungsziel() {
        return wunschZahlungsziel;
    }
    public void setWunschZahlungsziel(Zeitraum wunschZahlungsziel) {
        this.wunschZahlungsziel = wunschZahlungsziel;
    }
}