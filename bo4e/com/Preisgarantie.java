package bo4e.com;

import com.example.bo4e.enums.Preisgarantietyp;

/**
 * Definition für eine Preisgarantie mit der Möglichkeit verschiedener Ausprägungen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisgarantie.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisgarantie JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Preisgarantie.json>`_
 */
public class Preisgarantie extends COM {
    private String beschreibung;
    private Preisgarantietyp preisgarantietyp;
    private Zeitraum zeitlicheGueltigkeit;

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public Preisgarantietyp getPreisgarantietyp() { return preisgarantietyp; }
    public void setPreisgarantietyp(Preisgarantietyp value) { this.preisgarantietyp = value; }

    public Zeitraum getZeitlicheGueltigkeit() { return zeitlicheGueltigkeit; }
    public void setZeitlicheGueltigkeit(Zeitraum value) { this.zeitlicheGueltigkeit = value; }

}
