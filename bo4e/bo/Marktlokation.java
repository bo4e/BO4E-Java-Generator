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
import bo4e.com.Zaehlwerk;
import bo4e.com.Messlokationszuordnung;

import java.util.List;

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
    /**
     * Typ des Geschaeftsobjekts
     */
    private Typ typ = Typ.MARKTLOKATION;
    /**
     * Bilanzierungsgebiet, dem das Netzgebiet zugeordnet ist - im Falle eines Strom Netzes
     */
    private String bilanzierungsgebiet;
    /**
     * Die Bilanzierungsmethode, RLM oder SLP
     */
    private Bilanzierungsmethode bilanzierungsmethode;
    /**
     * Geschäftspartner, dem diese Marktlokation gehört
     */
    private Geschaeftspartner endkunde;
    /**
     * Kennzeichnung, ob Energie eingespeist oder entnommen (ausgespeist) wird
     */
    private Energierichtung energierichtung;
    /**
     * Die Gasqualität in diesem Netzgebiet. H-Gas oder L-Gas. Im Falle eines Gas-Netzes
     */
    private Gasqualitaet gasqualitaet;
    /**
     * Typ des Netzgebietes, z.B. Verteilnetz
     */
    private Gebiettyp gebietstyp;
    /**
     * katasterinformation: Optional["Katasteradresse"] = None
     */
    private Geokoordinaten geoadresse;
    /**
     * Codenummer des Grundversorgers, der für diese Marktlokation zuständig ist
     */
    private String grundversorgercodenr;
    /**
     * Gibt an, ob es sich um eine unterbrechbare Belieferung handelt
     */
    private Boolean istUnterbrechbar;
    /**
     * Alternativ zu einer postalischen Adresse und Geokoordinaten kann hier eine Ortsangabe
     * mittels Gemarkung und
     * Flurstück erfolgen.
     */
    private Katasteradresse katasterinformation;
    /**
     * Kundengruppen der Marktlokation
     */
    private List<Kundentyp> kundengruppen;
    /**
     * Die Adresse, an der die Energie-Lieferung oder -Einspeisung erfolgt
     */
    private Adresse lokationsadresse;
    /**
     * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
     */
    private String marktgebiet;
    /**
     * Identifikationsnummer einer Marktlokation, an der Energie entweder verbraucht, oder
     * erzeugt wird.
     */
    private String marktlokationsId;
    /**
     * Codenummer des Netzbetreibers, an dessen Netz diese Marktlokation angeschlossen ist.
     */
    private String netzbetreibercodenr;
    /**
     * Netzebene, in der der Bezug der Energie erfolgt.
     * Bei Strom Spannungsebene der Lieferung, bei Gas Druckstufe.
     * Beispiel Strom: Niederspannung Beispiel Gas: Niederdruck.
     */
    private Netzebene netzebene;
    /**
     * Die ID des Gebietes in der ene't-Datenbank
     */
    private String netzgebietsnr;
    /**
     * Kundengruppen der Marktlokation
     */
    private String regelzone;
    /**
     * Sparte der Marktlokation, z.B. Gas oder Strom
     */
    private Sparte sparte;
    /**
     * Verbrauchsart der Marktlokation.
     */
    private Verbrauchsart verbrauchsart;
    private List<Verbrauch> verbrauchsmengen;
    /**
     * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
     */
    private List<Zaehlwerk> zaehlwerke;
    private List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle;
    private Messlokationszuordnung zugehoerigeMesslokation;

    public String getBilanzierungsgebiet() {
        return Bilanzierungsgebiet;
    }
    public void setBilanzierungsgebiet(String bilanzierungsgebiet) {
        this.bilanzierungsgebiet = bilanzierungsgebiet;
    }

    public Bilanzierungsmethode getBilanzierungsmethode() {
        return Bilanzierungsmethode;
    }
    public void setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
        this.bilanzierungsmethode = bilanzierungsmethode;
    }

    public Geschaeftspartner getEndkunde() {
        return Endkunde;
    }
    public void setEndkunde(Geschaeftspartner endkunde) {
        this.endkunde = endkunde;
    }

    public Energierichtung getEnergierichtung() {
        return Energierichtung;
    }
    public void setEnergierichtung(Energierichtung energierichtung) {
        this.energierichtung = energierichtung;
    }

    public Gasqualitaet getGasqualitaet() {
        return Gasqualitaet;
    }
    public void setGasqualitaet(Gasqualitaet gasqualitaet) {
        this.gasqualitaet = gasqualitaet;
    }

    public Gebiettyp getGebietstyp() {
        return Gebietstyp;
    }
    public void setGebietstyp(Gebiettyp gebietstyp) {
        this.gebietstyp = gebietstyp;
    }

    public Geokoordinaten getGeoadresse() {
        return Geoadresse;
    }
    public void setGeoadresse(Geokoordinaten geoadresse) {
        this.geoadresse = geoadresse;
    }

    public String getGrundversorgercodenr() {
        return Grundversorgercodenr;
    }
    public void setGrundversorgercodenr(String grundversorgercodenr) {
        this.grundversorgercodenr = grundversorgercodenr;
    }

    public Boolean getIstUnterbrechbar() {
        return IstUnterbrechbar;
    }
    public void setIstUnterbrechbar(Boolean istUnterbrechbar) {
        this.istUnterbrechbar = istUnterbrechbar;
    }

    public Katasteradresse getKatasterinformation() {
        return Katasterinformation;
    }
    public void setKatasterinformation(Katasteradresse katasterinformation) {
        this.katasterinformation = katasterinformation;
    }

    public List<Kundentyp> getKundengruppen() {
        return Kundengruppen;
    }
    public void setKundengruppen(List<Kundentyp> kundengruppen) {
        this.kundengruppen = kundengruppen;
    }

    public Adresse getLokationsadresse() {
        return Lokationsadresse;
    }
    public void setLokationsadresse(Adresse lokationsadresse) {
        this.lokationsadresse = lokationsadresse;
    }

    public String getMarktgebiet() {
        return Marktgebiet;
    }
    public void setMarktgebiet(String marktgebiet) {
        this.marktgebiet = marktgebiet;
    }

    public String getMarktlokationsId() {
        return MarktlokationsId;
    }
    public void setMarktlokationsId(String marktlokationsId) {
        this.marktlokationsId = marktlokationsId;
    }

    public String getNetzbetreibercodenr() {
        return Netzbetreibercodenr;
    }
    public void setNetzbetreibercodenr(String netzbetreibercodenr) {
        this.netzbetreibercodenr = netzbetreibercodenr;
    }

    public Netzebene getNetzebene() {
        return Netzebene;
    }
    public void setNetzebene(Netzebene netzebene) {
        this.netzebene = netzebene;
    }

    public String getNetzgebietsnr() {
        return Netzgebietsnr;
    }
    public void setNetzgebietsnr(String netzgebietsnr) {
        this.netzgebietsnr = netzgebietsnr;
    }

    public String getRegelzone() {
        return Regelzone;
    }
    public void setRegelzone(String regelzone) {
        this.regelzone = regelzone;
    }

    public Sparte getSparte() {
        return Sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public Verbrauchsart getVerbrauchsart() {
        return Verbrauchsart;
    }
    public void setVerbrauchsart(Verbrauchsart verbrauchsart) {
        this.verbrauchsart = verbrauchsart;
    }

    public List<Verbrauch> getVerbrauchsmengen() {
        return Verbrauchsmengen;
    }
    public void setVerbrauchsmengen(List<Verbrauch> verbrauchsmengen) {
        this.verbrauchsmengen = verbrauchsmengen;
    }

    public List<Zaehlwerk> getZaehlwerke() {
        return Zaehlwerke;
    }
    public void setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
        this.zaehlwerke = zaehlwerke;
    }

    public List<Zaehlwerk> getZaehlwerkeDerBeteiligtenMarktrolle() {
        return ZaehlwerkeDerBeteiligtenMarktrolle;
    }
    public void setZaehlwerkeDerBeteiligtenMarktrolle(List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle) {
        this.zaehlwerkeDerBeteiligtenMarktrolle = zaehlwerkeDerBeteiligtenMarktrolle;
    }

    public Messlokationszuordnung getZugehoerigeMesslokation() {
        return ZugehoerigeMesslokation;
    }
    public void setZugehoerigeMesslokation(Messlokationszuordnung zugehoerigeMesslokation) {
        this.zugehoerigeMesslokation = zugehoerigeMesslokation;
    }
}