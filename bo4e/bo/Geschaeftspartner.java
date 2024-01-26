package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Anrede;
import com.example.bo4e.enums.Geschaeftspartnerrolle;
import com.example.bo4e.enums.Kontaktart;
import com.example.bo4e.com.Adresse;

/**
 * Mit diesem Objekt können Geschäftspartner übertragen werden.
 * Sowohl Unternehmen, als auch Privatpersonen können Geschäftspartner sein.
 * Hinweis: Marktteilnehmer haben ein eigenes BO, welches sich von diesem BO ableitet.
 * Hier sollte daher keine Zuordnung zu Marktrollen erfolgen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geschaeftspartner.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geschaeftspartner JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Geschaeftspartner.json>`_
 */
public class Geschaeftspartner extends Geschaeftsobjekt {
    private final Typ typ = Typ.GESCHAEFTSPARTNER;
    private String amtsgericht;
    private Anrede anrede;
    private String eMailAdresse;
    private Geschaeftspartnerrolle[] geschaeftspartnerrolle;
    private String glaeubigerID;
    private String hrnummer;
    private Boolean istGewerbe;
    private Kontaktart[] kontaktweg;
    private String name1;
    private String name2;
    private String name3;
    private Adresse partneradresse;
    private String umsatzsteuerID;
    private String website;

    public Typ getTyp() { return typ; }

    public String getAmtsgericht() { return amtsgericht; }
    public void setAmtsgericht(String value) { this.amtsgericht = value; }

    public Anrede getAnrede() { return anrede; }
    public void setAnrede(Anrede value) { this.anrede = value; }

    public String getEMailAdresse() { return eMailAdresse; }
    public void setEMailAdresse(String value) { this.eMailAdresse = value; }

    public Geschaeftspartnerrolle[] getGeschaeftspartnerrolle() { return geschaeftspartnerrolle; }
    public void setGeschaeftspartnerrolle(Geschaeftspartnerrolle[] value) { this.geschaeftspartnerrolle = value; }

    public String getGlaeubigerID() { return glaeubigerID; }
    public void setGlaeubigerID(String value) { this.glaeubigerID = value; }

    public String getHrnummer() { return hrnummer; }
    public void setHrnummer(String value) { this.hrnummer = value; }

    public Boolean getIstGewerbe() { return istGewerbe; }
    public void setIstGewerbe(Boolean value) { this.istGewerbe = value; }

    public Kontaktart[] getKontaktweg() { return kontaktweg; }
    public void setKontaktweg(Kontaktart[] value) { this.kontaktweg = value; }

    public String getName1() { return name1; }
    public void setName1(String value) { this.name1 = value; }

    public String getName2() { return name2; }
    public void setName2(String value) { this.name2 = value; }

    public String getName3() { return name3; }
    public void setName3(String value) { this.name3 = value; }

    public Adresse getPartneradresse() { return partneradresse; }
    public void setPartneradresse(Adresse value) { this.partneradresse = value; }

    public String getUmsatzsteuerID() { return umsatzsteuerID; }
    public void setUmsatzsteuerID(String value) { this.umsatzsteuerID = value; }

    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

}
