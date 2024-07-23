package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.enums.Energierichtung;
import bo4e.enums.Gasqualitaet;
import bo4e.enums.Gebiettyp;
import bo4e.com.Geokoordinaten;
import bo4e.com.Katasteradresse;
import bo4e.enums.Kundentyp;
import bo4e.com.Adresse;
import bo4e.enums.Netzebene;
import bo4e.enums.Sparte;
import bo4e.enums.Verbrauchsart;
import bo4e.com.Verbrauch;
import bo4e.com.Zaehlwerk;
import bo4e.com.Messlokationszuordnung;

/**
 * Object containing information about a Marktlokation
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Marktlokation.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Marktlokation JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Marktlokation.json>`_
 */
public class Marktlokation extends Geschaeftsobjekt {
    private final Typ _typ = Typ.MARKTLOKATION;
    private String bilanzierungsgebiet;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Geschaeftspartner endkunde;
    private Energierichtung energierichtung;
    private Gasqualitaet gasqualitaet;
    private Gebiettyp gebietstyp;
    private Geokoordinaten geoadresse;
    private String grundversorgercodenr;
    private Boolean istUnterbrechbar;
    private Katasteradresse katasterinformation;
    private Kundentyp[] kundengruppen;
    private Adresse lokationsadresse;
    private String marktgebiet;
    private String marktlokationsId;
    private String netzbetreibercodenr;
    private Netzebene netzebene;
    private String netzgebietsnr;
    private String regelzone;
    private Sparte sparte;
    private Verbrauchsart verbrauchsart;
    private Verbrauch[] verbrauchsmengen;
    private Zaehlwerk[] zaehlwerke;
    private Zaehlwerk[] zaehlwerkeDerBeteiligtenMarktrolle;
    private Messlokationszuordnung zugehoerigeMesslokation;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Identifikationsnummer einer Marktlokation, an der Energie entweder verbraucht, oder
     * erzeugt wird.
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Bilanzierungsgebiet, dem das Netzgebiet zugeordnet ist - im Falle eines Strom Netzes
     */
    public String getBilanzierungsgebiet() { return bilanzierungsgebiet; }
    public void setBilanzierungsgebiet(String value) { this.bilanzierungsgebiet = value; }

    /**
     * Die Bilanzierungsmethode, RLM oder SLP
     */
    public Bilanzierungsmethode getBilanzierungsmethode() { return bilanzierungsmethode; }
    public void setBilanzierungsmethode(Bilanzierungsmethode value) { this.bilanzierungsmethode = value; }

    /**
     * Geschäftspartner, dem diese Marktlokation gehört
     */
    public Geschaeftspartner getEndkunde() { return endkunde; }
    public void setEndkunde(Geschaeftspartner value) { this.endkunde = value; }

    /**
     * Kennzeichnung, ob Energie eingespeist oder entnommen (ausgespeist) wird
     */
    public Energierichtung getEnergierichtung() { return energierichtung; }
    public void setEnergierichtung(Energierichtung value) { this.energierichtung = value; }

    /**
     * Die Gasqualität in diesem Netzgebiet. H-Gas oder L-Gas. Im Falle eines Gas-Netzes
     */
    public Gasqualitaet getGasqualitaet() { return gasqualitaet; }
    public void setGasqualitaet(Gasqualitaet value) { this.gasqualitaet = value; }

    /**
     * Typ des Netzgebietes, z.B. Verteilnetz
     */
    public Gebiettyp getGebietstyp() { return gebietstyp; }
    public void setGebietstyp(Gebiettyp value) { this.gebietstyp = value; }

    /**
     * katasterinformation: Optional["Katasteradresse"] = None
     */
    public Geokoordinaten getGeoadresse() { return geoadresse; }
    public void setGeoadresse(Geokoordinaten value) { this.geoadresse = value; }

    /**
     * Codenummer des Grundversorgers, der für diese Marktlokation zuständig ist
     */
    public String getGrundversorgercodenr() { return grundversorgercodenr; }
    public void setGrundversorgercodenr(String value) { this.grundversorgercodenr = value; }

