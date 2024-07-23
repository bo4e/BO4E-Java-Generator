package bo4e.com;

import bo4e.enums.Erzeugungsart;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Energieherkunft.json>`_
 */
public class Energieherkunft extends COM {
    /**
     * Prozentualer Anteil der jeweiligen Erzeugungsart.
     */
    private Double anteilProzent;
    /**
     * Art der Erzeugung der Energie.
     */
    private Erzeugungsart erzeugungsart;

    public Double getAnteilProzent() {
        return AnteilProzent;
    }
    public void setAnteilProzent(Double anteilProzent) {
        this.anteilProzent = anteilProzent;
    }

    public Erzeugungsart getErzeugungsart() {
        return Erzeugungsart;
    }
    public void setErzeugungsart(Erzeugungsart erzeugungsart) {
        this.erzeugungsart = erzeugungsart;
    }
}