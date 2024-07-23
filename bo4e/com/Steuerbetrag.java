package bo4e.com;

import bo4e.enums.Steuerkennzeichen;
import bo4e.enums.Waehrungscode;

import java.util.List;

/**
 * Abbildung eines Steuerbetrages.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Steuerbetrag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Steuerbetrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Steuerbetrag.json>`_
 */
public class Steuerbetrag extends COM {
    /**
     * Nettobetrag für den die Steuer berechnet wurde. Z.B. 100
     */
    private Double basiswert;
    /**
     * Kennzeichnung des Steuersatzes, bzw. Verfahrens.
     */
    private Steuerkennzeichen steuerkennzeichen;
    /**
     * Aus dem Basiswert berechnete Steuer. Z.B. 19 (bei UST_19)
     */
    private Double steuerwert;
    /**
     * Währung. Z.B. Euro.
     */
    private Waehrungscode waehrung;

    public Double getBasiswert() {
        return basiswert;
    }
    public void setBasiswert(Double basiswert) {
        this.basiswert = basiswert;
    }

    public Steuerkennzeichen getSteuerkennzeichen() {
        return steuerkennzeichen;
    }
    public void setSteuerkennzeichen(Steuerkennzeichen steuerkennzeichen) {
        this.steuerkennzeichen = steuerkennzeichen;
    }

    public Double getSteuerwert() {
        return steuerwert;
    }
    public void setSteuerwert(Double steuerwert) {
        this.steuerwert = steuerwert;
    }

    public Waehrungscode getWaehrung() {
        return waehrung;
    }
    public void setWaehrung(Waehrungscode waehrung) {
        this.waehrung = waehrung;
    }
}