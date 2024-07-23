package bo4e.com;

import bo4e.enums.Zaehlertyp;

import java.util.List;

/**
 * Die Komponente Ausschreibungsdetail wird verwendet um die Informationen zu einer
 * Abnahmestelle innerhalb eines
 * Ausschreibungsloses abzubilden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Ausschreibungsdetail.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Ausschreibungsdetail JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Ausschreibungsdetail.json>`_
 */
public class Ausschreibungsdetail extends COM {
    /**
     * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
     */
    private Boolean istLastgangVorhanden;
    /**
     * Bezeichnung des Kunden, der die Marktlokation nutzt
     */
    private String kunde;
    /**
     * Angefragter Zeitraum für die ausgeschriebene Belieferung
     */
    private Zeitraum lieferzeitraum;
    /**
     * Die Adresse an der die Marktlokation sich befindet
     */
    private Adresse marktlokationsadresse;
    /**
     * Bezeichnung für die Lokation, z.B. 'Zentraler Einkauf, Hamburg'
     */
    private String marktlokationsbezeichnung;
    /**
     * Identifikation einer ausgeschriebenen Marktlokation
     */
    private String marktlokationsId;
    /**
     * Bezeichnung des zuständigen Netzbetreibers, z.B. 'Stromnetz Hamburg GmbH'
     */
    private String netzbetreiber;
    /**
     * In der angegebenen Netzebene wird die Marktlokation versorgt, z.B. MSP für Mittelspannung
     */
    private String netzebeneLieferung;
    /**
     * In der angegebenen Netzebene wird die Lokation gemessen, z.B. NSP für Niederspannung
     */
    private String netzebeneMessung;
    /**
     * Ein Prognosewert für die Arbeit innerhalb des angefragten Lieferzeitraums der
     * ausgeschriebenen Lokation
     */
    private Menge prognoseArbeitLieferzeitraum;
    /**
     * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
     */
    private Menge prognoseJahresarbeit;
    /**
     * Prognosewert für die abgenommene maximale Leistung der ausgeschriebenen Lokation
     */
    private Menge prognoseLeistung;
    /**
     * Die (evtl. abweichende) Rechnungsadresse
     */
    private Adresse rechnungsadresse;
    /**
     * Die Bezeichnung des Zählers an der Marktlokation
     */
    private String zaehlernummer;
    /**
     * Spezifikation, um welche Zählertechnik es sich im vorliegenden Fall handelt, z.B.
     * Leistungsmessung
     */
    private Zaehlertyp zaehlertechnik;

    public Ausschreibungsdetail() {}
    private Ausschreibungsdetail(AusschreibungsdetailBuilder builder) {
        this.istLastgangVorhanden = builder.istLastgangVorhanden;
        this.kunde = builder.kunde;
        this.lieferzeitraum = builder.lieferzeitraum;
        this.marktlokationsadresse = builder.marktlokationsadresse;
        this.marktlokationsbezeichnung = builder.marktlokationsbezeichnung;
        this.marktlokationsId = builder.marktlokationsId;
        this.netzbetreiber = builder.netzbetreiber;
        this.netzebeneLieferung = builder.netzebeneLieferung;
        this.netzebeneMessung = builder.netzebeneMessung;
        this.prognoseArbeitLieferzeitraum = builder.prognoseArbeitLieferzeitraum;
        this.prognoseJahresarbeit = builder.prognoseJahresarbeit;
        this.prognoseLeistung = builder.prognoseLeistung;
        this.rechnungsadresse = builder.rechnungsadresse;
        this.zaehlernummer = builder.zaehlernummer;
        this.zaehlertechnik = builder.zaehlertechnik;
    }

    public Boolean getIstLastgangVorhanden() {
        return istLastgangVorhanden;
    }
    public void setIstLastgangVorhanden(Boolean istLastgangVorhanden) {
        this.istLastgangVorhanden = istLastgangVorhanden;
    }

    public String getKunde() {
        return kunde;
    }
    public void setKunde(String kunde) {
        this.kunde = kunde;
    }

    public Zeitraum getLieferzeitraum() {
        return lieferzeitraum;
    }
    public void setLieferzeitraum(Zeitraum lieferzeitraum) {
        this.lieferzeitraum = lieferzeitraum;
    }

    public Adresse getMarktlokationsadresse() {
        return marktlokationsadresse;
    }
    public void setMarktlokationsadresse(Adresse marktlokationsadresse) {
        this.marktlokationsadresse = marktlokationsadresse;
    }

