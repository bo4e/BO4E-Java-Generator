package com.example.bo4e.com;

import com.example.bo4e.bo.Geraet;
import com.example.bo4e.enums.Voraussetzungen;

/**
 * Mit dieser Komponente werden Einschränkungen für die Anwendung von Tarifen modelliert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifeinschraenkung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifeinschraenkung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Tarifeinschraenkung.json>`_
 */
public class Tarifeinschraenkung extends COM {
    private Menge[] einschraenkungleistung;
    private Geraet[] einschraenkungzaehler;
    private Voraussetzungen[] voraussetzungen;
    private String[] zusatzprodukte;

    public Menge[] getEinschraenkungleistung() { return einschraenkungleistung; }
    public void setEinschraenkungleistung(Menge[] value) { this.einschraenkungleistung = value; }

    public Geraet[] getEinschraenkungzaehler() { return einschraenkungzaehler; }
    public void setEinschraenkungzaehler(Geraet[] value) { this.einschraenkungzaehler = value; }

    public Voraussetzungen[] getVoraussetzungen() { return voraussetzungen; }
    public void setVoraussetzungen(Voraussetzungen[] value) { this.voraussetzungen = value; }

    public String[] getZusatzprodukte() { return zusatzprodukte; }
    public void setZusatzprodukte(String[] value) { this.zusatzprodukte = value; }
}
