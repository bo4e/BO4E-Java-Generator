package bo4e.com;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/TarifpreisstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TarifpreisstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/TarifpreisstaffelProOrt.json>`_
 */
public class TarifpreisstaffelProOrt extends COM {
    private Double arbeitspreis;
    private Double arbeitspreisNT;
    private Double grundpreis;
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
     * Der Arbeitspreis in ct/kWh
     */
    public Double getArbeitspreis() { return arbeitspreis; }
    public void setArbeitspreis(Double value) { this.arbeitspreis = value; }

    /**
     * Der Arbeitspreis für Verbräuche in der Niedertarifzeit in ct/kWh
     */
    public Double getArbeitspreisNT() { return arbeitspreisNT; }
    public void setArbeitspreisNT(Double value) { this.arbeitspreisNT = value; }

    /**
     * Der Grundpreis in Euro/Jahr
     */
    public Double getGrundpreis() { return grundpreis; }
    public void setGrundpreis(Double value) { this.grundpreis = value; }

    /**
     * Oberer Wert, bis zu dem die Staffel gilt (exklusive)
     */
    public Double getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(Double value) { this.staffelgrenzeBis = value; }

    /**
     * Unterer Wert, ab dem die Staffel gilt (inklusive)
     */
    public Double getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(Double value) { this.staffelgrenzeVon = value; }

}
