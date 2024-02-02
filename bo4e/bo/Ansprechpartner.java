package com.example.bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Adresse;
import com.example.bo4e.enums.Anrede;
import com.example.bo4e.com.Rufnummer;
import com.example.bo4e.enums.Titel;
import com.example.bo4e.com.Zustaendigkeit;

/**
 * Object containing information about a Ansprechpartner
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Ansprechpartner.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Ansprechpartner JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Ansprechpartner.json>`_
 */
public class Ansprechpartner extends Geschaeftsobjekt {
    private final Typ typ = Typ.ANSPRECHPARTNER;
    private Adresse adresse;
    private Anrede anrede;
    private String eMailAdresse;
    private Geschaeftspartner geschaeftspartner;
    private String individuelleAnrede;
    private String kommentar;
    private String nachname;
    private Rufnummer rufnummer;
    private Titel titel;
    private String vorname;
    private Zustaendigkeit zustaendigkeit;

    public Typ getTyp() { return typ; }

    public Adresse getAdresse() { return adresse; }
    public void setAdresse(Adresse value) { this.adresse = value; }

    public Anrede getAnrede() { return anrede; }
    public void setAnrede(Anrede value) { this.anrede = value; }

    public String getEMailAdresse() { return eMailAdresse; }
    public void setEMailAdresse(String value) { this.eMailAdresse = value; }

    public Geschaeftspartner getGeschaeftspartner() { return geschaeftspartner; }
    public void setGeschaeftspartner(Geschaeftspartner value) { this.geschaeftspartner = value; }

    public String getIndividuelleAnrede() { return individuelleAnrede; }
    public void setIndividuelleAnrede(String value) { this.individuelleAnrede = value; }

    public String getKommentar() { return kommentar; }
    public void setKommentar(String value) { this.kommentar = value; }

    public String getNachname() { return nachname; }
    public void setNachname(String value) { this.nachname = value; }

    public Rufnummer getRufnummer() { return rufnummer; }
    public void setRufnummer(Rufnummer value) { this.rufnummer = value; }

    public Titel getTitel() { return titel; }
    public void setTitel(Titel value) { this.titel = value; }

    public String getVorname() { return vorname; }
    public void setVorname(String value) { this.vorname = value; }

    public Zustaendigkeit getZustaendigkeit() { return zustaendigkeit; }
    public void setZustaendigkeit(Zustaendigkeit value) { this.zustaendigkeit = value; }
}
