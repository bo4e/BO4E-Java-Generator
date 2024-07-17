package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Das BO Tarifinfo liefert die Merkmale, die einen Endkundentarif identifizierbar machen.
 * Dieses BO dient als Basis für weitere BOs mit erweiterten Anwendungsmöglichkeiten.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Tarifinfo.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifinfo JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Tarifinfo.json>`_
 */
public class Tarifinfo {
    private String id;
    private Typ typ;
    private String version;
    private Marktteilnehmer anbieter;
    private String anbietername;
    private OffsetDateTime anwendungVon;
    private String bemerkung;
    private String bezeichnung;
    private Energiemix energiemix;
    private List<Kundentyp> kundentypen;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private List<Tarifmerkmal> tarifmerkmale;
    private Tariftyp tariftyp;
    private Vertragskonditionen vertragskonditionen;
    private String website;
    private Zeitraum zeitlicheGueltigkeit;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Name des Tarifs
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
     */
    public Marktteilnehmer getAnbieter() { return anbieter; }
    public void setAnbieter(Marktteilnehmer value) { this.anbieter = value; }

    /**
     * Der Name des Marktpartners, der den Tarif anbietet
     */
    public String getAnbietername() { return anbietername; }
    public void setAnbietername(String value) { this.anbietername = value; }

    /**
     * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
     * abgerechnet wird,
     * z.B. "2021-07-20T18:31:48Z"
     */
    public OffsetDateTime getAnwendungVon() { return anwendungVon; }
    public void setAnwendungVon(OffsetDateTime value) { this.anwendungVon = value; }

    /**
     * Freitext
     */
    public String getBemerkung() { return bemerkung; }
    public void setBemerkung(String value) { this.bemerkung = value; }

    /**
     * Name des Tarifs
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Der Energiemix, der für diesen Tarif gilt
     */
    public Energiemix getEnergiemix() { return energiemix; }
    public void setEnergiemix(Energiemix value) { this.energiemix = value; }

    /**
     * Kundentypen für den der Tarif gilt, z.B. Privatkunden
     */
    public List<Kundentyp> getKundentypen() { return kundentypen; }
    public void setKundentypen(List<Kundentyp> value) { this.kundentypen = value; }

    /**
     * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
     */
    public Registeranzahl getRegisteranzahl() { return registeranzahl; }
    public void setRegisteranzahl(Registeranzahl value) { this.registeranzahl = value; }

    /**
     * Strom oder Gas, etc.
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    /**
     * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
     */
    public List<Tarifmerkmal> getTarifmerkmale() { return tarifmerkmale; }
    public void setTarifmerkmale(List<Tarifmerkmal> value) { this.tarifmerkmale = value; }

    /**
     * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
     */
    public Tariftyp getTariftyp() { return tariftyp; }
    public void setTariftyp(Tariftyp value) { this.tariftyp = value; }

    /**
     * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
     */
    public Vertragskonditionen getVertragskonditionen() { return vertragskonditionen; }
    public void setVertragskonditionen(Vertragskonditionen value) { this.vertragskonditionen = value; }

    /**
     * Internetseite auf dem der Tarif zu finden ist
     */
    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

    /**
     * Angabe, in welchem Zeitraum der Tarif gültig ist
     */
    public Zeitraum getZeitlicheGueltigkeit() { return zeitlicheGueltigkeit; }
    public void setZeitlicheGueltigkeit(Zeitraum value) { this.zeitlicheGueltigkeit = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
