package placeholder;

import java.util.List;

/**
 * Objekt zur Aufnahme der Information zu einem Marktteilnehmer
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Marktteilnehmer.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Marktteilnehmer JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Marktteilnehmer.json>`_
 */
public class Marktteilnehmer {
    private String id;
    private Typ typ;
    private String version;
    private Geschaeftspartner geschaeftspartner;
    private List<String> makoadresse;
    private Marktrolle marktrolle;
    private String rollencodenummer;
    private Rollencodetyp rollencodetyp;
    private Sparte sparte;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Gibt im Klartext die Bezeichnung der Marktrolle an
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Der zu diesem Marktteilnehmer gehörende Geschäftspartner
     */
    public Geschaeftspartner getGeschaeftspartner() { return geschaeftspartner; }
    public void setGeschaeftspartner(Geschaeftspartner value) { this.geschaeftspartner = value; }

    /**
     * Die 1:1-Kommunikationsadresse des Marktteilnehmers. Diese wird in der Marktkommunikation
     * verwendet. Konkret kann dies eine eMail-Adresse oder ein AS4-Endpunkt sein.
     */
    public List<String> getMakoadresse() { return makoadresse; }
    public void setMakoadresse(List<String> value) { this.makoadresse = value; }

    /**
     * Gibt im Klartext die Bezeichnung der Marktrolle an
     */
    public Marktrolle getMarktrolle() { return marktrolle; }
    public void setMarktrolle(Marktrolle value) { this.marktrolle = value; }

    /**
     * Gibt die Codenummer der Marktrolle an
     */
    public String getRollencodenummer() { return rollencodenummer; }
    public void setRollencodenummer(String value) { this.rollencodenummer = value; }

    /**
     * Gibt den Typ des Codes an
     */
    public Rollencodetyp getRollencodetyp() { return rollencodetyp; }
    public void setRollencodetyp(Rollencodetyp value) { this.rollencodetyp = value; }

    /**
     * Sparte des Marktteilnehmers, z.B. Gas oder Strom
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
