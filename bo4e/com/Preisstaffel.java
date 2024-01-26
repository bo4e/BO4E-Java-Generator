package bo4e.com;

import com.example.StringOderNummer;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisstaffel.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisstaffel JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Preisstaffel.json>`_
 */
public class Preisstaffel extends COM {
    private StringOderNummer einheitspreis;
    private Sigmoidparameter sigmoidparameter;
    private StringOderNummer staffelgrenzeBis;
    private StringOderNummer staffelgrenzeVon;

    public StringOderNummer getEinheitspreis() { return einheitspreis; }
    public void setEinheitspreis(StringOderNummer value) { this.einheitspreis = value; }

    public Sigmoidparameter getSigmoidparameter() { return sigmoidparameter; }
    public void setSigmoidparameter(Sigmoidparameter value) { this.sigmoidparameter = value; }

    public StringOderNummer getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(StringOderNummer value) { this.staffelgrenzeBis = value; }

    public StringOderNummer getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(StringOderNummer value) { this.staffelgrenzeVon = value; }

}
