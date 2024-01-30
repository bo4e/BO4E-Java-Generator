package bo4e.com;

import com.example.StringOderNummer;

/**
 * Die Sigmoid-Funktion, beispielsweise zur Berechnung eines Leistungspreises hat die Form:
 * LP=A/(1+(P/B)^C)+D
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Sigmoidparameter.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Sigmoidparameter JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Sigmoidparameter.json>`_
 */
public class Sigmoidparameter extends COM {
    private StringOderNummer A;
    private StringOderNummer B;
    private StringOderNummer C;
    private StringOderNummer D;

    public StringOderNummer getA() { return A; }
    public void setA(StringOderNummer value) { this.A = value; }

    public StringOderNummer getB() { return B; }
    public void setB(StringOderNummer value) { this.B = value; }

    public StringOderNummer getC() { return C; }
    public void setC(StringOderNummer value) { this.C = value; }

    public StringOderNummer getD() { return D; }
    public void setD(StringOderNummer value) { this.D = value; }

}
