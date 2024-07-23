package bo4e.com;

import bo4e.enums.Sparte;
import bo4e.enums.Oekolabel;
import bo4e.enums.Oekozertifikat;

import java.util.List;

/**
 * Zusammensetzung der gelieferten Energie aus den verschiedenen Primärenergieformen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Energiemix.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energiemix JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Energiemix.json>`_
 */
public class Energiemix extends COM {
    /**
     * Anteile der jeweiligen Erzeugungsart
     */
    private List<Energieherkunft> anteil;
    /**
     * Höhe des erzeugten Atommülls in g/kWh
     */
    private Double atommuell;
    /**
     * Bemerkung zum Energiemix
     */
    private String bemerkung;
    /**
     * Bezeichnung des Energiemix
     */
    private String bezeichnung;
    /**
     * Höhe des erzeugten CO2-Ausstosses in g/kWh
     */
    private Double co2Emission;
    /**
     * Strom oder Gas etc.
     */
    private Sparte energieart;
    /**
     * Eindeutige Nummer zur Identifizierung des Energiemixes
     */
    private Long energiemixnummer;
    /**
     * Jahr, für das der Energiemix gilt
     */
    private Long gueltigkeitsjahr;
    /**
     * Kennzeichen, ob der Versorger zu den Öko Top Ten gehört
     */
    private Boolean istInOekoTopTen;
    /**
     * Ökolabel für den Energiemix
     */
    private List<Oekolabel> oekolabel;
    /**
     * Zertifikate für den Energiemix
     */
    private List<Oekozertifikat> oekozertifikate;
    /**
     * Internetseite, auf der die Strommixdaten veröffentlicht sind
     */
    private String website;

    public Energiemix() {}
    private Energiemix(EnergiemixBuilder builder) {
        this.anteil = builder.anteil;
        this.atommuell = builder.atommuell;
        this.bemerkung = builder.bemerkung;
        this.bezeichnung = builder.bezeichnung;
        this.co2Emission = builder.co2Emission;
        this.energieart = builder.energieart;
        this.energiemixnummer = builder.energiemixnummer;
        this.gueltigkeitsjahr = builder.gueltigkeitsjahr;
        this.istInOekoTopTen = builder.istInOekoTopTen;
        this.oekolabel = builder.oekolabel;
        this.oekozertifikate = builder.oekozertifikate;
        this.website = builder.website;
    }

    public List<Energieherkunft> getAnteil() {
        return anteil;
    }
    public void setAnteil(List<Energieherkunft> anteil) {
        this.anteil = anteil;
    }

    public Double getAtommuell() {
        return atommuell;
    }
    public void setAtommuell(Double atommuell) {
        this.atommuell = atommuell;
    }

    public String getBemerkung() {
        return bemerkung;
    }
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Double getCo2Emission() {
        return co2Emission;
    }
    public void setCo2Emission(Double co2Emission) {
        this.co2Emission = co2Emission;
    }

    public Sparte getEnergieart() {
        return energieart;
    }
    public void setEnergieart(Sparte energieart) {
        this.energieart = energieart;
    }

    public Long getEnergiemixnummer() {
        return energiemixnummer;
    }
    public void setEnergiemixnummer(Long energiemixnummer) {
        this.energiemixnummer = energiemixnummer;
    }

    public Long getGueltigkeitsjahr() {
        return gueltigkeitsjahr;
    }
    public void setGueltigkeitsjahr(Long gueltigkeitsjahr) {
        this.gueltigkeitsjahr = gueltigkeitsjahr;
    }

    public Boolean getIstInOekoTopTen() {
        return istInOekoTopTen;
    }
    public void setIstInOekoTopTen(Boolean istInOekoTopTen) {
        this.istInOekoTopTen = istInOekoTopTen;
    }

    public List<Oekolabel> getOekolabel() {
        return oekolabel;
    }
    public void setOekolabel(List<Oekolabel> oekolabel) {
        this.oekolabel = oekolabel;
    }

