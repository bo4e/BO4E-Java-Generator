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
    private StringOderNummer a;
    private StringOderNummer b;
    private StringOderNummer c;
    private StringOderNummer d;

    public StringOderNummer getA() { return a; }
    public void setA(StringOderNummer value) { this.a = value; }

    public StringOderNummer getB() { return b; }
    public void setB(StringOderNummer value) { this.b = value; }

    public StringOderNummer getC() { return c; }
    public void setC(StringOderNummer value) { this.c = value; }

    public StringOderNummer getD() { return d; }
    public void setD(StringOderNummer value) { this.d = value; }

}
