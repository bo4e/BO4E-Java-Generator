package placeholder;

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
public class Zaehler {
    private String id;
    private Typ typ;
    private String version;
    private Befestigungsart befestigungsart;
    private OffsetDateTime eichungBis;
    private List<Geraet> geraete;
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
    private List<Zaehlwerk> zaehlwerke;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Typisierung des Zählers
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

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
    public List<Geraet> getGeraete() { return geraete; }
    public void setGeraete(List<Geraet> value) { this.geraete = value; }

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
    public List<Zaehlwerk> getZaehlwerke() { return zaehlwerke; }
    public void setZaehlwerke(List<Zaehlwerk> value) { this.zaehlwerke = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
