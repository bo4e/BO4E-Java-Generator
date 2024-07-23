package bo4e.com;

/**
 * Abbildung einer Preisstaffel mit regionaler Abgrenzung
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionalePreisstaffel.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionalePreisstaffel JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionalePreisstaffel.json>`_
 */
public class RegionalePreisstaffel extends COM {
    private Double einheitspreis;
    private RegionaleGueltigkeit regionaleGueltigkeit;
    private Sigmoidparameter sigmoidparameter;
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;

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
     * Preis pro abgerechneter Mengeneinheit
     */
    public Double getEinheitspreis() { return einheitspreis; }
    public void setEinheitspreis(Double value) { this.einheitspreis = value; }

    /**
     * Regionale Eingrenzung der Preisstaffel
     */
    public RegionaleGueltigkeit getRegionaleGueltigkeit() { return regionaleGueltigkeit; }
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit value) { this.regionaleGueltigkeit = value; }

    /**
     * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
     * Parameter
     */
    public Sigmoidparameter getSigmoidparameter() { return sigmoidparameter; }
    public void setSigmoidparameter(Sigmoidparameter value) { this.sigmoidparameter = value; }

    /**
     * Exklusiver oberer Wert, bis zu dem die Staffel gilt
     */
    public Double getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(Double value) { this.staffelgrenzeBis = value; }

    /**
     * Inklusiver unterer Wert, ab dem die Staffel gilt
     */
    public Double getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(Double value) { this.staffelgrenzeVon = value; }

}
