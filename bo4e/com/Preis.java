package bo4e.com;

import com.example.bo4e.enums.Mengeneinheit;
import com.example.bo4e.enums.Waehrungseinheit;
import com.example.bo4e.enums.Preisstatus;
import com.example.StringOderNummer;

/**
 * Abbildung eines Preises mit Wert, Einheit, Bezugswert und Status.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Preis.json>`_
 */
public class Preis extends COM {
    private Mengeneinheit bezugswert;
    private Waehrungseinheit einheit;
    private Preisstatus status;
    private StringOderNummer wert;

    public Mengeneinheit getBezugswert() { return bezugswert; }
    public void setBezugswert(Mengeneinheit value) { this.bezugswert = value; }

    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    public Preisstatus getStatus() { return status; }
    public void setStatus(Preisstatus value) { this.status = value; }

    public StringOderNummer getWert() { return wert; }
    public void setWert(StringOderNummer value) { this.wert = value; }

}
