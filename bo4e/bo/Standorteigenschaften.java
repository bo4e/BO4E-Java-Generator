package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.StandorteigenschaftenGas;
import bo4e.com.StandorteigenschaftenStrom;

import java.util.List;

/**
 * Modelliert die regionalen und spartenspezifischen Eigenschaften einer gegebenen Adresse.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Standorteigenschaften.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Standorteigenschaften JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Standorteigenschaften.json>`_
 */
public class Standorteigenschaften extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.STANDORTEIGENSCHAFTEN;
    /**
     * Eigenschaften zur Sparte Gas
     */
    private StandorteigenschaftenGas eigenschaftenGas;
    /**
     * Eigenschaften zur Sparte Strom
     */
    private List<StandorteigenschaftenStrom> eigenschaftenStrom;

    public Typ getTyp() {
        return typ;
    }

    public StandorteigenschaftenGas getEigenschaftenGas() {
        return eigenschaftenGas;
    }
    public void setEigenschaftenGas(StandorteigenschaftenGas eigenschaftenGas) {
        this.eigenschaftenGas = eigenschaftenGas;
    }

    public List<StandorteigenschaftenStrom> getEigenschaftenStrom() {
        return eigenschaftenStrom;
    }
    public void setEigenschaftenStrom(List<StandorteigenschaftenStrom> eigenschaftenStrom) {
        this.eigenschaftenStrom = eigenschaftenStrom;
    }
}