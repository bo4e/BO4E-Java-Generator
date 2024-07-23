package bo4e.com;

import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.Waehrungseinheit;

import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/PositionsAufAbschlag.json>`_
 */
public class PositionsAufAbschlag extends COM {
    /**
     * Typ des AufAbschlages
     */
    private AufAbschlagstyp aufAbschlagstyp;
    /**
     * Einheit, in der der Auf-/Abschlag angegeben ist (z.B. ct/kWh).
     */
    private Waehrungseinheit aufAbschlagswaehrung;
    /**
     * Höhe des Auf-/Abschlages
     */
    private Double aufAbschlagswert;
    /**
     * Beschreibung zum Auf-/Abschlag
     */
    private String beschreibung;
    /**
     * Bezeichnung des Auf-/Abschlags
     */
    private String bezeichnung;

    public AufAbschlagstyp getAufAbschlagstyp() {
        return AufAbschlagstyp;
    }
    public void setAufAbschlagstyp(AufAbschlagstyp aufAbschlagstyp) {
        this.aufAbschlagstyp = aufAbschlagstyp;
    }

    public Waehrungseinheit getAufAbschlagswaehrung() {
        return AufAbschlagswaehrung;
    }
    public void setAufAbschlagswaehrung(Waehrungseinheit aufAbschlagswaehrung) {
        this.aufAbschlagswaehrung = aufAbschlagswaehrung;
    }

    public Double getAufAbschlagswert() {
        return AufAbschlagswert;
    }
    public void setAufAbschlagswert(Double aufAbschlagswert) {
        this.aufAbschlagswert = aufAbschlagswert;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}