package placeholder;

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
public class Energiemix {
    private String id;
    private String version;
    private List<Energieherkunft> anteil;
    private Double atommuell;
    private String bemerkung;
    private String bezeichnung;
    private Double co2Emission;
    private Sparte energieart;
    private Long energiemixnummer;
    private Long gueltigkeitsjahr;
    private Boolean istInOekoTopTen;
    private List<Oekolabel> oekolabel;
    private List<Oekozertifikat> oekozertifikate;
    private String website;
    private List<ZusatzAttribut> zusatzAttribute;

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
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Anteile der jeweiligen Erzeugungsart
     */
    public List<Energieherkunft> getAnteil() { return anteil; }
    public void setAnteil(List<Energieherkunft> value) { this.anteil = value; }

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
    public List<Oekolabel> getOekolabel() { return oekolabel; }
    public void setOekolabel(List<Oekolabel> value) { this.oekolabel = value; }

    /**
     * Zertifikate für den Energiemix
     */
    public List<Oekozertifikat> getOekozertifikate() { return oekozertifikate; }
    public void setOekozertifikate(List<Oekozertifikat> value) { this.oekozertifikate = value; }

    /**
     * Internetseite, auf der die Strommixdaten veröffentlicht sind
     */
    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
