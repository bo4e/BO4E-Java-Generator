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
    private String A;
    private String B;
    private String C;
    private String D;

    public String getA() { return A; }
    public void setA(String value) { this.A = value; }

    public String getB() { return B; }
    public void setB(String value) { this.B = value; }

    public String getC() { return C; }
    public void setC(String value) { this.C = value; }

    public String getD() { return D; }
    public void setD(String value) { this.D = value; }

}
