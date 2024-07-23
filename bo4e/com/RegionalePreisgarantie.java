package bo4e.com;

import bo4e.enums.Preisgarantietyp;

/**
 * Abbildung einer Preisgarantie mit regionaler Abgrenzung
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionalePreisgarantie.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionalePreisgarantie JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionalePreisgarantie.json>`_
 */
public class RegionalePreisgarantie extends COM {
    private String beschreibung;
    private Preisgarantietyp preisgarantietyp;
    private RegionaleGueltigkeit regionaleGueltigkeit;
    private Zeitraum zeitlicheGueltigkeit;

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
     * Freitext zur Beschreibung der Preisgarantie.
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
     */
    public Preisgarantietyp getPreisgarantietyp() { return preisgarantietyp; }
    public void setPreisgarantietyp(Preisgarantietyp value) { this.preisgarantietyp = value; }

    /**
     * Regionale Eingrenzung der Preisgarantie.
     */
    public RegionaleGueltigkeit getRegionaleGueltigkeit() { return regionaleGueltigkeit; }
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit value) { this.regionaleGueltigkeit = value; }

    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    public Zeitraum getZeitlicheGueltigkeit() { return zeitlicheGueltigkeit; }
    public void setZeitlicheGueltigkeit(Zeitraum value) { this.zeitlicheGueltigkeit = value; }

}
