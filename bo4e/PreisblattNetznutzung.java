package placeholder;

import java.util.List;

/**
 * Die Variante des Preisblattmodells zur Abbildung der Netznutzungspreise
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattNetznutzung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattNetznutzung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/PreisblattNetznutzung.json>`_
 */
public class PreisblattNetznutzung {
    private String id;
    private Typ typ;
    private String version;
    private String bezeichnung;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private Kundengruppe kundengruppe;
    private Netzebene netzebene;
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
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
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
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
     */
    public Bilanzierungsmethode getBilanzierungsmethode() { return bilanzierungsmethode; }
    public void setBilanzierungsmethode(Bilanzierungsmethode value) { this.bilanzierungsmethode = value; }

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

    public Kundengruppe getKundengruppe() { return kundengruppe; }
    public void setKundengruppe(Kundengruppe value) { this.kundengruppe = value; }

    /**
     * Die Preise gelten für Marktlokationen in der angebebenen Netzebene
     */
    public Netzebene getNetzebene() { return netzebene; }
    public void setNetzebene(Netzebene value) { this.netzebene = value; }

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
