package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Energierichtung;
import bo4e.enums.Verbrauchsart;
import bo4e.enums.Waermenutzung;

import java.util.List;

/**
 * Mit dieser Komponente werden Zählwerke modelliert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zaehlwerk.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zaehlwerk JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zaehlwerk.json>`_
 */
public class Zaehlwerk extends COM {
    /**
     * Abrechnungsrelevant
     */
    private Long anzahlAblesungen;
    private String bezeichnung;
    private Mengeneinheit einheit;
    /**
     * Anzahl der Nachkommastellen
     */
    private Boolean istAbrechnungsrelevant;
    /**
     * Schwachlastfaehigkeit
     */
    private Boolean istSchwachlastfaehig;
    /**
     * Konzessionsabgabe
     */
    private Boolean istSteuerbefreit;
    /**
     * Stromverbrauchsart/Verbrauchsart Marktlokation
     */
    private Boolean istUnterbrechbar;
    /**
     * Wärmenutzung Marktlokation
     */
    private Konzessionsabgabe konzessionsabgabe;
    /**
     * Anzahl der Vorkommastellen
     */
    private Long nachkommastelle;
    private String obisKennzahl;
    private Energierichtung richtung;
    /**
     * Stromverbrauchsart/Verbrauchsart Marktlokation
     */
    private Verbrauchsart verbrauchsart;
    /**
     * Schwachlastfaehigkeit
     */
    private List<VerwendungszweckProMarktrolle> verwendungszwecke;
    /**
     * Steuerbefreiung
     */
    private Long vorkommastelle;
    /**
     * Unterbrechbarkeit Marktlokation
     */
    private Waermenutzung waermenutzung;
    private Double wandlerfaktor;
    private String zaehlwerkId;
    /**
     * Anzahl Ablesungen pro Jahr
     */
    private Zaehlzeitregister zaehlzeitregister;

    public Zaehlwerk() {}
    private Zaehlwerk(ZaehlwerkBuilder builder) {
        this.anzahlAblesungen = builder.anzahlAblesungen;
        this.bezeichnung = builder.bezeichnung;
        this.einheit = builder.einheit;
        this.istAbrechnungsrelevant = builder.istAbrechnungsrelevant;
        this.istSchwachlastfaehig = builder.istSchwachlastfaehig;
        this.istSteuerbefreit = builder.istSteuerbefreit;
        this.istUnterbrechbar = builder.istUnterbrechbar;
        this.konzessionsabgabe = builder.konzessionsabgabe;
        this.nachkommastelle = builder.nachkommastelle;
        this.obisKennzahl = builder.obisKennzahl;
        this.richtung = builder.richtung;
        this.verbrauchsart = builder.verbrauchsart;
        this.verwendungszwecke = builder.verwendungszwecke;
        this.vorkommastelle = builder.vorkommastelle;
        this.waermenutzung = builder.waermenutzung;
        this.wandlerfaktor = builder.wandlerfaktor;
        this.zaehlwerkId = builder.zaehlwerkId;
        this.zaehlzeitregister = builder.zaehlzeitregister;
    }

    public Long getAnzahlAblesungen() {
        return anzahlAblesungen;
    }
    public void setAnzahlAblesungen(Long anzahlAblesungen) {
        this.anzahlAblesungen = anzahlAblesungen;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Mengeneinheit getEinheit() {
        return einheit;
    }
    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    public Boolean getIstAbrechnungsrelevant() {
        return istAbrechnungsrelevant;
    }
    public void setIstAbrechnungsrelevant(Boolean istAbrechnungsrelevant) {
        this.istAbrechnungsrelevant = istAbrechnungsrelevant;
    }

    public Boolean getIstSchwachlastfaehig() {
        return istSchwachlastfaehig;
    }
    public void setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
        this.istSchwachlastfaehig = istSchwachlastfaehig;
    }

    public Boolean getIstSteuerbefreit() {
        return istSteuerbefreit;
    }
    public void setIstSteuerbefreit(Boolean istSteuerbefreit) {
        this.istSteuerbefreit = istSteuerbefreit;
    }

    public Boolean getIstUnterbrechbar() {
        return istUnterbrechbar;
    }
    public void setIstUnterbrechbar(Boolean istUnterbrechbar) {
        this.istUnterbrechbar = istUnterbrechbar;
    }

