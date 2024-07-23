package bo4e.com;

import bo4e.enums.AbgabeArt;

import java.util.List;

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Konzessionsabgabe verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Konzessionsabgabe.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Konzessionsabgabe JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Konzessionsabgabe.json>`_
 */
public class Konzessionsabgabe extends COM {
    /**
     * Gebührenkategorie der Konzessionsabgabe
     */
    private String kategorie;
    /**
     * Konzessionsabgabe in E/kWh
     */
    private Double kosten;
    /**
     * Art der Abgabe
     */
    private AbgabeArt satz;

    public String getKategorie() {
        return Kategorie;
    }
    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public Double getKosten() {
        return Kosten;
    }
    public void setKosten(Double kosten) {
        this.kosten = kosten;
    }

    public AbgabeArt getSatz() {
        return Satz;
    }
    public void setSatz(AbgabeArt satz) {
        this.satz = satz;
    }
}