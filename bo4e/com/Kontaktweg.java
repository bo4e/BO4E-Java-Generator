package bo4e.com;

import bo4e.enums.Kontaktart;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Die Komponente wird dazu verwendet, die Kontaktwege innerhalb des BOs Person
 * darzustellen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kontakt.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kontakt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Kontakt.json>`_
 */
public class Kontaktweg extends COM {
    /**
     * Spezifikation, beispielsweise "Durchwahl", "Sammelnummer" etc.
     */
    private String beschreibung;
    /**
     * Gibt an, ob es sich um den bevorzugten Kontaktweg handelt.
     */
    private Boolean istBevorzugterKontaktweg;
    /**
     * Gibt die Kontaktart des Kontaktes an.
     */
    private Kontaktart kontaktart;
    /**
     * Die Nummer oder E-Mail-Adresse.
     */
    private String kontaktwert;

    public Kontaktweg() {
    }

    private Kontaktweg(KontaktwegBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.istBevorzugterKontaktweg = builder.istBevorzugterKontaktweg;
        this.kontaktart = builder.kontaktart;
        this.kontaktwert = builder.kontaktwert;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Boolean getIstBevorzugterKontaktweg() {
        return istBevorzugterKontaktweg;
    }

    public void setIstBevorzugterKontaktweg(Boolean istBevorzugterKontaktweg) {
        this.istBevorzugterKontaktweg = istBevorzugterKontaktweg;
    }

    public Kontaktart getKontaktart() {
        return kontaktart;
    }

    public void setKontaktart(Kontaktart kontaktart) {
        this.kontaktart = kontaktart;
    }

    public String getKontaktwert() {
        return kontaktwert;
    }

    public void setKontaktwert(String kontaktwert) {
        this.kontaktwert = kontaktwert;
    }

    public static class KontaktwegBuilder extends COMBuilder {
        /**
         * Spezifikation, beispielsweise "Durchwahl", "Sammelnummer" etc.
         */
        private String beschreibung;
        /**
         * Gibt an, ob es sich um den bevorzugten Kontaktweg handelt.
         */
        private Boolean istBevorzugterKontaktweg;
        /**
         * Gibt die Kontaktart des Kontaktes an.
         */
        private Kontaktart kontaktart;
        /**
         * Die Nummer oder E-Mail-Adresse.
         */
        private String kontaktwert;
    
        public String getBeschreibung() {
            return beschreibung;
        }
    
        public KontaktwegBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }
    
        public Boolean getIstBevorzugterKontaktweg() {
            return istBevorzugterKontaktweg;
        }
    
        public KontaktwegBuilder setIstBevorzugterKontaktweg(Boolean istBevorzugterKontaktweg) {
            this.istBevorzugterKontaktweg = istBevorzugterKontaktweg;
            return this;
        }
    
        public Kontaktart getKontaktart() {
            return kontaktart;
        }
    
        public KontaktwegBuilder setKontaktart(Kontaktart kontaktart) {
            this.kontaktart = kontaktart;
            return this;
        }
    
        public String getKontaktwert() {
            return kontaktwert;
        }
    
        public KontaktwegBuilder setKontaktwert(String kontaktwert) {
            this.kontaktwert = kontaktwert;
            return this;
        }
    
        public KontaktwegBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public KontaktwegBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Kontaktweg build() {
            return new Kontaktweg(this);
        }
    }
}