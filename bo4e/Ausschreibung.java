package placeholder;

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
public class Ausschreibung {
    private String id;
    private Typ typ;
    private String version;
    private Zeitraum abgabefrist;
    private Geschaeftspartner ausschreibender;
    private Ausschreibungsportal ausschreibungportal;
    private String ausschreibungsnummer;
    private Ausschreibungsstatus ausschreibungsstatus;
    private Ausschreibungstyp ausschreibungstyp;
    private Zeitraum bindefrist;
    private Boolean istKostenpflichtig;
    private List<Ausschreibungslos> lose;
    private OffsetDateTime veroeffentlichungszeitpunkt;
    private String webseite;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Vom Herausgeber der Ausschreibung vergebene eindeutige Nummer
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

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
    public List<Ausschreibungslos> getLose() { return lose; }
    public void setLose(List<Ausschreibungslos> value) { this.lose = value; }

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

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
