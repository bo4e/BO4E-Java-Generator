package bo4e.com;

import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.AufAbschlagsziel;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
 * Modell für die preiserhöhenden (Aufschlag) bzw. preisvermindernden (Abschlag)
 * Zusatzvereinbarungen,
 * die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen wurden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/AufAbschlag.json>`_
 */
public class AufAbschlag extends COM {
    /**
     * Typ des Aufabschlages (z.B. absolut oder prozentual).
     */
    private AufAbschlagstyp aufAbschlagstyp;
    /**
     * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
     * Gesamtpreis etc..
     */
    private AufAbschlagsziel aufAbschlagsziel;
    /**
     * Beschreibung zum Auf-/Abschlag
     */
    private String beschreibung;
    /**
     * Bezeichnung des Auf-/Abschlags
     */
    private String bezeichnung;
    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
     */
    private Waehrungseinheit einheit;
    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
     */
    private Zeitraum gueltigkeitszeitraum;
    /**
     * Werte für die gestaffelten Auf/Abschläge.
     */
    private List<Preisstaffel> staffeln;
    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
     */
    private String website;

    public AufAbschlag() {
    }

    private AufAbschlag(AufAbschlagBuilder builder) {
        super(builder);
        this.aufAbschlagstyp = builder.aufAbschlagstyp;
        this.aufAbschlagsziel = builder.aufAbschlagsziel;
        this.beschreibung = builder.beschreibung;
        this.bezeichnung = builder.bezeichnung;
        this.einheit = builder.einheit;
        this.gueltigkeitszeitraum = builder.gueltigkeitszeitraum;
        this.staffeln = builder.staffeln;
        this.website = builder.website;
    }

    public AufAbschlagstyp getAufAbschlagstyp() {
        return aufAbschlagstyp;
    }

    public void setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
        this.aufAbschlagstyp = aufAbschlagstyp;
    }

    public AufAbschlagsziel getAufAbschlagsziel() {
        return aufAbschlagsziel;
    }

    public void setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
        this.aufAbschlagsziel = aufAbschlagsziel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Waehrungseinheit getEinheit() {
        return einheit;
    }

    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    public Zeitraum getGueltigkeitszeitraum() {
        return gueltigkeitszeitraum;
    }

    public void setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
        this.gueltigkeitszeitraum = gueltigkeitszeitraum;
    }

    public List<Preisstaffel> getStaffeln() {
        return staffeln;
    }

    public void setStaffeln(List<Preisstaffel> staffeln) {
        this.staffeln = staffeln;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public static class AufAbschlagBuilder extends COMBuilder {
        /**
         * Typ des Aufabschlages (z.B. absolut oder prozentual).
         */
        private AufAbschlagstyp aufAbschlagstyp;
        /**
         * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
         * Gesamtpreis etc..
         */
        private AufAbschlagsziel aufAbschlagsziel;
        /**
         * Beschreibung zum Auf-/Abschlag
         */
        private String beschreibung;
        /**
         * Bezeichnung des Auf-/Abschlags
         */
        private String bezeichnung;
        /**
         * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
         */
        private Waehrungseinheit einheit;
        /**
         * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
         */
        private Zeitraum gueltigkeitszeitraum;
        /**
         * Werte für die gestaffelten Auf/Abschläge.
         */
        private List<Preisstaffel> staffeln;
        /**
         * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
         */
        private String website;
    
        public AufAbschlagstyp getAufAbschlagstyp() {
            return aufAbschlagstyp;
        }
    
        public AufAbschlagBuilder setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
            this.aufAbschlagstyp = aufAbschlagstyp;
            return this;
        }
    
        public AufAbschlagsziel getAufAbschlagsziel() {
            return aufAbschlagsziel;
        }
    
        public AufAbschlagBuilder setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
            this.aufAbschlagsziel = aufAbschlagsziel;
            return this;
        }
    
        public String getBeschreibung() {
            return beschreibung;
        }
    
        public AufAbschlagBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public AufAbschlagBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Waehrungseinheit getEinheit() {
            return einheit;
        }
    
        public AufAbschlagBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public Zeitraum getGueltigkeitszeitraum() {
            return gueltigkeitszeitraum;
        }
    
        public AufAbschlagBuilder setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
            this.gueltigkeitszeitraum = gueltigkeitszeitraum;
            return this;
        }
    
        public List<Preisstaffel> getStaffeln() {
            return staffeln;
        }
    
        public AufAbschlagBuilder setStaffeln(List<Preisstaffel> staffeln) {
            this.staffeln = staffeln;
            return this;
        }
    
        public String getWebsite() {
            return website;
        }
    
        public AufAbschlagBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }
    
        public AufAbschlag build() {
            return new AufAbschlag(this);
        }
    }
}