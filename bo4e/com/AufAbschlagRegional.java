package bo4e.com;

import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.AufAbschlagsziel;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen
 * im Zusammenhang mit regionalen Gültigkeiten abgebildet werden.
 * Hier sind auch die Auswirkungen auf verschiedene Tarifparameter modelliert,
 * die sich durch die Auswahl eines Auf- oder Abschlags ergeben.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagRegional.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagRegional JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/AufAbschlagRegional.json>`_
 */
public class AufAbschlagRegional extends COM {
    /**
     * Typ des Aufabschlages (z.B. absolut oder prozentual)
     */
    private AufAbschlagstyp aufAbschlagstyp;
    /**
     * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
     * Gesamtpreis etc.
     */
    private AufAbschlagsziel aufAbschlagsziel;
    /**
     * Beschreibung zum Auf-/Abschlag
     */
    private String beschreibung;
    /**
     * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
     */
    private List<AufAbschlagProOrt> betraege;
    /**
     * Bezeichnung des Auf-/Abschlags
     */
    private String bezeichnung;
    /**
     * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct.
     */
    private Waehrungseinheit einheit;
    /**
     * Änderungen in den Einschränkungen zum Tarif. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    private Tarifeinschraenkung einschraenkungsaenderung;
    /**
     * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
     * Ökostrom:
     * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
     */
    private Energiemix energiemixaenderung;
    /**
     * Änderungen in den Garantievereinbarungen. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    private Preisgarantie garantieaenderung;
    /**
     * Zeitraum, in dem der Abschlag zur Anwendung kommen kann
     */
    private Zeitraum gueltigkeitszeitraum;
    /**
     * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten.
     */
    private String tarifnamensaenderungen;
    /**
     * Änderungen in den Vertragskonditionen. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    private Vertragskonditionen vertagskonditionsaenderung;
    /**
     * Voraussetzungen, die erfüllt sein müssen, damit dieser AufAbschlag zur Anwendung kommen
     * kann
     */
    private List<String> voraussetzungen;
    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind
     */
    private String website;
    /**
     * Zusatzprodukte, die nur in Kombination mit diesem AufAbschlag erhältlich sind
     */
    private List<String> zusatzprodukte;

    public AufAbschlagstyp getAufAbschlagstyp() {
        return AufAbschlagstyp;
    }
    public void setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
        this.aufAbschlagstyp = aufAbschlagstyp;
    }

    public AufAbschlagsziel getAufAbschlagsziel() {
        return AufAbschlagsziel;
    }
    public void setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
        this.aufAbschlagsziel = aufAbschlagsziel;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public List<AufAbschlagProOrt> getBetraege() {
        return Betraege;
    }
    public void setBetraege(List<AufAbschlagProOrt> betraege) {
        this.betraege = betraege;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Waehrungseinheit getEinheit() {
        return Einheit;
    }
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    public Tarifeinschraenkung getEinschraenkungsaenderung() {
        return Einschraenkungsaenderung;
    }
    public void setEinschraenkungsaenderung(Tarifeinschraenkung einschraenkungsaenderung) {
        this.einschraenkungsaenderung = einschraenkungsaenderung;
    }

    public Energiemix getEnergiemixaenderung() {
        return Energiemixaenderung;
    }
    public void setEnergiemixaenderung(Energiemix energiemixaenderung) {
        this.energiemixaenderung = energiemixaenderung;
    }

    public Preisgarantie getGarantieaenderung() {
        return Garantieaenderung;
    }
    public void setGarantieaenderung(Preisgarantie garantieaenderung) {
        this.garantieaenderung = garantieaenderung;
    }

    public Zeitraum getGueltigkeitszeitraum() {
        return Gueltigkeitszeitraum;
    }
    public void setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
        this.gueltigkeitszeitraum = gueltigkeitszeitraum;
    }

    public String getTarifnamensaenderungen() {
        return Tarifnamensaenderungen;
    }
    public void setTarifnamensaenderungen(String tarifnamensaenderungen) {
        this.tarifnamensaenderungen = tarifnamensaenderungen;
    }

    public Vertragskonditionen getVertagskonditionsaenderung() {
        return Vertagskonditionsaenderung;
    }
    public void setVertagskonditionsaenderung(Vertragskonditionen vertagskonditionsaenderung) {
        this.vertagskonditionsaenderung = vertagskonditionsaenderung;
    }

    public List<String> getVoraussetzungen() {
        return Voraussetzungen;
    }
    public void setVoraussetzungen(List<String> voraussetzungen) {
        this.voraussetzungen = voraussetzungen;
    }

    public String getWebsite() {
        return Website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public List<String> getZusatzprodukte() {
        return Zusatzprodukte;
    }
    public void setZusatzprodukte(List<String> zusatzprodukte) {
        this.zusatzprodukte = zusatzprodukte;
    }
}