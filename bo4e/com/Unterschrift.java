package com.example.bo4e.com;

import java.time.OffsetDateTime;

/**
 * Modellierung einer Unterschrift, z.B. für Verträge, Angebote etc.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Unterschrift.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Unterschrift JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Unterschrift.json>`_
 */
public class Unterschrift extends COM {
    private OffsetDateTime datum;
    private String name;
    private String ort;

    public OffsetDateTime getDatum() { return datum; }
    public void setDatum(OffsetDateTime value) { this.datum = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getOrt() { return ort; }
    public void setOrt(String value) { this.ort = value; }

}
