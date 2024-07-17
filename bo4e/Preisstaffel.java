package placeholder;

import java.util.List;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisstaffel.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisstaffel JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preisstaffel.json>`_
 */
public class Preisstaffel {
    private String id;
    private String version;
    private Double einheitspreis;
    private Sigmoidparameter sigmoidparameter;
    private Double staffelgrenzeBis;
    private Double staffelgrenzeVon;
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
     * Preis pro abgerechneter Mengeneinheit
     */
    public Double getEinheitspreis() { return einheitspreis; }
    public void setEinheitspreis(Double value) { this.einheitspreis = value; }

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

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
