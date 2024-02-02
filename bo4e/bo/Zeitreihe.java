package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Mengeneinheit;
import com.example.bo4e.enums.Medium;
import com.example.bo4e.enums.Messart;
import com.example.bo4e.enums.Messgroesse;
import com.example.bo4e.com.Zeitreihenwert;
import com.example.bo4e.enums.Wertermittlungsverfahren;

/**
 * Abbildung einer allgemeinen Zeitreihe mit einem Wertvektor.
 * Die Werte können mit wahlfreier zeitlicher Distanz im Vektor abgelegt sein.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Zeitreihe.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitreihe JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Zeitreihe.json>`_
 */
public class Zeitreihe extends Geschaeftsobjekt {
    private final Typ typ = Typ.ZEITREIHE;
    private String beschreibung;
    private String bezeichnung;
    private Mengeneinheit einheit;
    private Medium medium;
    private Messart messart;
    private Messgroesse messgroesse;
    private String version;
    private Zeitreihenwert[] werte;
    private Wertermittlungsverfahren wertherkunft;

    public Typ getTyp() { return typ; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    public Medium getMedium() { return medium; }
    public void setMedium(Medium value) { this.medium = value; }

    public Messart getMessart() { return messart; }
    public void setMessart(Messart value) { this.messart = value; }

    public Messgroesse getMessgroesse() { return messgroesse; }
    public void setMessgroesse(Messgroesse value) { this.messgroesse = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public Zeitreihenwert[] getWerte() { return werte; }
    public void setWerte(Zeitreihenwert[] value) { this.werte = value; }

    public Wertermittlungsverfahren getWertherkunft() { return wertherkunft; }
    public void setWertherkunft(Wertermittlungsverfahren value) { this.wertherkunft = value; }

}
