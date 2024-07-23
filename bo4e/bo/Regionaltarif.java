package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Tarifberechnungsparameter;
import bo4e.com.Energiemix;
import bo4e.enums.Kundentyp;
import bo4e.com.RegionalePreisgarantie;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.com.RegionalerAufAbschlag;
import bo4e.com.Tarifeinschraenkung;
import bo4e.enums.Tarifmerkmal;
import bo4e.com.RegionaleTarifpreisposition;
import bo4e.enums.Tariftyp;
import bo4e.com.Vertragskonditionen;
import bo4e.com.Zeitraum;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Regionaltarif.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Regionaltarif JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/{__gh_version__}/src/bo4e_schemas/bo/Regionaltarif.json>`_
 */
public class Regionaltarif extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.REGIONALTARIF;
    /**
     * Der Marktteilnehmer (Lieferant), der diesen Tarif anbietet
     */
    private Marktteilnehmer anbieter;
    /**
     * Der Name des Marktpartners, der den Tarif anbietet
     */
    private String anbietername;
    /**
     * Angabe des inklusiven Zeitpunkts, ab dem der Tarif bzw. der Preis angewendet und
     * abgerechnet wird,
     * z.B. "2021-07-20T18:31:48Z"
     */
    private OffsetDateTime anwendungVon;
    /**
     * Freitext
     */
    private String bemerkung;
    private Tarifberechnungsparameter berechnungsparameter;
    /**
     * Name des Tarifs
     */
    private String bezeichnung;
    /**
     * Der Energiemix, der für diesen Tarif gilt
     */
    private Energiemix energiemix;
    /**
     * Kundentypen für den der Tarif gilt, z.B. Privatkunden
     */
    private List<Kundentyp> kundentypen;
    private List<RegionalePreisgarantie> preisgarantien;
    private OffsetDateTime preisstand;
    /**
     * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
     */
    private Registeranzahl registeranzahl;
    /**
     * Strom oder Gas, etc.
     */
    private Sparte sparte;
    private List<RegionalerAufAbschlag> tarifAufAbschlaege;
    private Tarifeinschraenkung tarifeinschraenkung;
    /**
     * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
     */
    private List<Tarifmerkmal> tarifmerkmale;
    private List<RegionaleTarifpreisposition> tarifpreise;
    /**
     * Hinweis auf den Tariftyp, z.B. Grundversorgung oder Sondertarif
     */
    private Tariftyp tariftyp;
    /**
     * Mindestlaufzeiten und Kündigungsfristen zusammengefasst
     */
    private Vertragskonditionen vertragskonditionen;
    /**
     * Internetseite auf dem der Tarif zu finden ist
     */
    private String website;
    /**
     * Angabe, in welchem Zeitraum der Tarif gültig ist
     */
    private Zeitraum zeitlicheGueltigkeit;

    public Marktteilnehmer getAnbieter() {
        return Anbieter;
    }
    public void setAnbieter(Marktteilnehmer anbieter) {
        this.anbieter = anbieter;
    }

    public String getAnbietername() {
        return Anbietername;
    }
    public void setAnbietername(String anbietername) {
        this.anbietername = anbietername;
    }

    public OffsetDateTime getAnwendungVon() {
        return AnwendungVon;
    }
    public void setAnwendungVon(OffsetDateTime anwendungVon) {
        this.anwendungVon = anwendungVon;
    }

    public String getBemerkung() {
        return Bemerkung;
    }
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public Tarifberechnungsparameter getBerechnungsparameter() {
        return Berechnungsparameter;
    }
    public void setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
        this.berechnungsparameter = berechnungsparameter;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Energiemix getEnergiemix() {
        return Energiemix;
    }
    public void setEnergiemix(Energiemix energiemix) {
        this.energiemix = energiemix;
    }

    public List<Kundentyp> getKundentypen() {
        return Kundentypen;
    }
    public void setKundentypen(List<Kundentyp> kundentypen) {
        this.kundentypen = kundentypen;
    }

    public List<RegionalePreisgarantie> getPreisgarantien() {
        return Preisgarantien;
    }
    public void setPreisgarantien(List<RegionalePreisgarantie> preisgarantien) {
        this.preisgarantien = preisgarantien;
    }

    public OffsetDateTime getPreisstand() {
        return Preisstand;
    }
    public void setPreisstand(OffsetDateTime preisstand) {
        this.preisstand = preisstand;
    }

    public Registeranzahl getRegisteranzahl() {
        return Registeranzahl;
    }
    public void setRegisteranzahl(Registeranzahl registeranzahl) {
        this.registeranzahl = registeranzahl;
    }

    public Sparte getSparte() {
        return Sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public List<RegionalerAufAbschlag> getTarifAufAbschlaege() {
        return TarifAufAbschlaege;
    }
    public void setTarifAufAbschlaege(List<RegionalerAufAbschlag> tarifAufAbschlaege) {
        this.tarifAufAbschlaege = tarifAufAbschlaege;
    }

    public Tarifeinschraenkung getTarifeinschraenkung() {
        return Tarifeinschraenkung;
    }
    public void setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
        this.tarifeinschraenkung = tarifeinschraenkung;
    }

    public List<Tarifmerkmal> getTarifmerkmale() {
        return Tarifmerkmale;
    }
    public void setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
        this.tarifmerkmale = tarifmerkmale;
    }

    public List<RegionaleTarifpreisposition> getTarifpreise() {
        return Tarifpreise;
    }
    public void setTarifpreise(List<RegionaleTarifpreisposition> tarifpreise) {
        this.tarifpreise = tarifpreise;
    }

    public Tariftyp getTariftyp() {
        return Tariftyp;
    }
    public void setTariftyp(Tariftyp tariftyp) {
        this.tariftyp = tariftyp;
    }

    public Vertragskonditionen getVertragskonditionen() {
        return Vertragskonditionen;
    }
    public void setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
        this.vertragskonditionen = vertragskonditionen;
    }

    public String getWebsite() {
        return Website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public Zeitraum getZeitlicheGueltigkeit() {
        return ZeitlicheGueltigkeit;
    }
    public void setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
        this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
    }
}