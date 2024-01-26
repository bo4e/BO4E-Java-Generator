package bo4e.com;

import com.example.bo4e.enums.Sparte;
import com.example.bo4e.enums.Preismodell;
import com.example.bo4e.enums.Rechnungslegung;
import com.example.bo4e.enums.Vertragsform;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Ausschreibungslos.json>`_
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

    public Long getAnzahlLieferstellen() { return anzahlLieferstellen; }
    public void setAnzahlLieferstellen(Long value) { this.anzahlLieferstellen = value; }

    public String getBemerkung() { return bemerkung; }
    public void setBemerkung(String value) { this.bemerkung = value; }

    public String getBetreutDurch() { return betreutDurch; }
    public void setBetreutDurch(String value) { this.betreutDurch = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Sparte getEnergieart() { return energieart; }
    public void setEnergieart(Sparte value) { this.energieart = value; }

    public Menge getGesamtMenge() { return gesamtMenge; }
    public void setGesamtMenge(Menge value) { this.gesamtMenge = value; }

    public Ausschreibungsdetail[] getLieferstellen() { return lieferstellen; }
    public void setLieferstellen(Ausschreibungsdetail[] value) { this.lieferstellen = value; }

    public Zeitraum getLieferzeitraum() { return lieferzeitraum; }
    public void setLieferzeitraum(Zeitraum value) { this.lieferzeitraum = value; }

    public String getLosnummer() { return losnummer; }
    public void setLosnummer(String value) { this.losnummer = value; }

    public Preismodell getPreismodell() { return preismodell; }
    public void setPreismodell(Preismodell value) { this.preismodell = value; }

    public Zeitraum getWiederholungsintervall() { return wiederholungsintervall; }
    public void setWiederholungsintervall(Zeitraum value) { this.wiederholungsintervall = value; }

    public Zeitraum getWunschKuendingungsfrist() { return wunschKuendingungsfrist; }
    public void setWunschKuendingungsfrist(Zeitraum value) { this.wunschKuendingungsfrist = value; }

    public Menge getWunschMaximalmenge() { return wunschMaximalmenge; }
    public void setWunschMaximalmenge(Menge value) { this.wunschMaximalmenge = value; }

    public Menge getWunschMindestmenge() { return wunschMindestmenge; }
    public void setWunschMindestmenge(Menge value) { this.wunschMindestmenge = value; }

    public Rechnungslegung getWunschRechnungslegung() { return wunschRechnungslegung; }
    public void setWunschRechnungslegung(Rechnungslegung value) { this.wunschRechnungslegung = value; }

    public Vertragsform getWunschVertragsform() { return wunschVertragsform; }
    public void setWunschVertragsform(Vertragsform value) { this.wunschVertragsform = value; }

    public Zeitraum getWunschZahlungsziel() { return wunschZahlungsziel; }
    public void setWunschZahlungsziel(Zeitraum value) { this.wunschZahlungsziel = value; }

}
