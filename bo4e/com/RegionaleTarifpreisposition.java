package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preistyp;

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen im Zusammenhang mit
 * regionalen Gültigkeiten abgebildet
 * werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionaleTarifpreisposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionaleTarifpreisposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionaleTarifpreisposition.json>`_
 */
public class RegionaleTarifpreisposition extends COM {
    private Mengeneinheit bezugseinheit;
    private Waehrungseinheit einheit;
    private Mengeneinheit mengeneinheitstaffel;
    private RegionalePreisstaffel[] preisstaffeln;
    private Preistyp preistyp;

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
     * Größe, auf die sich die Einheit bezieht, beispielsweise kWh, Jahr
     */
    public Mengeneinheit getBezugseinheit() { return bezugseinheit; }
    public void setBezugseinheit(Mengeneinheit value) { this.bezugseinheit = value; }

    /**
     * Einheit des Preises (z.B. EURO)
     */
    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    /**
     * Gibt an, nach welcher Menge die vorgenannte Einschränkung erfolgt (z.B.
     * Jahresstromverbrauch in kWh)
     */
    public Mengeneinheit getMengeneinheitstaffel() { return mengeneinheitstaffel; }
    public void setMengeneinheitstaffel(Mengeneinheit value) { this.mengeneinheitstaffel = value; }

    /**
     * Hier sind die Staffeln mit ihren Preisangaben und regionalen Gültigkeiten definiert
     */
    public RegionalePreisstaffel[] getPreisstaffeln() { return preisstaffeln; }
    public void setPreisstaffeln(RegionalePreisstaffel[] value) { this.preisstaffeln = value; }

    /**
     * Angabe des Preistypes (z.B. Grundpreis)
     */
    public Preistyp getPreistyp() { return preistyp; }
    public void setPreistyp(Preistyp value) { this.preistyp = value; }

}
