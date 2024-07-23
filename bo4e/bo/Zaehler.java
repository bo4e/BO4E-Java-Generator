package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Befestigungsart;
import bo4e.enums.Messwerterfassung;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.enums.Zaehlerauspraegung;
import bo4e.enums.Zaehlergroesse;
import bo4e.enums.Zaehlertyp;
import bo4e.enums.ZaehlertypSpezifikation;
import bo4e.com.Zaehlwerk;
import bo4e.ZusatzAttribut;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Object containing information about a meter/"Zaehler".
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Zaehler.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zaehler JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Zaehler.json>`_
 */
public class Zaehler extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.ZAEHLER;
    /**
     * Besondere Spezifikation des Zählers
     */
    private Befestigungsart befestigungsart;
    /**
     * Zählerkonstante auf dem Zähler
     */
    private OffsetDateTime eichungBis;
    /**
     * Größe des Zählers
     */
    private List<Geraet> geraete;
    /**
     * Der Hersteller des Zählers
     */
    private Boolean istFernschaltbar;
    /**
     * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
     */
    private OffsetDateTime letzteEichung;
    /**
     * Fernschaltung
     */
    private Messwerterfassung messwerterfassung;
    /**
     * Spezifikation bezüglich unterstützter Tarif
     */
    private Registeranzahl registeranzahl;
    /**
     * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
     */
    private Sparte sparte;
    /**
     * Strom oder Gas
     */
    private Zaehlerauspraegung zaehlerauspraegung;
    /**
     * Befestigungsart
     */
    private Zaehlergroesse zaehlergroesse;
    /**
     * Der Hersteller des Zählers
     */
    private Geschaeftspartner zaehlerhersteller;
    /**
     * Spezifikation bezüglich unterstützter Tarif
     */
    private Double zaehlerkonstante;
    /**
     * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
     */
    private String zaehlernummer;
    /**
     * Spezifikation die Richtung des Zählers betreffend
     */
    private Zaehlertyp zaehlertyp;
    /**
     * Messwerterfassung des Zählers
     */
    private ZaehlertypSpezifikation zaehlertypSpezifikation;
    /**
     * Typisierung des Zählers
     */
    private List<Zaehlwerk> zaehlwerke;

    public Zaehler() {
    }

    private Zaehler(ZaehlerBuilder builder) {
        super(builder);
        this.befestigungsart = builder.befestigungsart;
        this.eichungBis = builder.eichungBis;
        this.geraete = builder.geraete;
        this.istFernschaltbar = builder.istFernschaltbar;
        this.letzteEichung = builder.letzteEichung;
        this.messwerterfassung = builder.messwerterfassung;
        this.registeranzahl = builder.registeranzahl;
        this.sparte = builder.sparte;
        this.zaehlerauspraegung = builder.zaehlerauspraegung;
        this.zaehlergroesse = builder.zaehlergroesse;
        this.zaehlerhersteller = builder.zaehlerhersteller;
        this.zaehlerkonstante = builder.zaehlerkonstante;
        this.zaehlernummer = builder.zaehlernummer;
        this.zaehlertyp = builder.zaehlertyp;
        this.zaehlertypSpezifikation = builder.zaehlertypSpezifikation;
        this.zaehlwerke = builder.zaehlwerke;
    }

    public Typ getTyp() {
        return typ;
    }

    public Befestigungsart getBefestigungsart() {
        return befestigungsart;
    }

    public void setBefestigungsart(Befestigungsart befestigungsart) {
        this.befestigungsart = befestigungsart;
    }

    public OffsetDateTime getEichungBis() {
        return eichungBis;
    }

    public void setEichungBis(OffsetDateTime eichungBis) {
        this.eichungBis = eichungBis;
    }

    public List<Geraet> getGeraete() {
        return geraete;
    }

    public void setGeraete(List<Geraet> geraete) {
        this.geraete = geraete;
    }

    public Boolean getIstFernschaltbar() {
        return istFernschaltbar;
    }

    public void setIstFernschaltbar(Boolean istFernschaltbar) {
        this.istFernschaltbar = istFernschaltbar;
    }

    public OffsetDateTime getLetzteEichung() {
        return letzteEichung;
    }

    public void setLetzteEichung(OffsetDateTime letzteEichung) {
        this.letzteEichung = letzteEichung;
    }

    public Messwerterfassung getMesswerterfassung() {
        return messwerterfassung;
    }

    public void setMesswerterfassung(Messwerterfassung messwerterfassung) {
        this.messwerterfassung = messwerterfassung;
    }

    public Registeranzahl getRegisteranzahl() {
        return registeranzahl;
    }

    public void setRegisteranzahl(Registeranzahl registeranzahl) {
        this.registeranzahl = registeranzahl;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public Zaehlerauspraegung getZaehlerauspraegung() {
        return zaehlerauspraegung;
    }

    public void setZaehlerauspraegung(Zaehlerauspraegung zaehlerauspraegung) {
        this.zaehlerauspraegung = zaehlerauspraegung;
    }

    public Zaehlergroesse getZaehlergroesse() {
        return zaehlergroesse;
    }

    public void setZaehlergroesse(Zaehlergroesse zaehlergroesse) {
        this.zaehlergroesse = zaehlergroesse;
    }

    public Geschaeftspartner getZaehlerhersteller() {
        return zaehlerhersteller;
    }

    public void setZaehlerhersteller(Geschaeftspartner zaehlerhersteller) {
        this.zaehlerhersteller = zaehlerhersteller;
    }

    public Double getZaehlerkonstante() {
        return zaehlerkonstante;
    }

    public void setZaehlerkonstante(Double zaehlerkonstante) {
        this.zaehlerkonstante = zaehlerkonstante;
    }

    public String getZaehlernummer() {
        return zaehlernummer;
    }

    public void setZaehlernummer(String zaehlernummer) {
        this.zaehlernummer = zaehlernummer;
    }

    public Zaehlertyp getZaehlertyp() {
        return zaehlertyp;
    }

    public void setZaehlertyp(Zaehlertyp zaehlertyp) {
        this.zaehlertyp = zaehlertyp;
    }

    public ZaehlertypSpezifikation getZaehlertypSpezifikation() {
        return zaehlertypSpezifikation;
    }

    public void setZaehlertypSpezifikation(ZaehlertypSpezifikation zaehlertypSpezifikation) {
        this.zaehlertypSpezifikation = zaehlertypSpezifikation;
    }

    public List<Zaehlwerk> getZaehlwerke() {
        return zaehlwerke;
    }

    public void setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
        this.zaehlwerke = zaehlwerke;
    }

    public static class ZaehlerBuilder extends GeschaeftsobjektBuilder {
        /**
         * Besondere Spezifikation des Zählers
         */
        private Befestigungsart befestigungsart;
        /**
         * Zählerkonstante auf dem Zähler
         */
        private OffsetDateTime eichungBis;
        /**
         * Größe des Zählers
         */
        private List<Geraet> geraete;
        /**
         * Der Hersteller des Zählers
         */
        private Boolean istFernschaltbar;
        /**
         * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
         */
        private OffsetDateTime letzteEichung;
        /**
         * Fernschaltung
         */
        private Messwerterfassung messwerterfassung;
        /**
         * Spezifikation bezüglich unterstützter Tarif
         */
        private Registeranzahl registeranzahl;
        /**
         * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
         */
        private Sparte sparte;
        /**
         * Strom oder Gas
         */
        private Zaehlerauspraegung zaehlerauspraegung;
        /**
         * Befestigungsart
         */
        private Zaehlergroesse zaehlergroesse;
        /**
         * Der Hersteller des Zählers
         */
        private Geschaeftspartner zaehlerhersteller;
        /**
         * Spezifikation bezüglich unterstützter Tarif
         */
        private Double zaehlerkonstante;
        /**
         * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
         */
        private String zaehlernummer;
        /**
         * Spezifikation die Richtung des Zählers betreffend
         */
        private Zaehlertyp zaehlertyp;
        /**
         * Messwerterfassung des Zählers
         */
        private ZaehlertypSpezifikation zaehlertypSpezifikation;
        /**
         * Typisierung des Zählers
         */
        private List<Zaehlwerk> zaehlwerke;
    
        public Befestigungsart getBefestigungsart() {
            return befestigungsart;
        }
    
        public ZaehlerBuilder setBefestigungsart(Befestigungsart befestigungsart) {
            this.befestigungsart = befestigungsart;
            return this;
        }
    
        public OffsetDateTime getEichungBis() {
            return eichungBis;
        }
    
        public ZaehlerBuilder setEichungBis(OffsetDateTime eichungBis) {
            this.eichungBis = eichungBis;
            return this;
        }
    
        public List<Geraet> getGeraete() {
            return geraete;
        }
    
        public ZaehlerBuilder setGeraete(List<Geraet> geraete) {
            this.geraete = geraete;
            return this;
        }
    
        public Boolean getIstFernschaltbar() {
            return istFernschaltbar;
        }
    
        public ZaehlerBuilder setIstFernschaltbar(Boolean istFernschaltbar) {
            this.istFernschaltbar = istFernschaltbar;
            return this;
        }
    
        public OffsetDateTime getLetzteEichung() {
            return letzteEichung;
        }
    
        public ZaehlerBuilder setLetzteEichung(OffsetDateTime letzteEichung) {
            this.letzteEichung = letzteEichung;
            return this;
        }
    
        public Messwerterfassung getMesswerterfassung() {
            return messwerterfassung;
        }
    
        public ZaehlerBuilder setMesswerterfassung(Messwerterfassung messwerterfassung) {
            this.messwerterfassung = messwerterfassung;
            return this;
        }
    
        public Registeranzahl getRegisteranzahl() {
            return registeranzahl;
        }
    
        public ZaehlerBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public ZaehlerBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public Zaehlerauspraegung getZaehlerauspraegung() {
            return zaehlerauspraegung;
        }
    
        public ZaehlerBuilder setZaehlerauspraegung(Zaehlerauspraegung zaehlerauspraegung) {
            this.zaehlerauspraegung = zaehlerauspraegung;
            return this;
        }
    
        public Zaehlergroesse getZaehlergroesse() {
            return zaehlergroesse;
        }
    
        public ZaehlerBuilder setZaehlergroesse(Zaehlergroesse zaehlergroesse) {
            this.zaehlergroesse = zaehlergroesse;
            return this;
        }
    
        public Geschaeftspartner getZaehlerhersteller() {
            return zaehlerhersteller;
        }
    
        public ZaehlerBuilder setZaehlerhersteller(Geschaeftspartner zaehlerhersteller) {
            this.zaehlerhersteller = zaehlerhersteller;
            return this;
        }
    
        public Double getZaehlerkonstante() {
            return zaehlerkonstante;
        }
    
        public ZaehlerBuilder setZaehlerkonstante(Double zaehlerkonstante) {
            this.zaehlerkonstante = zaehlerkonstante;
            return this;
        }
    
        public String getZaehlernummer() {
            return zaehlernummer;
        }
    
        public ZaehlerBuilder setZaehlernummer(String zaehlernummer) {
            this.zaehlernummer = zaehlernummer;
            return this;
        }
    
        public Zaehlertyp getZaehlertyp() {
            return zaehlertyp;
        }
    
        public ZaehlerBuilder setZaehlertyp(Zaehlertyp zaehlertyp) {
            this.zaehlertyp = zaehlertyp;
            return this;
        }
    
        public ZaehlertypSpezifikation getZaehlertypSpezifikation() {
            return zaehlertypSpezifikation;
        }
    
        public ZaehlerBuilder setZaehlertypSpezifikation(ZaehlertypSpezifikation zaehlertypSpezifikation) {
            this.zaehlertypSpezifikation = zaehlertypSpezifikation;
            return this;
        }
    
        public List<Zaehlwerk> getZaehlwerke() {
            return zaehlwerke;
        }
    
        public ZaehlerBuilder setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
            this.zaehlwerke = zaehlwerke;
            return this;
        }
    
        public ZaehlerBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public ZaehlerBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Zaehler build() {
            return new Zaehler(this);
        }
    }
}