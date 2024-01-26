package bo4e.com;

import com.example.bo4e.enums.Tarifregionskriterium;

/**
 * Mit dieser Komponente können Kriterien und deren Werte definiert werden
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/KriteriumWert.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `KriteriumWert JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/KriteriumWert.json>`_
 */
public class KriteriumWert extends COM {
    private Tarifregionskriterium kriterium;
    private String wert;

    public Tarifregionskriterium getKriterium() { return kriterium; }
    public void setKriterium(Tarifregionskriterium value) { this.kriterium = value; }

    public String getWert() { return wert; }
    public void setWert(String value) { this.wert = value; }

}
