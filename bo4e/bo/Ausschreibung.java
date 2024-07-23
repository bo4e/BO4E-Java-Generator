package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.enums.Ausschreibungsportal;
import bo4e.enums.Ausschreibungsstatus;
import bo4e.enums.Ausschreibungstyp;
import bo4e.com.Zeitraum;
import bo4e.com.Ausschreibungslos;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Das BO Ausschreibung dient zur detaillierten Darstellung von ausgeschriebenen
 * Energiemengen in der Energiewirtschaft
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Ausschreibung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Ausschreibung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Ausschreibung.json>`_
 */
public class Ausschreibung extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.AUSSCHREIBUNG;
    /**
     * bindefrist: Optional["Zeitraum"] = None
     */
    private Zeitraum abgabefrist;
    /**
     * abgabefrist: Optional["Zeitraum"] = None
     */
    private Geschaeftspartner ausschreibender;
    /**
     * Aufzählung der unterstützten Ausschreibungsportale
     */
    private Ausschreibungsportal ausschreibungportal;
    /**
     * Vom Herausgeber der Ausschreibung vergebene eindeutige Nummer
     */
    private String ausschreibungsnummer;
    /**
     * Bezeichnungen für die Ausschreibungsphasen
     */
    private Ausschreibungsstatus ausschreibungsstatus;
    /**
     * Aufzählung für die Typisierung von Ausschreibungen
     */
    private Ausschreibungstyp ausschreibungstyp;
    /**
     * Die einzelnen Lose, aus denen sich die Ausschreibung zusammensetzt
     */
    private Zeitraum bindefrist;
    /**
     * Kennzeichen, ob die Ausschreibung kostenpflichtig ist
     */
    private Boolean istKostenpflichtig;
    /**
     * Die einzelnen Lose, aus denen sich die Ausschreibung zusammensetzt
     */
    private List<Ausschreibungslos> lose;
    /**
     * Gibt den Veröffentlichungszeitpunkt der Ausschreibung an
     */
    private OffsetDateTime veroeffentlichungszeitpunkt;
    /**
     * Internetseite, auf der die Ausschreibung veröffentlicht wurde (falls vorhanden)
     */
    private String webseite;

    public Zeitraum getAbgabefrist() {
        return Abgabefrist;
    }
    public void setAbgabefrist(Zeitraum abgabefrist) {
        this.abgabefrist = abgabefrist;
    }

    public Geschaeftspartner getAusschreibender() {
        return Ausschreibender;
    }
    public void setAusschreibender(Geschaeftspartner ausschreibender) {
        this.ausschreibender = ausschreibender;
    }

    public Ausschreibungsportal getAusschreibungportal() {
        return Ausschreibungportal;
    }
    public void setAusschreibungportal(Ausschreibungsportal ausschreibungportal) {
        this.ausschreibungportal = ausschreibungportal;
    }

    public String getAusschreibungsnummer() {
        return Ausschreibungsnummer;
    }
    public void setAusschreibungsnummer(String ausschreibungsnummer) {
        this.ausschreibungsnummer = ausschreibungsnummer;
    }

    public Ausschreibungsstatus getAusschreibungsstatus() {
        return Ausschreibungsstatus;
    }
    public void setAusschreibungsstatus(Ausschreibungsstatus ausschreibungsstatus) {
        this.ausschreibungsstatus = ausschreibungsstatus;
    }

    public Ausschreibungstyp getAusschreibungstyp() {
        return Ausschreibungstyp;
    }
    public void setAusschreibungstyp(Ausschreibungstyp ausschreibungstyp) {
        this.ausschreibungstyp = ausschreibungstyp;
    }

    public Zeitraum getBindefrist() {
        return Bindefrist;
    }
    public void setBindefrist(Zeitraum bindefrist) {
        this.bindefrist = bindefrist;
    }

    public Boolean getIstKostenpflichtig() {
        return IstKostenpflichtig;
    }
    public void setIstKostenpflichtig(Boolean istKostenpflichtig) {
        this.istKostenpflichtig = istKostenpflichtig;
    }

    public List<Ausschreibungslos> getLose() {
        return Lose;
    }
    public void setLose(List<Ausschreibungslos> lose) {
        this.lose = lose;
    }

    public OffsetDateTime getVeroeffentlichungszeitpunkt() {
        return Veroeffentlichungszeitpunkt;
    }
    public void setVeroeffentlichungszeitpunkt(OffsetDateTime veroeffentlichungszeitpunkt) {
        this.veroeffentlichungszeitpunkt = veroeffentlichungszeitpunkt;
    }

    public String getWebseite() {
        return Webseite;
    }
    public void setWebseite(String webseite) {
        this.webseite = webseite;
    }
}