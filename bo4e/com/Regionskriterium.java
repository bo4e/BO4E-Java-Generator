package bo4e.com;

import com.example.bo4e.enums.Gueltigkeitstyp;
import com.example.bo4e.enums.Regionskriteriumtyp;

/**
 * Komponente zur Abbildung eines Regionskriteriums
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Regionskriterium.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Regionskriterium JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Regionskriterium.json>`_
 */
public class Regionskriterium extends COM {
    private Gueltigkeitstyp gueltigkeitstyp;
    private Regionskriteriumtyp regionskriteriumtyp;
    private String wert;

    public Gueltigkeitstyp getGueltigkeitstyp() { return gueltigkeitstyp; }
    public void setGueltigkeitstyp(Gueltigkeitstyp value) { this.gueltigkeitstyp = value; }

    public Regionskriteriumtyp getRegionskriteriumtyp() { return regionskriteriumtyp; }
    public void setRegionskriteriumtyp(Regionskriteriumtyp value) { this.regionskriteriumtyp = value; }

    public String getWert() { return wert; }
    public void setWert(String value) { this.wert = value; }

}
