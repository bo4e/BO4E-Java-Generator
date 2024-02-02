package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Zeitraum;
import com.example.bo4e.com.Preisposition;
import com.example.bo4e.enums.Preisstatus;
import com.example.bo4e.enums.Sparte;

/**
 * Das allgemeine Modell zur Abbildung von Preisen;
 * Davon abgeleitet können, über die Zuordnung identifizierender Merkmale, spezielle
 * Preisblatt-Varianten modelliert
 * werden.
 *
 * Die jeweiligen Sätze von Merkmalen sind in der Grafik ergänzt worden und stellen jeweils
 * eine Ausprägung für die
 * verschiedenen Anwendungsfälle der Preisblätter dar.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Preisblatt.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisblatt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Preisblatt.json>`_
 */
public class Preisblatt extends Geschaeftsobjekt {
    private final Typ typ = Typ.PREISBLATT;
    private String bezeichnung;
    private Zeitraum gueltigkeit;
    private Marktteilnehmer herausgeber;
    private Preisposition[] preispositionen;
    private Preisstatus preisstatus;
    private Sparte sparte;

    public Typ getTyp() { return typ; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    public Marktteilnehmer getHerausgeber() { return herausgeber; }
    public void setHerausgeber(Marktteilnehmer value) { this.herausgeber = value; }

    public Preisposition[] getPreispositionen() { return preispositionen; }
    public void setPreispositionen(Preisposition[] value) { this.preispositionen = value; }

    public Preisstatus getPreisstatus() { return preisstatus; }
    public void setPreisstatus(Preisstatus value) { this.preisstatus = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

}
