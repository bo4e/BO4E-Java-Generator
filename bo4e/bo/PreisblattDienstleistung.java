package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Dienstleistungstyp;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.com.Zeitraum;
import bo4e.com.Preisposition;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;

/**
 * Variante des Preisblattmodells zur Abbildung der Preise für wahlfreie Dienstleistungen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattDienstleistung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattDienstleistung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/PreisblattDienstleistung.json>`_
 */
public class PreisblattDienstleistung extends Geschaeftsobjekt {
    private final Typ _typ = Typ.PREISBLATTDIENSTLEISTUNG;
    private Dienstleistungstyp basisdienstleistung;
    private String bezeichnung;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Geraet geraetedetails;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private Dienstleistungstyp[] inklusiveDienstleistungen;
    private Preisposition[] preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Dienstleistung, für die der Preis abgebildet wird, z.B. Sperrung/Entsperrung
     */
    public Dienstleistungstyp getBasisdienstleistung() { return basisdienstleistung; }
    public void setBasisdienstleistung(Dienstleistungstyp value) { this.basisdienstleistung = value; }

    /**
     * Eine Bezeichnung für das Preisblatt
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
     */
    public Bilanzierungsmethode getBilanzierungsmethode() { return bilanzierungsmethode; }
    public void setBilanzierungsmethode(Bilanzierungsmethode value) { this.bilanzierungsmethode = value; }

    /**
     * Hier kann der Preis auf bestimmte Geräte eingegrenzt werden. Z.B. auf die Zählergröße
     */
    public Geraet getGeraetedetails() { return geraetedetails; }
    public void setGeraetedetails(Geraet value) { this.geraetedetails = value; }

    /**
     * Der Zeitraum für den der Preis festgelegt ist
     */
    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    /**
     * Der Netzbetreiber, der die Preise veröffentlicht hat
     */
    public Marktteilnehmer getHerausgeber() { return herausgeber; }
    public void setHerausgeber(Marktteilnehmer value) { this.herausgeber = value; }

    /**
     * Weitere Dienstleistungen, die im Preis enthalten sind
     */
    public Dienstleistungstyp[] getInklusiveDienstleistungen() { return inklusiveDienstleistungen; }
    public void setInklusiveDienstleistungen(Dienstleistungstyp[] value) { this.inklusiveDienstleistungen = value; }

    /**
     * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
     * Arbeitspreis, Grundpreis etc
     */
    public Preisposition[] getPreispositionen() { return preispositionen; }
    public void setPreispositionen(Preisposition[] value) { this.preispositionen = value; }

    /**
     * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
     */
    public Preisstatus getPreisstatus() { return preisstatus; }
    public void setPreisstatus(Preisstatus value) { this.preisstatus = value; }

    /**
     * Preisblatt gilt für angegebene Sparte
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

}
