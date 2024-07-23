package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.com.Zeitraum;
import bo4e.enums.Dienstleistungstyp;
import bo4e.enums.Netzebene;
import bo4e.com.Preisposition;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Variante des Preisblattmodells zur Abbildung der Preise für zusätzliche Hardware
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/PreisblattHardware.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `PreisblattHardware JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/PreisblattHardware.json>`_
 */
public class PreisblattHardware extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.PREISBLATTHARDWARE;
    /**
     * Der Preis betriftt das hier angegebene Gerät, z.B. ein Tarifschaltgerät
     */
    private Geraet basisgeraet;
    /**
     * Eine Bezeichnung für das Preisblatt
     */
    private String bezeichnung;
    /**
     * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
     */
    private Bilanzierungsmethode bilanzierungsmethode;
    /**
     * Der Zeitraum für den der Preis festgelegt ist
     */
    private Zeitraum gueltigkeit;
    /**
     * Der Netzbetreiber, der die Preise veröffentlicht hat
     */
    private Marktteilnehmer herausgeber;
    /**
     * Im Preis sind die hier angegebenen Dienstleistungen enthalten, z.B. Jährliche Ablesung
     */
    private List<Dienstleistungstyp> inklusiveDienstleistungen;
    /**
     * Im Preis sind die hier angegebenen Geräte mit enthalten, z.B. ein Wandler
     */
    private List<Geraet> inklusiveGeraete;
    /**
     * Die Preise gelten für Messlokationen in der angebebenen Netzebene
     */
    private Netzebene messebene;
    /**
     * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
     * Arbeitspreis, Grundpreis etc
     */
    private List<Preisposition> preispositionen;
    /**
     * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
     */
    private Preisstatus preisstatus;
    /**
     * Preisblatt gilt für angegebene Sparte
     */
    private Sparte sparte;

    public PreisblattHardware() {
    }

    private PreisblattHardware(PreisblattHardwareBuilder builder) {
        super(builder);
        this.basisgeraet = builder.basisgeraet;
        this.bezeichnung = builder.bezeichnung;
        this.bilanzierungsmethode = builder.bilanzierungsmethode;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.inklusiveDienstleistungen = builder.inklusiveDienstleistungen;
        this.inklusiveGeraete = builder.inklusiveGeraete;
        this.messebene = builder.messebene;
        this.preispositionen = builder.preispositionen;
        this.preisstatus = builder.preisstatus;
        this.sparte = builder.sparte;
    }

    public Typ getTyp() {
        return typ;
    }

    public Geraet getBasisgeraet() {
        return basisgeraet;
    }

    public void setBasisgeraet(Geraet basisgeraet) {
        this.basisgeraet = basisgeraet;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Bilanzierungsmethode getBilanzierungsmethode() {
        return bilanzierungsmethode;
    }

    public void setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
        this.bilanzierungsmethode = bilanzierungsmethode;
    }

    public Zeitraum getGueltigkeit() {
        return gueltigkeit;
    }

    public void setGueltigkeit(Zeitraum gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    public Marktteilnehmer getHerausgeber() {
        return herausgeber;
    }

    public void setHerausgeber(Marktteilnehmer herausgeber) {
        this.herausgeber = herausgeber;
    }

    public List<Dienstleistungstyp> getInklusiveDienstleistungen() {
        return inklusiveDienstleistungen;
    }

    public void setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
        this.inklusiveDienstleistungen = inklusiveDienstleistungen;
    }

    public List<Geraet> getInklusiveGeraete() {
        return inklusiveGeraete;
    }

    public void setInklusiveGeraete(List<Geraet> inklusiveGeraete) {
        this.inklusiveGeraete = inklusiveGeraete;
    }

    public Netzebene getMessebene() {
        return messebene;
    }

    public void setMessebene(Netzebene messebene) {
        this.messebene = messebene;
    }

    public List<Preisposition> getPreispositionen() {
        return preispositionen;
    }

    public void setPreispositionen(List<Preisposition> preispositionen) {
        this.preispositionen = preispositionen;
    }

    public Preisstatus getPreisstatus() {
        return preisstatus;
    }

    public void setPreisstatus(Preisstatus preisstatus) {
        this.preisstatus = preisstatus;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public static class PreisblattHardwareBuilder extends GeschaeftsobjektBuilder {
        /**
         * Der Preis betriftt das hier angegebene Gerät, z.B. ein Tarifschaltgerät
         */
        private Geraet basisgeraet;
        /**
         * Eine Bezeichnung für das Preisblatt
         */
        private String bezeichnung;
        /**
         * Die Preise gelten für Marktlokationen der angebebenen Bilanzierungsmethode
         */
        private Bilanzierungsmethode bilanzierungsmethode;
        /**
         * Der Zeitraum für den der Preis festgelegt ist
         */
        private Zeitraum gueltigkeit;
        /**
         * Der Netzbetreiber, der die Preise veröffentlicht hat
         */
        private Marktteilnehmer herausgeber;
        /**
         * Im Preis sind die hier angegebenen Dienstleistungen enthalten, z.B. Jährliche Ablesung
         */
        private List<Dienstleistungstyp> inklusiveDienstleistungen;
        /**
         * Im Preis sind die hier angegebenen Geräte mit enthalten, z.B. ein Wandler
         */
        private List<Geraet> inklusiveGeraete;
        /**
         * Die Preise gelten für Messlokationen in der angebebenen Netzebene
         */
        private Netzebene messebene;
        /**
         * Die einzelnen Positionen, die mit dem Preisblatt abgerechnet werden können. Z.B.
         * Arbeitspreis, Grundpreis etc
         */
        private List<Preisposition> preispositionen;
        /**
         * Merkmal, das anzeigt, ob es sich um vorläufige oder endgültige Preise handelt
         */
        private Preisstatus preisstatus;
        /**
         * Preisblatt gilt für angegebene Sparte
         */
        private Sparte sparte;
    
        public Geraet getBasisgeraet() {
            return basisgeraet;
        }
    
        public PreisblattHardwareBuilder setBasisgeraet(Geraet basisgeraet) {
            this.basisgeraet = basisgeraet;
            return this;
        }
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public PreisblattHardwareBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Bilanzierungsmethode getBilanzierungsmethode() {
            return bilanzierungsmethode;
        }
    
        public PreisblattHardwareBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }
    
        public Zeitraum getGueltigkeit() {
            return gueltigkeit;
        }
    
        public PreisblattHardwareBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }
    
        public Marktteilnehmer getHerausgeber() {
            return herausgeber;
        }
    
        public PreisblattHardwareBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }
    
        public List<Dienstleistungstyp> getInklusiveDienstleistungen() {
            return inklusiveDienstleistungen;
        }
    
        public PreisblattHardwareBuilder setInklusiveDienstleistungen(List<Dienstleistungstyp> inklusiveDienstleistungen) {
            this.inklusiveDienstleistungen = inklusiveDienstleistungen;
            return this;
        }
    
        public List<Geraet> getInklusiveGeraete() {
            return inklusiveGeraete;
        }
    
        public PreisblattHardwareBuilder setInklusiveGeraete(List<Geraet> inklusiveGeraete) {
            this.inklusiveGeraete = inklusiveGeraete;
            return this;
        }
    
        public Netzebene getMessebene() {
            return messebene;
        }
    
        public PreisblattHardwareBuilder setMessebene(Netzebene messebene) {
            this.messebene = messebene;
            return this;
        }
    
        public List<Preisposition> getPreispositionen() {
            return preispositionen;
        }
    
        public PreisblattHardwareBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }
    
        public Preisstatus getPreisstatus() {
            return preisstatus;
        }
    
        public PreisblattHardwareBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public PreisblattHardwareBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public PreisblattHardwareBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public PreisblattHardwareBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public PreisblattHardware build() {
            return new PreisblattHardware(this);
        }
    }
}