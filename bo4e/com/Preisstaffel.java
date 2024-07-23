package bo4e.com;

import java.util.List;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisstaffel.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisstaffel JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preisstaffel.json>`_
 */
public class Preisstaffel extends COM {
    /**
     * Preis pro abgerechneter Mengeneinheit
     */
    private Double einheitspreis;
    /**
     * Parameter zur Berechnung des Preises anhand der Jahresmenge und weiterer netzbezogener
     * Parameter
     */
    private Sigmoidparameter sigmoidparameter;
    /**
     * Exklusiver oberer Wert, bis zu dem die Staffel gilt
     */
    private Double staffelgrenzeBis;
    /**
     * Inklusiver unterer Wert, ab dem die Staffel gilt
     */
    private Double staffelgrenzeVon;

    public Double getEinheitspreis() {
        return Einheitspreis;
    }
    public void setEinheitspreis(Double einheitspreis) {
        this.einheitspreis = einheitspreis;
    }

    public Sigmoidparameter getSigmoidparameter() {
        return Sigmoidparameter;
    }
    public void setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
        this.sigmoidparameter = sigmoidparameter;
    }

    public Double getStaffelgrenzeBis() {
        return StaffelgrenzeBis;
    }
    public void setStaffelgrenzeBis(Double staffelgrenzeBis) {
        this.staffelgrenzeBis = staffelgrenzeBis;
    }

    public Double getStaffelgrenzeVon() {
        return StaffelgrenzeVon;
    }
    public void setStaffelgrenzeVon(Double staffelgrenzeVon) {
        this.staffelgrenzeVon = staffelgrenzeVon;
    }
}