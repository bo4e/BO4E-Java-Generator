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
    private final Typ typ = Typ.MARKTLOKATION;
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

    public Marktlokation() {}
    private Marktlokation(MarktlokationBuilder builder) {
        this.bilanzierungsgebiet = builder.bilanzierungsgebiet;
        this.bilanzierungsmethode = builder.bilanzierungsmethode;
        this.endkunde = builder.endkunde;
        this.energierichtung = builder.energierichtung;
        this.gasqualitaet = builder.gasqualitaet;
        this.gebietstyp = builder.gebietstyp;
        this.geoadresse = builder.geoadresse;
        this.grundversorgercodenr = builder.grundversorgercodenr;
        this.istUnterbrechbar = builder.istUnterbrechbar;
        this.katasterinformation = builder.katasterinformation;
        this.kundengruppen = builder.kundengruppen;
        this.lokationsadresse = builder.lokationsadresse;
        this.marktgebiet = builder.marktgebiet;
        this.marktlokationsId = builder.marktlokationsId;
        this.netzbetreibercodenr = builder.netzbetreibercodenr;
        this.netzebene = builder.netzebene;
        this.netzgebietsnr = builder.netzgebietsnr;
        this.regelzone = builder.regelzone;
        this.sparte = builder.sparte;
        this.verbrauchsart = builder.verbrauchsart;
        this.verbrauchsmengen = builder.verbrauchsmengen;
        this.zaehlwerke = builder.zaehlwerke;
        this.zaehlwerkeDerBeteiligtenMarktrolle = builder.zaehlwerkeDerBeteiligtenMarktrolle;
        this.zugehoerigeMesslokation = builder.zugehoerigeMesslokation;
    }

    public Typ getTyp() {
        return typ;
    }

    public String getBilanzierungsgebiet() {
        return bilanzierungsgebiet;
    }
    public void setBilanzierungsgebiet(String bilanzierungsgebiet) {
        this.bilanzierungsgebiet = bilanzierungsgebiet;
    }

    public Bilanzierungsmethode getBilanzierungsmethode() {
        return bilanzierungsmethode;
    }
    public void setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
        this.bilanzierungsmethode = bilanzierungsmethode;
    }

    public Geschaeftspartner getEndkunde() {
        return endkunde;
    }
    public void setEndkunde(Geschaeftspartner endkunde) {
        this.endkunde = endkunde;
    }

    public Energierichtung getEnergierichtung() {
        return energierichtung;
    }
    public void setEnergierichtung(Energierichtung energierichtung) {
        this.energierichtung = energierichtung;
    }

    public Gasqualitaet getGasqualitaet() {
        return gasqualitaet;
    }
    public void setGasqualitaet(Gasqualitaet gasqualitaet) {
        this.gasqualitaet = gasqualitaet;
    }

    public Gebiettyp getGebietstyp() {
        return gebietstyp;
    }
    public void setGebietstyp(Gebiettyp gebietstyp) {
        this.gebietstyp = gebietstyp;
    }

    public Geokoordinaten getGeoadresse() {
        return geoadresse;
    }
    public void setGeoadresse(Geokoordinaten geoadresse) {
        this.geoadresse = geoadresse;
    }

    public String getGrundversorgercodenr() {
        return grundversorgercodenr;
    }
    public void setGrundversorgercodenr(String grundversorgercodenr) {
        this.grundversorgercodenr = grundversorgercodenr;
    }

    public Boolean getIstUnterbrechbar() {
        return istUnterbrechbar;
    }
    public void setIstUnterbrechbar(Boolean istUnterbrechbar) {
        this.istUnterbrechbar = istUnterbrechbar;
    }

    public Katasteradresse getKatasterinformation() {
        return katasterinformation;
    }
    public void setKatasterinformation(Katasteradresse katasterinformation) {
        this.katasterinformation = katasterinformation;
    }

    public List<Kundentyp> getKundengruppen() {
        return kundengruppen;
    }
    public void setKundengruppen(List<Kundentyp> kundengruppen) {
        this.kundengruppen = kundengruppen;
    }

    public Adresse getLokationsadresse() {
        return lokationsadresse;
    }
    public void setLokationsadresse(Adresse lokationsadresse) {
        this.lokationsadresse = lokationsadresse;
    }

    public String getMarktgebiet() {
        return marktgebiet;
    }
    public void setMarktgebiet(String marktgebiet) {
        this.marktgebiet = marktgebiet;
    }

    public String getMarktlokationsId() {
        return marktlokationsId;
    }
    public void setMarktlokationsId(String marktlokationsId) {
        this.marktlokationsId = marktlokationsId;
    }

    public String getNetzbetreibercodenr() {
        return netzbetreibercodenr;
    }
    public void setNetzbetreibercodenr(String netzbetreibercodenr) {
        this.netzbetreibercodenr = netzbetreibercodenr;
    }

    public Netzebene getNetzebene() {
        return netzebene;
    }
    public void setNetzebene(Netzebene netzebene) {
        this.netzebene = netzebene;
    }

    public String getNetzgebietsnr() {
        return netzgebietsnr;
    }
    public void setNetzgebietsnr(String netzgebietsnr) {
        this.netzgebietsnr = netzgebietsnr;
    }

    public String getRegelzone() {
        return regelzone;
    }
    public void setRegelzone(String regelzone) {
        this.regelzone = regelzone;
    }

    public Sparte getSparte() {
        return sparte;
    }
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public Verbrauchsart getVerbrauchsart() {
        return verbrauchsart;
    }
    public void setVerbrauchsart(Verbrauchsart verbrauchsart) {
        this.verbrauchsart = verbrauchsart;
    }

    public List<Verbrauch> getVerbrauchsmengen() {
        return verbrauchsmengen;
    }
    public void setVerbrauchsmengen(List<Verbrauch> verbrauchsmengen) {
        this.verbrauchsmengen = verbrauchsmengen;
    }

    public List<Zaehlwerk> getZaehlwerke() {
        return zaehlwerke;
    }
    public void setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
        this.zaehlwerke = zaehlwerke;
    }

    public List<Zaehlwerk> getZaehlwerkeDerBeteiligtenMarktrolle() {
        return zaehlwerkeDerBeteiligtenMarktrolle;
    }
    public void setZaehlwerkeDerBeteiligtenMarktrolle(List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle) {
        this.zaehlwerkeDerBeteiligtenMarktrolle = zaehlwerkeDerBeteiligtenMarktrolle;
    }

    public Messlokationszuordnung getZugehoerigeMesslokation() {
        return zugehoerigeMesslokation;
    }
    public void setZugehoerigeMesslokation(Messlokationszuordnung zugehoerigeMesslokation) {
        this.zugehoerigeMesslokation = zugehoerigeMesslokation;
    }

    public static class MarktlokationBuilder extends GeschaeftsobjektBuilder {
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
            return bilanzierungsgebiet;
        }
        public MarktlokationBuilder setBilanzierungsgebiet(String bilanzierungsgebiet) {
            this.bilanzierungsgebiet = bilanzierungsgebiet;
            return this;
        }
    
        public Bilanzierungsmethode getBilanzierungsmethode() {
            return bilanzierungsmethode;
        }
        public MarktlokationBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }
    
        public Geschaeftspartner getEndkunde() {
            return endkunde;
        }
        public MarktlokationBuilder setEndkunde(Geschaeftspartner endkunde) {
            this.endkunde = endkunde;
            return this;
        }
    
        public Energierichtung getEnergierichtung() {
            return energierichtung;
        }
        public MarktlokationBuilder setEnergierichtung(Energierichtung energierichtung) {
            this.energierichtung = energierichtung;
            return this;
        }
    
        public Gasqualitaet getGasqualitaet() {
            return gasqualitaet;
        }
        public MarktlokationBuilder setGasqualitaet(Gasqualitaet gasqualitaet) {
            this.gasqualitaet = gasqualitaet;
            return this;
        }
    
        public Gebiettyp getGebietstyp() {
            return gebietstyp;
        }
        public MarktlokationBuilder setGebietstyp(Gebiettyp gebietstyp) {
            this.gebietstyp = gebietstyp;
            return this;
        }
    
        public Geokoordinaten getGeoadresse() {
            return geoadresse;
        }
        public MarktlokationBuilder setGeoadresse(Geokoordinaten geoadresse) {
            this.geoadresse = geoadresse;
            return this;
        }
    
        public String getGrundversorgercodenr() {
            return grundversorgercodenr;
        }
        public MarktlokationBuilder setGrundversorgercodenr(String grundversorgercodenr) {
            this.grundversorgercodenr = grundversorgercodenr;
            return this;
        }
    
        public Boolean getIstUnterbrechbar() {
            return istUnterbrechbar;
        }
        public MarktlokationBuilder setIstUnterbrechbar(Boolean istUnterbrechbar) {
            this.istUnterbrechbar = istUnterbrechbar;
            return this;
        }
    
        public Katasteradresse getKatasterinformation() {
            return katasterinformation;
        }
        public MarktlokationBuilder setKatasterinformation(Katasteradresse katasterinformation) {
            this.katasterinformation = katasterinformation;
            return this;
        }
    
        public List<Kundentyp> getKundengruppen() {
            return kundengruppen;
        }
        public MarktlokationBuilder setKundengruppen(List<Kundentyp> kundengruppen) {
            this.kundengruppen = kundengruppen;
            return this;
        }
    
        public Adresse getLokationsadresse() {
            return lokationsadresse;
        }
        public MarktlokationBuilder setLokationsadresse(Adresse lokationsadresse) {
            this.lokationsadresse = lokationsadresse;
            return this;
        }
    
        public String getMarktgebiet() {
            return marktgebiet;
        }
        public MarktlokationBuilder setMarktgebiet(String marktgebiet) {
            this.marktgebiet = marktgebiet;
            return this;
        }
    
        public String getMarktlokationsId() {
            return marktlokationsId;
        }
        public MarktlokationBuilder setMarktlokationsId(String marktlokationsId) {
            this.marktlokationsId = marktlokationsId;
            return this;
        }
    
        public String getNetzbetreibercodenr() {
            return netzbetreibercodenr;
        }
        public MarktlokationBuilder setNetzbetreibercodenr(String netzbetreibercodenr) {
            this.netzbetreibercodenr = netzbetreibercodenr;
            return this;
        }
    
        public Netzebene getNetzebene() {
            return netzebene;
        }
        public MarktlokationBuilder setNetzebene(Netzebene netzebene) {
            this.netzebene = netzebene;
            return this;
        }
    
        public String getNetzgebietsnr() {
            return netzgebietsnr;
        }
        public MarktlokationBuilder setNetzgebietsnr(String netzgebietsnr) {
            this.netzgebietsnr = netzgebietsnr;
            return this;
        }
    
        public String getRegelzone() {
            return regelzone;
        }
        public MarktlokationBuilder setRegelzone(String regelzone) {
            this.regelzone = regelzone;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
        public MarktlokationBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public Verbrauchsart getVerbrauchsart() {
            return verbrauchsart;
        }
        public MarktlokationBuilder setVerbrauchsart(Verbrauchsart verbrauchsart) {
            this.verbrauchsart = verbrauchsart;
            return this;
        }
    
        public List<Verbrauch> getVerbrauchsmengen() {
            return verbrauchsmengen;
        }
        public MarktlokationBuilder setVerbrauchsmengen(List<Verbrauch> verbrauchsmengen) {
            this.verbrauchsmengen = verbrauchsmengen;
            return this;
        }
    
        public List<Zaehlwerk> getZaehlwerke() {
            return zaehlwerke;
        }
        public MarktlokationBuilder setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
            this.zaehlwerke = zaehlwerke;
            return this;
        }
    
        public List<Zaehlwerk> getZaehlwerkeDerBeteiligtenMarktrolle() {
            return zaehlwerkeDerBeteiligtenMarktrolle;
        }
        public MarktlokationBuilder setZaehlwerkeDerBeteiligtenMarktrolle(List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle) {
            this.zaehlwerkeDerBeteiligtenMarktrolle = zaehlwerkeDerBeteiligtenMarktrolle;
            return this;
        }
    
        public Messlokationszuordnung getZugehoerigeMesslokation() {
            return zugehoerigeMesslokation;
        }
        public MarktlokationBuilder setZugehoerigeMesslokation(Messlokationszuordnung zugehoerigeMesslokation) {
            this.zugehoerigeMesslokation = zugehoerigeMesslokation;
            return this;
        }
    
        public Marktlokation build() {
            return new Marktlokation(this);
        }
    }
}