    public String getMarktlokationsbezeichnung() {
        return marktlokationsbezeichnung;
    }
    public void setMarktlokationsbezeichnung(String marktlokationsbezeichnung) {
        this.marktlokationsbezeichnung = marktlokationsbezeichnung;
    }

    public String getMarktlokationsId() {
        return marktlokationsId;
    }
    public void setMarktlokationsId(String marktlokationsId) {
        this.marktlokationsId = marktlokationsId;
    }

    public String getNetzbetreiber() {
        return netzbetreiber;
    }
    public void setNetzbetreiber(String netzbetreiber) {
        this.netzbetreiber = netzbetreiber;
    }

    public String getNetzebeneLieferung() {
        return netzebeneLieferung;
    }
    public void setNetzebeneLieferung(String netzebeneLieferung) {
        this.netzebeneLieferung = netzebeneLieferung;
    }

    public String getNetzebeneMessung() {
        return netzebeneMessung;
    }
    public void setNetzebeneMessung(String netzebeneMessung) {
        this.netzebeneMessung = netzebeneMessung;
    }

    public Menge getPrognoseArbeitLieferzeitraum() {
        return prognoseArbeitLieferzeitraum;
    }
    public void setPrognoseArbeitLieferzeitraum(Menge prognoseArbeitLieferzeitraum) {
        this.prognoseArbeitLieferzeitraum = prognoseArbeitLieferzeitraum;
    }

    public Menge getPrognoseJahresarbeit() {
        return prognoseJahresarbeit;
    }
    public void setPrognoseJahresarbeit(Menge prognoseJahresarbeit) {
        this.prognoseJahresarbeit = prognoseJahresarbeit;
    }

    public Menge getPrognoseLeistung() {
        return prognoseLeistung;
    }
    public void setPrognoseLeistung(Menge prognoseLeistung) {
        this.prognoseLeistung = prognoseLeistung;
    }

    public Adresse getRechnungsadresse() {
        return rechnungsadresse;
    }
    public void setRechnungsadresse(Adresse rechnungsadresse) {
        this.rechnungsadresse = rechnungsadresse;
    }

    public String getZaehlernummer() {
        return zaehlernummer;
    }
    public void setZaehlernummer(String zaehlernummer) {
        this.zaehlernummer = zaehlernummer;
    }

    public Zaehlertyp getZaehlertechnik() {
        return zaehlertechnik;
    }
    public void setZaehlertechnik(Zaehlertyp zaehlertechnik) {
        this.zaehlertechnik = zaehlertechnik;
    }

    public static class AusschreibungsdetailBuilder extends COMBuilder {
        /**
         * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
         */
        private Boolean istLastgangVorhanden;
        /**
         * Bezeichnung des Kunden, der die Marktlokation nutzt
         */
        private String kunde;
        /**
         * Angefragter Zeitraum für die ausgeschriebene Belieferung
         */
        private Zeitraum lieferzeitraum;
        /**
         * Die Adresse an der die Marktlokation sich befindet
         */
        private Adresse marktlokationsadresse;
        /**
         * Bezeichnung für die Lokation, z.B. 'Zentraler Einkauf, Hamburg'
         */
        private String marktlokationsbezeichnung;
        /**
         * Identifikation einer ausgeschriebenen Marktlokation
         */
        private String marktlokationsId;
        /**
         * Bezeichnung des zuständigen Netzbetreibers, z.B. 'Stromnetz Hamburg GmbH'
         */
        private String netzbetreiber;
        /**
         * In der angegebenen Netzebene wird die Marktlokation versorgt, z.B. MSP für Mittelspannung
         */
        private String netzebeneLieferung;
        /**
         * In der angegebenen Netzebene wird die Lokation gemessen, z.B. NSP für Niederspannung
         */
        private String netzebeneMessung;
        /**
         * Ein Prognosewert für die Arbeit innerhalb des angefragten Lieferzeitraums der
         * ausgeschriebenen Lokation
         */
        private Menge prognoseArbeitLieferzeitraum;
        /**
         * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
         */
        private Menge prognoseJahresarbeit;
        /**
         * Prognosewert für die abgenommene maximale Leistung der ausgeschriebenen Lokation
         */
        private Menge prognoseLeistung;
        /**
         * Die (evtl. abweichende) Rechnungsadresse
         */
        private Adresse rechnungsadresse;
        /**
         * Die Bezeichnung des Zählers an der Marktlokation
         */
        private String zaehlernummer;
        /**
         * Spezifikation, um welche Zählertechnik es sich im vorliegenden Fall handelt, z.B.
         * Leistungsmessung
         */
        private Zaehlertyp zaehlertechnik;
    
