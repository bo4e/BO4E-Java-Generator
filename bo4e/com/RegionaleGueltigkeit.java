package bo4e.com;

import bo4e.enums.Gueltigkeitstyp;

/**
 * Mit dieser Komponente können regionale Gültigkeiten, z.B. für Tarife, Zu- und Abschläge
 * und Preise definiert werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionaleGueltigkeit.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionaleGueltigkeit JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionaleGueltigkeit.json>`_
 */
public class RegionaleGueltigkeit extends COM {
    private Gueltigkeitstyp gueltigkeitstyp;
    private KriteriumWert[] kriteriumsWerte;

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
     * Unterscheidung ob Positivliste oder Negativliste übertragen wird
     */
    public Gueltigkeitstyp getGueltigkeitstyp() { return gueltigkeitstyp; }
    public void setGueltigkeitstyp(Gueltigkeitstyp value) { this.gueltigkeitstyp = value; }

    /**
     * Hier stehen die Kriterien, die die regionale Gültigkeit festlegen
     */
    public KriteriumWert[] getKriteriumsWerte() { return kriteriumsWerte; }
    public void setKriteriumsWerte(KriteriumWert[] value) { this.kriteriumsWerte = value; }

}
