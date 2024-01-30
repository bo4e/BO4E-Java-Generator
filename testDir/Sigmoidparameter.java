package com.example.bo4e;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-python/main/json_schemas/com/Sigmoidparameter.json>`_
 */
public class Sigmoidparameter {
    private String id;
    private String a;
    private String b;
    private String c;
    private String d;

    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    public String getA() { return a; }
    public void setA(String value) { this.a = value; }

    public String getB() { return b; }
    public void setB(String value) { this.b = value; }

    public String getC() { return c; }
    public void setC(String value) { this.c = value; }

    public String getD() { return d; }
    public void setD(String value) { this.d = value; }
}
