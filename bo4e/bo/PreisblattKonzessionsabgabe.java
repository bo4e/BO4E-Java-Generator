package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.enums.KundengruppeKA;
import bo4e.com.Preisposition;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;

import java.util.List;

/**
 * Die Variante des Preisblattmodells zur Abbildung von allgemeinen Abgaben
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattKonzessionsabgabe.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattKonzessionsabgabe JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/PreisblattKonzessionsabgabe.json>`_
 */
public class PreisblattKonzessionsabgabe extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.PREISBLATTKONZESSIONSABGABE;
    /**
     * Eine Bezeichnung für das Preisblatt
     */
    private String bezeichnung;
    /**
     * Der Zeitraum für den der Preis festgelegt ist
     */
    private Zeitraum gueltigkeit;
    /**
     * Der Netzbetreiber, der die Preise veröffentlicht hat
     */
    private Marktteilnehmer herausgeber;
    /**
     * Kundegruppe anhand derer die Höhe der Konzessionabgabe festgelegt ist
     */
    private KundengruppeKA kundengruppeKA;
    /**
     * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
     * Arbeitspreis, Grundpreis etc
     */
    private List<Preisposition> preispositionen;
    /**
     * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
     */
    private Preisstatus preisstatus;
    /**
     * Preisblatt gilt für angegebene Sparte
     */
    private Sparte sparte;

    public Typ getTyp() {
        return typ;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Zeitraum getGueltigkeit() {
        return gueltigkeit;
    }
    public void setGueltigkeit(Zeitraum gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    public Marktteilnehmer getHerausgeber() {
        return herausgeber;
    }
    public void setHerausgeber(Marktteilnehmer herausgeber) {
        this.herausgeber = herausgeber;
    }

    public KundengruppeKA getKundengruppeKA() {
        return kundengruppeKA;
    }
    public void setKundengruppeKA(KundengruppeKA kundengruppeKA) {
        this.kundengruppeKA = kundengruppeKA;
    }

    public List<Preisposition> getPreispositionen() {
        return preispositionen;
    }
    public void setPreispositionen(List<Preisposition> preispositionen) {
        this.preispositionen = preispositionen;
    }

    public Preisstatus getPreisstatus() {
        return preisstatus;
    }
    public void setPreisstatus(Preisstatus preisstatus) {
        this.preisstatus = preisstatus;
    }

    public Sparte getSparte() {
        return sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }
}