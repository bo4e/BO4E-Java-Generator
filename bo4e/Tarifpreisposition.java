package placeholder;

import java.util.List;

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen abgebildet werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifpreisposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreisposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifpreisposition.json>`_
 */
public class Tarifpreisposition {
    private String id;
    private String version;
    private Mengeneinheit bezugseinheit;
    private Waehrungseinheit einheit;
    private Mengeneinheit mengeneinheitstaffel;
    private List<Preisstaffel> preisstaffeln;
    private Preistyp preistyp;
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
     * Hier sind die Staffeln mit ihren Preisenangaben definiert
     */
    public List<Preisstaffel> getPreisstaffeln() { return preisstaffeln; }
    public void setPreisstaffeln(List<Preisstaffel> value) { this.preisstaffeln = value; }

    /**
     * Angabe des Preistypes (z.B. Grundpreis)
     */
    public Preistyp getPreistyp() { return preistyp; }
    public void setPreistyp(Preistyp value) { this.preistyp = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
