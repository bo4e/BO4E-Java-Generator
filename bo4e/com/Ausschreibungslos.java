package bo4e.com;

import bo4e.enums.Sparte;
import bo4e.enums.Preismodell;
import bo4e.enums.Rechnungslegung;
import bo4e.enums.Vertragsform;

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
    private Long anzahlLieferstellen;
    private String bemerkung;
    private String betreutDurch;
    private String bezeichnung;
    private Sparte energieart;
    private Menge gesamtMenge;
    private Ausschreibungsdetail[] lieferstellen;
    private Zeitraum lieferzeitraum;
    private String losnummer;
    private Preismodell preismodell;
    private Zeitraum wiederholungsintervall;
    private Zeitraum wunschKuendingungsfrist;
    private Menge wunschMaximalmenge;
    private Menge wunschMindestmenge;
    private Rechnungslegung wunschRechnungslegung;
    private Vertragsform wunschVertragsform;
    private Zeitraum wunschZahlungsziel;

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
     * Anzahl der Lieferstellen in dieser Ausschreibung
     */
    public Long getAnzahlLieferstellen() { return anzahlLieferstellen; }
    public void setAnzahlLieferstellen(Long value) { this.anzahlLieferstellen = value; }

    /**
     * Bemerkung des Kunden zum Los
     */
    public String getBemerkung() { return bemerkung; }
    public void setBemerkung(String value) { this.bemerkung = value; }

    /**
     * Name des Lizenzpartners
     */
    public String getBetreutDurch() { return betreutDurch; }
    public void setBetreutDurch(String value) { this.betreutDurch = value; }

    /**
     * Bezeichnung der Ausschreibung
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Unterscheidungsmöglichkeiten für die Sparte
     */
    public Sparte getEnergieart() { return energieart; }
    public void setEnergieart(Sparte value) { this.energieart = value; }

    /**
     * Gibt den Gesamtjahresverbrauch (z.B. in kWh) aller in diesem Los enthaltenen
     * Lieferstellen an
     */
    public Menge getGesamtMenge() { return gesamtMenge; }
    public void setGesamtMenge(Menge value) { this.gesamtMenge = value; }

    /**
     * Die ausgeschriebenen Lieferstellen
     */
    public Ausschreibungsdetail[] getLieferstellen() { return lieferstellen; }
    public void setLieferstellen(Ausschreibungsdetail[] value) { this.lieferstellen = value; }

    /**
     * Zeitraum, für den die in diesem Los enthaltenen Lieferstellen beliefert werden sollen
     */
    public Zeitraum getLieferzeitraum() { return lieferzeitraum; }
    public void setLieferzeitraum(Zeitraum value) { this.lieferzeitraum = value; }

    /**
     * Laufende Nummer des Loses
     */
    public String getLosnummer() { return losnummer; }
    public void setLosnummer(String value) { this.losnummer = value; }

    /**
     * Bezeichnung der Preismodelle in Ausschreibungen für die Energielieferung
     */
    public Preismodell getPreismodell() { return preismodell; }
    public void setPreismodell(Preismodell value) { this.preismodell = value; }

    /**
     * Kundenwunsch zur Kündigungsfrist in der Ausschreibung
     */
    public Zeitraum getWiederholungsintervall() { return wiederholungsintervall; }
    public void setWiederholungsintervall(Zeitraum value) { this.wiederholungsintervall = value; }

    /**
     * Kundenwunsch zur Kündigungsfrist in der Ausschreibung
     */
    public Zeitraum getWunschKuendingungsfrist() { return wunschKuendingungsfrist; }
    public void setWunschKuendingungsfrist(Zeitraum value) { this.wunschKuendingungsfrist = value; }

    /**
     * Maximalmenge Toleranzband (kWh, %)
     */
    public Menge getWunschMaximalmenge() { return wunschMaximalmenge; }
    public void setWunschMaximalmenge(Menge value) { this.wunschMaximalmenge = value; }

    /**
     * Mindesmenge Toleranzband (kWh, %)
     */
    public Menge getWunschMindestmenge() { return wunschMindestmenge; }
    public void setWunschMindestmenge(Menge value) { this.wunschMindestmenge = value; }

    /**
     * Aufzählung der Möglichkeiten zur Rechnungslegung in Ausschreibungen
     */
    public Rechnungslegung getWunschRechnungslegung() { return wunschRechnungslegung; }
    public void setWunschRechnungslegung(Rechnungslegung value) { this.wunschRechnungslegung = value; }

    /**
     * Aufzählung der Möglichkeiten zu Vertragsformen in Ausschreibungen
     */
    public Vertragsform getWunschVertragsform() { return wunschVertragsform; }
    public void setWunschVertragsform(Vertragsform value) { this.wunschVertragsform = value; }

    /**
     * Kundenwunsch zum Zahlungsziel in der Ausschreibung
     */
    public Zeitraum getWunschZahlungsziel() { return wunschZahlungsziel; }
    public void setWunschZahlungsziel(Zeitraum value) { this.wunschZahlungsziel = value; }

}
