package com.example.bo4e.com;

import com.example.bo4e.enums.Waehrungscode;
import com.example.StringOderNummer;

/**
 * Die Komponente wird dazu verwendet, Summenbeträge (beispielsweise in Angeboten und
 * Rechnungen) als Geldbeträge
 * abzubilden. Die Einheit ist dabei immer die Hauptwährung also Euro, Dollar etc…
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Betrag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Betrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Betrag.json>`_
 */
public class Betrag extends COM {
    private Waehrungscode waehrung;
    private String wert;

    public Waehrungscode getWaehrung() { return waehrung; }
    public void setWaehrung(Waehrungscode value) { this.waehrung = value; }

    public String getWert() { return wert; }
    public void setWert(String value) { this.wert = value; }

}
