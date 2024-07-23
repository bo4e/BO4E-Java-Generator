package bo4e.com;

import bo4e.enums.BDEWArtikelnummer;
import bo4e.enums.Mengeneinheit;
import bo4e.ZusatzAttribut;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Über Rechnungspositionen werden Rechnungen strukturiert.
 * In einem Rechnungsteil wird jeweils eine in sich geschlossene Leistung abgerechnet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Rechnungsposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Rechnungsposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Rechnungsposition.json>`_
 */
public class Rechnungsposition extends COM {
    /**
     * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
     * BDEW-Artikelnummer ablöst
     */
    private String artikelId;
    /**
     * Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
     */
    private BDEWArtikelnummer artikelnummer;
    /**
     * Der Preis für eine Einheit der energetischen Menge
     */
    private Preis einzelpreis;
    /**
     * Ende der Lieferung für die abgerechnete Leistung (exklusiv)
     */
    private OffsetDateTime lieferungBis;
    /**
     * Start der Lieferung für die abgerechnete Leistung (inklusiv)
     */
    private OffsetDateTime lieferungVon;
    /**
     * Marktlokation, die zu dieser Position gehört
     */
    private String lokationsId;
    /**
     * Die abgerechnete Menge mit Einheit
     */
    private Menge positionsMenge;
    /**
     * Fortlaufende Nummer für die Rechnungsposition
     */
    private Long positionsnummer;
    /**
     * Bezeichung für die abgerechnete Position
     */
    private String positionstext;
    /**
     * Nettobetrag für den Rabatt dieser Position
     */
    private Betrag teilrabattNetto;
    /**
     * # the cross check in general doesn't work because Betrag and Preis use different enums to
     * describe the currency
     * # see https://github.com/Hochfrequenz/BO4E-python/issues/126
     *
     * #: Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
     * teilsumme_steuer: Optional["Steuerbetrag"] = None
     *
     * #: Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
     * zeiteinheit: Optional["Mengeneinheit"] = None
     *
     * #: Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
     * artikelnummer: Optional["BDEWArtikelnummer"] = None
     * #: Marktlokation, die zu dieser Position gehört
     * lokations_id: Optional[str] = None
     *
     * zeitbezogene_menge: Optional["Menge"] = None
     */
    private Betrag teilsummeNetto;
    /**
     * Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
     */
    private Steuerbetrag teilsummeSteuer;
    /**
     * Nettobetrag für den Rabatt dieser Position
     */
    private Menge zeitbezogeneMenge;
    /**
     * Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
     */
    private Mengeneinheit zeiteinheit;

    public Rechnungsposition() {
    }

    private Rechnungsposition(RechnungspositionBuilder builder) {
        super(builder);
        this.artikelId = builder.artikelId;
        this.artikelnummer = builder.artikelnummer;
        this.einzelpreis = builder.einzelpreis;
        this.lieferungBis = builder.lieferungBis;
        this.lieferungVon = builder.lieferungVon;
        this.lokationsId = builder.lokationsId;
        this.positionsMenge = builder.positionsMenge;
        this.positionsnummer = builder.positionsnummer;
        this.positionstext = builder.positionstext;
        this.teilrabattNetto = builder.teilrabattNetto;
        this.teilsummeNetto = builder.teilsummeNetto;
        this.teilsummeSteuer = builder.teilsummeSteuer;
        this.zeitbezogeneMenge = builder.zeitbezogeneMenge;
        this.zeiteinheit = builder.zeiteinheit;
    }

    public String getArtikelId() {
        return artikelId;
    }

    public void setArtikelId(String artikelId) {
        this.artikelId = artikelId;
    }

    public BDEWArtikelnummer getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(BDEWArtikelnummer artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public Preis getEinzelpreis() {
        return einzelpreis;
    }

    public void setEinzelpreis(Preis einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    public OffsetDateTime getLieferungBis() {
        return lieferungBis;
    }

    public void setLieferungBis(OffsetDateTime lieferungBis) {
        this.lieferungBis = lieferungBis;
    }

    public OffsetDateTime getLieferungVon() {
        return lieferungVon;
    }

    public void setLieferungVon(OffsetDateTime lieferungVon) {
        this.lieferungVon = lieferungVon;
    }

    public String getLokationsId() {
        return lokationsId;
    }

    public void setLokationsId(String lokationsId) {
        this.lokationsId = lokationsId;
    }

    public Menge getPositionsMenge() {
        return positionsMenge;
    }

    public void setPositionsMenge(Menge positionsMenge) {
        this.positionsMenge = positionsMenge;
    }

    public Long getPositionsnummer() {
        return positionsnummer;
    }

    public void setPositionsnummer(Long positionsnummer) {
        this.positionsnummer = positionsnummer;
    }

    public String getPositionstext() {
        return positionstext;
    }

    public void setPositionstext(String positionstext) {
        this.positionstext = positionstext;
    }

    public Betrag getTeilrabattNetto() {
        return teilrabattNetto;
    }

    public void setTeilrabattNetto(Betrag teilrabattNetto) {
        this.teilrabattNetto = teilrabattNetto;
    }

    public Betrag getTeilsummeNetto() {
        return teilsummeNetto;
    }

    public void setTeilsummeNetto(Betrag teilsummeNetto) {
        this.teilsummeNetto = teilsummeNetto;
    }

    public Steuerbetrag getTeilsummeSteuer() {
        return teilsummeSteuer;
    }

    public void setTeilsummeSteuer(Steuerbetrag teilsummeSteuer) {
        this.teilsummeSteuer = teilsummeSteuer;
    }

    public Menge getZeitbezogeneMenge() {
        return zeitbezogeneMenge;
    }

    public void setZeitbezogeneMenge(Menge zeitbezogeneMenge) {
        this.zeitbezogeneMenge = zeitbezogeneMenge;
    }

    public Mengeneinheit getZeiteinheit() {
        return zeiteinheit;
    }

    public void setZeiteinheit(Mengeneinheit zeiteinheit) {
        this.zeiteinheit = zeiteinheit;
    }

    public static class RechnungspositionBuilder extends COMBuilder {
        /**
         * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
         * BDEW-Artikelnummer ablöst
         */
        private String artikelId;
        /**
         * Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
         */
        private BDEWArtikelnummer artikelnummer;
        /**
         * Der Preis für eine Einheit der energetischen Menge
         */
        private Preis einzelpreis;
        /**
         * Ende der Lieferung für die abgerechnete Leistung (exklusiv)
         */
        private OffsetDateTime lieferungBis;
        /**
         * Start der Lieferung für die abgerechnete Leistung (inklusiv)
         */
        private OffsetDateTime lieferungVon;
        /**
         * Marktlokation, die zu dieser Position gehört
         */
        private String lokationsId;
        /**
         * Die abgerechnete Menge mit Einheit
         */
        private Menge positionsMenge;
        /**
         * Fortlaufende Nummer für die Rechnungsposition
         */
        private Long positionsnummer;
        /**
         * Bezeichung für die abgerechnete Position
         */
        private String positionstext;
        /**
         * Nettobetrag für den Rabatt dieser Position
         */
        private Betrag teilrabattNetto;
        /**
         * # the cross check in general doesn't work because Betrag and Preis use different enums to
         * describe the currency
         * # see https://github.com/Hochfrequenz/BO4E-python/issues/126
         *
         * #: Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
         * teilsumme_steuer: Optional["Steuerbetrag"] = None
         *
         * #: Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
         * zeiteinheit: Optional["Mengeneinheit"] = None
         *
         * #: Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
         * artikelnummer: Optional["BDEWArtikelnummer"] = None
         * #: Marktlokation, die zu dieser Position gehört
         * lokations_id: Optional[str] = None
         *
         * zeitbezogene_menge: Optional["Menge"] = None
         */
        private Betrag teilsummeNetto;
        /**
         * Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
         */
        private Steuerbetrag teilsummeSteuer;
        /**
         * Nettobetrag für den Rabatt dieser Position
         */
        private Menge zeitbezogeneMenge;
        /**
         * Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
         */
        private Mengeneinheit zeiteinheit;
    
        public String getArtikelId() {
            return artikelId;
        }
    
        public RechnungspositionBuilder setArtikelId(String artikelId) {
            this.artikelId = artikelId;
            return this;
        }
    
        public BDEWArtikelnummer getArtikelnummer() {
            return artikelnummer;
        }
    
        public RechnungspositionBuilder setArtikelnummer(BDEWArtikelnummer artikelnummer) {
            this.artikelnummer = artikelnummer;
            return this;
        }
    
        public Preis getEinzelpreis() {
            return einzelpreis;
        }
    
        public RechnungspositionBuilder setEinzelpreis(Preis einzelpreis) {
            this.einzelpreis = einzelpreis;
            return this;
        }
    
        public OffsetDateTime getLieferungBis() {
            return lieferungBis;
        }
    
        public RechnungspositionBuilder setLieferungBis(OffsetDateTime lieferungBis) {
            this.lieferungBis = lieferungBis;
            return this;
        }
    
        public OffsetDateTime getLieferungVon() {
            return lieferungVon;
        }
    
        public RechnungspositionBuilder setLieferungVon(OffsetDateTime lieferungVon) {
            this.lieferungVon = lieferungVon;
            return this;
        }
    
        public String getLokationsId() {
            return lokationsId;
        }
    
        public RechnungspositionBuilder setLokationsId(String lokationsId) {
            this.lokationsId = lokationsId;
            return this;
        }
    
        public Menge getPositionsMenge() {
            return positionsMenge;
        }
    
        public RechnungspositionBuilder setPositionsMenge(Menge positionsMenge) {
            this.positionsMenge = positionsMenge;
            return this;
        }
    
        public Long getPositionsnummer() {
            return positionsnummer;
        }
    
        public RechnungspositionBuilder setPositionsnummer(Long positionsnummer) {
            this.positionsnummer = positionsnummer;
            return this;
        }
    
        public String getPositionstext() {
            return positionstext;
        }
    
        public RechnungspositionBuilder setPositionstext(String positionstext) {
            this.positionstext = positionstext;
            return this;
        }
    
        public Betrag getTeilrabattNetto() {
            return teilrabattNetto;
        }
    
        public RechnungspositionBuilder setTeilrabattNetto(Betrag teilrabattNetto) {
            this.teilrabattNetto = teilrabattNetto;
            return this;
        }
    
        public Betrag getTeilsummeNetto() {
            return teilsummeNetto;
        }
    
        public RechnungspositionBuilder setTeilsummeNetto(Betrag teilsummeNetto) {
            this.teilsummeNetto = teilsummeNetto;
            return this;
        }
    
        public Steuerbetrag getTeilsummeSteuer() {
            return teilsummeSteuer;
        }
    
        public RechnungspositionBuilder setTeilsummeSteuer(Steuerbetrag teilsummeSteuer) {
            this.teilsummeSteuer = teilsummeSteuer;
            return this;
        }
    
        public Menge getZeitbezogeneMenge() {
            return zeitbezogeneMenge;
        }
    
        public RechnungspositionBuilder setZeitbezogeneMenge(Menge zeitbezogeneMenge) {
            this.zeitbezogeneMenge = zeitbezogeneMenge;
            return this;
        }
    
        public Mengeneinheit getZeiteinheit() {
            return zeiteinheit;
        }
    
        public RechnungspositionBuilder setZeiteinheit(Mengeneinheit zeiteinheit) {
            this.zeiteinheit = zeiteinheit;
            return this;
        }
    
        public RechnungspositionBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public RechnungspositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Rechnungsposition build() {
            return new Rechnungsposition(this);
        }
    }
}