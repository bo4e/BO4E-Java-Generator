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
    private final Typ typ = Typ.REGIONALTARIF;
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

    public Regionaltarif() {
    }

    private Regionaltarif(RegionaltarifBuilder builder) {
        super(builder);
        this.anbieter = builder.anbieter;
        this.anbietername = builder.anbietername;
        this.anwendungVon = builder.anwendungVon;
        this.bemerkung = builder.bemerkung;
        this.berechnungsparameter = builder.berechnungsparameter;
        this.bezeichnung = builder.bezeichnung;
        this.energiemix = builder.energiemix;
        this.kundentypen = builder.kundentypen;
        this.preisgarantien = builder.preisgarantien;
        this.preisstand = builder.preisstand;
        this.registeranzahl = builder.registeranzahl;
        this.sparte = builder.sparte;
        this.tarifAufAbschlaege = builder.tarifAufAbschlaege;
        this.tarifeinschraenkung = builder.tarifeinschraenkung;
        this.tarifmerkmale = builder.tarifmerkmale;
        this.tarifpreise = builder.tarifpreise;
        this.tariftyp = builder.tariftyp;
        this.vertragskonditionen = builder.vertragskonditionen;
        this.website = builder.website;
        this.zeitlicheGueltigkeit = builder.zeitlicheGueltigkeit;
    }

    public Typ getTyp() {
        return typ;
    }

    public Marktteilnehmer getAnbieter() {
        return anbieter;
    }

    public void setAnbieter(Marktteilnehmer anbieter) {
        this.anbieter = anbieter;
    }

    public String getAnbietername() {
        return anbietername;
    }

    public void setAnbietername(String anbietername) {
        this.anbietername = anbietername;
    }

    public OffsetDateTime getAnwendungVon() {
        return anwendungVon;
    }

    public void setAnwendungVon(OffsetDateTime anwendungVon) {
        this.anwendungVon = anwendungVon;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public Tarifberechnungsparameter getBerechnungsparameter() {
        return berechnungsparameter;
    }

    public void setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
        this.berechnungsparameter = berechnungsparameter;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Energiemix getEnergiemix() {
        return energiemix;
    }

    public void setEnergiemix(Energiemix energiemix) {
        this.energiemix = energiemix;
    }

    public List<Kundentyp> getKundentypen() {
        return kundentypen;
    }

    public void setKundentypen(List<Kundentyp> kundentypen) {
        this.kundentypen = kundentypen;
    }

    public List<RegionalePreisgarantie> getPreisgarantien() {
        return preisgarantien;
    }

    public void setPreisgarantien(List<RegionalePreisgarantie> preisgarantien) {
        this.preisgarantien = preisgarantien;
    }

    public OffsetDateTime getPreisstand() {
        return preisstand;
    }

    public void setPreisstand(OffsetDateTime preisstand) {
        this.preisstand = preisstand;
    }

    public Registeranzahl getRegisteranzahl() {
        return registeranzahl;
    }

    public void setRegisteranzahl(Registeranzahl registeranzahl) {
        this.registeranzahl = registeranzahl;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public List<RegionalerAufAbschlag> getTarifAufAbschlaege() {
        return tarifAufAbschlaege;
    }

    public void setTarifAufAbschlaege(List<RegionalerAufAbschlag> tarifAufAbschlaege) {
        this.tarifAufAbschlaege = tarifAufAbschlaege;
    }

    public Tarifeinschraenkung getTarifeinschraenkung() {
        return tarifeinschraenkung;
    }

    public void setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
        this.tarifeinschraenkung = tarifeinschraenkung;
    }

    public List<Tarifmerkmal> getTarifmerkmale() {
        return tarifmerkmale;
    }

    public void setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
        this.tarifmerkmale = tarifmerkmale;
    }

    public List<RegionaleTarifpreisposition> getTarifpreise() {
        return tarifpreise;
    }

    public void setTarifpreise(List<RegionaleTarifpreisposition> tarifpreise) {
        this.tarifpreise = tarifpreise;
    }

    public Tariftyp getTariftyp() {
        return tariftyp;
    }

    public void setTariftyp(Tariftyp tariftyp) {
        this.tariftyp = tariftyp;
    }

    public Vertragskonditionen getVertragskonditionen() {
        return vertragskonditionen;
    }

    public void setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
        this.vertragskonditionen = vertragskonditionen;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Zeitraum getZeitlicheGueltigkeit() {
        return zeitlicheGueltigkeit;
    }

    public void setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
        this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
    }

    public static class RegionaltarifBuilder extends GeschaeftsobjektBuilder {
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
            return anbieter;
        }
    
        public RegionaltarifBuilder setAnbieter(Marktteilnehmer anbieter) {
            this.anbieter = anbieter;
            return this;
        }
    
        public String getAnbietername() {
            return anbietername;
        }
    
        public RegionaltarifBuilder setAnbietername(String anbietername) {
            this.anbietername = anbietername;
            return this;
        }
    
        public OffsetDateTime getAnwendungVon() {
            return anwendungVon;
        }
    
        public RegionaltarifBuilder setAnwendungVon(OffsetDateTime anwendungVon) {
            this.anwendungVon = anwendungVon;
            return this;
        }
    
        public String getBemerkung() {
            return bemerkung;
        }
    
        public RegionaltarifBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }
    
        public Tarifberechnungsparameter getBerechnungsparameter() {
            return berechnungsparameter;
        }
    
        public RegionaltarifBuilder setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
            this.berechnungsparameter = berechnungsparameter;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public RegionaltarifBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Energiemix getEnergiemix() {
            return energiemix;
        }
    
        public RegionaltarifBuilder setEnergiemix(Energiemix energiemix) {
            this.energiemix = energiemix;
            return this;
        }
    
        public List<Kundentyp> getKundentypen() {
            return kundentypen;
        }
    
        public RegionaltarifBuilder setKundentypen(List<Kundentyp> kundentypen) {
            this.kundentypen = kundentypen;
            return this;
        }
    
        public List<RegionalePreisgarantie> getPreisgarantien() {
            return preisgarantien;
        }
    
        public RegionaltarifBuilder setPreisgarantien(List<RegionalePreisgarantie> preisgarantien) {
            this.preisgarantien = preisgarantien;
            return this;
        }
    
        public OffsetDateTime getPreisstand() {
            return preisstand;
        }
    
        public RegionaltarifBuilder setPreisstand(OffsetDateTime preisstand) {
            this.preisstand = preisstand;
            return this;
        }
    
        public Registeranzahl getRegisteranzahl() {
            return registeranzahl;
        }
    
        public RegionaltarifBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public RegionaltarifBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public List<RegionalerAufAbschlag> getTarifAufAbschlaege() {
            return tarifAufAbschlaege;
        }
    
        public RegionaltarifBuilder setTarifAufAbschlaege(List<RegionalerAufAbschlag> tarifAufAbschlaege) {
            this.tarifAufAbschlaege = tarifAufAbschlaege;
            return this;
        }
    
        public Tarifeinschraenkung getTarifeinschraenkung() {
            return tarifeinschraenkung;
        }
    
        public RegionaltarifBuilder setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
            this.tarifeinschraenkung = tarifeinschraenkung;
            return this;
        }
    
        public List<Tarifmerkmal> getTarifmerkmale() {
            return tarifmerkmale;
        }
    
        public RegionaltarifBuilder setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
            this.tarifmerkmale = tarifmerkmale;
            return this;
        }
    
        public List<RegionaleTarifpreisposition> getTarifpreise() {
            return tarifpreise;
        }
    
        public RegionaltarifBuilder setTarifpreise(List<RegionaleTarifpreisposition> tarifpreise) {
            this.tarifpreise = tarifpreise;
            return this;
        }
    
        public Tariftyp getTariftyp() {
            return tariftyp;
        }
    
        public RegionaltarifBuilder setTariftyp(Tariftyp tariftyp) {
            this.tariftyp = tariftyp;
            return this;
        }
    
        public Vertragskonditionen getVertragskonditionen() {
            return vertragskonditionen;
        }
    
        public RegionaltarifBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }
    
        public String getWebsite() {
            return website;
        }
    
        public RegionaltarifBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }
    
        public Zeitraum getZeitlicheGueltigkeit() {
            return zeitlicheGueltigkeit;
        }
    
        public RegionaltarifBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }
    
        public Regionaltarif build() {
            return new Regionaltarif(this);
        }
    }
}