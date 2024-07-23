package bo4e.com;

import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.Waehrungseinheit;

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
    private AufAbschlagstyp aufAbschlagstyp;
    private Waehrungseinheit aufAbschlagswaehrung;
    private Double aufAbschlagswert;
    private String beschreibung;
    private String bezeichnung;

    /**
     * zusatz_attribute: Optional[list["ZusatzAttribut"]] = None
     *
     * # pylint: disable=duplicate-code
     * model_config = ConfigDict(
     * alias_generator=camelize,
     * populate_by_name=True,
     * extra="allow",
     * # json_encoders is deprecated, but there is no easy-to-use alternative. The best way
     * would be to create
     * # an annotated version of Decimal, but you would have to use it everywhere in the
     * pydantic models.
     * # See this issue for more info: https://github.com/pydantic/pydantic/issues/6375
     * json_encoders={Decimal: str},
     * )
     */
    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Typ des AufAbschlages
     */
    public AufAbschlagstyp getAufAbschlagstyp() { return aufAbschlagstyp; }
    public void setAufAbschlagstyp(AufAbschlagstyp value) { this.aufAbschlagstyp = value; }

    /**
     * Einheit, in der der Auf-/Abschlag angegeben ist (z.B. ct/kWh).
     */
    public Waehrungseinheit getAufAbschlagswaehrung() { return aufAbschlagswaehrung; }
    public void setAufAbschlagswaehrung(Waehrungseinheit value) { this.aufAbschlagswaehrung = value; }

    /**
     * Höhe des Auf-/Abschlages
     */
    public Double getAufAbschlagswert() { return aufAbschlagswert; }
    public void setAufAbschlagswert(Double value) { this.aufAbschlagswert = value; }

    /**
     * Beschreibung zum Auf-/Abschlag
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Bezeichnung des Auf-/Abschlags
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

}
