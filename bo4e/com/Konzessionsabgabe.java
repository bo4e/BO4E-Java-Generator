package bo4e.com;

import bo4e.enums.AbgabeArt;

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Konzessionsabgabe verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Konzessionsabgabe.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Konzessionsabgabe JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Konzessionsabgabe.json>`_
 */
public class Konzessionsabgabe extends COM {
    private String kategorie;
    private Double kosten;
    private AbgabeArt satz;

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
     * Gebührenkategorie der Konzessionsabgabe
     */
    public String getKategorie() { return kategorie; }
    public void setKategorie(String value) { this.kategorie = value; }

    /**
     * Konzessionsabgabe in E/kWh
     */
    public Double getKosten() { return kosten; }
    public void setKosten(Double value) { this.kosten = value; }

    /**
     * Art der Abgabe
     */
    public AbgabeArt getSatz() { return satz; }
    public void setSatz(AbgabeArt value) { this.satz = value; }

}
