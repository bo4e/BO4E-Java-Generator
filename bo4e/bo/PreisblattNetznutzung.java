package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Bilanzierungsmethode;
import com.example.bo4e.com.Zeitraum;
import com.example.bo4e.enums.Kundengruppe;
import com.example.bo4e.enums.Netzebene;
import com.example.bo4e.com.Preisposition;
import com.example.bo4e.enums.Preisstatus;
import com.example.bo4e.enums.Sparte;

/**
 * Die Variante des Preisblattmodells zur Abbildung der Netznutzungspreise
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattNetznutzung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattNetznutzung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/PreisblattNetznutzung.json>`_
 */
public class PreisblattNetznutzung extends Geschaeftsobjekt {
    private final Typ typ = Typ.PREISBLATTNETZNUTZUNG;
    private String bezeichnung;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private Kundengruppe kundengruppe;
    private Netzebene netzebene;
    private Preisposition[] preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    public Typ getTyp() { return typ; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Bilanzierungsmethode getBilanzierungsmethode() { return bilanzierungsmethode; }
    public void setBilanzierungsmethode(Bilanzierungsmethode value) { this.bilanzierungsmethode = value; }

    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    public Marktteilnehmer getHerausgeber() { return herausgeber; }
    public void setHerausgeber(Marktteilnehmer value) { this.herausgeber = value; }

    public Kundengruppe getKundengruppe() { return kundengruppe; }
    public void setKundengruppe(Kundengruppe value) { this.kundengruppe = value; }

    public Netzebene getNetzebene() { return netzebene; }
    public void setNetzebene(Netzebene value) { this.netzebene = value; }

    public Preisposition[] getPreispositionen() { return preispositionen; }
    public void setPreispositionen(Preisposition[] value) { this.preispositionen = value; }

    public Preisstatus getPreisstatus() { return preisstatus; }
    public void setPreisstatus(Preisstatus value) { this.preisstatus = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

}
