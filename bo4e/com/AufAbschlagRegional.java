package bo4e.com;

import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.AufAbschlagsziel;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen
 * im Zusammenhang mit regionalen Gültigkeiten abgebildet werden.
 * Hier sind auch die Auswirkungen auf verschiedene Tarifparameter modelliert,
 * die sich durch die Auswahl eines Auf- oder Abschlags ergeben.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagRegional.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagRegional JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/AufAbschlagRegional.json>`_
 */
public class AufAbschlagRegional extends COM {
    /**
     * Typ des Aufabschlages (z.B. absolut oder prozentual)
     */
    private AufAbschlagstyp aufAbschlagstyp;
    /**
     * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
     * Gesamtpreis etc.
     */
    private AufAbschlagsziel aufAbschlagsziel;
    /**
     * Beschreibung zum Auf-/Abschlag
     */
    private String beschreibung;
    /**
     * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
     */
    private List<AufAbschlagProOrt> betraege;
    /**
     * Bezeichnung des Auf-/Abschlags
     */
    private String bezeichnung;
    /**
     * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct.
     */
    private Waehrungseinheit einheit;
    /**
     * Änderungen in den Einschränkungen zum Tarif. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    private Tarifeinschraenkung einschraenkungsaenderung;
    /**
     * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
     * Ökostrom:
     * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
     */
    private Energiemix energiemixaenderung;
    /**
     * Änderungen in den Garantievereinbarungen. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    private Preisgarantie garantieaenderung;
    /**
     * Zeitraum, in dem der Abschlag zur Anwendung kommen kann
     */
    private Zeitraum gueltigkeitszeitraum;
    /**
     * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten.
     */
    private String tarifnamensaenderungen;
    /**
     * Änderungen in den Vertragskonditionen. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    private Vertragskonditionen vertagskonditionsaenderung;
    /**
     * Voraussetzungen, die erfüllt sein müssen, damit dieser AufAbschlag zur Anwendung kommen
     * kann
     */
    private List<String> voraussetzungen;
    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind
     */
    private String website;
    /**
     * Zusatzprodukte, die nur in Kombination mit diesem AufAbschlag erhältlich sind
     */
    private List<String> zusatzprodukte;

    public AufAbschlagRegional() {
    }

    private AufAbschlagRegional(AufAbschlagRegionalBuilder builder) {
        super(builder);
        this.aufAbschlagstyp = builder.aufAbschlagstyp;
        this.aufAbschlagsziel = builder.aufAbschlagsziel;
        this.beschreibung = builder.beschreibung;
        this.betraege = builder.betraege;
        this.bezeichnung = builder.bezeichnung;
        this.einheit = builder.einheit;
        this.einschraenkungsaenderung = builder.einschraenkungsaenderung;
        this.energiemixaenderung = builder.energiemixaenderung;
        this.garantieaenderung = builder.garantieaenderung;
        this.gueltigkeitszeitraum = builder.gueltigkeitszeitraum;
        this.tarifnamensaenderungen = builder.tarifnamensaenderungen;
        this.vertagskonditionsaenderung = builder.vertagskonditionsaenderung;
        this.voraussetzungen = builder.voraussetzungen;
        this.website = builder.website;
        this.zusatzprodukte = builder.zusatzprodukte;
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

    public List<AufAbschlagProOrt> getBetraege() {
        return betraege;
    }

    public void setBetraege(List<AufAbschlagProOrt> betraege) {
        this.betraege = betraege;
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

    public Tarifeinschraenkung getEinschraenkungsaenderung() {
        return einschraenkungsaenderung;
    }

    public void setEinschraenkungsaenderung(Tarifeinschraenkung einschraenkungsaenderung) {
        this.einschraenkungsaenderung = einschraenkungsaenderung;
    }

    public Energiemix getEnergiemixaenderung() {
        return energiemixaenderung;
    }

    public void setEnergiemixaenderung(Energiemix energiemixaenderung) {
        this.energiemixaenderung = energiemixaenderung;
    }

    public Preisgarantie getGarantieaenderung() {
        return garantieaenderung;
    }

    public void setGarantieaenderung(Preisgarantie garantieaenderung) {
        this.garantieaenderung = garantieaenderung;
    }

    public Zeitraum getGueltigkeitszeitraum() {
        return gueltigkeitszeitraum;
    }

    public void setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
        this.gueltigkeitszeitraum = gueltigkeitszeitraum;
    }

    public String getTarifnamensaenderungen() {
        return tarifnamensaenderungen;
    }

    public void setTarifnamensaenderungen(String tarifnamensaenderungen) {
        this.tarifnamensaenderungen = tarifnamensaenderungen;
    }

    public Vertragskonditionen getVertagskonditionsaenderung() {
        return vertagskonditionsaenderung;
    }

    public void setVertagskonditionsaenderung(Vertragskonditionen vertagskonditionsaenderung) {
        this.vertagskonditionsaenderung = vertagskonditionsaenderung;
    }

    public List<String> getVoraussetzungen() {
        return voraussetzungen;
    }

    public void setVoraussetzungen(List<String> voraussetzungen) {
        this.voraussetzungen = voraussetzungen;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<String> getZusatzprodukte() {
        return zusatzprodukte;
    }

    public void setZusatzprodukte(List<String> zusatzprodukte) {
        this.zusatzprodukte = zusatzprodukte;
    }

    public static class AufAbschlagRegionalBuilder extends COMBuilder {
        /**
         * Typ des Aufabschlages (z.B. absolut oder prozentual)
         */
        private AufAbschlagstyp aufAbschlagstyp;
        /**
         * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
         * Gesamtpreis etc.
         */
        private AufAbschlagsziel aufAbschlagsziel;
        /**
         * Beschreibung zum Auf-/Abschlag
         */
        private String beschreibung;
        /**
         * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
         */
        private List<AufAbschlagProOrt> betraege;
        /**
         * Bezeichnung des Auf-/Abschlags
         */
        private String bezeichnung;
        /**
         * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct.
         */
        private Waehrungseinheit einheit;
        /**
         * Änderungen in den Einschränkungen zum Tarif. Falls in dieser Komponenten angegeben,
         * werden die Tarifparameter hiermit überschrieben.
         */
        private Tarifeinschraenkung einschraenkungsaenderung;
        /**
         * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
         * Ökostrom:
         * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
         */
        private Energiemix energiemixaenderung;
        /**
         * Änderungen in den Garantievereinbarungen. Falls in dieser Komponenten angegeben,
         * werden die Tarifparameter hiermit überschrieben.
         */
        private Preisgarantie garantieaenderung;
        /**
         * Zeitraum, in dem der Abschlag zur Anwendung kommen kann
         */
        private Zeitraum gueltigkeitszeitraum;
        /**
         * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten.
         */
        private String tarifnamensaenderungen;
        /**
         * Änderungen in den Vertragskonditionen. Falls in dieser Komponenten angegeben,
         * werden die Tarifparameter hiermit überschrieben.
         */
        private Vertragskonditionen vertagskonditionsaenderung;
        /**
         * Voraussetzungen, die erfüllt sein müssen, damit dieser AufAbschlag zur Anwendung kommen
         * kann
         */
        private List<String> voraussetzungen;
        /**
         * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind
         */
        private String website;
        /**
         * Zusatzprodukte, die nur in Kombination mit diesem AufAbschlag erhältlich sind
         */
        private List<String> zusatzprodukte;
    
        public AufAbschlagstyp getAufAbschlagstyp() {
            return aufAbschlagstyp;
        }
    
        public AufAbschlagRegionalBuilder setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
            this.aufAbschlagstyp = aufAbschlagstyp;
            return this;
        }
    
        public AufAbschlagsziel getAufAbschlagsziel() {
            return aufAbschlagsziel;
        }
    
        public AufAbschlagRegionalBuilder setAufAbschlagsziel(AufAbschlagsziel aufAbschlagsziel) {
            this.aufAbschlagsziel = aufAbschlagsziel;
            return this;
        }
    
        public String getBeschreibung() {
            return beschreibung;
        }
    
        public AufAbschlagRegionalBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }
    
        public List<AufAbschlagProOrt> getBetraege() {
            return betraege;
        }
    
        public AufAbschlagRegionalBuilder setBetraege(List<AufAbschlagProOrt> betraege) {
            this.betraege = betraege;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public AufAbschlagRegionalBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Waehrungseinheit getEinheit() {
            return einheit;
        }
    
        public AufAbschlagRegionalBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public Tarifeinschraenkung getEinschraenkungsaenderung() {
            return einschraenkungsaenderung;
        }
    
        public AufAbschlagRegionalBuilder setEinschraenkungsaenderung(Tarifeinschraenkung einschraenkungsaenderung) {
            this.einschraenkungsaenderung = einschraenkungsaenderung;
            return this;
        }
    
        public Energiemix getEnergiemixaenderung() {
            return energiemixaenderung;
        }
    
        public AufAbschlagRegionalBuilder setEnergiemixaenderung(Energiemix energiemixaenderung) {
            this.energiemixaenderung = energiemixaenderung;
            return this;
        }
    
        public Preisgarantie getGarantieaenderung() {
            return garantieaenderung;
        }
    
        public AufAbschlagRegionalBuilder setGarantieaenderung(Preisgarantie garantieaenderung) {
            this.garantieaenderung = garantieaenderung;
            return this;
        }
    
        public Zeitraum getGueltigkeitszeitraum() {
            return gueltigkeitszeitraum;
        }
    
        public AufAbschlagRegionalBuilder setGueltigkeitszeitraum(Zeitraum gueltigkeitszeitraum) {
            this.gueltigkeitszeitraum = gueltigkeitszeitraum;
            return this;
        }
    
        public String getTarifnamensaenderungen() {
            return tarifnamensaenderungen;
        }
    
        public AufAbschlagRegionalBuilder setTarifnamensaenderungen(String tarifnamensaenderungen) {
            this.tarifnamensaenderungen = tarifnamensaenderungen;
            return this;
        }
    
        public Vertragskonditionen getVertagskonditionsaenderung() {
            return vertagskonditionsaenderung;
        }
    
        public AufAbschlagRegionalBuilder setVertagskonditionsaenderung(Vertragskonditionen vertagskonditionsaenderung) {
            this.vertagskonditionsaenderung = vertagskonditionsaenderung;
            return this;
        }
    
        public List<String> getVoraussetzungen() {
            return voraussetzungen;
        }
    
        public AufAbschlagRegionalBuilder setVoraussetzungen(List<String> voraussetzungen) {
            this.voraussetzungen = voraussetzungen;
            return this;
        }
    
        public String getWebsite() {
            return website;
        }
    
        public AufAbschlagRegionalBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }
    
        public List<String> getZusatzprodukte() {
            return zusatzprodukte;
        }
    
        public AufAbschlagRegionalBuilder setZusatzprodukte(List<String> zusatzprodukte) {
            this.zusatzprodukte = zusatzprodukte;
            return this;
        }
    
        public AufAbschlagRegional build() {
            return new AufAbschlagRegional(this);
        }
    }
}