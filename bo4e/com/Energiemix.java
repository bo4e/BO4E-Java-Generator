package bo4e.com;

import bo4e.enums.Sparte;
import bo4e.enums.Oekolabel;
import bo4e.enums.Oekozertifikat;

import java.util.List;

/**
 * Zusammensetzung der gelieferten Energie aus den verschiedenen Primärenergieformen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Energiemix.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energiemix JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Energiemix.json>`_
 */
public class Energiemix extends COM {
    /**
     * Anteile der jeweiligen Erzeugungsart
     */
    private List<Energieherkunft> anteil;
    /**
     * Höhe des erzeugten Atommülls in g/kWh
     */
    private Double atommuell;
    /**
     * Bemerkung zum Energiemix
     */
    private String bemerkung;
    /**
     * Bezeichnung des Energiemix
     */
    private String bezeichnung;
    /**
     * Höhe des erzeugten CO2-Ausstosses in g/kWh
     */
    private Double co2Emission;
    /**
     * Strom oder Gas etc.
     */
    private Sparte energieart;
    /**
     * Eindeutige Nummer zur Identifizierung des Energiemixes
     */
    private Long energiemixnummer;
    /**
     * Jahr, für das der Energiemix gilt
     */
    private Long gueltigkeitsjahr;
    /**
     * Kennzeichen, ob der Versorger zu den Öko Top Ten gehört
     */
    private Boolean istInOekoTopTen;
    /**
     * Ökolabel für den Energiemix
     */
    private List<Oekolabel> oekolabel;
    /**
     * Zertifikate für den Energiemix
     */
    private List<Oekozertifikat> oekozertifikate;
    /**
     * Internetseite, auf der die Strommixdaten veröffentlicht sind
     */
    private String website;

    public List<Energieherkunft> getAnteil() {
        return Anteil;
    }
    public void setAnteil(List<Energieherkunft> anteil) {
        this.anteil = anteil;
    }

    public Double getAtommuell() {
        return Atommuell;
    }
    public void setAtommuell(Double atommuell) {
        this.atommuell = atommuell;
    }

    public String getBemerkung() {
        return Bemerkung;
    }
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Double getCo2Emission() {
        return Co2Emission;
    }
    public void setCo2Emission(Double co2Emission) {
        this.co2Emission = co2Emission;
    }

    public Sparte getEnergieart() {
        return Energieart;
    }
    public void setEnergieart(Sparte energieart) {
        this.energieart = energieart;
    }

    public Long getEnergiemixnummer() {
        return Energiemixnummer;
    }
    public void setEnergiemixnummer(Long energiemixnummer) {
        this.energiemixnummer = energiemixnummer;
    }

    public Long getGueltigkeitsjahr() {
        return Gueltigkeitsjahr;
    }
    public void setGueltigkeitsjahr(Long gueltigkeitsjahr) {
        this.gueltigkeitsjahr = gueltigkeitsjahr;
    }

    public Boolean getIstInOekoTopTen() {
        return IstInOekoTopTen;
    }
    public void setIstInOekoTopTen(Boolean istInOekoTopTen) {
        this.istInOekoTopTen = istInOekoTopTen;
    }

    public List<Oekolabel> getOekolabel() {
        return Oekolabel;
    }
    public void setOekolabel(List<Oekolabel> oekolabel) {
        this.oekolabel = oekolabel;
    }

    public List<Oekozertifikat> getOekozertifikate() {
        return Oekozertifikate;
    }
    public void setOekozertifikate(List<Oekozertifikat> oekozertifikate) {
        this.oekozertifikate = oekozertifikate;
    }

    public String getWebsite() {
        return Website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
}