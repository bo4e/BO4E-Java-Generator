package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Geokoordinaten;
import bo4e.com.Katasteradresse;
import bo4e.com.Adresse;
import bo4e.com.Dienstleistung;
import bo4e.enums.Netzebene;
import bo4e.enums.Sparte;

import java.util.List;

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
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.MESSLOKATION;
    /**
     * katasterinformation: Optional["Katasteradresse"] = None
     */
    private Geokoordinaten geoadresse;
    /**
     * Liste der Geräte, die zu dieser Messstelle gehört
     */
    private List<Geraet> geraete;
    /**
     * grundzustaendiger_msbim_codenr: Optional[str] = None
     */
    private String grundzustaendigerMsbCodenr;
    /**
     * # only one of the following three optional address attributes can be set
     * messadresse: Optional["Adresse"] = None
     */
    private String grundzustaendigerMsbimCodenr;
    /**
     * Alternativ zu einer postalischen Adresse und Geokoordinaten kann hier eine Ortsangabe
     * mittels Gemarkung und
     * Flurstück erfolgen.
     */
    private Katasteradresse katasterinformation;
    /**
     * geoadresse: Optional["Geokoordinaten"] = None
     */
    private Adresse messadresse;
    /**
     * Liste der Messdienstleistungen, die zu dieser Messstelle gehört
     */
    private List<Dienstleistung> messdienstleistung;
    /**
     * Die Nummer des Messgebietes in der ene't-Datenbank
     */
    private String messgebietnr;
    /**
     * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
     */
    private String messlokationsId;
    /**
     * Zähler, die zu dieser Messlokation gehören
     */
    private List<Zaehler> messlokationszaehler;
    /**
     * Spannungsebene der Messung
     */
    private Netzebene netzebeneMessung;
    /**
     * Sparte der Messlokation, z.B. Gas oder Strom
     */
    private Sparte sparte;

    public Geokoordinaten getGeoadresse() {
        return geoadresse;
    }
    public void setGeoadresse(Geokoordinaten geoadresse) {
        this.geoadresse = geoadresse;
    }

    public List<Geraet> getGeraete() {
        return geraete;
    }
    public void setGeraete(List<Geraet> geraete) {
        this.geraete = geraete;
    }

    public String getGrundzustaendigerMsbCodenr() {
        return grundzustaendigerMsbCodenr;
    }
    public void setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
        this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
    }

    public String getGrundzustaendigerMsbimCodenr() {
        return grundzustaendigerMsbimCodenr;
    }
    public void setGrundzustaendigerMsbimCodenr(String grundzustaendigerMsbimCodenr) {
        this.grundzustaendigerMsbimCodenr = grundzustaendigerMsbimCodenr;
    }

    public Katasteradresse getKatasterinformation() {
        return katasterinformation;
    }
    public void setKatasterinformation(Katasteradresse katasterinformation) {
        this.katasterinformation = katasterinformation;
    }

    public Adresse getMessadresse() {
        return messadresse;
    }
    public void setMessadresse(Adresse messadresse) {
        this.messadresse = messadresse;
    }

    public List<Dienstleistung> getMessdienstleistung() {
        return messdienstleistung;
    }
    public void setMessdienstleistung(List<Dienstleistung> messdienstleistung) {
        this.messdienstleistung = messdienstleistung;
    }

    public String getMessgebietnr() {
        return messgebietnr;
    }
    public void setMessgebietnr(String messgebietnr) {
        this.messgebietnr = messgebietnr;
    }

    public String getMesslokationsId() {
        return messlokationsId;
    }
    public void setMesslokationsId(String messlokationsId) {
        this.messlokationsId = messlokationsId;
    }

    public List<Zaehler> getMesslokationszaehler() {
        return messlokationszaehler;
    }
    public void setMesslokationszaehler(List<Zaehler> messlokationszaehler) {
        this.messlokationszaehler = messlokationszaehler;
    }

    public Netzebene getNetzebeneMessung() {
        return netzebeneMessung;
    }
    public void setNetzebeneMessung(Netzebene netzebeneMessung) {
        this.netzebeneMessung = netzebeneMessung;
    }

    public Sparte getSparte() {
        return sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }
}