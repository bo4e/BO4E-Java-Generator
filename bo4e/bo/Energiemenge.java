package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Verbrauch;
import com.example.bo4e.enums.Lokationstyp;

/**
 * Abbildung von Mengen, die Lokationen zugeordnet sind
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Energiemenge.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energiemenge JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Energiemenge.json>`_
 */
public class Energiemenge extends Geschaeftsobjekt {
    private final Typ typ = Typ.ENERGIEMENGE;
    private Verbrauch[] energieverbrauch;
    private String lokationsId;
    private Lokationstyp lokationstyp;

    public Typ getTyp() { return typ; }

    public Verbrauch[] getEnergieverbrauch() { return energieverbrauch; }
    public void setEnergieverbrauch(Verbrauch[] value) { this.energieverbrauch = value; }

    public String getLokationsId() { return lokationsId; }
    public void setLokationsId(String value) { this.lokationsId = value; }

    public Lokationstyp getLokationstyp() { return lokationstyp; }
    public void setLokationstyp(Lokationstyp value) { this.lokationstyp = value; }

}
