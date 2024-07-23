package bo4e.com;

import bo4e.enums.Steuerkennzeichen;
import bo4e.enums.Waehrungscode;

/**
 * Abbildung eines Steuerbetrages.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Steuerbetrag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Steuerbetrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Steuerbetrag.json>`_
 */
public class Steuerbetrag extends COM {
    private Double basiswert;
    private Steuerkennzeichen steuerkennzeichen;
    private Double steuerwert;
    private Waehrungscode waehrung;

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
     * Nettobetrag für den die Steuer berechnet wurde. Z.B. 100
     */
    public Double getBasiswert() { return basiswert; }
    public void setBasiswert(Double value) { this.basiswert = value; }

    /**
     * Kennzeichnung des Steuersatzes, bzw. Verfahrens.
     */
    public Steuerkennzeichen getSteuerkennzeichen() { return steuerkennzeichen; }
    public void setSteuerkennzeichen(Steuerkennzeichen value) { this.steuerkennzeichen = value; }

    /**
     * Aus dem Basiswert berechnete Steuer. Z.B. 19 (bei UST_19)
     */
    public Double getSteuerwert() { return steuerwert; }
    public void setSteuerwert(Double value) { this.steuerwert = value; }

    /**
     * Währung. Z.B. Euro.
     */
    public Waehrungscode getWaehrung() { return waehrung; }
    public void setWaehrung(Waehrungscode value) { this.waehrung = value; }

}