    /**
     * Gibt an, ob es sich um eine unterbrechbare Belieferung handelt
     */
    public Boolean getIstUnterbrechbar() { return istUnterbrechbar; }
    public void setIstUnterbrechbar(Boolean value) { this.istUnterbrechbar = value; }

    /**
     * Alternativ zu einer postalischen Adresse und Geokoordinaten kann hier eine Ortsangabe
     * mittels Gemarkung und
     * Flurstück erfolgen.
     */
    public Katasteradresse getKatasterinformation() { return katasterinformation; }
    public void setKatasterinformation(Katasteradresse value) { this.katasterinformation = value; }

    /**
     * Kundengruppen der Marktlokation
     */
    public Kundentyp[] getKundengruppen() { return kundengruppen; }
    public void setKundengruppen(Kundentyp[] value) { this.kundengruppen = value; }

    /**
     * Die Adresse, an der die Energie-Lieferung oder -Einspeisung erfolgt
     */
    public Adresse getLokationsadresse() { return lokationsadresse; }
    public void setLokationsadresse(Adresse value) { this.lokationsadresse = value; }

    /**
     * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
     */
    public String getMarktgebiet() { return marktgebiet; }
    public void setMarktgebiet(String value) { this.marktgebiet = value; }

    /**
     * Identifikationsnummer einer Marktlokation, an der Energie entweder verbraucht, oder
     * erzeugt wird.
     */
    public String getMarktlokationsId() { return marktlokationsId; }
    public void setMarktlokationsId(String value) { this.marktlokationsId = value; }

    /**
     * Codenummer des Netzbetreibers, an dessen Netz diese Marktlokation angeschlossen ist.
     */
    public String getNetzbetreibercodenr() { return netzbetreibercodenr; }
    public void setNetzbetreibercodenr(String value) { this.netzbetreibercodenr = value; }

    /**
     * Netzebene, in der der Bezug der Energie erfolgt.
     * Bei Strom Spannungsebene der Lieferung, bei Gas Druckstufe.
     * Beispiel Strom: Niederspannung Beispiel Gas: Niederdruck.
     */
    public Netzebene getNetzebene() { return netzebene; }
    public void setNetzebene(Netzebene value) { this.netzebene = value; }

    /**
     * Die ID des Gebietes in der ene't-Datenbank
     */
    public String getNetzgebietsnr() { return netzgebietsnr; }
    public void setNetzgebietsnr(String value) { this.netzgebietsnr = value; }

    /**
     * Kundengruppen der Marktlokation
     */
    public String getRegelzone() { return regelzone; }
    public void setRegelzone(String value) { this.regelzone = value; }

    /**
     * Sparte der Marktlokation, z.B. Gas oder Strom
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    /**
     * Verbrauchsart der Marktlokation.
     */
    public Verbrauchsart getVerbrauchsart() { return verbrauchsart; }
    public void setVerbrauchsart(Verbrauchsart value) { this.verbrauchsart = value; }

    public Verbrauch[] getVerbrauchsmengen() { return verbrauchsmengen; }
    public void setVerbrauchsmengen(Verbrauch[] value) { this.verbrauchsmengen = value; }

    /**
     * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
     */
    public Zaehlwerk[] getZaehlwerke() { return zaehlwerke; }
    public void setZaehlwerke(Zaehlwerk[] value) { this.zaehlwerke = value; }

    public Zaehlwerk[] getZaehlwerkeDerBeteiligtenMarktrolle() { return zaehlwerkeDerBeteiligtenMarktrolle; }
    public void setZaehlwerkeDerBeteiligtenMarktrolle(Zaehlwerk[] value) { this.zaehlwerkeDerBeteiligtenMarktrolle = value; }

    public Messlokationszuordnung getZugehoerigeMesslokation() { return zugehoerigeMesslokation; }
    public void setZugehoerigeMesslokation(Messlokationszuordnung value) { this.zugehoerigeMesslokation = value; }

}
