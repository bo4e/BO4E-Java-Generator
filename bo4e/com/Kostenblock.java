package bo4e.com;

/**
 * Mit dieser Komponente werden mehrere Kostenpositionen zusammengefasst.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kostenblock.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kostenblock JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Kostenblock.json>`_
 */
public class Kostenblock extends COM {
    private String kostenblockbezeichnung;
    private Kostenposition[] kostenpositionen;
    private Betrag summeKostenblock;

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
     * Bezeichnung für einen Kostenblock. Z.B. Netzkosten, Messkosten, Umlagen, etc.
     */
    public String getKostenblockbezeichnung() { return kostenblockbezeichnung; }
    public void setKostenblockbezeichnung(String value) { this.kostenblockbezeichnung = value; }

    /**
     * Hier sind die Details zu einer Kostenposition aufgeführt. Z.B.:
     * Alliander Netz Heinsberg GmbH, 01.02.2018, 31.12.2018, Arbeitspreis HT, 3.660 kWh, 5,8200
     * ct/kWh, 213,01 €
     */
    public Kostenposition[] getKostenpositionen() { return kostenpositionen; }
    public void setKostenpositionen(Kostenposition[] value) { this.kostenpositionen = value; }

    /**
     * Die Summe aller Kostenpositionen dieses Blocks
     */
    public Betrag getSummeKostenblock() { return summeKostenblock; }
    public void setSummeKostenblock(Betrag value) { this.summeKostenblock = value; }

}
