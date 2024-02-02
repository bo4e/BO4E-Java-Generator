package com.example.bo4e.com;

import com.example.bo4e.enums.Landescode;

/**
 * Contains an address that can be used for most purposes.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Adresse.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Adresse JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Adresse.json>`_
 */
public class Adresse extends COM {
    private String adresszusatz;
    private String coErgaenzung;
    private String hausnummer;
    private Landescode landescode;
    private String ort;
    private String ortsteil;
    private String postfach;
    private String postleitzahl;
    private String strasse;

    public String getAdresszusatz() { return adresszusatz; }
    public void setAdresszusatz(String value) { this.adresszusatz = value; }

    public String getCoErgaenzung() { return coErgaenzung; }
    public void setCoErgaenzung(String value) { this.coErgaenzung = value; }

    public String getHausnummer() { return hausnummer; }
    public void setHausnummer(String value) { this.hausnummer = value; }

    public Landescode getLandescode() { return landescode; }
    public void setLandescode(Landescode value) { this.landescode = value; }

    public String getOrt() { return ort; }
    public void setOrt(String value) { this.ort = value; }

    public String getOrtsteil() { return ortsteil; }
    public void setOrtsteil(String value) { this.ortsteil = value; }

    public String getPostfach() { return postfach; }
    public void setPostfach(String value) { this.postfach = value; }

    public String getPostleitzahl() { return postleitzahl; }
    public void setPostleitzahl(String value) { this.postleitzahl = value; }

    public String getStrasse() { return strasse; }
    public void setStrasse(String value) { this.strasse = value; }

}
