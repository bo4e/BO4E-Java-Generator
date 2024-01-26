package bo4e.com;

import com.example.bo4e.enums.Marktrolle;
import com.example.bo4e.enums.Verwendungszweck;

/**
 * Dient zur Identifizierung des Verwendungszwecks der Marktrolle an der Marktlokation, der
 * die Werte zu übermitteln sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Verwendungszweck.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Verwendungszweck JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Verwendungszweck.json>`_
 */
public class VerwendungszweckProMarktrolle extends COM {
    private Marktrolle marktrolle;
    private Verwendungszweck[] zwecke;

    public Marktrolle getMarktrolle() { return marktrolle; }
    public void setMarktrolle(Marktrolle value) { this.marktrolle = value; }

    public Verwendungszweck[] getZwecke() { return zwecke; }
    public void setZwecke(Verwendungszweck[] value) { this.zwecke = value; }
}
