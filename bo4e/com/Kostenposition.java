package bo4e.com;

import bo4e.ZusatzAttribut;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Kostenposition verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kostenposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kostenposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Kostenposition.json>`_
 */
public class Kostenposition extends COM {
    /**
     * Bezeichnung für den Artikel für den die Kosten ermittelt wurden. Beispiel: Arbeitspreis HT
     */
    private String artikelbezeichnung;
    /**
     * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
     */
    private String artikeldetail;
    /**
     * Der errechnete Gesamtbetrag der Position als Ergebnis der Berechnung <Menge *
     * Einzelpreis> oder
     * <Einzelpreis / (Anzahl Tage Jahr) * zeitmenge>
     */
    private Betrag betragKostenposition;
    /**
     * exklusiver bis-Zeitpunkt der Kostenzeitscheibe
     */
    private OffsetDateTime bis;
    /**
     * Der Preis für eine Einheit. Beispiele: 5,8200 ct/kWh oder 55 €/Jahr.
     */
    private Preis einzelpreis;
    /**
     * Die Menge, die in die Kostenberechnung eingeflossen ist. Beispiel: 3.660 kWh
     */
    private Menge menge;
    /**
     * Ein Titel für die Zeile. Hier kann z.B. der Netzbetreiber eingetragen werden, wenn es
     * sich um Netzkosten handelt.
     */
    private String positionstitel;
    /**
     * inklusiver von-Zeitpunkt der Kostenzeitscheibe
     */
    private OffsetDateTime von;
    /**
     * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
     */
    private Menge zeitmenge;

    public Kostenposition() {
    }

    private Kostenposition(KostenpositionBuilder builder) {
        super(builder);
        this.artikelbezeichnung = builder.artikelbezeichnung;
        this.artikeldetail = builder.artikeldetail;
        this.betragKostenposition = builder.betragKostenposition;
        this.bis = builder.bis;
        this.einzelpreis = builder.einzelpreis;
        this.menge = builder.menge;
        this.positionstitel = builder.positionstitel;
        this.von = builder.von;
        this.zeitmenge = builder.zeitmenge;
    }

    public String getArtikelbezeichnung() {
        return artikelbezeichnung;
    }

    public void setArtikelbezeichnung(String artikelbezeichnung) {
        this.artikelbezeichnung = artikelbezeichnung;
    }

    public String getArtikeldetail() {
        return artikeldetail;
    }

    public void setArtikeldetail(String artikeldetail) {
        this.artikeldetail = artikeldetail;
    }

    public Betrag getBetragKostenposition() {
        return betragKostenposition;
    }

    public void setBetragKostenposition(Betrag betragKostenposition) {
        this.betragKostenposition = betragKostenposition;
    }

    public OffsetDateTime getBis() {
        return bis;
    }

    public void setBis(OffsetDateTime bis) {
        this.bis = bis;
    }

    public Preis getEinzelpreis() {
        return einzelpreis;
    }

    public void setEinzelpreis(Preis einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    public Menge getMenge() {
        return menge;
    }

    public void setMenge(Menge menge) {
        this.menge = menge;
    }

    public String getPositionstitel() {
        return positionstitel;
    }

    public void setPositionstitel(String positionstitel) {
        this.positionstitel = positionstitel;
    }

    public OffsetDateTime getVon() {
        return von;
    }

    public void setVon(OffsetDateTime von) {
        this.von = von;
    }

    public Menge getZeitmenge() {
        return zeitmenge;
    }

    public void setZeitmenge(Menge zeitmenge) {
        this.zeitmenge = zeitmenge;
    }

    public static class KostenpositionBuilder extends COMBuilder {
        /**
         * Bezeichnung für den Artikel für den die Kosten ermittelt wurden. Beispiel: Arbeitspreis HT
         */
        private String artikelbezeichnung;
        /**
         * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
         */
        private String artikeldetail;
        /**
         * Der errechnete Gesamtbetrag der Position als Ergebnis der Berechnung <Menge *
         * Einzelpreis> oder
         * <Einzelpreis / (Anzahl Tage Jahr) * zeitmenge>
         */
        private Betrag betragKostenposition;
        /**
         * exklusiver bis-Zeitpunkt der Kostenzeitscheibe
         */
        private OffsetDateTime bis;
        /**
         * Der Preis für eine Einheit. Beispiele: 5,8200 ct/kWh oder 55 €/Jahr.
         */
        private Preis einzelpreis;
        /**
         * Die Menge, die in die Kostenberechnung eingeflossen ist. Beispiel: 3.660 kWh
         */
        private Menge menge;
        /**
         * Ein Titel für die Zeile. Hier kann z.B. der Netzbetreiber eingetragen werden, wenn es
         * sich um Netzkosten handelt.
         */
        private String positionstitel;
        /**
         * inklusiver von-Zeitpunkt der Kostenzeitscheibe
         */
        private OffsetDateTime von;
        /**
         * Detaillierung des Artikels (optional). Beispiel: 'Drehstromzähler'
         */
        private Menge zeitmenge;
    
        public String getArtikelbezeichnung() {
            return artikelbezeichnung;
        }
    
        public KostenpositionBuilder setArtikelbezeichnung(String artikelbezeichnung) {
            this.artikelbezeichnung = artikelbezeichnung;
            return this;
        }
    
        public String getArtikeldetail() {
            return artikeldetail;
        }
    
        public KostenpositionBuilder setArtikeldetail(String artikeldetail) {
            this.artikeldetail = artikeldetail;
            return this;
        }
    
        public Betrag getBetragKostenposition() {
            return betragKostenposition;
        }
    
        public KostenpositionBuilder setBetragKostenposition(Betrag betragKostenposition) {
            this.betragKostenposition = betragKostenposition;
            return this;
        }
    
        public OffsetDateTime getBis() {
            return bis;
        }
    
        public KostenpositionBuilder setBis(OffsetDateTime bis) {
            this.bis = bis;
            return this;
        }
    
        public Preis getEinzelpreis() {
            return einzelpreis;
        }
    
        public KostenpositionBuilder setEinzelpreis(Preis einzelpreis) {
            this.einzelpreis = einzelpreis;
            return this;
        }
    
        public Menge getMenge() {
            return menge;
        }
    
        public KostenpositionBuilder setMenge(Menge menge) {
            this.menge = menge;
            return this;
        }
    
        public String getPositionstitel() {
            return positionstitel;
        }
    
        public KostenpositionBuilder setPositionstitel(String positionstitel) {
            this.positionstitel = positionstitel;
            return this;
        }
    
        public OffsetDateTime getVon() {
            return von;
        }
    
        public KostenpositionBuilder setVon(OffsetDateTime von) {
            this.von = von;
            return this;
        }
    
        public Menge getZeitmenge() {
            return zeitmenge;
        }
    
        public KostenpositionBuilder setZeitmenge(Menge zeitmenge) {
            this.zeitmenge = zeitmenge;
            return this;
        }
    
        public KostenpositionBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public KostenpositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Kostenposition build() {
            return new Kostenposition(this);
        }
    }
}