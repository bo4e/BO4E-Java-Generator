package placeholder;

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
public class Standorteigenschaften {
    private String id;
    private Typ typ;
    private String version;
    private StandorteigenschaftenGas eigenschaftenGas;
    private List<StandorteigenschaftenStrom> eigenschaftenStrom;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Eigenschaften zur Sparte Strom
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Eigenschaften zur Sparte Gas
     */
    public StandorteigenschaftenGas getEigenschaftenGas() { return eigenschaftenGas; }
    public void setEigenschaftenGas(StandorteigenschaftenGas value) { this.eigenschaftenGas = value; }

    /**
     * Eigenschaften zur Sparte Strom
     */
    public List<StandorteigenschaftenStrom> getEigenschaftenStrom() { return eigenschaftenStrom; }
    public void setEigenschaftenStrom(List<StandorteigenschaftenStrom> value) { this.eigenschaftenStrom = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
