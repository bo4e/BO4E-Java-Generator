package placeholder;

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
public class Marktlokation {
    private String id;
    private Typ typ;
    private String version;
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
    private List<Kundentyp> kundengruppen;
    private Adresse lokationsadresse;
    private String marktgebiet;
    private String marktlokationsId;
    private String netzbetreibercodenr;
    private Netzebene netzebene;
    private String netzgebietsnr;
    private String regelzone;
    private Sparte sparte;
    private Verbrauchsart verbrauchsart;
    private List<Verbrauch> verbrauchsmengen;
    private List<Zaehlwerk> zaehlwerke;
    private List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle;
    private Messlokationszuordnung zugehoerigeMesslokation;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Identifikationsnummer einer Marktlokation, an der Energie entweder verbraucht, oder
     * erzeugt wird.
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

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
    public List<Kundentyp> getKundengruppen() { return kundengruppen; }
    public void setKundengruppen(List<Kundentyp> value) { this.kundengruppen = value; }

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

    public List<Verbrauch> getVerbrauchsmengen() { return verbrauchsmengen; }
    public void setVerbrauchsmengen(List<Verbrauch> value) { this.verbrauchsmengen = value; }

    /**
     * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
     */
    public List<Zaehlwerk> getZaehlwerke() { return zaehlwerke; }
    public void setZaehlwerke(List<Zaehlwerk> value) { this.zaehlwerke = value; }

    public List<Zaehlwerk> getZaehlwerkeDerBeteiligtenMarktrolle() { return zaehlwerkeDerBeteiligtenMarktrolle; }
    public void setZaehlwerkeDerBeteiligtenMarktrolle(List<Zaehlwerk> value) { this.zaehlwerkeDerBeteiligtenMarktrolle = value; }

    public Messlokationszuordnung getZugehoerigeMesslokation() { return zugehoerigeMesslokation; }
    public void setZugehoerigeMesslokation(Messlokationszuordnung value) { this.zugehoerigeMesslokation = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