    public List<Oekozertifikat> getOekozertifikate() {
        return oekozertifikate;
    }
    public void setOekozertifikate(List<Oekozertifikat> oekozertifikate) {
        this.oekozertifikate = oekozertifikate;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public static class EnergiemixBuilder extends COMBuilder {
        /**
         * Anteile der jeweiligen Erzeugungsart
         */
        private List<Energieherkunft> anteil;
        /**
         * Höhe des erzeugten Atommülls in g/kWh
         */
        private Double atommuell;
        /**
         * Bemerkung zum Energiemix
         */
        private String bemerkung;
        /**
         * Bezeichnung des Energiemix
         */
        private String bezeichnung;
        /**
         * Höhe des erzeugten CO2-Ausstosses in g/kWh
         */
        private Double co2Emission;
        /**
         * Strom oder Gas etc.
         */
        private Sparte energieart;
        /**
         * Eindeutige Nummer zur Identifizierung des Energiemixes
         */
        private Long energiemixnummer;
        /**
         * Jahr, für das der Energiemix gilt
         */
        private Long gueltigkeitsjahr;
        /**
         * Kennzeichen, ob der Versorger zu den Öko Top Ten gehört
         */
        private Boolean istInOekoTopTen;
        /**
         * Ökolabel für den Energiemix
         */
        private List<Oekolabel> oekolabel;
        /**
         * Zertifikate für den Energiemix
         */
        private List<Oekozertifikat> oekozertifikate;
        /**
         * Internetseite, auf der die Strommixdaten veröffentlicht sind
         */
        private String website;
    
        public List<Energieherkunft> getAnteil() {
            return anteil;
        }
        public EnergiemixBuilder setAnteil(List<Energieherkunft> anteil) {
            this.anteil = anteil;
            return this;
        }
    
        public Double getAtommuell() {
            return atommuell;
        }
        public EnergiemixBuilder setAtommuell(Double atommuell) {
            this.atommuell = atommuell;
            return this;
        }
    
        public String getBemerkung() {
            return bemerkung;
        }
        public EnergiemixBuilder setBemerkung(String bemerkung) {
            this.bemerkung = bemerkung;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
        public EnergiemixBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Double getCo2Emission() {
            return co2Emission;
        }
        public EnergiemixBuilder setCo2Emission(Double co2Emission) {
            this.co2Emission = co2Emission;
            return this;
        }
    
        public Sparte getEnergieart() {
            return energieart;
        }
        public EnergiemixBuilder setEnergieart(Sparte energieart) {
            this.energieart = energieart;
            return this;
        }
    
        public Long getEnergiemixnummer() {
            return energiemixnummer;
        }
        public EnergiemixBuilder setEnergiemixnummer(Long energiemixnummer) {
            this.energiemixnummer = energiemixnummer;
            return this;
        }
    
        public Long getGueltigkeitsjahr() {
            return gueltigkeitsjahr;
        }
        public EnergiemixBuilder setGueltigkeitsjahr(Long gueltigkeitsjahr) {
            this.gueltigkeitsjahr = gueltigkeitsjahr;
            return this;
        }
    
        public Boolean getIstInOekoTopTen() {
            return istInOekoTopTen;
        }
        public EnergiemixBuilder setIstInOekoTopTen(Boolean istInOekoTopTen) {
            this.istInOekoTopTen = istInOekoTopTen;
            return this;
        }
    
        public List<Oekolabel> getOekolabel() {
            return oekolabel;
        }
        public EnergiemixBuilder setOekolabel(List<Oekolabel> oekolabel) {
            this.oekolabel = oekolabel;
            return this;
        }
    
        public List<Oekozertifikat> getOekozertifikate() {
            return oekozertifikate;
        }
        public EnergiemixBuilder setOekozertifikate(List<Oekozertifikat> oekozertifikate) {
            this.oekozertifikate = oekozertifikate;
            return this;
        }
    
        public String getWebsite() {
            return website;
        }
        public EnergiemixBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }
    
        public Energiemix build() {
            return new Energiemix(this);
        }
    }
}