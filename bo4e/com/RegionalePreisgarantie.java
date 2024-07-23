package bo4e.com;

import bo4e.enums.Preisgarantietyp;

import java.util.List;

/**
 * Abbildung einer Preisgarantie mit regionaler Abgrenzung
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionalePreisgarantie.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionalePreisgarantie JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionalePreisgarantie.json>`_
 */
public class RegionalePreisgarantie extends COM {
    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    private String beschreibung;
    /**
     * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
     */
    private Preisgarantietyp preisgarantietyp;
    /**
     * Regionale Eingrenzung der Preisgarantie.
     */
    private RegionaleGueltigkeit regionaleGueltigkeit;
    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    private Zeitraum zeitlicheGueltigkeit;

    public String getBeschreibung() {
        return Beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Preisgarantietyp getPreisgarantietyp() {
        return Preisgarantietyp;
    }
    public void setPreisgarantietyp(Preisgarantietyp preisgarantietyp) {
        this.preisgarantietyp = preisgarantietyp;
    }

    public RegionaleGueltigkeit getRegionaleGueltigkeit() {
        return RegionaleGueltigkeit;
    }
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
        this.regionaleGueltigkeit = regionaleGueltigkeit;
    }

    public Zeitraum getZeitlicheGueltigkeit() {
        return ZeitlicheGueltigkeit;
    }
    public void setZeitlicheGueltigkeit(Zeitraum zeitlicheGueltigkeit) {
        this.zeitlicheGueltigkeit = zeitlicheGueltigkeit;
    }
}