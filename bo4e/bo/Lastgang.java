package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Sparte;
import bo4e.com.Zeitreihenwert;
import bo4e.com.Menge;

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
    private final Typ _typ = Typ.LASTGANG;
    private Marktlokation marktlokation;
    private Mengeneinheit messgroesse;
    private Messlokation messlokation;
    private String obisKennzahl;
    private Sparte sparte;
    private String version;
    private Zeitreihenwert[] werte;
    private Menge zeitIntervallLaenge;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Angabe, ob es sich um einen Gas- oder Stromlastgang handelt
     */
    public Typ getTyp() { return _typ; }

    /**
     * Marktlokation, zu der der Lastgang gehört
     */
    public Marktlokation getMarktlokation() { return marktlokation; }
    public void setMarktlokation(Marktlokation value) { this.marktlokation = value; }

    /**
     * Definition der gemessenen Größe anhand ihrer Einheit
     */
    public Mengeneinheit getMessgroesse() { return messgroesse; }
    public void setMessgroesse(Mengeneinheit value) { this.messgroesse = value; }

    /**
     * Marktlokation, zu der der Lastgang gehört
     */
    public Messlokation getMesslokation() { return messlokation; }
    public void setMesslokation(Messlokation value) { this.messlokation = value; }

    /**
     * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
     * z.B. '1-0:1.8.1'
     */
    public String getObisKennzahl() { return obisKennzahl; }
    public void setObisKennzahl(String value) { this.obisKennzahl = value; }

    /**
     * Angabe, ob es sich um einen Gas- oder Stromlastgang handelt
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    /**
     * Versionsnummer des Lastgangs
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Die im Lastgang enthaltenen Messwerte
     */
    public Zeitreihenwert[] getWerte() { return werte; }
    public void setWerte(Zeitreihenwert[] value) { this.werte = value; }

    public Menge getZeitIntervallLaenge() { return zeitIntervallLaenge; }
    public void setZeitIntervallLaenge(Menge value) { this.zeitIntervallLaenge = value; }

}
