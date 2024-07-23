package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preistyp;
import bo4e.enums.Preisstatus;

/**
 * Abbildung eines Tarifpreises mit Preistyp und Beschreibung abgeleitet von COM Preis.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifpreis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifpreis.json>`_
 */
public class Tarifpreis extends COM {
    private String beschreibung;
    private Mengeneinheit bezugswert;
    private Waehrungseinheit einheit;
    private Preistyp preistyp;
    private Preisstatus status;
    private Double wert;

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
     * Beschreibung des Preises. Hier können z.B. Preisdetails angegeben sein, beispielsweise
     * "Drehstromzähler".
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

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
     * Angabe des Preistypes (z.B. Grundpreis)
     */
    public Preistyp getPreistyp() { return preistyp; }
    public void setPreistyp(Preistyp value) { this.preistyp = value; }

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

}
