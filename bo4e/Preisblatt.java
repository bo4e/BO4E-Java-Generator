package placeholder;

import java.util.List;

/**
 * Das allgemeine Modell zur Abbildung von Preisen;
 * Davon abgeleitet können, über die Zuordnung identifizierender Merkmale, spezielle
 * Preisblatt-Varianten modelliert
 * werden.
 *
 * Die jeweiligen Sätze von Merkmalen sind in der Grafik ergänzt worden und stellen jeweils
 * eine Ausprägung für die
 * verschiedenen Anwendungsfälle der Preisblätter dar.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Preisblatt.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisblatt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Preisblatt.json>`_
 */
public class Preisblatt {
    private String id;
    private Typ typ;
    private String version;
    private String bezeichnung;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private List<Preisposition> preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Eine Bezeichnung für das Preisblatt
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Eine Bezeichnung für das Preisblatt
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

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
     * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
     * Arbeitspreis, Grundpreis etc
     */
    public List<Preisposition> getPreispositionen() { return preispositionen; }
    public void setPreispositionen(List<Preisposition> value) { this.preispositionen = value; }

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

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
