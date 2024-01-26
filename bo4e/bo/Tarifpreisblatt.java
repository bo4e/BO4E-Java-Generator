package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Tarifberechnungsparameter;
import com.example.bo4e.com.Energiemix;
import com.example.bo4e.enums.Kundentyp;
import com.example.bo4e.com.Preisgarantie;
import com.example.bo4e.enums.Registeranzahl;
import com.example.bo4e.enums.Sparte;
import com.example.bo4e.com.AufAbschlag;
import com.example.bo4e.com.Tarifeinschraenkung;
import com.example.bo4e.enums.Tarifmerkmal;
import com.example.bo4e.com.Tarifpreisposition;
import com.example.bo4e.enums.Tariftyp;
import com.example.bo4e.com.Vertragskonditionen;
import com.example.bo4e.com.Zeitraum;
import java.time.OffsetDateTime;

/**
 * Tarifinformation mit Preisen, Aufschlägen und Berechnungssystematik
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Tarifpreisblatt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreisblatt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Tarifpreisblatt.json>`_
 */
public class Tarifpreisblatt extends Geschaeftsobjekt {
    private final Typ typ = Typ.TARIFPREISBLATT;
    private Marktteilnehmer anbieter;
    private String anbietername;
    private OffsetDateTime anwendungVon;
    private String bemerkung;
    private Tarifberechnungsparameter berechnungsparameter;
    private String bezeichnung;
    private Energiemix energiemix;
    private Kundentyp[] kundentypen;
    private Preisgarantie preisgarantie;
    private OffsetDateTime preisstand;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private AufAbschlag[] tarifAufAbschlaege;
    private Tarifeinschraenkung tarifeinschraenkung;
    private Tarifmerkmal[] tarifmerkmale;
    private Tarifpreisposition[] tarifpreise;
    private Tariftyp tariftyp;
    private Vertragskonditionen vertragskonditionen;
    private String website;
    private Zeitraum zeitlicheGueltigkeit;

    public Typ getTyp() { return typ; }

    public Marktteilnehmer getAnbieter() { return anbieter; }
    public void setAnbieter(Marktteilnehmer value) { this.anbieter = value; }

    public String getAnbietername() { return anbietername; }
    public void setAnbietername(String value) { this.anbietername = value; }

    public OffsetDateTime getAnwendungVon() { return anwendungVon; }
    public void setAnwendungVon(OffsetDateTime value) { this.anwendungVon = value; }

    public String getBemerkung() { return bemerkung; }
    public void setBemerkung(String value) { this.bemerkung = value; }

    public Tarifberechnungsparameter getBerechnungsparameter() { return berechnungsparameter; }
    public void setBerechnungsparameter(Tarifberechnungsparameter value) { this.berechnungsparameter = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Energiemix getEnergiemix() { return energiemix; }
    public void setEnergiemix(Energiemix value) { this.energiemix = value; }

    public Kundentyp[] getKundentypen() { return kundentypen; }
    public void setKundentypen(Kundentyp[] value) { this.kundentypen = value; }

    public Preisgarantie getPreisgarantie() { return preisgarantie; }
    public void setPreisgarantie(Preisgarantie value) { this.preisgarantie = value; }

    public OffsetDateTime getPreisstand() { return preisstand; }
    public void setPreisstand(OffsetDateTime value) { this.preisstand = value; }

    public Registeranzahl getRegisteranzahl() { return registeranzahl; }
    public void setRegisteranzahl(Registeranzahl value) { this.registeranzahl = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public AufAbschlag[] getTarifAufAbschlaege() { return tarifAufAbschlaege; }
    public void setTarifAufAbschlaege(AufAbschlag[] value) { this.tarifAufAbschlaege = value; }

    public Tarifeinschraenkung getTarifeinschraenkung() { return tarifeinschraenkung; }
    public void setTarifeinschraenkung(Tarifeinschraenkung value) { this.tarifeinschraenkung = value; }

    public Tarifmerkmal[] getTarifmerkmale() { return tarifmerkmale; }
    public void setTarifmerkmale(Tarifmerkmal[] value) { this.tarifmerkmale = value; }

    public Tarifpreisposition[] getTarifpreise() { return tarifpreise; }
    public void setTarifpreise(Tarifpreisposition[] value) { this.tarifpreise = value; }

    public Tariftyp getTariftyp() { return tariftyp; }
    public void setTariftyp(Tariftyp value) { this.tariftyp = value; }

    public Vertragskonditionen getVertragskonditionen() { return vertragskonditionen; }
    public void setVertragskonditionen(Vertragskonditionen value) { this.vertragskonditionen = value; }

    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

    public Zeitraum getZeitlicheGueltigkeit() { return zeitlicheGueltigkeit; }
    public void setZeitlicheGueltigkeit(Zeitraum value) { this.zeitlicheGueltigkeit = value; }

}
