package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preisstatus;

import java.util.List;

/**
 * Abbildung eines Preises mit Wert, Einheit, Bezugswert und Status.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preis.json>`_
 */
public class Preis extends COM {
    /**
     * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
     */
    private Mengeneinheit bezugswert;
    /**
     * Währungseinheit für den Preis, z.B. Euro oder Ct.
     */
    private Waehrungseinheit einheit;
    /**
     * Gibt den Status des veröffentlichten Preises an
     */
    private Preisstatus status;
    /**
     * Gibt die nominale Höhe des Preises an.
     */
    private Double wert;

    public Mengeneinheit getBezugswert() {
        return bezugswert;
    }
    public void setBezugswert(Mengeneinheit bezugswert) {
        this.bezugswert = bezugswert;
    }

    public Waehrungseinheit getEinheit() {
        return einheit;
    }
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    public Preisstatus getStatus() {
        return status;
    }
    public void setStatus(Preisstatus status) {
        this.status = status;
    }

    public Double getWert() {
        return wert;
    }
    public void setWert(Double wert) {
        this.wert = wert;
    }
}