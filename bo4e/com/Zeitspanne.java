package com.example.bo4e.com;

import java.time.OffsetDateTime;

/**
 * Eine Zeitspanne ist definiert aus Start und/oder Ende.
 * Der Unterschied zur Menge (die auch zur Abbildung von Zeitmengen genutzt wird) ist, dass
 * konkrete Start- und Endzeitpunkte angegeben werden.
 * Die Zeitspanne ist aus dem COM Zeitraum hervorgegangen, das in Zeitspanne und Menge
 * aufgeteilt wurde.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitspanne.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitspanne JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Zeitspanne.json>`_
 */
public class Zeitspanne extends COM {
    private OffsetDateTime ende;
    private OffsetDateTime start;

    public OffsetDateTime getEnde() { return ende; }
    public void setEnde(OffsetDateTime value) { this.ende = value; }

    public OffsetDateTime getStart() { return start; }
    public void setStart(OffsetDateTime value) { this.start = value; }

}
