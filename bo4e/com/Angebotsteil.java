package bo4e.com;

import bo4e.bo.Marktlokation;

import java.util.List;

/**
 * Mit dieser Komponente wird ein Teil einer Angebotsvariante abgebildet.
 * Hier werden alle Angebotspositionen aggregiert.
 * Angebotsteile werden im einfachsten Fall für eine Marktlokation oder Lieferstellenadresse
 * erzeugt.
 * Hier werden die Mengen und Gesamtkosten aller Angebotspositionen zusammengefasst.
 * Eine Variante besteht mindestens aus einem Angebotsteil.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Angebotsteil.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebotsteil JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Angebotsteil.json>`_
 */
public class Angebotsteil extends COM {
    /**
     * Identifizierung eines Subkapitels einer Anfrage, beispielsweise das Los einer
     * Ausschreibung
     */
    private String anfrageSubreferenz;
    /**
     * Summe der Jahresenergiekosten aller in diesem Angebotsteil enthaltenen Lieferstellen
     */
    private Betrag gesamtkostenangebotsteil;
    /**
     * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
     */
    private Menge gesamtmengeangebotsteil;
    /**
     * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
     */
    private List<Marktlokation> lieferstellenangebotsteil;
    /**
     * Hier kann der Belieferungszeitraum angegeben werden, für den dieser Angebotsteil gilt
     */
    private Zeitraum lieferzeitraum;
    /**
     * Einzelne Positionen, die zu diesem Angebotsteil gehören
     */
    private List<Angebotsposition> positionen;

    public Angebotsteil() {
    }

    private Angebotsteil(AngebotsteilBuilder builder) {
        super(builder);
        this.anfrageSubreferenz = builder.anfrageSubreferenz;
        this.gesamtkostenangebotsteil = builder.gesamtkostenangebotsteil;
        this.gesamtmengeangebotsteil = builder.gesamtmengeangebotsteil;
        this.lieferstellenangebotsteil = builder.lieferstellenangebotsteil;
        this.lieferzeitraum = builder.lieferzeitraum;
        this.positionen = builder.positionen;
    }

    public String getAnfrageSubreferenz() {
        return anfrageSubreferenz;
    }

    public void setAnfrageSubreferenz(String anfrageSubreferenz) {
        this.anfrageSubreferenz = anfrageSubreferenz;
    }

    public Betrag getGesamtkostenangebotsteil() {
        return gesamtkostenangebotsteil;
    }

    public void setGesamtkostenangebotsteil(Betrag gesamtkostenangebotsteil) {
        this.gesamtkostenangebotsteil = gesamtkostenangebotsteil;
    }

    public Menge getGesamtmengeangebotsteil() {
        return gesamtmengeangebotsteil;
    }

    public void setGesamtmengeangebotsteil(Menge gesamtmengeangebotsteil) {
        this.gesamtmengeangebotsteil = gesamtmengeangebotsteil;
    }

    public List<Marktlokation> getLieferstellenangebotsteil() {
        return lieferstellenangebotsteil;
    }

    public void setLieferstellenangebotsteil(List<Marktlokation> lieferstellenangebotsteil) {
        this.lieferstellenangebotsteil = lieferstellenangebotsteil;
    }

    public Zeitraum getLieferzeitraum() {
        return lieferzeitraum;
    }

    public void setLieferzeitraum(Zeitraum lieferzeitraum) {
        this.lieferzeitraum = lieferzeitraum;
    }

    public List<Angebotsposition> getPositionen() {
        return positionen;
    }

    public void setPositionen(List<Angebotsposition> positionen) {
        this.positionen = positionen;
    }

    public static class AngebotsteilBuilder extends COMBuilder {
        /**
         * Identifizierung eines Subkapitels einer Anfrage, beispielsweise das Los einer
         * Ausschreibung
         */
        private String anfrageSubreferenz;
        /**
         * Summe der Jahresenergiekosten aller in diesem Angebotsteil enthaltenen Lieferstellen
         */
        private Betrag gesamtkostenangebotsteil;
        /**
         * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
         */
        private Menge gesamtmengeangebotsteil;
        /**
         * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
         */
        private List<Marktlokation> lieferstellenangebotsteil;
        /**
         * Hier kann der Belieferungszeitraum angegeben werden, für den dieser Angebotsteil gilt
         */
        private Zeitraum lieferzeitraum;
        /**
         * Einzelne Positionen, die zu diesem Angebotsteil gehören
         */
        private List<Angebotsposition> positionen;
    
        public String getAnfrageSubreferenz() {
            return anfrageSubreferenz;
        }
    
        public AngebotsteilBuilder setAnfrageSubreferenz(String anfrageSubreferenz) {
            this.anfrageSubreferenz = anfrageSubreferenz;
            return this;
        }
    
        public Betrag getGesamtkostenangebotsteil() {
            return gesamtkostenangebotsteil;
        }
    
        public AngebotsteilBuilder setGesamtkostenangebotsteil(Betrag gesamtkostenangebotsteil) {
            this.gesamtkostenangebotsteil = gesamtkostenangebotsteil;
            return this;
        }
    
        public Menge getGesamtmengeangebotsteil() {
            return gesamtmengeangebotsteil;
        }
    
        public AngebotsteilBuilder setGesamtmengeangebotsteil(Menge gesamtmengeangebotsteil) {
            this.gesamtmengeangebotsteil = gesamtmengeangebotsteil;
            return this;
        }
    
        public List<Marktlokation> getLieferstellenangebotsteil() {
            return lieferstellenangebotsteil;
        }
    
        public AngebotsteilBuilder setLieferstellenangebotsteil(List<Marktlokation> lieferstellenangebotsteil) {
            this.lieferstellenangebotsteil = lieferstellenangebotsteil;
            return this;
        }
    
        public Zeitraum getLieferzeitraum() {
            return lieferzeitraum;
        }
    
        public AngebotsteilBuilder setLieferzeitraum(Zeitraum lieferzeitraum) {
            this.lieferzeitraum = lieferzeitraum;
            return this;
        }
    
        public List<Angebotsposition> getPositionen() {
            return positionen;
        }
    
        public AngebotsteilBuilder setPositionen(List<Angebotsposition> positionen) {
            this.positionen = positionen;
            return this;
        }
    
        public Angebotsteil build() {
            return new Angebotsteil(this);
        }
    }
}