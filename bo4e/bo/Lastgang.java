package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Sparte;
import bo4e.com.Zeitreihenwert;
import bo4e.com.Menge;

import java.util.List;

/**
 * Modell zur Abbildung eines Lastganges;
 * In diesem Modell werden die Messwerte mit einem vollständigen Zeitintervall
 * (zeit_intervall_laenge) angegeben und es bietet daher eine hohe Flexibilität in der
 * Übertragung jeglicher zeitlich veränderlicher Messgrössen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Lastgang.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Lastgang JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Lastgang.json>`_
 */
public class Lastgang extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.LASTGANG;
    /**
     * Marktlokation, zu der der Lastgang gehört
     */
    private Marktlokation marktlokation;
    /**
     * Definition der gemessenen Größe anhand ihrer Einheit
     */
    private Mengeneinheit messgroesse;
    /**
     * Marktlokation, zu der der Lastgang gehört
     */
    private Messlokation messlokation;
    /**
     * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
     * z.B. '1-0:1.8.1'
     */
    private String obisKennzahl;
    /**
     * Angabe, ob es sich um einen Gas- oder Stromlastgang handelt
     */
    private Sparte sparte;
    /**
     * Versionsnummer des Lastgangs
     */
    private String version;
    /**
     * Die im Lastgang enthaltenen Messwerte
     */
    private List<Zeitreihenwert> werte;
    private Menge zeitIntervallLaenge;

    public Marktlokation getMarktlokation() {
        return Marktlokation;
    }
    public void setMarktlokation(Marktlokation marktlokation) {
        this.marktlokation = marktlokation;
    }

    public Mengeneinheit getMessgroesse() {
        return Messgroesse;
    }
    public void setMessgroesse(Mengeneinheit messgroesse) {
        this.messgroesse = messgroesse;
    }

    public Messlokation getMesslokation() {
        return Messlokation;
    }
    public void setMesslokation(Messlokation messlokation) {
        this.messlokation = messlokation;
    }

    public String getObisKennzahl() {
        return ObisKennzahl;
    }
    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    public Sparte getSparte() {
        return Sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public String getVersion() {
        return Version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public List<Zeitreihenwert> getWerte() {
        return Werte;
    }
    public void setWerte(List<Zeitreihenwert> werte) {
        this.werte = werte;
    }

    public Menge getZeitIntervallLaenge() {
        return ZeitIntervallLaenge;
    }
    public void setZeitIntervallLaenge(Menge zeitIntervallLaenge) {
        this.zeitIntervallLaenge = zeitIntervallLaenge;
    }
}