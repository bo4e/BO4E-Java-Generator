package bo4e.com;

import bo4e.enums.Preisgarantietyp;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preisgarantie.json>`_
 */
public class Preisgarantie extends COM {
    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    private String beschreibung;
    /**
     * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
     */
    private Preisgarantietyp preisgarantietyp;
    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    private Zeitraum zeitlicheGueltigkeit;

    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Preisgarantietyp getPreisgarantietyp() {
        return preisgarantietyp;
    }
    public void setPreisgarantietyp(Preisgarantietyp preisgarantietyp) {
        this.preisgarantietyp = preisgarantietyp;
    }

    public Zeitraum getZeitlicheGueltigkeit() {
        return zeitlicheGueltigkeit;
    }
    public void setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
        this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
    }
}