package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Regionskriterium;

/**
 * Modellierung einer Region als Menge von Kriterien, die eine Region beschreiben
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Region.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Region JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Region.json>`_
 */
public class Region extends Geschaeftsobjekt {
    private final Typ typ = Typ.REGION;
    private String bezeichnung;
    private Regionskriterium[] negativListe;
    private Regionskriterium[] positivListe;

    public Typ getTyp() { return typ; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Regionskriterium[] getNegativListe() { return negativListe; }
    public void setNegativListe(Regionskriterium[] value) { this.negativListe = value; }

    public Regionskriterium[] getPositivListe() { return positivListe; }
    public void setPositivListe(Regionskriterium[] value) { this.positivListe = value; }

}
