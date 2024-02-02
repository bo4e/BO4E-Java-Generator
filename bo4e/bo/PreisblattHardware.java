package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Bilanzierungsmethode;
import com.example.bo4e.com.Zeitraum;
import com.example.bo4e.enums.Dienstleistungstyp;
import com.example.bo4e.enums.Netzebene;
import com.example.bo4e.com.Preisposition;
import com.example.bo4e.enums.Preisstatus;
import com.example.bo4e.enums.Sparte;

/**
 * Variante des Preisblattmodells zur Abbildung der Preise für zusätzliche Hardware
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattHardware.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattHardware JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/PreisblattHardware.json>`_
 */
public class PreisblattHardware extends Geschaeftsobjekt {
    private final Typ typ = Typ.PREISBLATTHARDWARE;
    private Geraet basisgeraet;
    private String bezeichnung;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private Dienstleistungstyp[] inklusiveDienstleistungen;
    private Geraet[] inklusiveGeraete;
    private Netzebene messebene;
    private Preisposition[] preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    public Typ getTyp() { return typ; }

    public Geraet getBasisgeraet() { return basisgeraet; }
    public void setBasisgeraet(Geraet value) { this.basisgeraet = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Bilanzierungsmethode getBilanzierungsmethode() { return bilanzierungsmethode; }
    public void setBilanzierungsmethode(Bilanzierungsmethode value) { this.bilanzierungsmethode = value; }

    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    public Marktteilnehmer getHerausgeber() { return herausgeber; }
    public void setHerausgeber(Marktteilnehmer value) { this.herausgeber = value; }

    public Dienstleistungstyp[] getInklusiveDienstleistungen() { return inklusiveDienstleistungen; }
    public void setInklusiveDienstleistungen(Dienstleistungstyp[] value) { this.inklusiveDienstleistungen = value; }

    public Geraet[] getInklusiveGeraete() { return inklusiveGeraete; }
    public void setInklusiveGeraete(Geraet[] value) { this.inklusiveGeraete = value; }

    public Netzebene getMessebene() { return messebene; }
    public void setMessebene(Netzebene value) { this.messebene = value; }

    public Preisposition[] getPreispositionen() { return preispositionen; }
    public void setPreispositionen(Preisposition[] value) { this.preispositionen = value; }

    public Preisstatus getPreisstatus() { return preisstatus; }
    public void setPreisstatus(Preisstatus value) { this.preisstatus = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

}
