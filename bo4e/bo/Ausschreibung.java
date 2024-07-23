package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.enums.Ausschreibungsportal;
import bo4e.enums.Ausschreibungsstatus;
import bo4e.enums.Ausschreibungstyp;
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
    private final Typ typ = Typ.AUSSCHREIBUNG;
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

    public Ausschreibung() {
    }

    private Ausschreibung(AusschreibungBuilder builder) {
        super(builder);
        this.abgabefrist = builder.abgabefrist;
        this.ausschreibender = builder.ausschreibender;
        this.ausschreibungportal = builder.ausschreibungportal;
        this.ausschreibungsnummer = builder.ausschreibungsnummer;
        this.ausschreibungsstatus = builder.ausschreibungsstatus;
        this.ausschreibungstyp = builder.ausschreibungstyp;
        this.bindefrist = builder.bindefrist;
        this.istKostenpflichtig = builder.istKostenpflichtig;
        this.lose = builder.lose;
        this.veroeffentlichungszeitpunkt = builder.veroeffentlichungszeitpunkt;
        this.webseite = builder.webseite;
    }

    public Typ getTyp() {
        return typ;
    }

    public Zeitraum getAbgabefrist() {
        return abgabefrist;
    }

    public void setAbgabefrist(Zeitraum abgabefrist) {
        this.abgabefrist = abgabefrist;
    }

    public Geschaeftspartner getAusschreibender() {
        return ausschreibender;
    }

    public void setAusschreibender(Geschaeftspartner ausschreibender) {
        this.ausschreibender = ausschreibender;
    }

    public Ausschreibungsportal getAusschreibungportal() {
        return ausschreibungportal;
    }

    public void setAusschreibungportal(Ausschreibungsportal ausschreibungportal) {
        this.ausschreibungportal = ausschreibungportal;
    }

    public String getAusschreibungsnummer() {
        return ausschreibungsnummer;
    }

    public void setAusschreibungsnummer(String ausschreibungsnummer) {
        this.ausschreibungsnummer = ausschreibungsnummer;
    }

    public Ausschreibungsstatus getAusschreibungsstatus() {
        return ausschreibungsstatus;
    }

    public void setAusschreibungsstatus(Ausschreibungsstatus ausschreibungsstatus) {
        this.ausschreibungsstatus = ausschreibungsstatus;
    }

    public Ausschreibungstyp getAusschreibungstyp() {
        return ausschreibungstyp;
    }

    public void setAusschreibungstyp(Ausschreibungstyp ausschreibungstyp) {
        this.ausschreibungstyp = ausschreibungstyp;
    }

    public Zeitraum getBindefrist() {
        return bindefrist;
    }

    public void setBindefrist(Zeitraum bindefrist) {
        this.bindefrist = bindefrist;
    }

    public Boolean getIstKostenpflichtig() {
        return istKostenpflichtig;
    }

    public void setIstKostenpflichtig(Boolean istKostenpflichtig) {
        this.istKostenpflichtig = istKostenpflichtig;
    }

    public List<Ausschreibungslos> getLose() {
        return lose;
    }

    public void setLose(List<Ausschreibungslos> lose) {
        this.lose = lose;
    }

    public OffsetDateTime getVeroeffentlichungszeitpunkt() {
        return veroeffentlichungszeitpunkt;
    }

    public void setVeroeffentlichungszeitpunkt(OffsetDateTime veroeffentlichungszeitpunkt) {
        this.veroeffentlichungszeitpunkt = veroeffentlichungszeitpunkt;
    }

    public String getWebseite() {
        return webseite;
    }

    public void setWebseite(String webseite) {
        this.webseite = webseite;
    }

    public static class AusschreibungBuilder extends GeschaeftsobjektBuilder {
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
            return abgabefrist;
        }
    
        public AusschreibungBuilder setAbgabefrist(Zeitraum abgabefrist) {
            this.abgabefrist = abgabefrist;
            return this;
        }
    
        public Geschaeftspartner getAusschreibender() {
            return ausschreibender;
        }
    
        public AusschreibungBuilder setAusschreibender(Geschaeftspartner ausschreibender) {
            this.ausschreibender = ausschreibender;
            return this;
        }
    
        public Ausschreibungsportal getAusschreibungportal() {
            return ausschreibungportal;
        }
    
        public AusschreibungBuilder setAusschreibungportal(Ausschreibungsportal ausschreibungportal) {
            this.ausschreibungportal = ausschreibungportal;
            return this;
        }
    
        public String getAusschreibungsnummer() {
            return ausschreibungsnummer;
        }
    
        public AusschreibungBuilder setAusschreibungsnummer(String ausschreibungsnummer) {
            this.ausschreibungsnummer = ausschreibungsnummer;
            return this;
        }
    
        public Ausschreibungsstatus getAusschreibungsstatus() {
            return ausschreibungsstatus;
        }
    
        public AusschreibungBuilder setAusschreibungsstatus(Ausschreibungsstatus ausschreibungsstatus) {
            this.ausschreibungsstatus = ausschreibungsstatus;
            return this;
        }
    
        public Ausschreibungstyp getAusschreibungstyp() {
            return ausschreibungstyp;
        }
    
        public AusschreibungBuilder setAusschreibungstyp(Ausschreibungstyp ausschreibungstyp) {
            this.ausschreibungstyp = ausschreibungstyp;
            return this;
        }
    
        public Zeitraum getBindefrist() {
            return bindefrist;
        }
    
        public AusschreibungBuilder setBindefrist(Zeitraum bindefrist) {
            this.bindefrist = bindefrist;
            return this;
        }
    
        public Boolean getIstKostenpflichtig() {
            return istKostenpflichtig;
        }
    
        public AusschreibungBuilder setIstKostenpflichtig(Boolean istKostenpflichtig) {
            this.istKostenpflichtig = istKostenpflichtig;
            return this;
        }
    
        public List<Ausschreibungslos> getLose() {
            return lose;
        }
    
        public AusschreibungBuilder setLose(List<Ausschreibungslos> lose) {
            this.lose = lose;
            return this;
        }
    
        public OffsetDateTime getVeroeffentlichungszeitpunkt() {
            return veroeffentlichungszeitpunkt;
        }
    
        public AusschreibungBuilder setVeroeffentlichungszeitpunkt(OffsetDateTime veroeffentlichungszeitpunkt) {
            this.veroeffentlichungszeitpunkt = veroeffentlichungszeitpunkt;
            return this;
        }
    
        public String getWebseite() {
            return webseite;
        }
    
        public AusschreibungBuilder setWebseite(String webseite) {
            this.webseite = webseite;
            return this;
        }
    
        public Ausschreibung build() {
            return new Ausschreibung(this);
        }
    }
}