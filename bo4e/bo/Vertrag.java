package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Sparte;
import com.example.bo4e.com.Unterschrift;
import com.example.bo4e.enums.Vertragsart;
import com.example.bo4e.com.Vertragskonditionen;
import com.example.bo4e.enums.Vertragsstatus;
import com.example.bo4e.com.Vertragsteil;
import java.time.OffsetDateTime;

/**
 * Modell für die Abbildung von Vertragsbeziehungen;
 * Das Objekt dient dazu, alle Arten von Verträgen, die in der Energiewirtschaft Verwendung
 * finden, abzubilden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Vertrag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Vertrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Vertrag.json>`_
 */
public class Vertrag extends Geschaeftsobjekt {
    private final Typ typ = Typ.VERTRAG;
    private String beschreibung;
    private Sparte sparte;
    private Unterschrift[] unterzeichnervp1;
    private Unterschrift[] unterzeichnervp2;
    private Vertragsart vertragsart;
    private OffsetDateTime vertragsbeginn;
    private OffsetDateTime vertragsende;
    private Vertragskonditionen vertragskonditionen;
    private String vertragsnummer;
    private Geschaeftspartner vertragspartner1;
    private Geschaeftspartner vertragspartner2;
    private Vertragsstatus vertragsstatus;
    private Vertragsteil[] vertragsteile;

    public Typ getTyp() { return typ; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public Unterschrift[] getUnterzeichnervp1() { return unterzeichnervp1; }
    public void setUnterzeichnervp1(Unterschrift[] value) { this.unterzeichnervp1 = value; }

    public Unterschrift[] getUnterzeichnervp2() { return unterzeichnervp2; }
    public void setUnterzeichnervp2(Unterschrift[] value) { this.unterzeichnervp2 = value; }

    public Vertragsart getVertragsart() { return vertragsart; }
    public void setVertragsart(Vertragsart value) { this.vertragsart = value; }

    public OffsetDateTime getVertragsbeginn() { return vertragsbeginn; }
    public void setVertragsbeginn(OffsetDateTime value) { this.vertragsbeginn = value; }

    public OffsetDateTime getVertragsende() { return vertragsende; }
    public void setVertragsende(OffsetDateTime value) { this.vertragsende = value; }

    public Vertragskonditionen getVertragskonditionen() { return vertragskonditionen; }
    public void setVertragskonditionen(Vertragskonditionen value) { this.vertragskonditionen = value; }

    public String getVertragsnummer() { return vertragsnummer; }
    public void setVertragsnummer(String value) { this.vertragsnummer = value; }

    public Geschaeftspartner getVertragspartner1() { return vertragspartner1; }
    public void setVertragspartner1(Geschaeftspartner value) { this.vertragspartner1 = value; }

    public Geschaeftspartner getVertragspartner2() { return vertragspartner2; }
    public void setVertragspartner2(Geschaeftspartner value) { this.vertragspartner2 = value; }

    public Vertragsstatus getVertragsstatus() { return vertragsstatus; }
    public void setVertragsstatus(Vertragsstatus value) { this.vertragsstatus = value; }

    public Vertragsteil[] getVertragsteile() { return vertragsteile; }
    public void setVertragsteile(Vertragsteil[] value) { this.vertragsteile = value; }

}
