package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Geokoordinaten;
import bo4e.com.Katasteradresse;
import bo4e.com.Adresse;
import bo4e.com.Dienstleistung;
import bo4e.enums.Netzebene;
import bo4e.enums.Sparte;

/**
 * Object containing information about a Messlokation
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Messlokation.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Messlokation JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Messlokation.json>`_
 */
public class Messlokation extends Geschaeftsobjekt {
    private final Typ _typ = Typ.MESSLOKATION;
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

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * katasterinformation: Optional["Katasteradresse"] = None
     */
    public Geokoordinaten getGeoadresse() { return geoadresse; }
    public void setGeoadresse(Geokoordinaten value) { this.geoadresse = value; }

    /**
     * Liste der Geräte, die zu dieser Messstelle gehört
     */
    public Geraet[] getGeraete() { return geraete; }
    public void setGeraete(Geraet[] value) { this.geraete = value; }

    /**
     * grundzustaendiger_msbim_codenr: Optional[str] = None
     */
    public String getGrundzustaendigerMsbCodenr() { return grundzustaendigerMsbCodenr; }
    public void setGrundzustaendigerMsbCodenr(String value) { this.grundzustaendigerMsbCodenr = value; }

    /**
     * # only one of the following three optional address attributes can be set
     * messadresse: Optional["Adresse"] = None
     */
    public String getGrundzustaendigerMsbimCodenr() { return grundzustaendigerMsbimCodenr; }
    public void setGrundzustaendigerMsbimCodenr(String value) { this.grundzustaendigerMsbimCodenr = value; }

    /**
     * Alternativ zu einer postalischen Adresse und Geokoordinaten kann hier eine Ortsangabe
     * mittels Gemarkung und
     * Flurstück erfolgen.
     */
    public Katasteradresse getKatasterinformation() { return katasterinformation; }
    public void setKatasterinformation(Katasteradresse value) { this.katasterinformation = value; }

    /**
     * geoadresse: Optional["Geokoordinaten"] = None
     */
    public Adresse getMessadresse() { return messadresse; }
    public void setMessadresse(Adresse value) { this.messadresse = value; }

    /**
     * Liste der Messdienstleistungen, die zu dieser Messstelle gehört
     */
    public Dienstleistung[] getMessdienstleistung() { return messdienstleistung; }
    public void setMessdienstleistung(Dienstleistung[] value) { this.messdienstleistung = value; }

    /**
     * Die Nummer des Messgebietes in der ene't-Datenbank
     */
    public String getMessgebietnr() { return messgebietnr; }
    public void setMessgebietnr(String value) { this.messgebietnr = value; }

    /**
     * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
     */
    public String getMesslokationsId() { return messlokationsId; }
    public void setMesslokationsId(String value) { this.messlokationsId = value; }

    /**
     * Zähler, die zu dieser Messlokation gehören
     */
    public Zaehler[] getMesslokationszaehler() { return messlokationszaehler; }
    public void setMesslokationszaehler(Zaehler[] value) { this.messlokationszaehler = value; }

    /**
     * Spannungsebene der Messung
     */
    public Netzebene getNetzebeneMessung() { return netzebeneMessung; }
    public void setNetzebeneMessung(Netzebene value) { this.netzebeneMessung = value; }

    /**
     * Sparte der Messlokation, z.B. Gas oder Strom
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

}
