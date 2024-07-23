package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Geraeteklasse;
import bo4e.enums.Geraetetyp;

/**
 * Mit diesem BO werden alle Geräte modelliert, die keine Zähler sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geraet.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geraet JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Geraet.json>`_
 */
public class Geraet extends Geschaeftsobjekt {
    private final Typ _typ = Typ.GERAET;
    private String bezeichnung;
    private Geraeteklasse geraeteklasse;
    private String geraetenummer;
    private Geraetetyp geraetetyp;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Bezeichnung des Geräts
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Die übergreifende Klasse eines Geräts, beispielsweise Wandler
     */
    public Geraeteklasse getGeraeteklasse() { return geraeteklasse; }
    public void setGeraeteklasse(Geraeteklasse value) { this.geraeteklasse = value; }

    /**
     * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
     */
    public String getGeraetenummer() { return geraetenummer; }
    public void setGeraetenummer(String value) { this.geraetenummer = value; }

    /**
     * Der speziellere Typ eines Gerätes, beispielsweise Stromwandler
     */
    public Geraetetyp getGeraetetyp() { return geraetetyp; }
    public void setGeraetetyp(Geraetetyp value) { this.geraetetyp = value; }

}
