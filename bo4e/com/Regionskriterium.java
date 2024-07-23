package bo4e.com;

import bo4e.enums.Gueltigkeitstyp;
import bo4e.enums.Regionskriteriumtyp;

/**
 * Komponente zur Abbildung eines Regionskriteriums
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Regionskriterium.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Regionskriterium JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Regionskriterium.json>`_
 */
public class Regionskriterium extends COM {
    private Gueltigkeitstyp gueltigkeitstyp;
    private Regionskriteriumtyp regionskriteriumtyp;
    private String wert;

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
     * Hier wird festgelegt, ob es sich um ein einschließendes oder ausschließendes Kriterium
     * handelt.
     */
    public Gueltigkeitstyp getGueltigkeitstyp() { return gueltigkeitstyp; }
    public void setGueltigkeitstyp(Gueltigkeitstyp value) { this.gueltigkeitstyp = value; }

    /**
     * Hier wird das Kriterium selbst angegeben, z.B. Bundesland.
     */
    public Regionskriteriumtyp getRegionskriteriumtyp() { return regionskriteriumtyp; }
    public void setRegionskriteriumtyp(Regionskriteriumtyp value) { this.regionskriteriumtyp = value; }

    /**
     * Der Wert, den das Kriterium annehmen kann, z.B. NRW.
     * Im Falle des Regionskriteriumstyp BUNDESWEIT spielt dieser Wert keine Rolle.
     */
    public String getWert() { return wert; }
    public void setWert(String value) { this.wert = value; }

}
