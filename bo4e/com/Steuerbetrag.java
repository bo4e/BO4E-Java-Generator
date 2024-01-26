package bo4e.com;

import com.example.StringOderNummer;
import com.example.bo4e.enums.Steuerkennzeichen;
import com.example.bo4e.enums.Waehrungscode;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Steuerbetrag.json>`_
 */
public class Steuerbetrag extends COM {
    private StringOderNummer basiswert;
    private Steuerkennzeichen steuerkennzeichen;
    private StringOderNummer steuerwert;
    private Waehrungscode waehrung;

    public StringOderNummer getBasiswert() { return basiswert; }
    public void setBasiswert(StringOderNummer value) { this.basiswert = value; }

    public Steuerkennzeichen getSteuerkennzeichen() { return steuerkennzeichen; }
    public void setSteuerkennzeichen(Steuerkennzeichen value) { this.steuerkennzeichen = value; }

    public StringOderNummer getSteuerwert() { return steuerwert; }
    public void setSteuerwert(StringOderNummer value) { this.steuerwert = value; }

    public Waehrungscode getWaehrung() { return waehrung; }
    public void setWaehrung(Waehrungscode value) { this.waehrung = value; }

}
