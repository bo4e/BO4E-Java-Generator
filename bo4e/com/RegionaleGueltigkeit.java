package bo4e.com;

import com.example.bo4e.enums.Gueltigkeitstyp;

/**
 * Mit dieser Komponente können regionale Gültigkeiten, z.B. für Tarife, Zu- und Abschläge
 * und Preise definiert werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionaleGueltigkeit.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionaleGueltigkeit JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/RegionaleGueltigkeit.json>`_
 */
public class RegionaleGueltigkeit extends COM {
    private Gueltigkeitstyp gueltigkeitstyp;
    private KriteriumWert[] kriteriumsWerte;

    public Gueltigkeitstyp getGueltigkeitstyp() { return gueltigkeitstyp; }
    public void setGueltigkeitstyp(Gueltigkeitstyp value) { this.gueltigkeitstyp = value; }

    public KriteriumWert[] getKriteriumsWerte() { return kriteriumsWerte; }
    public void setKriteriumsWerte(KriteriumWert[] value) { this.kriteriumsWerte = value; }

}
