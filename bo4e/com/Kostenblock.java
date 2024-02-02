package com.example.bo4e.com;

/**
 * Mit dieser Komponente werden mehrere Kostenpositionen zusammengefasst.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kostenblock.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kostenblock JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Kostenblock.json>`_
 */
public class Kostenblock extends COM {
    private String kostenblockbezeichnung;
    private Kostenposition[] kostenpositionen;
    private Betrag summeKostenblock;

    public String getKostenblockbezeichnung() { return kostenblockbezeichnung; }
    public void setKostenblockbezeichnung(String value) { this.kostenblockbezeichnung = value; }

    public Kostenposition[] getKostenpositionen() { return kostenpositionen; }
    public void setKostenpositionen(Kostenposition[] value) { this.kostenpositionen = value; }

    public Betrag getSummeKostenblock() { return summeKostenblock; }
    public void setSummeKostenblock(Betrag value) { this.summeKostenblock = value; }

}
