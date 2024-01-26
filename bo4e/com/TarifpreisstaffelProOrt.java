package bo4e.com;

import com.example.StringOderNummer;

/**
 * Gibt die Staffelgrenzen der jeweiligen Preise an
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/TarifpreisstaffelProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TarifpreisstaffelProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/TarifpreisstaffelProOrt.json>`_
 */
public class TarifpreisstaffelProOrt extends COM {
    private StringOderNummer arbeitspreis;
    private StringOderNummer arbeitspreisNT;
    private StringOderNummer grundpreis;
    private StringOderNummer staffelgrenzeBis;
    private StringOderNummer staffelgrenzeVon;

    public StringOderNummer getArbeitspreis() { return arbeitspreis; }
    public void setArbeitspreis(StringOderNummer value) { this.arbeitspreis = value; }

    public StringOderNummer getArbeitspreisNT() { return arbeitspreisNT; }
    public void setArbeitspreisNT(StringOderNummer value) { this.arbeitspreisNT = value; }

    public StringOderNummer getGrundpreis() { return grundpreis; }
    public void setGrundpreis(StringOderNummer value) { this.grundpreis = value; }

    public StringOderNummer getStaffelgrenzeBis() { return staffelgrenzeBis; }
    public void setStaffelgrenzeBis(StringOderNummer value) { this.staffelgrenzeBis = value; }

    public StringOderNummer getStaffelgrenzeVon() { return staffelgrenzeVon; }
    public void setStaffelgrenzeVon(StringOderNummer value) { this.staffelgrenzeVon = value; }

}
