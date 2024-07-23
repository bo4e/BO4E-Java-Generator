package bo4e.com;

import bo4e.enums.Landescode;

import java.util.List;

/**
 * Contains an address that can be used for most purposes.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Adresse.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Adresse JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Adresse.json>`_
 */
public class Adresse extends COM {
    /**
     * Zusatzhinweis zum Auffinden der Adresse, z.B. "3. Stock linke Wohnung"
     */
    private String adresszusatz;
    /**
     * Im Falle einer c/o-Adresse steht in diesem Attribut die Anrede. Z.B. "c/o Veronica
     * Hauptmieterin"
     */
    private String coErgaenzung;
    /**
     * Hausnummer inkl. Zusatz; z.B. "3", "4a"
     */
    private String hausnummer;
    /**
     * Offizieller ISO-Landescode
     */
    private Landescode landescode;
    /**
     * Bezeichnung der Stadt; z.B. "Hückelhoven"
     */
    private String ort;
    /**
     * Bezeichnung des Ortsteils; z.B. "Mitte"
     */
    private String ortsteil;
    /**
     * Im Falle einer Postfachadresse das Postfach; Damit werden Straße und Hausnummer nicht
     * berücksichtigt
     */
    private String postfach;
    /**
     * Die Postleitzahl; z.B: "41836"
     */
    private String postleitzahl;
    /**
     * Bezeichnung der Straße; z.B. "Weserstraße"
     */
    private String strasse;

    public Adresse() {
    }

    private Adresse(AdresseBuilder builder) {
        super(builder);
        this.adresszusatz = builder.adresszusatz;
        this.coErgaenzung = builder.coErgaenzung;
        this.hausnummer = builder.hausnummer;
        this.landescode = builder.landescode;
        this.ort = builder.ort;
        this.ortsteil = builder.ortsteil;
        this.postfach = builder.postfach;
        this.postleitzahl = builder.postleitzahl;
        this.strasse = builder.strasse;
    }

    public String getAdresszusatz() {
        return adresszusatz;
    }

    public void setAdresszusatz(String adresszusatz) {
        this.adresszusatz = adresszusatz;
    }

    public String getCoErgaenzung() {
        return coErgaenzung;
    }

    public void setCoErgaenzung(String coErgaenzung) {
        this.coErgaenzung = coErgaenzung;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public Landescode getLandescode() {
        return landescode;
    }

    public void setLandescode(Landescode landescode) {
        this.landescode = landescode;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getOrtsteil() {
        return ortsteil;
    }

    public void setOrtsteil(String ortsteil) {
        this.ortsteil = ortsteil;
    }

    public String getPostfach() {
        return postfach;
    }

    public void setPostfach(String postfach) {
        this.postfach = postfach;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public static class AdresseBuilder extends COMBuilder {
        /**
         * Zusatzhinweis zum Auffinden der Adresse, z.B. "3. Stock linke Wohnung"
         */
        private String adresszusatz;
        /**
         * Im Falle einer c/o-Adresse steht in diesem Attribut die Anrede. Z.B. "c/o Veronica
         * Hauptmieterin"
         */
        private String coErgaenzung;
        /**
         * Hausnummer inkl. Zusatz; z.B. "3", "4a"
         */
        private String hausnummer;
        /**
         * Offizieller ISO-Landescode
         */
        private Landescode landescode;
        /**
         * Bezeichnung der Stadt; z.B. "Hückelhoven"
         */
        private String ort;
        /**
         * Bezeichnung des Ortsteils; z.B. "Mitte"
         */
        private String ortsteil;
        /**
         * Im Falle einer Postfachadresse das Postfach; Damit werden Straße und Hausnummer nicht
         * berücksichtigt
         */
        private String postfach;
        /**
         * Die Postleitzahl; z.B: "41836"
         */
        private String postleitzahl;
        /**
         * Bezeichnung der Straße; z.B. "Weserstraße"
         */
        private String strasse;
    
        public String getAdresszusatz() {
            return adresszusatz;
        }
    
        public AdresseBuilder setAdresszusatz(String adresszusatz) {
            this.adresszusatz = adresszusatz;
            return this;
        }
    
        public String getCoErgaenzung() {
            return coErgaenzung;
        }
    
        public AdresseBuilder setCoErgaenzung(String coErgaenzung) {
            this.coErgaenzung = coErgaenzung;
            return this;
        }
    
        public String getHausnummer() {
            return hausnummer;
        }
    
        public AdresseBuilder setHausnummer(String hausnummer) {
            this.hausnummer = hausnummer;
            return this;
        }
    
        public Landescode getLandescode() {
            return landescode;
        }
    
        public AdresseBuilder setLandescode(Landescode landescode) {
            this.landescode = landescode;
            return this;
        }
    
        public String getOrt() {
            return ort;
        }
    
        public AdresseBuilder setOrt(String ort) {
            this.ort = ort;
            return this;
        }
    
        public String getOrtsteil() {
            return ortsteil;
        }
    
        public AdresseBuilder setOrtsteil(String ortsteil) {
            this.ortsteil = ortsteil;
            return this;
        }
    
        public String getPostfach() {
            return postfach;
        }
    
        public AdresseBuilder setPostfach(String postfach) {
            this.postfach = postfach;
            return this;
        }
    
        public String getPostleitzahl() {
            return postleitzahl;
        }
    
        public AdresseBuilder setPostleitzahl(String postleitzahl) {
            this.postleitzahl = postleitzahl;
            return this;
        }
    
        public String getStrasse() {
            return strasse;
        }
    
        public AdresseBuilder setStrasse(String strasse) {
            this.strasse = strasse;
            return this;
        }
    
        public Adresse build() {
            return new Adresse(this);
        }
    }
}