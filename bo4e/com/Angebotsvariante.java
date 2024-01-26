package bo4e.com;

import com.example.bo4e.enums.Angebotsstatus;
import java.time.OffsetDateTime;

/**
 * Führt die verschiedenen Ausprägungen der Angebotsberechnung auf
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Angebotsvariante.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebotsvariante JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Angebotsvariante.json>`_
 */
public class Angebotsvariante extends COM {
    private Angebotsstatus angebotsstatus;
    private OffsetDateTime bindefrist;
    private OffsetDateTime erstellungsdatum;
    private Betrag gesamtkosten;
    private Menge gesamtmenge;
    private Angebotsteil[] teile;

    public Angebotsstatus getAngebotsstatus() { return angebotsstatus; }
    public void setAngebotsstatus(Angebotsstatus value) { this.angebotsstatus = value; }

    public OffsetDateTime getBindefrist() { return bindefrist; }
    public void setBindefrist(OffsetDateTime value) { this.bindefrist = value; }

    public OffsetDateTime getErstellungsdatum() { return erstellungsdatum; }
    public void setErstellungsdatum(OffsetDateTime value) { this.erstellungsdatum = value; }

    public Betrag getGesamtkosten() { return gesamtkosten; }
    public void setGesamtkosten(Betrag value) { this.gesamtkosten = value; }

    public Menge getGesamtmenge() { return gesamtmenge; }
    public void setGesamtmenge(Menge value) { this.gesamtmenge = value; }

    public Angebotsteil[] getTeile() { return teile; }
    public void setTeile(Angebotsteil[] value) { this.teile = value; }

}
