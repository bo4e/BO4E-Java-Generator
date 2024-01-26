package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Dienstleistungstyp;
import com.example.bo4e.enums.Bilanzierungsmethode;
import com.example.bo4e.com.Zeitraum;
import com.example.bo4e.com.Preisposition;
import com.example.bo4e.enums.Preisstatus;
import com.example.bo4e.enums.Sparte;

/**
 * Variante des Preisblattmodells zur Abbildung der Preise für wahlfreie Dienstleistungen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattDienstleistung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattDienstleistung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/PreisblattDienstleistung.json>`_
 */
public class PreisblattDienstleistung extends Geschaeftsobjekt {
    private final Typ typ = Typ.PREISBLATTDIENSTLEISTUNG;
    private Dienstleistungstyp basisdienstleistung;
    private String bezeichnung;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Geraet geraetedetails;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private Dienstleistungstyp[] inklusiveDienstleistungen;
    private Preisposition[] preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    public Typ getTyp() { return typ; }

    public Dienstleistungstyp getBasisdienstleistung() { return basisdienstleistung; }
    public void setBasisdienstleistung(Dienstleistungstyp value) { this.basisdienstleistung = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Bilanzierungsmethode getBilanzierungsmethode() { return bilanzierungsmethode; }
    public void setBilanzierungsmethode(Bilanzierungsmethode value) { this.bilanzierungsmethode = value; }

    public Geraet getGeraetedetails() { return geraetedetails; }
    public void setGeraetedetails(Geraet value) { this.geraetedetails = value; }

    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    public Marktteilnehmer getHerausgeber() { return herausgeber; }
    public void setHerausgeber(Marktteilnehmer value) { this.herausgeber = value; }

    public Dienstleistungstyp[] getInklusiveDienstleistungen() { return inklusiveDienstleistungen; }
    public void setInklusiveDienstleistungen(Dienstleistungstyp[] value) { this.inklusiveDienstleistungen = value; }

    public Preisposition[] getPreispositionen() { return preispositionen; }
    public void setPreispositionen(Preisposition[] value) { this.preispositionen = value; }

    public Preisstatus getPreisstatus() { return preisstatus; }
    public void setPreisstatus(Preisstatus value) { this.preisstatus = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

}
