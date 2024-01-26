package bo4e.com;

import com.example.bo4e.enums.Mengeneinheit;
import com.example.StringOderNummer;

/**
 * Abbildung einer Menge mit Wert und Einheit.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Menge.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Menge JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Menge.json>`_
 */
public class Menge extends COM {
    private Mengeneinheit einheit;
    private StringOderNummer wert;

    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    public StringOderNummer getWert() { return wert; }
    public void setWert(StringOderNummer value) { this.wert = value; }

}