    public Konzessionsabgabe getKonzessionsabgabe() {
        return konzessionsabgabe;
    }
    public void setKonzessionsabgabe(Konzessionsabgabe konzessionsabgabe) {
        this.konzessionsabgabe = konzessionsabgabe;
    }

    public Long getNachkommastelle() {
        return nachkommastelle;
    }
    public void setNachkommastelle(Long nachkommastelle) {
        this.nachkommastelle = nachkommastelle;
    }

    public String getObisKennzahl() {
        return obisKennzahl;
    }
    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    public Energierichtung getRichtung() {
        return richtung;
    }
    public void setRichtung(Energierichtung richtung) {
        this.richtung = richtung;
    }

    public Verbrauchsart getVerbrauchsart() {
        return verbrauchsart;
    }
    public void setVerbrauchsart(Verbrauchsart verbrauchsart) {
        this.verbrauchsart = verbrauchsart;
    }

    public List<VerwendungszweckProMarktrolle> getVerwendungszwecke() {
        return verwendungszwecke;
    }
    public void setVerwendungszwecke(List<VerwendungszweckProMarktrolle> verwendungszwecke) {
        this.verwendungszwecke = verwendungszwecke;
    }

    public Long getVorkommastelle() {
        return vorkommastelle;
    }
    public void setVorkommastelle(Long vorkommastelle) {
        this.vorkommastelle = vorkommastelle;
    }

    public Waermenutzung getWaermenutzung() {
        return waermenutzung;
    }
    public void setWaermenutzung(Waermenutzung waermenutzung) {
        this.waermenutzung = waermenutzung;
    }

    public Double getWandlerfaktor() {
        return wandlerfaktor;
    }
    public void setWandlerfaktor(Double wandlerfaktor) {
        this.wandlerfaktor = wandlerfaktor;
    }

    public String getZaehlwerkId() {
        return zaehlwerkId;
    }
    public void setZaehlwerkId(String zaehlwerkId) {
        this.zaehlwerkId = zaehlwerkId;
    }

    public Zaehlzeitregister getZaehlzeitregister() {
        return zaehlzeitregister;
    }
    public void setZaehlzeitregister(Zaehlzeitregister zaehlzeitregister) {
        this.zaehlzeitregister = zaehlzeitregister;
    }

    public static class ZaehlwerkBuilder extends COMBuilder {
        /**
         * Abrechnungsrelevant
         */
        private Long anzahlAblesungen;
        private String bezeichnung;
        private Mengeneinheit einheit;
        /**
         * Anzahl der Nachkommastellen
         */
        private Boolean istAbrechnungsrelevant;
        /**
         * Schwachlastfaehigkeit
         */
        private Boolean istSchwachlastfaehig;
        /**
         * Konzessionsabgabe
         */
        private Boolean istSteuerbefreit;
        /**
         * Stromverbrauchsart/Verbrauchsart Marktlokation
         */
        private Boolean istUnterbrechbar;
        /**
         * Wärmenutzung Marktlokation
         */
        private Konzessionsabgabe konzessionsabgabe;
        /**
         * Anzahl der Vorkommastellen
         */
        private Long nachkommastelle;
        private String obisKennzahl;
        private Energierichtung richtung;
        /**
         * Stromverbrauchsart/Verbrauchsart Marktlokation
         */
        private Verbrauchsart verbrauchsart;
        /**
         * Schwachlastfaehigkeit
         */
        private List<VerwendungszweckProMarktrolle> verwendungszwecke;
        /**
         * Steuerbefreiung
         */
        private Long vorkommastelle;
        /**
         * Unterbrechbarkeit Marktlokation
         */
        private Waermenutzung waermenutzung;
        private Double wandlerfaktor;
        private String zaehlwerkId;
        /**
         * Anzahl Ablesungen pro Jahr
         */
        private Zaehlzeitregister zaehlzeitregister;
    
