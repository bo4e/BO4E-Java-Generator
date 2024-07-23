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
    private final Typ _typ = Typ.ZAEHLER;
    private Befestigungsart befestigungsart;
    private OffsetDateTime eichungBis;
    private Geraet[] geraete;
    private Boolean istFernschaltbar;
    private OffsetDateTime letzteEichung;
    private Messwerterfassung messwerterfassung;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private Zaehlerauspraegung zaehlerauspraegung;
    private Zaehlergroesse zaehlergroesse;
    private Geschaeftspartner zaehlerhersteller;
    private Double zaehlerkonstante;
    private String zaehlernummer;
    private Zaehlertyp zaehlertyp;
    private ZaehlertypSpezifikation zaehlertypSpezifikation;
    private Zaehlwerk[] zaehlwerke;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Typisierung des Zählers
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Besondere Spezifikation des Zählers
     */
    public Befestigungsart getBefestigungsart() { return befestigungsart; }
    public void setBefestigungsart(Befestigungsart value) { this.befestigungsart = value; }

    /**
     * Zählerkonstante auf dem Zähler
     */
    public OffsetDateTime getEichungBis() { return eichungBis; }
    public void setEichungBis(OffsetDateTime value) { this.eichungBis = value; }

    /**
     * Größe des Zählers
     */
    public Geraet[] getGeraete() { return geraete; }
    public void setGeraete(Geraet[] value) { this.geraete = value; }

    /**
     * Der Hersteller des Zählers
     */
    public Boolean getIstFernschaltbar() { return istFernschaltbar; }
    public void setIstFernschaltbar(Boolean value) { this.istFernschaltbar = value; }

    /**
     * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
     */
    public OffsetDateTime getLetzteEichung() { return letzteEichung; }
    public void setLetzteEichung(OffsetDateTime value) { this.letzteEichung = value; }

    /**
     * Fernschaltung
     */
    public Messwerterfassung getMesswerterfassung() { return messwerterfassung; }
    public void setMesswerterfassung(Messwerterfassung value) { this.messwerterfassung = value; }

    /**
     * Spezifikation bezüglich unterstützter Tarif
     */
    public Registeranzahl getRegisteranzahl() { return registeranzahl; }
    public void setRegisteranzahl(Registeranzahl value) { this.registeranzahl = value; }

    /**
     * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    /**
     * Strom oder Gas
     */
    public Zaehlerauspraegung getZaehlerauspraegung() { return zaehlerauspraegung; }
    public void setZaehlerauspraegung(Zaehlerauspraegung value) { this.zaehlerauspraegung = value; }

    /**
     * Befestigungsart
     */
    public Zaehlergroesse getZaehlergroesse() { return zaehlergroesse; }
    public void setZaehlergroesse(Zaehlergroesse value) { this.zaehlergroesse = value; }

    /**
     * Der Hersteller des Zählers
     */
    public Geschaeftspartner getZaehlerhersteller() { return zaehlerhersteller; }
    public void setZaehlerhersteller(Geschaeftspartner value) { this.zaehlerhersteller = value; }

    /**
     * Spezifikation bezüglich unterstützter Tarif
     */
    public Double getZaehlerkonstante() { return zaehlerkonstante; }
    public void setZaehlerkonstante(Double value) { this.zaehlerkonstante = value; }

    /**
     * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
     */
    public String getZaehlernummer() { return zaehlernummer; }
    public void setZaehlernummer(String value) { this.zaehlernummer = value; }

    /**
     * Spezifikation die Richtung des Zählers betreffend
     */
    public Zaehlertyp getZaehlertyp() { return zaehlertyp; }
    public void setZaehlertyp(Zaehlertyp value) { this.zaehlertyp = value; }

    /**
     * Messwerterfassung des Zählers
     */
    public ZaehlertypSpezifikation getZaehlertypSpezifikation() { return zaehlertypSpezifikation; }
    public void setZaehlertypSpezifikation(ZaehlertypSpezifikation value) { this.zaehlertypSpezifikation = value; }

    /**
     * Typisierung des Zählers
     */
    public Zaehlwerk[] getZaehlwerke() { return zaehlwerke; }
    public void setZaehlwerke(Zaehlwerk[] value) { this.zaehlwerke = value; }

}
