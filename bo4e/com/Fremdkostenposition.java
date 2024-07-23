package bo4e.com;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Eine Kostenposition im Bereich der Fremdkosten
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Fremdkostenposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Fremdkostenposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Fremdkostenposition.json>`_
 */
public class Fremdkostenposition extends COM {
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
     * EIC-Code des Regel- oder Marktgebietes eingetragen. Z.B. '10YDE-EON------1' für die
     * Regelzone TenneT
     */
    private String gebietcodeEic;
    /**
     * Link zum veröffentlichten Preisblatt
     */
    private String linkPreisblatt;
    /**
     * Die Codenummer (z.B. BDEW-Codenummer) des Marktpartners, der die Preise festlegt / die
     * Kosten in Rechnung stellt
     */
    private String marktpartnercode;
    /**
     * Der Name des Marktpartners, der die Preise festlegt, bzw. die Kosten in Rechnung stellt
     */
    private String marktpartnername;
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

    public Fremdkostenposition() {}
    private Fremdkostenposition(FremdkostenpositionBuilder builder) {
        this.artikelbezeichnung = builder.artikelbezeichnung;
        this.artikeldetail = builder.artikeldetail;
        this.betragKostenposition = builder.betragKostenposition;
        this.bis = builder.bis;
        this.einzelpreis = builder.einzelpreis;
        this.gebietcodeEic = builder.gebietcodeEic;
        this.linkPreisblatt = builder.linkPreisblatt;
        this.marktpartnercode = builder.marktpartnercode;
        this.marktpartnername = builder.marktpartnername;
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

    public String getGebietcodeEic() {
        return gebietcodeEic;
    }
    public void setGebietcodeEic(String gebietcodeEic) {
        this.gebietcodeEic = gebietcodeEic;
    }

    public String getLinkPreisblatt() {
        return linkPreisblatt;
    }
    public void setLinkPreisblatt(String linkPreisblatt) {
        this.linkPreisblatt = linkPreisblatt;
    }

    public String getMarktpartnercode() {
        return marktpartnercode;
    }
    public void setMarktpartnercode(String marktpartnercode) {
        this.marktpartnercode = marktpartnercode;
    }

    public String getMarktpartnername() {
        return marktpartnername;
    }
    public void setMarktpartnername(String marktpartnername) {
        this.marktpartnername = marktpartnername;
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

    public static class FremdkostenpositionBuilder extends COMBuilder {
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
         * EIC-Code des Regel- oder Marktgebietes eingetragen. Z.B. '10YDE-EON------1' für die
         * Regelzone TenneT
         */
        private String gebietcodeEic;
        /**
         * Link zum veröffentlichten Preisblatt
         */
        private String linkPreisblatt;
        /**
         * Die Codenummer (z.B. BDEW-Codenummer) des Marktpartners, der die Preise festlegt / die
         * Kosten in Rechnung stellt
         */
        private String marktpartnercode;
        /**
         * Der Name des Marktpartners, der die Preise festlegt, bzw. die Kosten in Rechnung stellt
         */
        private String marktpartnername;
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
        public FremdkostenpositionBuilder setArtikelbezeichnung(String artikelbezeichnung) {
            this.artikelbezeichnung = artikelbezeichnung;
            return this;
        }
    
        public String getArtikeldetail() {
            return artikeldetail;
        }
        public FremdkostenpositionBuilder setArtikeldetail(String artikeldetail) {
            this.artikeldetail = artikeldetail;
            return this;
        }
    
        public Betrag getBetragKostenposition() {
            return betragKostenposition;
        }
        public FremdkostenpositionBuilder setBetragKostenposition(Betrag betragKostenposition) {
            this.betragKostenposition = betragKostenposition;
            return this;
        }
    
        public OffsetDateTime getBis() {
            return bis;
        }
        public FremdkostenpositionBuilder setBis(OffsetDateTime bis) {
            this.bis = bis;
            return this;
        }
    
        public Preis getEinzelpreis() {
            return einzelpreis;
        }
        public FremdkostenpositionBuilder setEinzelpreis(Preis einzelpreis) {
            this.einzelpreis = einzelpreis;
            return this;
        }
    
        public String getGebietcodeEic() {
            return gebietcodeEic;
        }
        public FremdkostenpositionBuilder setGebietcodeEic(String gebietcodeEic) {
            this.gebietcodeEic = gebietcodeEic;
            return this;
        }
    
        public String getLinkPreisblatt() {
            return linkPreisblatt;
        }
        public FremdkostenpositionBuilder setLinkPreisblatt(String linkPreisblatt) {
            this.linkPreisblatt = linkPreisblatt;
            return this;
        }
    
        public String getMarktpartnercode() {
            return marktpartnercode;
        }
        public FremdkostenpositionBuilder setMarktpartnercode(String marktpartnercode) {
            this.marktpartnercode = marktpartnercode;
            return this;
        }
    
        public String getMarktpartnername() {
            return marktpartnername;
        }
        public FremdkostenpositionBuilder setMarktpartnername(String marktpartnername) {
            this.marktpartnername = marktpartnername;
            return this;
        }
    
        public Menge getMenge() {
            return menge;
        }
        public FremdkostenpositionBuilder setMenge(Menge menge) {
            this.menge = menge;
            return this;
        }
    
        public String getPositionstitel() {
            return positionstitel;
        }
        public FremdkostenpositionBuilder setPositionstitel(String positionstitel) {
            this.positionstitel = positionstitel;
            return this;
        }
    
        public OffsetDateTime getVon() {
            return von;
        }
        public FremdkostenpositionBuilder setVon(OffsetDateTime von) {
            this.von = von;
            return this;
        }
    
        public Menge getZeitmenge() {
            return zeitmenge;
        }
        public FremdkostenpositionBuilder setZeitmenge(Menge zeitmenge) {
            this.zeitmenge = zeitmenge;
            return this;
        }
    
        public Fremdkostenposition build() {
            return new Fremdkostenposition(this);
        }
    }
}