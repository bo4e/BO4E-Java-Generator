package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Sparte;
import bo4e.com.Unterschrift;
import bo4e.com.Unterschrift;
import bo4e.enums.Vertragsart;
import bo4e.com.Vertragskonditionen;
import bo4e.enums.Vertragsstatus;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Abbildung eines Bündelvertrags.
 * Es handelt sich hierbei um eine Liste von Einzelverträgen, die in einem Vertragsobjekt
 * gebündelt sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Buendelvertrag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Buendelvertrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Buendelvertrag.json>`_
 */
public class Buendelvertrag extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.BUENDELVERTRAG;
    /**
     * Beschreibung zum Vertrag
     */
    private String beschreibung;
    /**
     * Die Liste mit den Einzelverträgen zu den Abnahmestellen
     */
    private List<Vertrag> einzelvertraege;
    /**
     * Unterscheidungsmöglichkeiten für die Sparte
     */
    private Sparte sparte;
    /**
     * Unterzeichner des Vertragspartners1
     */
    private List<Unterschrift> unterzeichnervp1;
    /**
     * Unterzeichner des Vertragspartners2
     */
    private List<Unterschrift> unterzeichnervp2;
    /**
     * Hier ist festgelegt, um welche Art von Vertrag es sich handelt. Z.B. Netznutzungvertrag
     */
    private Vertragsart vertragsart;
    /**
     * Gibt an, wann der Vertrag beginnt (inklusiv)
     */
    private OffsetDateTime vertragsbeginn;
    /**
     * Gibt an, wann der Vertrag (voraussichtlich) endet oder beendet wurde (exklusiv)
     */
    private OffsetDateTime vertragsende;
    /**
     * Festlegungen zu Laufzeiten und Kündigungsfristen
     */
    private List<Vertragskonditionen> vertragskonditionen;
    /**
     * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
     */
    private String vertragsnummer;
    /**
     * Beispiel: "Vertrag zwischen Vertagspartner 1 ..."
     */
    private Geschaeftspartner vertragspartner1;
    /**
     * Beispiel "Vertrag zwischen Vertagspartner 1 und Vertragspartner 2"
     */
    private Geschaeftspartner vertragspartner2;
    /**
     * Gibt den Status des Vertrages an
     */
    private Vertragsstatus vertragsstatus;

    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public List<Vertrag> getEinzelvertraege() {
        return einzelvertraege;
    }
    public void setEinzelvertraege(List<Vertrag> einzelvertraege) {
        this.einzelvertraege = einzelvertraege;
    }

    public Sparte getSparte() {
        return sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public List<Unterschrift> getUnterzeichnervp1() {
        return unterzeichnervp1;
    }
    public void setUnterzeichnervp1(List<Unterschrift> unterzeichnervp1) {
        this.unterzeichnervp1 = unterzeichnervp1;
    }

    public List<Unterschrift> getUnterzeichnervp2() {
        return unterzeichnervp2;
    }
    public void setUnterzeichnervp2(List<Unterschrift> unterzeichnervp2) {
        this.unterzeichnervp2 = unterzeichnervp2;
    }

    public Vertragsart getVertragsart() {
        return vertragsart;
    }
    public void setVertragsart(Vertragsart vertragsart) {
        this.vertragsart = vertragsart;
    }

    public OffsetDateTime getVertragsbeginn() {
        return vertragsbeginn;
    }
    public void setVertragsbeginn(OffsetDateTime vertragsbeginn) {
        this.vertragsbeginn = vertragsbeginn;
    }

    public OffsetDateTime getVertragsende() {
        return vertragsende;
    }
    public void setVertragsende(OffsetDateTime vertragsende) {
        this.vertragsende = vertragsende;
    }

    public List<Vertragskonditionen> getVertragskonditionen() {
        return vertragskonditionen;
    }
    public void setVertragskonditionen(List<Vertragskonditionen> vertragskonditionen) {
        this.vertragskonditionen = vertragskonditionen;
    }

    public String getVertragsnummer() {
        return vertragsnummer;
    }
    public void setVertragsnummer(String vertragsnummer) {
        this.vertragsnummer = vertragsnummer;
    }

    public Geschaeftspartner getVertragspartner1() {
        return vertragspartner1;
    }
    public void setVertragspartner1(Geschaeftspartner vertragspartner1) {
        this.vertragspartner1 = vertragspartner1;
    }

    public Geschaeftspartner getVertragspartner2() {
        return vertragspartner2;
    }
    public void setVertragspartner2(Geschaeftspartner vertragspartner2) {
        this.vertragspartner2 = vertragspartner2;
    }

    public Vertragsstatus getVertragsstatus() {
        return vertragsstatus;
    }
    public void setVertragsstatus(Vertragsstatus vertragsstatus) {
        this.vertragsstatus = vertragsstatus;
    }
}