package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Mengeneinheit;
import com.example.bo4e.enums.Sparte;
import com.example.bo4e.com.Zeitreihenwert;
import com.example.bo4e.com.Menge;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Lastgang.json>`_
 */
public class Lastgang extends Geschaeftsobjekt {
    private final Typ typ = Typ.LASTGANG;
    private Marktlokation marktlokation;
    private Mengeneinheit messgroesse;
    private Messlokation messlokation;
    private String obisKennzahl;
    private Sparte sparte;
    private String version;
    private Zeitreihenwert[] werte;
    private Menge zeitIntervallLaenge;

    public Typ getTyp() { return typ; }

    public Marktlokation getMarktlokation() { return marktlokation; }
    public void setMarktlokation(Marktlokation value) { this.marktlokation = value; }

    public Mengeneinheit getMessgroesse() { return messgroesse; }
    public void setMessgroesse(Mengeneinheit value) { this.messgroesse = value; }

    public Messlokation getMesslokation() { return messlokation; }
    public void setMesslokation(Messlokation value) { this.messlokation = value; }

    public String getObisKennzahl() { return obisKennzahl; }
    public void setObisKennzahl(String value) { this.obisKennzahl = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public Zeitreihenwert[] getWerte() { return werte; }
    public void setWerte(Zeitreihenwert[] value) { this.werte = value; }

    public Menge getZeitIntervallLaenge() { return zeitIntervallLaenge; }
    public void setZeitIntervallLaenge(Menge value) { this.zeitIntervallLaenge = value; }

}
