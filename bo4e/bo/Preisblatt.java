package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.com.Preisposition;
import bo4e.enums.Preisstatus;
import bo4e.enums.Sparte;

import java.util.List;

/**
 * Das allgemeine Modell zur Abbildung von Preisen;
 * Davon abgeleitet können, über die Zuordnung identifizierender Merkmale, spezielle
 * Preisblatt-Varianten modelliert
 * werden.
 *
 * Die jeweiligen Sätze von Merkmalen sind in der Grafik ergänzt worden und stellen jeweils
 * eine Ausprägung für die
 * verschiedenen Anwendungsfälle der Preisblätter dar.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Preisblatt.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisblatt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Preisblatt.json>`_
 */
public class Preisblatt extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.PREISBLATT;
    /**
     * Eine Bezeichnung für das Preisblatt
     */
    private String bezeichnung;
    /**
     * Der Zeitraum für den der Preis festgelegt ist
     */
    private Zeitraum gueltigkeit;
    /**
     * Der Netzbetreiber, der die Preise veröffentlicht hat
     */
    private Marktteilnehmer herausgeber;
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

    public Preisblatt() {
    }

    private Preisblatt(PreisblattBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.gueltigkeit = builder.gueltigkeit;
        this.herausgeber = builder.herausgeber;
        this.preispositionen = builder.preispositionen;
        this.preisstatus = builder.preisstatus;
        this.sparte = builder.sparte;
    }

    public Typ getTyp() {
        return typ;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
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

    public static class PreisblattBuilder extends GeschaeftsobjektBuilder {
        /**
         * Eine Bezeichnung für das Preisblatt
         */
        private String bezeichnung;
        /**
         * Der Zeitraum für den der Preis festgelegt ist
         */
        private Zeitraum gueltigkeit;
        /**
         * Der Netzbetreiber, der die Preise veröffentlicht hat
         */
        private Marktteilnehmer herausgeber;
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
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public PreisblattBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Zeitraum getGueltigkeit() {
            return gueltigkeit;
        }
    
        public PreisblattBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }
    
        public Marktteilnehmer getHerausgeber() {
            return herausgeber;
        }
    
        public PreisblattBuilder setHerausgeber(Marktteilnehmer herausgeber) {
            this.herausgeber = herausgeber;
            return this;
        }
    
        public List<Preisposition> getPreispositionen() {
            return preispositionen;
        }
    
        public PreisblattBuilder setPreispositionen(List<Preisposition> preispositionen) {
            this.preispositionen = preispositionen;
            return this;
        }
    
        public Preisstatus getPreisstatus() {
            return preisstatus;
        }
    
        public PreisblattBuilder setPreisstatus(Preisstatus preisstatus) {
            this.preisstatus = preisstatus;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public PreisblattBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public Preisblatt build() {
            return new Preisblatt(this);
        }
    }
}