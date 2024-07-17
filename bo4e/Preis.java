package placeholder;

import java.util.List;

/**
 * Abbildung eines Preises mit Wert, Einheit, Bezugswert und Status.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preis.json>`_
 */
public class Preis {
    private String id;
    private String version;
    private Mengeneinheit bezugswert;
    private Waehrungseinheit einheit;
    private Preisstatus status;
    private Double wert;
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
     * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
     */
    public Mengeneinheit getBezugswert() { return bezugswert; }
    public void setBezugswert(Mengeneinheit value) { this.bezugswert = value; }

    /**
     * Währungseinheit für den Preis, z.B. Euro oder Ct.
     */
    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    /**
     * Gibt den Status des veröffentlichten Preises an
     */
    public Preisstatus getStatus() { return status; }
    public void setStatus(Preisstatus value) { this.status = value; }

    /**
     * Gibt die nominale Höhe des Preises an.
     */
    public Double getWert() { return wert; }
    public void setWert(Double value) { this.wert = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
