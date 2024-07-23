package bo4e.com;

import bo4e.enums.Marktrolle;
import bo4e.enums.Verwendungszweck;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Verwendungszweck.json>`_
 */
public class VerwendungszweckProMarktrolle extends COM {
    /**
     * Zwecke: Optional[list["Verwendungszweck"]] = None
     */
    private Marktrolle marktrolle;
    /**
     * Verwendungszwecke
     */
    private List<Verwendungszweck> zwecke;

    public Marktrolle getMarktrolle() {
        return Marktrolle;
    }
    public void setMarktrolle(Marktrolle marktrolle) {
        this.marktrolle = marktrolle;
    }

    public List<Verwendungszweck> getZwecke() {
        return Zwecke;
    }
    public void setZwecke(List<Verwendungszweck> zwecke) {
        this.zwecke = zwecke;
    }
}