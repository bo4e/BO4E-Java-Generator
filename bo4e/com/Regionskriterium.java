package bo4e.com;

import bo4e.enums.Gueltigkeitstyp;
import bo4e.enums.Regionskriteriumtyp;

import java.util.List;

/**
 * Komponente zur Abbildung eines Regionskriteriums
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Regionskriterium.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Regionskriterium JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Regionskriterium.json>`_
 */
public class Regionskriterium extends COM {
    /**
     * Hier wird festgelegt, ob es sich um ein einschließendes oder ausschließendes Kriterium
     * handelt.
     */
    private Gueltigkeitstyp gueltigkeitstyp;
    /**
     * Hier wird das Kriterium selbst angegeben, z.B. Bundesland.
     */
    private Regionskriteriumtyp regionskriteriumtyp;
    /**
     * Der Wert, den das Kriterium annehmen kann, z.B. NRW.
     * Im Falle des Regionskriteriumstyp BUNDESWEIT spielt dieser Wert keine Rolle.
     */
    private String wert;

    public Gueltigkeitstyp getGueltigkeitstyp() {
        return Gueltigkeitstyp;
    }
    public void setGueltigkeitstyp(Gueltigkeitstyp gueltigkeitstyp) {
        this.gueltigkeitstyp = gueltigkeitstyp;
    }

    public Regionskriteriumtyp getRegionskriteriumtyp() {
        return Regionskriteriumtyp;
    }
    public void setRegionskriteriumtyp(Regionskriteriumtyp regionskriteriumtyp) {
        this.regionskriteriumtyp = regionskriteriumtyp;
    }

    public String getWert() {
        return Wert;
    }
    public void setWert(String wert) {
        this.wert = wert;
    }
}