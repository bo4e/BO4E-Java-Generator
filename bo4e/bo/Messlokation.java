package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.com.Geokoordinaten;
import com.example.bo4e.com.Katasteradresse;
import com.example.bo4e.com.Adresse;
import com.example.bo4e.com.Dienstleistung;
import com.example.bo4e.enums.Netzebene;
import com.example.bo4e.enums.Sparte;

/**
 * Object containing information about a Messlokation
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Messlokation.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Messlokation JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Messlokation.json>`_
 */
public class Messlokation extends Geschaeftsobjekt {
    private final Typ typ = Typ.MESSLOKATION;
    private Geokoordinaten geoadresse;
    private Geraet[] geraete;
    private String grundzustaendigerMsbCodenr;
    private String grundzustaendigerMsbimCodenr;
    private Katasteradresse katasterinformation;
    private Adresse messadresse;
    private Dienstleistung[] messdienstleistung;
    private String messgebietnr;
    private String messlokationsId;
    private Zaehler[] messlokationszaehler;
    private Netzebene netzebeneMessung;
    private Sparte sparte;

    public Typ getTyp() { return typ; }

    public Geokoordinaten getGeoadresse() { return geoadresse; }
    public void setGeoadresse(Geokoordinaten value) { this.geoadresse = value; }

    public Geraet[] getGeraete() { return geraete; }
    public void setGeraete(Geraet[] value) { this.geraete = value; }

    public String getGrundzustaendigerMsbCodenr() { return grundzustaendigerMsbCodenr; }
    public void setGrundzustaendigerMsbCodenr(String value) { this.grundzustaendigerMsbCodenr = value; }

    public String getGrundzustaendigerMsbimCodenr() { return grundzustaendigerMsbimCodenr; }
    public void setGrundzustaendigerMsbimCodenr(String value) { this.grundzustaendigerMsbimCodenr = value; }

    public Katasteradresse getKatasterinformation() { return katasterinformation; }
    public void setKatasterinformation(Katasteradresse value) { this.katasterinformation = value; }

    public Adresse getMessadresse() { return messadresse; }
    public void setMessadresse(Adresse value) { this.messadresse = value; }

    public Dienstleistung[] getMessdienstleistung() { return messdienstleistung; }
    public void setMessdienstleistung(Dienstleistung[] value) { this.messdienstleistung = value; }

    public String getMessgebietnr() { return messgebietnr; }
    public void setMessgebietnr(String value) { this.messgebietnr = value; }

    public String getMesslokationsId() { return messlokationsId; }
    public void setMesslokationsId(String value) { this.messlokationsId = value; }

    public Zaehler[] getMesslokationszaehler() { return messlokationszaehler; }
    public void setMesslokationszaehler(Zaehler[] value) { this.messlokationszaehler = value; }

    public Netzebene getNetzebeneMessung() { return netzebeneMessung; }
    public void setNetzebeneMessung(Netzebene value) { this.netzebeneMessung = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

}
