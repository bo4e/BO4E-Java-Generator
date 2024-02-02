package com.example.bo4e.com;

import com.example.StringOderNummer;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/TarifpreisstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TarifpreisstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/TarifpreisstaffelProOrt.json>`_
 */
public class TarifpreisstaffelProOrt extends COM {
    private String arbeitspreis;
    private String arbeitspreisNT;
    private String grundpreis;
    private String staffelgrenzeBis;
    private String staffelgrenzeVon;

    public String getArbeitspreis() { return arbeitspreis; }
    public void setArbeitspreis(String value) { this.arbeitspreis = value; }

    public String getArbeitspreisNT() { return arbeitspreisNT; }
    public void setArbeitspreisNT(String value) { this.arbeitspreisNT = value; }

    public String getGrundpreis() { return grundpreis; }
    public void setGrundpreis(String value) { this.grundpreis = value; }

    public String getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(String value) { this.staffelgrenzeBis = value; }

    public String getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(String value) { this.staffelgrenzeVon = value; }

}
