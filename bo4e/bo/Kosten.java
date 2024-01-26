package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Zeitraum;
import com.example.bo4e.com.Kostenblock;
import com.example.bo4e.enums.Kostenklasse;
import com.example.bo4e.com.Betrag;

/**
 * Dieses BO wird zur Übertagung von hierarchischen Kostenstrukturen verwendet.
 * Die Kosten werden dabei in Kostenblöcke und diese wiederum in Kostenpositionen
 * strukturiert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Kosten.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kosten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Kosten.json>`_
 */
public class Kosten extends Geschaeftsobjekt {
    private final Typ typ = Typ.KOSTEN;
    private Zeitraum gueltigkeit;
    private Kostenblock[] kostenbloecke;
    private Kostenklasse kostenklasse;
    private Betrag[] summeKosten;

    public Typ getTyp() { return typ; }

    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    public Kostenblock[] getKostenbloecke() { return kostenbloecke; }
    public void setKostenbloecke(Kostenblock[] value) { this.kostenbloecke = value; }

    public Kostenklasse getKostenklasse() { return kostenklasse; }
    public void setKostenklasse(Kostenklasse value) { this.kostenklasse = value; }

    public Betrag[] getSummeKosten() { return summeKosten; }
    public void setSummeKosten(Betrag[] value) { this.summeKosten = value; }

}
