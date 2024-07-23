package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preistyp;
import bo4e.enums.Preisstatus;

import java.util.List;

/**
 * Abbildung eines Tarifpreises mit Preistyp und Beschreibung abgeleitet von COM Preis.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifpreis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifpreis.json>`_
 */
public class Tarifpreis extends COM {
    /**
     * Beschreibung des Preises. Hier können z.B. Preisdetails angegeben sein, beispielsweise
     * "Drehstromzähler".
     */
    private String beschreibung;
    /**
     * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
     */
    private Mengeneinheit bezugswert;
    /**
     * Währungseinheit für den Preis, z.B. Euro oder Ct.
     */
    private Waehrungseinheit einheit;
    /**
     * Angabe des Preistypes (z.B. Grundpreis)
     */
    private Preistyp preistyp;
    /**
     * Gibt den Status des veröffentlichten Preises an
     */
    private Preisstatus status;
    /**
     * Gibt die nominale Höhe des Preises an.
     */
    private Double wert;

    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

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

    public Preistyp getPreistyp() {
        return preistyp;
    }
    public void setPreistyp(Preistyp preistyp) {
        this.preistyp = preistyp;
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