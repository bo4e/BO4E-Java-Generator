package bo4e.com;

import bo4e.enums.Sparte;
import bo4e.enums.Oekolabel;
import bo4e.enums.Oekozertifikat;

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
    private Energieherkunft[] anteil;
    private Double atommuell;
    private String bemerkung;
    private String bezeichnung;
    private Double co2Emission;
    private Sparte energieart;
    private Long energiemixnummer;
    private Long gueltigkeitsjahr;
    private Boolean istInOekoTopTen;
    private Oekolabel[] oekolabel;
    private Oekozertifikat[] oekozertifikate;
    private String website;

    /**
     * zusatz_attribute: Optional[list["ZusatzAttribut"]] = None
     *
     * # pylint: disable=duplicate-code
     * model_config = ConfigDict(
     * alias_generator=camelize,
     * populate_by_name=True,
     * extra="allow",
     * # json_encoders is deprecated, but there is no easy-to-use alternative. The best way
     * would be to create
     * # an annotated version of Decimal, but you would have to use it everywhere in the
     * pydantic models.
     * # See this issue for more info: https://github.com/pydantic/pydantic/issues/6375
     * json_encoders={Decimal: str},
     * )
     */
    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Anteile der jeweiligen Erzeugungsart
     */
    public Energieherkunft[] getAnteil() { return anteil; }
    public void setAnteil(Energieherkunft[] value) { this.anteil = value; }

    /**
     * Höhe des erzeugten Atommülls in g/kWh
     */
    public Double getAtommuell() { return atommuell; }
    public void setAtommuell(Double value) { this.atommuell = value; }

    /**
     * Bemerkung zum Energiemix
     */
    public String getBemerkung() { return bemerkung; }
    public void setBemerkung(String value) { this.bemerkung = value; }

    /**
     * Bezeichnung des Energiemix
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Höhe des erzeugten CO2-Ausstosses in g/kWh
     */
    public Double getCo2Emission() { return co2Emission; }
    public void setCo2Emission(Double value) { this.co2Emission = value; }

    /**
     * Strom oder Gas etc.
     */
    public Sparte getEnergieart() { return energieart; }
    public void setEnergieart(Sparte value) { this.energieart = value; }

    /**
     * Eindeutige Nummer zur Identifizierung des Energiemixes
     */
    public Long getEnergiemixnummer() { return energiemixnummer; }
    public void setEnergiemixnummer(Long value) { this.energiemixnummer = value; }

    /**
     * Jahr, für das der Energiemix gilt
     */
    public Long getGueltigkeitsjahr() { return gueltigkeitsjahr; }
    public void setGueltigkeitsjahr(Long value) { this.gueltigkeitsjahr = value; }

    /**
     * Kennzeichen, ob der Versorger zu den Öko Top Ten gehört
     */
    public Boolean getIstInOekoTopTen() { return istInOekoTopTen; }
    public void setIstInOekoTopTen(Boolean value) { this.istInOekoTopTen = value; }

    /**
     * Ökolabel für den Energiemix
     */
    public Oekolabel[] getOekolabel() { return oekolabel; }
    public void setOekolabel(Oekolabel[] value) { this.oekolabel = value; }

    /**
     * Zertifikate für den Energiemix
     */
    public Oekozertifikat[] getOekozertifikate() { return oekozertifikate; }
    public void setOekozertifikate(Oekozertifikat[] value) { this.oekozertifikate = value; }

    /**
     * Internetseite, auf der die Strommixdaten veröffentlicht sind
     */
    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

}
