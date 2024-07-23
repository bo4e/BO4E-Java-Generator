package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preistyp;
import bo4e.enums.Preisstatus;

import java.util.List;

/**
 * Abbildung eines Tarifpreises mit Preistyp und Beschreibung abgeleitet von COM Preis.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifpreis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifpreis.json>`_
 */
public class Tarifpreis extends COM {
    /**
     * Beschreibung des Preises. Hier können z.B. Preisdetails angegeben sein, beispielsweise
     * "Drehstromzähler".
     */
    private String beschreibung;
    /**
     * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
     */
    private Mengeneinheit bezugswert;
    /**
     * Währungseinheit für den Preis, z.B. Euro oder Ct.
     */
    private Waehrungseinheit einheit;
    /**
     * Angabe des Preistypes (z.B. Grundpreis)
     */
    private Preistyp preistyp;
    /**
     * Gibt den Status des veröffentlichten Preises an
     */
    private Preisstatus status;
    /**
     * Gibt die nominale Höhe des Preises an.
     */
    private Double wert;

    public Tarifpreis() {}
    private Tarifpreis(TarifpreisBuilder builder) {
        this.beschreibung = builder.beschreibung;
        this.bezugswert = builder.bezugswert;
        this.einheit = builder.einheit;
        this.preistyp = builder.preistyp;
        this.status = builder.status;
        this.wert = builder.wert;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Mengeneinheit getBezugswert() {
        return bezugswert;
    }
    public void setBezugswert(Mengeneinheit bezugswert) {
        this.bezugswert = bezugswert;
    }

    public Waehrungseinheit getEinheit() {
        return einheit;
    }
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    public Preistyp getPreistyp() {
        return preistyp;
    }
    public void setPreistyp(Preistyp preistyp) {
        this.preistyp = preistyp;
    }

    public Preisstatus getStatus() {
        return status;
    }
    public void setStatus(Preisstatus status) {
        this.status = status;
    }

    public Double getWert() {
        return wert;
    }
    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static class TarifpreisBuilder extends COMBuilder {
        /**
         * Beschreibung des Preises. Hier können z.B. Preisdetails angegeben sein, beispielsweise
         * "Drehstromzähler".
         */
        private String beschreibung;
        /**
         * Angabe, für welche Bezugsgröße der Preis gilt. Z.B. kWh.
         */
        private Mengeneinheit bezugswert;
        /**
         * Währungseinheit für den Preis, z.B. Euro oder Ct.
         */
        private Waehrungseinheit einheit;
        /**
         * Angabe des Preistypes (z.B. Grundpreis)
         */
        private Preistyp preistyp;
        /**
         * Gibt den Status des veröffentlichten Preises an
         */
        private Preisstatus status;
        /**
         * Gibt die nominale Höhe des Preises an.
         */
        private Double wert;
    
        public String getBeschreibung() {
            return beschreibung;
        }
        public TarifpreisBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }
    
        public Mengeneinheit getBezugswert() {
            return bezugswert;
        }
        public TarifpreisBuilder setBezugswert(Mengeneinheit bezugswert) {
            this.bezugswert = bezugswert;
            return this;
        }
    
        public Waehrungseinheit getEinheit() {
            return einheit;
        }
        public TarifpreisBuilder setEinheit(Waehrungseinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public Preistyp getPreistyp() {
            return preistyp;
        }
        public TarifpreisBuilder setPreistyp(Preistyp preistyp) {
            this.preistyp = preistyp;
            return this;
        }
    
        public Preisstatus getStatus() {
            return status;
        }
        public TarifpreisBuilder setStatus(Preisstatus status) {
            this.status = status;
            return this;
        }
    
        public Double getWert() {
            return wert;
        }
        public TarifpreisBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }
    
        public Tarifpreis build() {
            return new Tarifpreis(this);
        }
    }
}