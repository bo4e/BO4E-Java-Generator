package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Zeitraum;
import com.example.bo4e.enums.Ausschreibungsportal;
import com.example.bo4e.enums.Ausschreibungsstatus;
import com.example.bo4e.enums.Ausschreibungstyp;
import com.example.bo4e.com.Ausschreibungslos;
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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Ausschreibung.json>`_
 */
public class Ausschreibung extends Geschaeftsobjekt {
    private final Typ typ = Typ.AUSSCHREIUNG;
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

    public Typ getTyp() { return typ; }

    public Zeitraum getAbgabefrist() { return abgabefrist; }
    public void setAbgabefrist(Zeitraum value) { this.abgabefrist = value; }

    public Geschaeftspartner getAusschreibender() { return ausschreibender; }
    public void setAusschreibender(Geschaeftspartner value) { this.ausschreibender = value; }

    public Ausschreibungsportal getAusschreibungportal() { return ausschreibungportal; }
    public void setAusschreibungportal(Ausschreibungsportal value) { this.ausschreibungportal = value; }

    public String getAusschreibungsnummer() { return ausschreibungsnummer; }
    public void setAusschreibungsnummer(String value) { this.ausschreibungsnummer = value; }

    public Ausschreibungsstatus getAusschreibungsstatus() { return ausschreibungsstatus; }
    public void setAusschreibungsstatus(Ausschreibungsstatus value) { this.ausschreibungsstatus = value; }

    public Ausschreibungstyp getAusschreibungstyp() { return ausschreibungstyp; }
    public void setAusschreibungstyp(Ausschreibungstyp value) { this.ausschreibungstyp = value; }

    public Zeitraum getBindefrist() { return bindefrist; }
    public void setBindefrist(Zeitraum value) { this.bindefrist = value; }

    public Boolean getIstKostenpflichtig() { return istKostenpflichtig; }
    public void setIstKostenpflichtig(Boolean value) { this.istKostenpflichtig = value; }

    public Ausschreibungslos[] getLose() { return lose; }
    public void setLose(Ausschreibungslos[] value) { this.lose = value; }

    public OffsetDateTime getVeroeffentlichungszeitpunkt() { return veroeffentlichungszeitpunkt; }
    public void setVeroeffentlichungszeitpunkt(OffsetDateTime value) { this.veroeffentlichungszeitpunkt = value; }

    public String getWebseite() { return webseite; }
    public void setWebseite(String value) { this.webseite = value; }

}
