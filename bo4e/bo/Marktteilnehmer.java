package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Marktrolle;
import bo4e.enums.Rollencodetyp;
import bo4e.enums.Sparte;

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
public class Marktteilnehmer extends Geschaeftsobjekt {
    private final Typ _typ = Typ.MARKTTEILNEHMER;
    private Geschaeftspartner geschaeftspartner;
    private String[] makoadresse;
    private Marktrolle marktrolle;
    private String rollencodenummer;
    private Rollencodetyp rollencodetyp;
    private Sparte sparte;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Gibt im Klartext die Bezeichnung der Marktrolle an
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Der zu diesem Marktteilnehmer gehörende Geschäftspartner
     */
    public Geschaeftspartner getGeschaeftspartner() { return geschaeftspartner; }
    public void setGeschaeftspartner(Geschaeftspartner value) { this.geschaeftspartner = value; }

    /**
     * Die 1:1-Kommunikationsadresse des Marktteilnehmers. Diese wird in der Marktkommunikation
     * verwendet. Konkret kann dies eine eMail-Adresse oder ein AS4-Endpunkt sein.
     */
    public String[] getMakoadresse() { return makoadresse; }
    public void setMakoadresse(String[] value) { this.makoadresse = value; }

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

}
