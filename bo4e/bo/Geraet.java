package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Geraeteklasse;
import bo4e.enums.Geraetetyp;

import java.util.List;

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
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.GERAET;
    /**
     * Bezeichnung des Geräts
     */
    private String bezeichnung;
    /**
     * Die übergreifende Klasse eines Geräts, beispielsweise Wandler
     */
    private Geraeteklasse geraeteklasse;
    /**
     * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
     */
    private String geraetenummer;
    /**
     * Der speziellere Typ eines Gerätes, beispielsweise Stromwandler
     */
    private Geraetetyp geraetetyp;

    public String getBezeichnung() {
        return Bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Geraeteklasse getGeraeteklasse() {
        return Geraeteklasse;
    }
    public void setGeraeteklasse(Geraeteklasse geraeteklasse) {
        this.geraeteklasse = geraeteklasse;
    }

    public String getGeraetenummer() {
        return Geraetenummer;
    }
    public void setGeraetenummer(String geraetenummer) {
        this.geraetenummer = geraetenummer;
    }

    public Geraetetyp getGeraetetyp() {
        return Geraetetyp;
    }
    public void setGeraetetyp(Geraetetyp geraetetyp) {
        this.geraetetyp = geraetetyp;
    }
}