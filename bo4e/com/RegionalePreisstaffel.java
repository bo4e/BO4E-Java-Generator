package com.example.bo4e.com;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/RegionalePreisstaffel.json>`_
 */
public class RegionalePreisstaffel extends COM {
    private String einheitspreis;
    private RegionaleGueltigkeit regionaleGueltigkeit;
    private Sigmoidparameter sigmoidparameter;
    private String staffelgrenzeBis;
    private String staffelgrenzeVon;

    public String getEinheitspreis() { return einheitspreis; }
    public void setEinheitspreis(String value) { this.einheitspreis = value; }

    public RegionaleGueltigkeit getRegionaleGueltigkeit() { return regionaleGueltigkeit; }
    public void setRegionaleGueltigkeit(RegionaleGueltigkeit value) { this.regionaleGueltigkeit = value; }

    public Sigmoidparameter getSigmoidparameter() { return sigmoidparameter; }
    public void setSigmoidparameter(Sigmoidparameter value) { this.sigmoidparameter = value; }

    public String getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(String value) { this.staffelgrenzeBis = value; }

    public String getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(String value) { this.staffelgrenzeVon = value; }

}
