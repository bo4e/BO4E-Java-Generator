package bo4e.com;

import com.example.bo4e.enums.Themengebiet;

/**
 * Enthält die zeitliche Zuordnung eines Ansprechpartners zu Abteilungen und
 * Zuständigkeiten.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zustaendigkeit.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zustaendigkeit JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Zustaendigkeit.json>`_
 */
public class Zustaendigkeit extends COM {
    private String abteilung;
    private String jobtitel;
    private Themengebiet themengebiet;

    public String getAbteilung() { return abteilung; }
    public void setAbteilung(String value) { this.abteilung = value; }

    public String getJobtitel() { return jobtitel; }
    public void setJobtitel(String value) { this.jobtitel = value; }

    public Themengebiet getThemengebiet() { return themengebiet; }
    public void setThemengebiet(Themengebiet value) { this.themengebiet = value; }

}
