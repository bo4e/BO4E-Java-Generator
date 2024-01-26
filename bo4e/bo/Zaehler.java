package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Befestigungsart;
import com.example.bo4e.enums.Messwerterfassung;
import com.example.bo4e.enums.Registeranzahl;
import com.example.bo4e.enums.Sparte;
import com.example.bo4e.enums.Zaehlerauspraegung;
import com.example.bo4e.enums.Zaehlergroesse;
import com.example.StringOderNummer;
import com.example.bo4e.enums.Zaehlertyp;
import com.example.bo4e.enums.ZaehlertypSpezifikation;
import com.example.bo4e.com.Zaehlwerk;
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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Zaehler.json>`_
 */
public class Zaehler extends Geschaeftsobjekt {
    private final Typ typ = Typ.ZAEHLER;
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
    private StringOderNummer zaehlerkonstante;
    private String zaehlernummer;
    private Zaehlertyp zaehlertyp;
    private ZaehlertypSpezifikation zaehlertypSpezifikation;
    private Zaehlwerk[] zaehlwerke;

    public Typ getTyp() { return typ; }

    public Befestigungsart getBefestigungsart() { return befestigungsart; }
    public void setBefestigungsart(Befestigungsart value) { this.befestigungsart = value; }

    public OffsetDateTime getEichungBis() { return eichungBis; }
    public void setEichungBis(OffsetDateTime value) { this.eichungBis = value; }

    public Geraet[] getGeraete() { return geraete; }
    public void setGeraete(Geraet[] value) { this.geraete = value; }

    public Boolean getIstFernschaltbar() { return istFernschaltbar; }
    public void setIstFernschaltbar(Boolean value) { this.istFernschaltbar = value; }

    public OffsetDateTime getLetzteEichung() { return letzteEichung; }
    public void setLetzteEichung(OffsetDateTime value) { this.letzteEichung = value; }

    public Messwerterfassung getMesswerterfassung() { return messwerterfassung; }
    public void setMesswerterfassung(Messwerterfassung value) { this.messwerterfassung = value; }

    public Registeranzahl getRegisteranzahl() { return registeranzahl; }
    public void setRegisteranzahl(Registeranzahl value) { this.registeranzahl = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public Zaehlerauspraegung getZaehlerauspraegung() { return zaehlerauspraegung; }
    public void setZaehlerauspraegung(Zaehlerauspraegung value) { this.zaehlerauspraegung = value; }

    public Zaehlergroesse getZaehlergroesse() { return zaehlergroesse; }
    public void setZaehlergroesse(Zaehlergroesse value) { this.zaehlergroesse = value; }

    public Geschaeftspartner getZaehlerhersteller() { return zaehlerhersteller; }
    public void setZaehlerhersteller(Geschaeftspartner value) { this.zaehlerhersteller = value; }

    public StringOderNummer getZaehlerkonstante() { return zaehlerkonstante; }
    public void setZaehlerkonstante(StringOderNummer value) { this.zaehlerkonstante = value; }

    public String getZaehlernummer() { return zaehlernummer; }
    public void setZaehlernummer(String value) { this.zaehlernummer = value; }

    public Zaehlertyp getZaehlertyp() { return zaehlertyp; }
    public void setZaehlertyp(Zaehlertyp value) { this.zaehlertyp = value; }

    public ZaehlertypSpezifikation getZaehlertypSpezifikation() { return zaehlertypSpezifikation; }
    public void setZaehlertypSpezifikation(ZaehlertypSpezifikation value) { this.zaehlertypSpezifikation = value; }

    public Zaehlwerk[] getZaehlwerke() { return zaehlwerke; }
    public void setZaehlwerke(Zaehlwerk[] value) { this.zaehlwerke = value; }

}
