package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.enums.Ausschreibungsportal;
import bo4e.enums.Ausschreibungsstatus;
import bo4e.enums.Ausschreibungstyp;
import bo4e.com.Ausschreibungslos;
import java.time.OffsetDateTime;

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
    private final Typ _typ = Typ.AUSSCHREIBUNG;
    private Zeitraum abgabefrist;
    private Geschaeftspartner ausschreibender;
    private Ausschreibungsportal ausschreibungportal;
    private String ausschreibungsnummer;
    private Ausschreibungsstatus ausschreibungsstatus;
    private Ausschreibungstyp ausschreibungstyp;
    private Zeitraum bindefrist;
    private Boolean istKostenpflichtig;
    private Ausschreibungslos[] lose;
    private OffsetDateTime veroeffentlichungszeitpunkt;
    private String webseite;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Vom Herausgeber der Ausschreibung vergebene eindeutige Nummer
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * bindefrist: Optional["Zeitraum"] = None
     */
    public Zeitraum getAbgabefrist() { return abgabefrist; }
    public void setAbgabefrist(Zeitraum value) { this.abgabefrist = value; }

    /**
     * abgabefrist: Optional["Zeitraum"] = None
     */
    public Geschaeftspartner getAusschreibender() { return ausschreibender; }
    public void setAusschreibender(Geschaeftspartner value) { this.ausschreibender = value; }

    /**
     * Aufzählung der unterstützten Ausschreibungsportale
     */
    public Ausschreibungsportal getAusschreibungportal() { return ausschreibungportal; }
    public void setAusschreibungportal(Ausschreibungsportal value) { this.ausschreibungportal = value; }

    /**
     * Vom Herausgeber der Ausschreibung vergebene eindeutige Nummer
     */
    public String getAusschreibungsnummer() { return ausschreibungsnummer; }
    public void setAusschreibungsnummer(String value) { this.ausschreibungsnummer = value; }

    /**
     * Bezeichnungen für die Ausschreibungsphasen
     */
    public Ausschreibungsstatus getAusschreibungsstatus() { return ausschreibungsstatus; }
    public void setAusschreibungsstatus(Ausschreibungsstatus value) { this.ausschreibungsstatus = value; }

    /**
     * Aufzählung für die Typisierung von Ausschreibungen
     */
    public Ausschreibungstyp getAusschreibungstyp() { return ausschreibungstyp; }
    public void setAusschreibungstyp(Ausschreibungstyp value) { this.ausschreibungstyp = value; }

    /**
     * Die einzelnen Lose, aus denen sich die Ausschreibung zusammensetzt
     */
    public Zeitraum getBindefrist() { return bindefrist; }
    public void setBindefrist(Zeitraum value) { this.bindefrist = value; }

    /**
     * Kennzeichen, ob die Ausschreibung kostenpflichtig ist
     */
    public Boolean getIstKostenpflichtig() { return istKostenpflichtig; }
    public void setIstKostenpflichtig(Boolean value) { this.istKostenpflichtig = value; }

    /**
     * Die einzelnen Lose, aus denen sich die Ausschreibung zusammensetzt
     */
    public Ausschreibungslos[] getLose() { return lose; }
    public void setLose(Ausschreibungslos[] value) { this.lose = value; }

    /**
     * Gibt den Veröffentlichungszeitpunkt der Ausschreibung an
     */
    public OffsetDateTime getVeroeffentlichungszeitpunkt() { return veroeffentlichungszeitpunkt; }
    public void setVeroeffentlichungszeitpunkt(OffsetDateTime value) { this.veroeffentlichungszeitpunkt = value; }

    /**
     * Internetseite, auf der die Ausschreibung veröffentlicht wurde (falls vorhanden)
     */
    public String getWebseite() { return webseite; }
    public void setWebseite(String value) { this.webseite = value; }

}
