package placeholder;

import java.util.List;

/**
 * In dieser Komponente sind die Berechnungsparameter für die Ermittlung der Tarifkosten
 * zusammengefasst.
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifberechnungsparameter.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifberechnungsparameter JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifberechnungsparameter.json>`_
 */
public class Tarifberechnungsparameter {
    private String id;
    private String version;
    private Tarifkalkulationsmethode berechnungsmethode;
    private Preis hoechstpreisHT;
    private Preis hoechstpreisNT;
    private Boolean istMesspreisInGrundpreisEnthalten;
    private Boolean istMesspreisZuBeruecksichtigen;
    private Double kwInklusive;
    private Double kwWeitereMengen;
    private Messpreistyp messpreistyp;
    private Preis mindestpreis;
    private List<ZusatzAttribut> zusatzAttribute;
    private List<Tarifpreis> zusatzpreise;

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
     * Gibt an, wie die Einzelpreise des Tarifes zu verarbeiten sind
     */
    public Tarifkalkulationsmethode getBerechnungsmethode() { return berechnungsmethode; }
    public void setBerechnungsmethode(Tarifkalkulationsmethode value) { this.berechnungsmethode = value; }

    /**
     * Höchstpreis für den Durchschnitts-Arbeitspreis HT
     */
    public Preis getHoechstpreisHT() { return hoechstpreisHT; }
    public void setHoechstpreisHT(Preis value) { this.hoechstpreisHT = value; }

    /**
     * Höchstpreis für den Durchschnitts-Arbeitspreis NT
     */
    public Preis getHoechstpreisNT() { return hoechstpreisNT; }
    public void setHoechstpreisNT(Preis value) { this.hoechstpreisNT = value; }

    /**
     * True, falls der Messpreis im Grundpreis (GP) enthalten ist
     */
    public Boolean getIstMesspreisInGrundpreisEnthalten() { return istMesspreisInGrundpreisEnthalten; }
    public void setIstMesspreisInGrundpreisEnthalten(Boolean value) { this.istMesspreisInGrundpreisEnthalten = value; }

    /**
     * Typ des Messpreises
     */
    public Boolean getIstMesspreisZuBeruecksichtigen() { return istMesspreisZuBeruecksichtigen; }
    public void setIstMesspreisZuBeruecksichtigen(Boolean value) { this.istMesspreisZuBeruecksichtigen = value; }

    /**
     * Im Preis bereits eingeschlossene Leistung (für Gas)
     */
    public Double getKwInklusive() { return kwInklusive; }
    public void setKwInklusive(Double value) { this.kwInklusive = value; }

    /**
     * Intervall, indem die über "kwInklusive" hinaus abgenommene Leistung kostenpflichtig wird
     * (z.B. je 5 kW 20 EURO)
     */
    public Double getKwWeitereMengen() { return kwWeitereMengen; }
    public void setKwWeitereMengen(Double value) { this.kwWeitereMengen = value; }

    /**
     * Typ des Messpreises
     */
    public Messpreistyp getMesspreistyp() { return messpreistyp; }
    public void setMesspreistyp(Messpreistyp value) { this.messpreistyp = value; }

    /**
     * Mindestpreis für den Durchschnitts-Arbeitspreis
     */
    public Preis getMindestpreis() { return mindestpreis; }
    public void setMindestpreis(Preis value) { this.mindestpreis = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }

    /**
     * Liste mit zusätzlichen Preisen, beispielsweise Messpreise und/oder Leistungspreise
     */
    public List<Tarifpreis> getZusatzpreise() { return zusatzpreise; }
    public void setZusatzpreise(List<Tarifpreis> value) { this.zusatzpreise = value; }
}
