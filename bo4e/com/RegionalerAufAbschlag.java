package bo4e.com;

import com.example.bo4e.enums.AufAbschlagstyp;
import com.example.bo4e.enums.AufAbschlagsziel;
import com.example.bo4e.enums.Waehrungseinheit;

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen im Zusammenhang mit
 * regionalen Gültigkeiten
 * abgebildet werden.
 * Hier sind auch die Auswirkungen auf verschiedene Tarifparameter modelliert, die sich
 * durch die Auswahl eines Auf-
 * oder Abschlags ergeben.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionalerAufAbschlag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionalerAufAbschlag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/RegionalerAufAbschlag.json>`_
 */
public class RegionalerAufAbschlag extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private AufAbschlagsziel aufAbschlagsziel;
    private String beschreibung;
    private String bezeichnung;
    private Waehrungseinheit einheit;
    private Tarifeinschraenkung einschraenkungsaenderung;
    private Energiemix energiemixaenderung;
    private Preisgarantie garantieaenderung;
    private Zeitraum gueltigkeitszeitraum;
    private RegionalePreisstaffel[] staffeln;
    private String tarifnamensaenderungen;
    private Vertragskonditionen vertagskonditionsaenderung;
    private String[] voraussetzungen;
    private String website;
    private String[] zusatzprodukte;

    public AufAbschlagstyp getAufAbschlagstyp() { return aufAbschlagstyp; }
    public void setAufAbschlagstyp(AufAbschlagstyp value) { this.aufAbschlagstyp = value; }

    public AufAbschlagsziel getAufAbschlagsziel() { return aufAbschlagsziel; }
    public void setAufAbschlagsziel(AufAbschlagsziel value) { this.aufAbschlagsziel = value; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    public Tarifeinschraenkung getEinschraenkungsaenderung() { return einschraenkungsaenderung; }
    public void setEinschraenkungsaenderung(Tarifeinschraenkung value) { this.einschraenkungsaenderung = value; }

    public Energiemix getEnergiemixaenderung() { return energiemixaenderung; }
    public void setEnergiemixaenderung(Energiemix value) { this.energiemixaenderung = value; }

    public Preisgarantie getGarantieaenderung() { return garantieaenderung; }
    public void setGarantieaenderung(Preisgarantie value) { this.garantieaenderung = value; }

    public Zeitraum getGueltigkeitszeitraum() { return gueltigkeitszeitraum; }
    public void setGueltigkeitszeitraum(Zeitraum value) { this.gueltigkeitszeitraum = value; }

    public RegionalePreisstaffel[] getStaffeln() { return staffeln; }
    public void setStaffeln(RegionalePreisstaffel[] value) { this.staffeln = value; }

    public String getTarifnamensaenderungen() { return tarifnamensaenderungen; }
    public void setTarifnamensaenderungen(String value) { this.tarifnamensaenderungen = value; }

    public Vertragskonditionen getVertagskonditionsaenderung() { return vertagskonditionsaenderung; }
    public void setVertagskonditionsaenderung(Vertragskonditionen value) { this.vertagskonditionsaenderung = value; }

    public String[] getVoraussetzungen() { return voraussetzungen; }
    public void setVoraussetzungen(String[] value) { this.voraussetzungen = value; }

    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

    public String[] getZusatzprodukte() { return zusatzprodukte; }
    public void setZusatzprodukte(String[] value) { this.zusatzprodukte = value; }
}
