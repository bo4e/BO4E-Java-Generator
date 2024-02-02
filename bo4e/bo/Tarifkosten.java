package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Energiemix;
import com.example.bo4e.enums.Kundentyp;
import com.example.bo4e.enums.Registeranzahl;
import com.example.bo4e.enums.Sparte;
import com.example.bo4e.enums.Tarifmerkmal;
import com.example.bo4e.enums.Tariftyp;
import com.example.bo4e.com.Vertragskonditionen;
import com.example.bo4e.com.Zeitraum;
import java.time.OffsetDateTime;

/**
 * Objekt zur Kommunikation von Kosten, die im Rahmen der Tarifanwendung entstehen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Tarifkosten.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifkosten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Tarifkosten.json>`_
 */
public class Tarifkosten extends Geschaeftsobjekt {
    private final Typ typ = Typ.TARIFKOSTEN;
    private Marktteilnehmer anbieter;
    private String anbietername;
    private OffsetDateTime anwendungVon;
    private String bemerkung;
    private String bezeichnung;
    private Energiemix energiemix;
    private Kosten kosten;
    private Kundentyp[] kundentypen;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private Tarifmerkmal[] tarifmerkmale;
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

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Energiemix getEnergiemix() { return energiemix; }
    public void setEnergiemix(Energiemix value) { this.energiemix = value; }

    public Kosten getKosten() { return kosten; }
    public void setKosten(Kosten value) { this.kosten = value; }

    public Kundentyp[] getKundentypen() { return kundentypen; }
    public void setKundentypen(Kundentyp[] value) { this.kundentypen = value; }

    public Registeranzahl getRegisteranzahl() { return registeranzahl; }
    public void setRegisteranzahl(Registeranzahl value) { this.registeranzahl = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public Tarifmerkmal[] getTarifmerkmale() { return tarifmerkmale; }
    public void setTarifmerkmale(Tarifmerkmal[] value) { this.tarifmerkmale = value; }

    public Tariftyp getTariftyp() { return tariftyp; }
    public void setTariftyp(Tariftyp value) { this.tariftyp = value; }

    public Vertragskonditionen getVertragskonditionen() { return vertragskonditionen; }
    public void setVertragskonditionen(Vertragskonditionen value) { this.vertragskonditionen = value; }

    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

    public Zeitraum getZeitlicheGueltigkeit() { return zeitlicheGueltigkeit; }
    public void setZeitlicheGueltigkeit(Zeitraum value) { this.zeitlicheGueltigkeit = value; }

}
