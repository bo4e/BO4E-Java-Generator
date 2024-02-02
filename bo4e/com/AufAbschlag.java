package com.example.bo4e.com;

import com.example.bo4e.enums.AufAbschlagstyp;
import com.example.bo4e.enums.AufAbschlagsziel;
import com.example.bo4e.enums.Waehrungseinheit;

/**
 * Modell für die preiserhöhenden (Aufschlag) bzw. preisvermindernden (Abschlag)
 * Zusatzvereinbarungen,
 * die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen wurden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/AufAbschlag.json>`_
 */
public class AufAbschlag extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private AufAbschlagsziel aufAbschlagsziel;
    private String beschreibung;
    private String bezeichnung;
    private Waehrungseinheit einheit;
    private Zeitraum gueltigkeitszeitraum;
    private Preisstaffel[] staffeln;
    private String website;

    public AufAbschlagstyp getAufAbschlagstyp() { return aufAbschlagstyp; }
    public void setAufAbschlagstyp(AufAbschlagstyp value) { this.aufAbschlagstyp = value; }

    public AufAbschlagsziel getAufAbschlagsziel() { return aufAbschlagsziel; }
    public void setAufAbschlagsziel(AufAbschlagsziel value) { this.aufAbschlagsziel = value; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    public Zeitraum getGueltigkeitszeitraum() { return gueltigkeitszeitraum; }
    public void setGueltigkeitszeitraum(Zeitraum value) { this.gueltigkeitszeitraum = value; }

    public Preisstaffel[] getStaffeln() { return staffeln; }
    public void setStaffeln(Preisstaffel[] value) { this.staffeln = value; }

    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

}
