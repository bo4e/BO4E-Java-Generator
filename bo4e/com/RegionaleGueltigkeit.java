package bo4e.com;

import bo4e.enums.Gueltigkeitstyp;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionaleGueltigkeit.json>`_
 */
public class RegionaleGueltigkeit extends COM {
    /**
     * Unterscheidung ob Positivliste oder Negativliste übertragen wird
     */
    private Gueltigkeitstyp gueltigkeitstyp;
    /**
     * Hier stehen die Kriterien, die die regionale Gültigkeit festlegen
     */
    private List<KriteriumWert> kriteriumsWerte;

    public Gueltigkeitstyp getGueltigkeitstyp() {
        return gueltigkeitstyp;
    }
    public void setGueltigkeitstyp(Gueltigkeitstyp gueltigkeitstyp) {
        this.gueltigkeitstyp = gueltigkeitstyp;
    }

    public List<KriteriumWert> getKriteriumsWerte() {
        return kriteriumsWerte;
    }
    public void setKriteriumsWerte(List<KriteriumWert> kriteriumsWerte) {
        this.kriteriumsWerte = kriteriumsWerte;
    }
}