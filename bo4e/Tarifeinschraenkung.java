package placeholder;

import java.util.List;

/**
 * Mit dieser Komponente werden Einschränkungen für die Anwendung von Tarifen modelliert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifeinschraenkung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifeinschraenkung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifeinschraenkung.json>`_
 */
public class Tarifeinschraenkung {
    private String id;
    private String version;
    private List<Menge> einschraenkungleistung;
    private List<Geraet> einschraenkungzaehler;
    private List<Voraussetzungen> voraussetzungen;
    private List<ZusatzAttribut> zusatzAttribute;
    private List<String> zusatzprodukte;

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
     * Die vereinbarte Leistung, die (näherungsweise) abgenommen wird.
     * Insbesondere Gastarife können daran gebunden sein, dass die Leistung einer vereinbarten
     * Höhe entspricht.
     */
    public List<Menge> getEinschraenkungleistung() { return einschraenkungleistung; }
    public void setEinschraenkungleistung(List<Menge> value) { this.einschraenkungleistung = value; }

    /**
     * Liste der Zähler/Geräte, die erforderlich sind, damit dieser Tarif zur Anwendung gelangen
     * kann.
     * (Falls keine Zähler angegeben sind, ist der Tarif nicht an das Vorhandensein bestimmter
     * Zähler gebunden.)
     */
    public List<Geraet> getEinschraenkungzaehler() { return einschraenkungzaehler; }
    public void setEinschraenkungzaehler(List<Geraet> value) { this.einschraenkungzaehler = value; }

    /**
     * Voraussetzungen, die erfüllt sein müssen, damit dieser Tarif zur Anwendung kommen kann
     */
    public List<Voraussetzungen> getVoraussetzungen() { return voraussetzungen; }
    public void setVoraussetzungen(List<Voraussetzungen> value) { this.voraussetzungen = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }

    /**
     * Weitere Produkte, die gemeinsam mit diesem Tarif bestellt werden können
     */
    public List<String> getZusatzprodukte() { return zusatzprodukte; }
    public void setZusatzprodukte(List<String> value) { this.zusatzprodukte = value; }
}
