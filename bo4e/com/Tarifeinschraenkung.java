package bo4e.com;

import bo4e.bo.Geraet;
import bo4e.enums.Voraussetzungen;

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
public class Tarifeinschraenkung extends COM {
    private Menge[] einschraenkungleistung;
    private Geraet[] einschraenkungzaehler;
    private Voraussetzungen[] voraussetzungen;
    private String[] zusatzprodukte;

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
     * Die vereinbarte Leistung, die (näherungsweise) abgenommen wird.
     * Insbesondere Gastarife können daran gebunden sein, dass die Leistung einer vereinbarten
     * Höhe entspricht.
     */
    public Menge[] getEinschraenkungleistung() { return einschraenkungleistung; }
    public void setEinschraenkungleistung(Menge[] value) { this.einschraenkungleistung = value; }

    /**
     * Liste der Zähler/Geräte, die erforderlich sind, damit dieser Tarif zur Anwendung gelangen
     * kann.
     * (Falls keine Zähler angegeben sind, ist der Tarif nicht an das Vorhandensein bestimmter
     * Zähler gebunden.)
     */
    public Geraet[] getEinschraenkungzaehler() { return einschraenkungzaehler; }
    public void setEinschraenkungzaehler(Geraet[] value) { this.einschraenkungzaehler = value; }

    /**
     * Voraussetzungen, die erfüllt sein müssen, damit dieser Tarif zur Anwendung kommen kann
     */
    public Voraussetzungen[] getVoraussetzungen() { return voraussetzungen; }
    public void setVoraussetzungen(Voraussetzungen[] value) { this.voraussetzungen = value; }

    /**
     * Weitere Produkte, die gemeinsam mit diesem Tarif bestellt werden können
     */
    public String[] getZusatzprodukte() { return zusatzprodukte; }
    public void setZusatzprodukte(String[] value) { this.zusatzprodukte = value; }
}
