package bo4e.com;

import bo4e.enums.Themengebiet;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zustaendigkeit.json>`_
 */
public class Zustaendigkeit extends COM {
    /**
     * Berufliche Rolle des Ansprechpartners/ der Person
     */
    private String abteilung;
    /**
     * Berufliche Rolle des Ansprechpartners/ der Person
     */
    private String position;
    /**
     * Hier kann eine thematische Zuordnung des Ansprechpartners bzw. der Person angegeben werden
     */
    private Themengebiet themengebiet;

    public String getAbteilung() {
        return Abteilung;
    }
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getPosition() {
        return Position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public Themengebiet getThemengebiet() {
        return Themengebiet;
    }
    public void setThemengebiet(Themengebiet themengebiet) {
        this.themengebiet = themengebiet;
    }
}