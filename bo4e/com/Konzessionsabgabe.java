package bo4e.com;

import bo4e.enums.AbgabeArt;

import java.util.List;

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Konzessionsabgabe verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Konzessionsabgabe.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Konzessionsabgabe JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Konzessionsabgabe.json>`_
 */
public class Konzessionsabgabe extends COM {
    /**
     * Gebührenkategorie der Konzessionsabgabe
     */
    private String kategorie;
    /**
     * Konzessionsabgabe in E/kWh
     */
    private Double kosten;
    /**
     * Art der Abgabe
     */
    private AbgabeArt satz;

    public Konzessionsabgabe() {
    }

    private Konzessionsabgabe(KonzessionsabgabeBuilder builder) {
        super(builder);
        this.kategorie = builder.kategorie;
        this.kosten = builder.kosten;
        this.satz = builder.satz;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public Double getKosten() {
        return kosten;
    }

    public void setKosten(Double kosten) {
        this.kosten = kosten;
    }

    public AbgabeArt getSatz() {
        return satz;
    }

    public void setSatz(AbgabeArt satz) {
        this.satz = satz;
    }

    public static class KonzessionsabgabeBuilder extends COMBuilder {
        /**
         * Gebührenkategorie der Konzessionsabgabe
         */
        private String kategorie;
        /**
         * Konzessionsabgabe in E/kWh
         */
        private Double kosten;
        /**
         * Art der Abgabe
         */
        private AbgabeArt satz;
    
        public String getKategorie() {
            return kategorie;
        }
    
        public KonzessionsabgabeBuilder setKategorie(String kategorie) {
            this.kategorie = kategorie;
            return this;
        }
    
        public Double getKosten() {
            return kosten;
        }
    
        public KonzessionsabgabeBuilder setKosten(Double kosten) {
            this.kosten = kosten;
            return this;
        }
    
        public AbgabeArt getSatz() {
            return satz;
        }
    
        public KonzessionsabgabeBuilder setSatz(AbgabeArt satz) {
            this.satz = satz;
            return this;
        }
    
        public Konzessionsabgabe build() {
            return new Konzessionsabgabe(this);
        }
    }
}