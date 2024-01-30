package bo4e.com;

import com.example.StringOderNummer;
import com.example.bo4e.enums.Sparte;
import com.example.bo4e.enums.Oekolabel;
import com.example.bo4e.enums.Oekozertifikat;

/**
 * Zusammensetzung der gelieferten Energie aus den verschiedenen Primärenergieformen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Energiemix.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energiemix JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Energiemix.json>`_
 */
public class Energiemix extends COM {
    private Energieherkunft[] anteil;
    private String atommuell;
    private String bemerkung;
    private String bezeichnung;
    private String co2Emission;
    private Sparte energieart;
    private Long energiemixnummer;
    private Long gueltigkeitsjahr;
    private Boolean istInOekoTopTen;
    private Oekolabel[] oekolabel;
    private Oekozertifikat[] oekozertifikate;
    private String website;

    public Energieherkunft[] getAnteil() { return anteil; }
    public void setAnteil(Energieherkunft[] value) { this.anteil = value; }

    public String getAtommuell() { return atommuell; }
    public void setAtommuell(String value) { this.atommuell = value; }

    public String getBemerkung() { return bemerkung; }
    public void setBemerkung(String value) { this.bemerkung = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public String getCo2Emission() { return co2Emission; }
    public void setCo2Emission(String value) { this.co2Emission = value; }

    public Sparte getEnergieart() { return energieart; }
    public void setEnergieart(Sparte value) { this.energieart = value; }

    public Long getEnergiemixnummer() { return energiemixnummer; }
    public void setEnergiemixnummer(Long value) { this.energiemixnummer = value; }

    public Long getGueltigkeitsjahr() { return gueltigkeitsjahr; }
    public void setGueltigkeitsjahr(Long value) { this.gueltigkeitsjahr = value; }

    public Boolean getIstInOekoTopTen() { return istInOekoTopTen; }
    public void setIstInOekoTopTen(Boolean value) { this.istInOekoTopTen = value; }

    public Oekolabel[] getOekolabel() { return oekolabel; }
    public void setOekolabel(Oekolabel[] value) { this.oekolabel = value; }

    public Oekozertifikat[] getOekozertifikate() { return oekozertifikate; }
    public void setOekozertifikate(Oekozertifikat[] value) { this.oekozertifikate = value; }

    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

}