        public Boolean getIstLastgangVorhanden() {
            return istLastgangVorhanden;
        }
        public AusschreibungsdetailBuilder setIstLastgangVorhanden(Boolean istLastgangVorhanden) {
            this.istLastgangVorhanden = istLastgangVorhanden;
            return this;
        }
    
        public String getKunde() {
            return kunde;
        }
        public AusschreibungsdetailBuilder setKunde(String kunde) {
            this.kunde = kunde;
            return this;
        }
    
        public Zeitraum getLieferzeitraum() {
            return lieferzeitraum;
        }
        public AusschreibungsdetailBuilder setLieferzeitraum(Zeitraum lieferzeitraum) {
            this.lieferzeitraum = lieferzeitraum;
            return this;
        }
    
        public Adresse getMarktlokationsadresse() {
            return marktlokationsadresse;
        }
        public AusschreibungsdetailBuilder setMarktlokationsadresse(Adresse marktlokationsadresse) {
            this.marktlokationsadresse = marktlokationsadresse;
            return this;
        }
    
        public String getMarktlokationsbezeichnung() {
            return marktlokationsbezeichnung;
        }
        public AusschreibungsdetailBuilder setMarktlokationsbezeichnung(String marktlokationsbezeichnung) {
            this.marktlokationsbezeichnung = marktlokationsbezeichnung;
            return this;
        }
    
        public String getMarktlokationsId() {
            return marktlokationsId;
        }
        public AusschreibungsdetailBuilder setMarktlokationsId(String marktlokationsId) {
            this.marktlokationsId = marktlokationsId;
            return this;
        }
    
        public String getNetzbetreiber() {
            return netzbetreiber;
        }
        public AusschreibungsdetailBuilder setNetzbetreiber(String netzbetreiber) {
            this.netzbetreiber = netzbetreiber;
            return this;
        }
    
        public String getNetzebeneLieferung() {
            return netzebeneLieferung;
        }
        public AusschreibungsdetailBuilder setNetzebeneLieferung(String netzebeneLieferung) {
            this.netzebeneLieferung = netzebeneLieferung;
            return this;
        }
    
        public String getNetzebeneMessung() {
            return netzebeneMessung;
        }
        public AusschreibungsdetailBuilder setNetzebeneMessung(String netzebeneMessung) {
            this.netzebeneMessung = netzebeneMessung;
            return this;
        }
    
        public Menge getPrognoseArbeitLieferzeitraum() {
            return prognoseArbeitLieferzeitraum;
        }
        public AusschreibungsdetailBuilder setPrognoseArbeitLieferzeitraum(Menge prognoseArbeitLieferzeitraum) {
            this.prognoseArbeitLieferzeitraum = prognoseArbeitLieferzeitraum;
            return this;
        }
    
        public Menge getPrognoseJahresarbeit() {
            return prognoseJahresarbeit;
        }
        public AusschreibungsdetailBuilder setPrognoseJahresarbeit(Menge prognoseJahresarbeit) {
            this.prognoseJahresarbeit = prognoseJahresarbeit;
            return this;
        }
    
        public Menge getPrognoseLeistung() {
            return prognoseLeistung;
        }
        public AusschreibungsdetailBuilder setPrognoseLeistung(Menge prognoseLeistung) {
            this.prognoseLeistung = prognoseLeistung;
            return this;
        }
    
        public Adresse getRechnungsadresse() {
            return rechnungsadresse;
        }
        public AusschreibungsdetailBuilder setRechnungsadresse(Adresse rechnungsadresse) {
            this.rechnungsadresse = rechnungsadresse;
            return this;
        }
    
        public String getZaehlernummer() {
            return zaehlernummer;
        }
        public AusschreibungsdetailBuilder setZaehlernummer(String zaehlernummer) {
            this.zaehlernummer = zaehlernummer;
            return this;
        }
    
        public Zaehlertyp getZaehlertechnik() {
            return zaehlertechnik;
        }
        public AusschreibungsdetailBuilder setZaehlertechnik(Zaehlertyp zaehlertechnik) {
            this.zaehlertechnik = zaehlertechnik;
            return this;
        }
    
        public Ausschreibungsdetail build() {
            return new Ausschreibungsdetail(this);
        }
    }
}