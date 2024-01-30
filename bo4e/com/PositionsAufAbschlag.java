package bo4e.com;

import com.example.bo4e.enums.AufAbschlagstyp;
import com.example.bo4e.enums.Waehrungseinheit;
import com.example.StringOderNummer;

/**
 * Differenzierung der zu betrachtenden Produkte anhand der preiserhöhenden (Aufschlag)
 * bzw. preisvermindernden (Abschlag) Zusatzvereinbarungen,
 * die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen werden
 * können.
 * Es können mehrere Auf-/Abschläge gleichzeitig ausgewählt werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/PositionsAufAbschlag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PositionsAufAbschlag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/PositionsAufAbschlag.json>`_
 */
public class PositionsAufAbschlag extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private Waehrungseinheit aufAbschlagswaehrung;
    private String aufAbschlagswert;
    private String beschreibung;
    private String bezeichnung;

    public AufAbschlagstyp getAufAbschlagstyp() { return aufAbschlagstyp; }
    public void setAufAbschlagstyp(AufAbschlagstyp value) { this.aufAbschlagstyp = value; }

    public Waehrungseinheit getAufAbschlagswaehrung() { return aufAbschlagswaehrung; }
    public void setAufAbschlagswaehrung(Waehrungseinheit value) { this.aufAbschlagswaehrung = value; }

    public String getAufAbschlagswert() { return aufAbschlagswert; }
    public void setAufAbschlagswert(String value) { this.aufAbschlagswert = value; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

}