        public Long getAnzahlAblesungen() {
            return anzahlAblesungen;
        }
        public ZaehlwerkBuilder setAnzahlAblesungen(Long anzahlAblesungen) {
            this.anzahlAblesungen = anzahlAblesungen;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
        public ZaehlwerkBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Mengeneinheit getEinheit() {
            return einheit;
        }
        public ZaehlwerkBuilder setEinheit(Mengeneinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public Boolean getIstAbrechnungsrelevant() {
            return istAbrechnungsrelevant;
        }
        public ZaehlwerkBuilder setIstAbrechnungsrelevant(Boolean istAbrechnungsrelevant) {
            this.istAbrechnungsrelevant = istAbrechnungsrelevant;
            return this;
        }
    
        public Boolean getIstSchwachlastfaehig() {
            return istSchwachlastfaehig;
        }
        public ZaehlwerkBuilder setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
            this.istSchwachlastfaehig = istSchwachlastfaehig;
            return this;
        }
    
        public Boolean getIstSteuerbefreit() {
            return istSteuerbefreit;
        }
        public ZaehlwerkBuilder setIstSteuerbefreit(Boolean istSteuerbefreit) {
            this.istSteuerbefreit = istSteuerbefreit;
            return this;
        }
    
        public Boolean getIstUnterbrechbar() {
            return istUnterbrechbar;
        }
        public ZaehlwerkBuilder setIstUnterbrechbar(Boolean istUnterbrechbar) {
            this.istUnterbrechbar = istUnterbrechbar;
            return this;
        }
    
        public Konzessionsabgabe getKonzessionsabgabe() {
            return konzessionsabgabe;
        }
        public ZaehlwerkBuilder setKonzessionsabgabe(Konzessionsabgabe konzessionsabgabe) {
            this.konzessionsabgabe = konzessionsabgabe;
            return this;
        }
    
        public Long getNachkommastelle() {
            return nachkommastelle;
        }
        public ZaehlwerkBuilder setNachkommastelle(Long nachkommastelle) {
            this.nachkommastelle = nachkommastelle;
            return this;
        }
    
        public String getObisKennzahl() {
            return obisKennzahl;
        }
        public ZaehlwerkBuilder setObisKennzahl(String obisKennzahl) {
            this.obisKennzahl = obisKennzahl;
            return this;
        }
    
        public Energierichtung getRichtung() {
            return richtung;
        }
        public ZaehlwerkBuilder setRichtung(Energierichtung richtung) {
            this.richtung = richtung;
            return this;
        }
    
        public Verbrauchsart getVerbrauchsart() {
            return verbrauchsart;
        }
        public ZaehlwerkBuilder setVerbrauchsart(Verbrauchsart verbrauchsart) {
            this.verbrauchsart = verbrauchsart;
            return this;
        }
    
        public List<VerwendungszweckProMarktrolle> getVerwendungszwecke() {
            return verwendungszwecke;
        }
        public ZaehlwerkBuilder setVerwendungszwecke(List<VerwendungszweckProMarktrolle> verwendungszwecke) {
            this.verwendungszwecke = verwendungszwecke;
            return this;
        }
    
        public Long getVorkommastelle() {
            return vorkommastelle;
        }
        public ZaehlwerkBuilder setVorkommastelle(Long vorkommastelle) {
            this.vorkommastelle = vorkommastelle;
            return this;
        }
    
        public Waermenutzung getWaermenutzung() {
            return waermenutzung;
        }
        public ZaehlwerkBuilder setWaermenutzung(Waermenutzung waermenutzung) {
            this.waermenutzung = waermenutzung;
            return this;
        }
    
        public Double getWandlerfaktor() {
            return wandlerfaktor;
        }
        public ZaehlwerkBuilder setWandlerfaktor(Double wandlerfaktor) {
            this.wandlerfaktor = wandlerfaktor;
            return this;
        }
    
        public String getZaehlwerkId() {
            return zaehlwerkId;
        }
        public ZaehlwerkBuilder setZaehlwerkId(String zaehlwerkId) {
            this.zaehlwerkId = zaehlwerkId;
            return this;
        }
    
        public Zaehlzeitregister getZaehlzeitregister() {
            return zaehlzeitregister;
        }
        public ZaehlwerkBuilder setZaehlzeitregister(Zaehlzeitregister zaehlzeitregister) {
            this.zaehlzeitregister = zaehlzeitregister;
            return this;
        }
    
        public Zaehlwerk build() {
            return new Zaehlwerk(this);
        }
    }
}