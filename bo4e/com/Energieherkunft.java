package com.example.bo4e.com;

import com.example.StringOderNummer;
import com.example.bo4e.enums.Erzeugungsart;

/**
 * Abbildung einer Energieherkunft
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Energieherkunft.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energieherkunft JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Energieherkunft.json>`_
 */
public class Energieherkunft extends COM {
    private String anteilProzent;
    private Erzeugungsart erzeugungsart;

    public String getAnteilProzent() { return anteilProzent; }
    public void setAnteilProzent(String value) { this.anteilProzent = value; }

    public Erzeugungsart getErzeugungsart() { return erzeugungsart; }
    public void setErzeugungsart(Erzeugungsart value) { this.erzeugungsart = value; }

}
