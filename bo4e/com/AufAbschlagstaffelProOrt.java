package bo4e.com;

import com.example.StringOderNummer;

/**
 * Gibt den Wert eines Auf- oder Abschlags und dessen Staffelgrenzen an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/AufAbschlagstaffelProOrt.json>`_
 */
public class AufAbschlagstaffelProOrt extends COM {
    private StringOderNummer staffelgrenzeBis;
    private StringOderNummer staffelgrenzeVon;
    private StringOderNummer wert;

    public StringOderNummer getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(StringOderNummer value) { this.staffelgrenzeBis = value; }

    public StringOderNummer getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(StringOderNummer value) { this.staffelgrenzeVon = value; }

    public StringOderNummer getWert() { return wert; }
    public void setWert(StringOderNummer value) { this.wert = value; }

}
