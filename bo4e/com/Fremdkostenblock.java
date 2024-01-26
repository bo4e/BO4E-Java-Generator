package bo4e.com;

/**
 * Komponente zur Abbildung eines Kostenblocks in den Fremdkosten
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Fremdkostenblock.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Fremdkostenblock JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Fremdkostenblock.json>`_
 */
public class Fremdkostenblock extends COM {
    private String kostenblockbezeichnung;
    private Fremdkostenposition[] kostenpositionen;
    private Betrag summeKostenblock;

    public String getKostenblockbezeichnung() { return kostenblockbezeichnung; }
    public void setKostenblockbezeichnung(String value) { this.kostenblockbezeichnung = value; }

    public Fremdkostenposition[] getKostenpositionen() { return kostenpositionen; }
    public void setKostenpositionen(Fremdkostenposition[] value) { this.kostenpositionen = value; }

    public Betrag getSummeKostenblock() { return summeKostenblock; }
    public void setSummeKostenblock(Betrag value) { this.summeKostenblock = value; }

}
