package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.StandorteigenschaftenGas;
import bo4e.com.StandorteigenschaftenStrom;

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
    private final Typ _typ = Typ.STANDORTEIGENSCHAFTEN;
    private StandorteigenschaftenGas eigenschaftenGas;
    private StandorteigenschaftenStrom[] eigenschaftenStrom;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Eigenschaften zur Sparte Strom
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Eigenschaften zur Sparte Gas
     */
    public StandorteigenschaftenGas getEigenschaftenGas() { return eigenschaftenGas; }
    public void setEigenschaftenGas(StandorteigenschaftenGas value) { this.eigenschaftenGas = value; }

    /**
     * Eigenschaften zur Sparte Strom
     */
    public StandorteigenschaftenStrom[] getEigenschaftenStrom() { return eigenschaftenStrom; }
    public void setEigenschaftenStrom(StandorteigenschaftenStrom[] value) { this.eigenschaftenStrom = value; }

}
