package bo4e.com;

import bo4e.bo.Geraet;
import bo4e.enums.Voraussetzungen;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifeinschraenkung.json>`_
 */
public class Tarifeinschraenkung extends COM {
    /**
     * Die vereinbarte Leistung, die (näherungsweise) abgenommen wird.
     * Insbesondere Gastarife können daran gebunden sein, dass die Leistung einer vereinbarten
     * Höhe entspricht.
     */
    private List<Menge> einschraenkungleistung;
    /**
     * Liste der Zähler/Geräte, die erforderlich sind, damit dieser Tarif zur Anwendung gelangen
     * kann.
     * (Falls keine Zähler angegeben sind, ist der Tarif nicht an das Vorhandensein bestimmter
     * Zähler gebunden.)
     */
    private List<Geraet> einschraenkungzaehler;
    /**
     * Voraussetzungen, die erfüllt sein müssen, damit dieser Tarif zur Anwendung kommen kann
     */
    private List<Voraussetzungen> voraussetzungen;
    /**
     * Weitere Produkte, die gemeinsam mit diesem Tarif bestellt werden können
     */
    private List<String> zusatzprodukte;

    public List<Menge> getEinschraenkungleistung() {
        return einschraenkungleistung;
    }
    public void setEinschraenkungleistung(List<Menge> einschraenkungleistung) {
        this.einschraenkungleistung = einschraenkungleistung;
    }

    public List<Geraet> getEinschraenkungzaehler() {
        return einschraenkungzaehler;
    }
    public void setEinschraenkungzaehler(List<Geraet> einschraenkungzaehler) {
        this.einschraenkungzaehler = einschraenkungzaehler;
    }

    public List<Voraussetzungen> getVoraussetzungen() {
        return voraussetzungen;
    }
    public void setVoraussetzungen(List<Voraussetzungen> voraussetzungen) {
        this.voraussetzungen = voraussetzungen;
    }

    public List<String> getZusatzprodukte() {
        return zusatzprodukte;
    }
    public void setZusatzprodukte(List<String> zusatzprodukte) {
        this.zusatzprodukte = zusatzprodukte;
    }
}