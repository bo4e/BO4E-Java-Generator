package bo4e.com;

import java.util.List;

/**
 * Abbildung einer Preisstaffel mit regionaler Abgrenzung
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionalePreisstaffel.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionalePreisstaffel JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/RegionalePreisstaffel.json>`_
 */
public class RegionalePreisstaffel extends COM {
    /**
     * Preis pro abgerechneter Mengeneinheit
     */
    private Double einheitspreis;
    /**
     * Regionale Eingrenzung der Preisstaffel
     */
    private RegionaleGueltigkeit regionaleGueltigkeit;
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
        return einheitspreis;
    }
    public void setEinheitspreis(Double einheitspreis) {
        this.einheitspreis = einheitspreis;
    }

    public RegionaleGueltigkeit getRegionaleGueltigkeit() {
        return regionaleGueltigkeit;
    }
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit regionaleGueltigkeit) {
        this.regionaleGueltigkeit = regionaleGueltigkeit;
    }

    public Sigmoidparameter getSigmoidparameter() {
        return sigmoidparameter;
    }
    public void setSigmoidparameter(Sigmoidparameter sigmoidparameter) {
        this.sigmoidparameter = sigmoidparameter;
    }

    public Double getStaffelgrenzeBis() {
        return staffelgrenzeBis;
    }
    public void setStaffelgrenzeBis(Double staffelgrenzeBis) {
        this.staffelgrenzeBis = staffelgrenzeBis;
    }

    public Double getStaffelgrenzeVon() {
        return staffelgrenzeVon;
    }
    public void setStaffelgrenzeVon(Double staffelgrenzeVon) {
        this.staffelgrenzeVon = staffelgrenzeVon;
    }
}