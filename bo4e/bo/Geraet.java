package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Geraeteklasse;
import com.example.bo4e.enums.Geraetetyp;

/**
 * Mit diesem BO werden alle Geräte modelliert, die keine Zähler sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geraet.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geraet JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Geraet.json>`_
 */
public class Geraet extends Geschaeftsobjekt {
    private final Typ typ = Typ.GERAET;
    private String bezeichnung;
    private Geraeteklasse geraeteklasse;
    private String geraetenummer;
    private Geraetetyp geraetetyp;

    public Typ getTyp() { return typ; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Geraeteklasse getGeraeteklasse() { return geraeteklasse; }
    public void setGeraeteklasse(Geraeteklasse value) { this.geraeteklasse = value; }

    public String getGeraetenummer() { return geraetenummer; }
    public void setGeraetenummer(String value) { this.geraetenummer = value; }

    public Geraetetyp getGeraetetyp() { return geraetetyp; }
    public void setGeraetetyp(Geraetetyp value) { this.geraetetyp = value; }

}
