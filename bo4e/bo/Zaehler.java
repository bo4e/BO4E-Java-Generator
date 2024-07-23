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
    private Typ typ = Typ.ZAEHLER;
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
        return Befestigungsart;
    }
    public void setBefestigungsart(Befestigungsart befestigungsart) {
        this.befestigungsart = befestigungsart;
    }

    public OffsetDateTime getEichungBis() {
        return EichungBis;
    }
    public void setEichungBis(OffsetDateTime eichungBis) {
        this.eichungBis = eichungBis;
    }

    public List<Geraet> getGeraete() {
        return Geraete;
    }
    public void setGeraete(List<Geraet> geraete) {
        this.geraete = geraete;
    }

    public Boolean getIstFernschaltbar() {
        return IstFernschaltbar;
    }
    public void setIstFernschaltbar(Boolean istFernschaltbar) {
        this.istFernschaltbar = istFernschaltbar;
    }

    public OffsetDateTime getLetzteEichung() {
        return LetzteEichung;
    }
    public void setLetzteEichung(OffsetDateTime letzteEichung) {
        this.letzteEichung = letzteEichung;
    }

    public Messwerterfassung getMesswerterfassung() {
        return Messwerterfassung;
    }
    public void setMesswerterfassung(Messwerterfassung messwerterfassung) {
        this.messwerterfassung = messwerterfassung;
    }

    public Registeranzahl getRegisteranzahl() {
        return Registeranzahl;
    }
    public void setRegisteranzahl(Registeranzahl registeranzahl) {
        this.registeranzahl = registeranzahl;
    }

    public Sparte getSparte() {
        return Sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public Zaehlerauspraegung getZaehlerauspraegung() {
        return Zaehlerauspraegung;
    }
    public void setZaehlerauspraegung(Zaehlerauspraegung zaehlerauspraegung) {
        this.zaehlerauspraegung = zaehlerauspraegung;
    }

    public Zaehlergroesse getZaehlergroesse() {
        return Zaehlergroesse;
    }
    public void setZaehlergroesse(Zaehlergroesse zaehlergroesse) {
        this.zaehlergroesse = zaehlergroesse;
    }

    public Geschaeftspartner getZaehlerhersteller() {
        return Zaehlerhersteller;
    }
    public void setZaehlerhersteller(Geschaeftspartner zaehlerhersteller) {
        this.zaehlerhersteller = zaehlerhersteller;
    }

    public Double getZaehlerkonstante() {
        return Zaehlerkonstante;
    }
    public void setZaehlerkonstante(Double zaehlerkonstante) {
        this.zaehlerkonstante = zaehlerkonstante;
    }

    public String getZaehlernummer() {
        return Zaehlernummer;
    }
    public void setZaehlernummer(String zaehlernummer) {
        this.zaehlernummer = zaehlernummer;
    }

    public Zaehlertyp getZaehlertyp() {
        return Zaehlertyp;
    }
    public void setZaehlertyp(Zaehlertyp zaehlertyp) {
        this.zaehlertyp = zaehlertyp;
    }

    public ZaehlertypSpezifikation getZaehlertypSpezifikation() {
        return ZaehlertypSpezifikation;
    }
    public void setZaehlertypSpezifikation(ZaehlertypSpezifikation zaehlertypSpezifikation) {
        this.zaehlertypSpezifikation = zaehlertypSpezifikation;
    }

    public List<Zaehlwerk> getZaehlwerke() {
        return Zaehlwerke;
    }
    public void setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
        this.zaehlwerke = zaehlwerke;
    }
}