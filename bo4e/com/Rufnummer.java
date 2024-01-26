package bo4e.com;

import com.example.bo4e.enums.Rufnummernart;

/**
 * Contains information to call or fax someone
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Rufnummer.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Rufnummer JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Rufnummer.json>`_
 */
public class Rufnummer extends COM {
    private Rufnummernart nummerntyp;
    private String rufnummer;

    public Rufnummernart getNummerntyp() { return nummerntyp; }
    public void setNummerntyp(Rufnummernart value) { this.nummerntyp = value; }

    public String getRufnummer() { return rufnummer; }
    public void setRufnummer(String value) { this.rufnummer = value; }

}
