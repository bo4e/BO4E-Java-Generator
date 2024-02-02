package com.example.bo4e.com;

import com.example.bo4e.enums.BDEWArtikelnummer;
import com.example.bo4e.enums.Kalkulationsmethode;
import com.example.bo4e.enums.Mengeneinheit;
import com.example.bo4e.enums.Leistungstyp;
import com.example.bo4e.enums.Waehrungseinheit;
import com.example.bo4e.enums.Tarifzeit;
import com.example.bo4e.enums.Bemessungsgroesse;

/**
 * Preis für eine definierte Lieferung oder Leistung innerhalb eines Preisblattes
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Preisposition.json>`_
 */
public class Preisposition extends COM {
    private BDEWArtikelnummer bdewArtikelnummer;
    private Kalkulationsmethode berechnungsmethode;
    private Mengeneinheit bezugsgroesse;
    private String freimengeBlindarbeit;
    private String freimengeLeistungsfaktor;
    private String gruppenartikelId;
    private String leistungsbezeichnung;
    private Leistungstyp leistungstyp;
    private Waehrungseinheit preiseinheit;
    private Preisstaffel[] preisstaffeln;
    private Tarifzeit tarifzeit;
    private Mengeneinheit zeitbasis;
    private Bemessungsgroesse zonungsgroesse;

    public BDEWArtikelnummer getBdewArtikelnummer() { return bdewArtikelnummer; }
    public void setBdewArtikelnummer(BDEWArtikelnummer value) { this.bdewArtikelnummer = value; }

    public Kalkulationsmethode getBerechnungsmethode() { return berechnungsmethode; }
    public void setBerechnungsmethode(Kalkulationsmethode value) { this.berechnungsmethode = value; }

    public Mengeneinheit getBezugsgroesse() { return bezugsgroesse; }
    public void setBezugsgroesse(Mengeneinheit value) { this.bezugsgroesse = value; }

    public String getFreimengeBlindarbeit() { return freimengeBlindarbeit; }
    public void setFreimengeBlindarbeit(String value) { this.freimengeBlindarbeit = value; }

    public String getFreimengeLeistungsfaktor() { return freimengeLeistungsfaktor; }
    public void setFreimengeLeistungsfaktor(String value) { this.freimengeLeistungsfaktor = value; }

    public String getGruppenartikelId() { return gruppenartikelId; }
    public void setGruppenartikelId(String value) { this.gruppenartikelId = value; }

    public String getLeistungsbezeichnung() { return leistungsbezeichnung; }
    public void setLeistungsbezeichnung(String value) { this.leistungsbezeichnung = value; }

    public Leistungstyp getLeistungstyp() { return leistungstyp; }
    public void setLeistungstyp(Leistungstyp value) { this.leistungstyp = value; }

    public Waehrungseinheit getPreiseinheit() { return preiseinheit; }
    public void setPreiseinheit(Waehrungseinheit value) { this.preiseinheit = value; }

    public Preisstaffel[] getPreisstaffeln() { return preisstaffeln; }
    public void setPreisstaffeln(Preisstaffel[] value) { this.preisstaffeln = value; }

    public Tarifzeit getTarifzeit() { return tarifzeit; }
    public void setTarifzeit(Tarifzeit value) { this.tarifzeit = value; }

    public Mengeneinheit getZeitbasis() { return zeitbasis; }
    public void setZeitbasis(Mengeneinheit value) { this.zeitbasis = value; }

    public Bemessungsgroesse getZonungsgroesse() { return zonungsgroesse; }
    public void setZonungsgroesse(Bemessungsgroesse value) { this.zonungsgroesse = value; }

}
