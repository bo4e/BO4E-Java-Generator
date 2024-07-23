package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Tarifberechnungsparameter;
import bo4e.com.Energiemix;
import bo4e.enums.Kundentyp;
import bo4e.com.Preisgarantie;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.com.AufAbschlag;
import bo4e.com.Tarifeinschraenkung;
import bo4e.enums.Tarifmerkmal;
import bo4e.com.Tarifpreisposition;
import bo4e.enums.Tariftyp;
import bo4e.com.Vertragskonditionen;
import bo4e.com.Zeitraum;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Tarifinformation mit Preisen, Aufschlägen und Berechnungssystematik
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Tarifpreisblatt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreisblatt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Tarifpreisblatt.json>`_
 */
public class Tarifpreisblatt extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.TARIFPREISBLATT;
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
    /**
     * Für die Berechnung der Kosten sind die hier abgebildeten Parameter heranzuziehen
     */
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
    /**
     * Festlegung von Garantien für bestimmte Preisanteile
     */
    private Preisgarantie preisgarantie;
    /**
     * Gibt an, wann der Preis zuletzt angepasst wurde
     */
    private OffsetDateTime preisstand;
    /**
     * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
     */
    private Registeranzahl registeranzahl;
    /**
     * Strom oder Gas, etc.
     */
    private Sparte sparte;
    /**
     * Auf- und Abschläge auf die Preise oder Kosten
     */
    private List<AufAbschlag> tarifAufAbschlaege;
    /**
     * Die Bedingungen und Einschränkungen unter denen ein Tarif angewendet werden kann
     */
    private Tarifeinschraenkung tarifeinschraenkung;
    /**
     * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
     */
    private List<Tarifmerkmal> tarifmerkmale;
    /**
     * Die festgelegten Preise, z.B. für Arbeitspreis, Grundpreis etc.
     */
    private List<Tarifpreisposition> tarifpreise;
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

    public Tarifpreisblatt() {}
    private Tarifpreisblatt(TarifpreisblattBuilder builder) {
        this.anbieter = builder.anbieter;
        this.anbietername = builder.anbietername;
        this.anwendungVon = builder.anwendungVon;
        this.bemerkung = builder.bemerkung;
        this.berechnungsparameter = builder.berechnungsparameter;
        this.bezeichnung = builder.bezeichnung;
        this.energiemix = builder.energiemix;
        this.kundentypen = builder.kundentypen;
        this.preisgarantie = builder.preisgarantie;
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

    public Preisgarantie getPreisgarantie() {
        return preisgarantie;
    }
    public void setPreisgarantie(Preisgarantie preisgarantie) {
        this.preisgarantie = preisgarantie;
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

    public List<AufAbschlag> getTarifAufAbschlaege() {
        return tarifAufAbschlaege;
    }
    public void setTarifAufAbschlaege(List<AufAbschlag> tarifAufAbschlaege) {
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

    public List<Tarifpreisposition> getTarifpreise() {
        return tarifpreise;
    }
    public void setTarifpreise(List<Tarifpreisposition> tarifpreise) {
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

    public static class TarifpreisblattBuilder extends GeschaeftsobjektBuilder {
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
        /**
         * Für die Berechnung der Kosten sind die hier abgebildeten Parameter heranzuziehen
         */
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
        /**
         * Festlegung von Garantien für bestimmte Preisanteile
         */
        private Preisgarantie preisgarantie;
        /**
         * Gibt an, wann der Preis zuletzt angepasst wurde
         */
        private OffsetDateTime preisstand;
        /**
         * Die Art des Tarifes, z.B. Eintarif oder Mehrtarif
         */
        private Registeranzahl registeranzahl;
        /**
         * Strom oder Gas, etc.
         */
        private Sparte sparte;
        /**
         * Auf- und Abschläge auf die Preise oder Kosten
         */
        private List<AufAbschlag> tarifAufAbschlaege;
        /**
         * Die Bedingungen und Einschränkungen unter denen ein Tarif angewendet werden kann
         */
        private Tarifeinschraenkung tarifeinschraenkung;
        /**
         * Weitere Merkmale des Tarifs, z.B. Festpreis oder Vorkasse
         */
        private List<Tarifmerkmal> tarifmerkmale;
        /**
         * Die festgelegten Preise, z.B. für Arbeitspreis, Grundpreis etc.
         */
        private List<Tarifpreisposition> tarifpreise;
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
        public TarifpreisblattBuilder setAnbieter(Marktteilnehmer anbieter) {
            this.anbieter = anbieter;
            return this;
        }
    
        public String getAnbietername() {
            return anbietername;
        }
        public TarifpreisblattBuilder setAnbietername(String anbietername) {
            this.anbietername = anbietername;
            return this;
        }
    
        public OffsetDateTime getAnwendungVon() {
            return anwendungVon;
        }
        public TarifpreisblattBuilder setAnwendungVon(OffsetDateTime anwendungVon) {
            this.anwendungVon = anwendungVon;
            return this;
        }
    
        public String getBemerkung() {
            return bemerkung;
        }
        public TarifpreisblattBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }
    
        public Tarifberechnungsparameter getBerechnungsparameter() {
            return berechnungsparameter;
        }
        public TarifpreisblattBuilder setBerechnungsparameter(Tarifberechnungsparameter berechnungsparameter) {
            this.berechnungsparameter = berechnungsparameter;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
        public TarifpreisblattBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Energiemix getEnergiemix() {
            return energiemix;
        }
        public TarifpreisblattBuilder setEnergiemix(Energiemix energiemix) {
            this.energiemix = energiemix;
            return this;
        }
    
        public List<Kundentyp> getKundentypen() {
            return kundentypen;
        }
        public TarifpreisblattBuilder setKundentypen(List<Kundentyp> kundentypen) {
            this.kundentypen = kundentypen;
            return this;
        }
    
        public Preisgarantie getPreisgarantie() {
            return preisgarantie;
        }
        public TarifpreisblattBuilder setPreisgarantie(Preisgarantie preisgarantie) {
            this.preisgarantie = preisgarantie;
            return this;
        }
    
        public OffsetDateTime getPreisstand() {
            return preisstand;
        }
        public TarifpreisblattBuilder setPreisstand(OffsetDateTime preisstand) {
            this.preisstand = preisstand;
            return this;
        }
    
        public Registeranzahl getRegisteranzahl() {
            return registeranzahl;
        }
        public TarifpreisblattBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
        public TarifpreisblattBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public List<AufAbschlag> getTarifAufAbschlaege() {
            return tarifAufAbschlaege;
        }
        public TarifpreisblattBuilder setTarifAufAbschlaege(List<AufAbschlag> tarifAufAbschlaege) {
            this.tarifAufAbschlaege = tarifAufAbschlaege;
            return this;
        }
    
        public Tarifeinschraenkung getTarifeinschraenkung() {
            return tarifeinschraenkung;
        }
        public TarifpreisblattBuilder setTarifeinschraenkung(Tarifeinschraenkung tarifeinschraenkung) {
            this.tarifeinschraenkung = tarifeinschraenkung;
            return this;
        }
    
        public List<Tarifmerkmal> getTarifmerkmale() {
            return tarifmerkmale;
        }
        public TarifpreisblattBuilder setTarifmerkmale(List<Tarifmerkmal> tarifmerkmale) {
            this.tarifmerkmale = tarifmerkmale;
            return this;
        }
    
        public List<Tarifpreisposition> getTarifpreise() {
            return tarifpreise;
        }
        public TarifpreisblattBuilder setTarifpreise(List<Tarifpreisposition> tarifpreise) {
            this.tarifpreise = tarifpreise;
            return this;
        }
    
        public Tariftyp getTariftyp() {
            return tariftyp;
        }
        public TarifpreisblattBuilder setTariftyp(Tariftyp tariftyp) {
            this.tariftyp = tariftyp;
            return this;
        }
    
        public Vertragskonditionen getVertragskonditionen() {
            return vertragskonditionen;
        }
        public TarifpreisblattBuilder setVertragskonditionen(Vertragskonditionen vertragskonditionen) {
            this.vertragskonditionen = vertragskonditionen;
            return this;
        }
    
        public String getWebsite() {
            return website;
        }
        public TarifpreisblattBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }
    
        public Zeitraum getZeitlicheGueltigkeit() {
            return zeitlicheGueltigkeit;
        }
        public TarifpreisblattBuilder setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
            this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
            return this;
        }
    
        public Tarifpreisblatt build() {
            return new Tarifpreisblatt(this);
        }
    }
}