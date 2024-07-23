package bo4e.com;

import bo4e.enums.Angebotsstatus;

import java.time.OffsetDateTime;
import java.util.List;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Angebotsvariante.json>`_
 */
public class Angebotsvariante extends COM {
    /**
     * Gibt den Status eines Angebotes an.
     */
    private Angebotsstatus angebotsstatus;
    /**
     * Bis zu diesem Zeitpunkt gilt die Angebotsvariante
     */
    private OffsetDateTime bindefrist;
    /**
     * Datum der Erstellung der Angebotsvariante
     */
    private OffsetDateTime erstellungsdatum;
    /**
     * Aufsummierte Kosten aller Angebotsteile
     */
    private Betrag gesamtkosten;
    /**
     * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
     */
    private Menge gesamtmenge;
    /**
     * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
     */
    private List<Angebotsteil> teile;

    public Angebotsstatus getAngebotsstatus() {
        return Angebotsstatus;
    }
    public void setAngebotsstatus(Angebotsstatus angebotsstatus) {
        this.angebotsstatus = angebotsstatus;
    }

    public OffsetDateTime getBindefrist() {
        return Bindefrist;
    }
    public void setBindefrist(OffsetDateTime bindefrist) {
        this.bindefrist = bindefrist;
    }

    public OffsetDateTime getErstellungsdatum() {
        return Erstellungsdatum;
    }
    public void setErstellungsdatum(OffsetDateTime erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }

    public Betrag getGesamtkosten() {
        return Gesamtkosten;
    }
    public void setGesamtkosten(Betrag gesamtkosten) {
        this.gesamtkosten = gesamtkosten;
    }

    public Menge getGesamtmenge() {
        return Gesamtmenge;
    }
    public void setGesamtmenge(Menge gesamtmenge) {
        this.gesamtmenge = gesamtmenge;
    }

    public List<Angebotsteil> getTeile() {
        return Teile;
    }
    public void setTeile(List<Angebotsteil> teile) {
        this.teile = teile;
    }
}