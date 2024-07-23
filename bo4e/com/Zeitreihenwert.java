package bo4e.com;

import bo4e.enums.Messwertstatus;
import bo4e.enums.Messwertstatuszusatz;

import java.util.List;

/**
 * Abbildung eines Zeitreihenwertes bestehend aus Zeitraum, Wert und Statusinformationen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitreihenwert.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitreihenwert JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zeitreihenwert.json>`_
 */
public class Zeitreihenwert extends COM {
    /**
     * Der Status gibt an, wie der Wert zu interpretieren ist, z.B. in Berechnungen.
     */
    private Messwertstatus status;
    /**
     * Eine Zusatzinformation zum Status, beispielsweise ein Grund für einen fehlenden Wert.
     */
    private Messwertstatuszusatz statuszusatz;
    /**
     * Zeitespanne für das Messintervall
     */
    private Double wert;
    /**
     * Zeitespanne für das Messintervall
     */
    private Zeitspanne zeitspanne;

    public Zeitreihenwert() {
    }

    private Zeitreihenwert(ZeitreihenwertBuilder builder) {
        super(builder);
        this.status = builder.status;
        this.statuszusatz = builder.statuszusatz;
        this.wert = builder.wert;
        this.zeitspanne = builder.zeitspanne;
    }

    public Messwertstatus getStatus() {
        return status;
    }

    public void setStatus(Messwertstatus status) {
        this.status = status;
    }

    public Messwertstatuszusatz getStatuszusatz() {
        return statuszusatz;
    }

    public void setStatuszusatz(Messwertstatuszusatz statuszusatz) {
        this.statuszusatz = statuszusatz;
    }

    public Double getWert() {
        return wert;
    }

    public void setWert(Double wert) {
        this.wert = wert;
    }

    public Zeitspanne getZeitspanne() {
        return zeitspanne;
    }

    public void setZeitspanne(Zeitspanne zeitspanne) {
        this.zeitspanne = zeitspanne;
    }

    public static class ZeitreihenwertBuilder extends COMBuilder {
        /**
         * Der Status gibt an, wie der Wert zu interpretieren ist, z.B. in Berechnungen.
         */
        private Messwertstatus status;
        /**
         * Eine Zusatzinformation zum Status, beispielsweise ein Grund für einen fehlenden Wert.
         */
        private Messwertstatuszusatz statuszusatz;
        /**
         * Zeitespanne für das Messintervall
         */
        private Double wert;
        /**
         * Zeitespanne für das Messintervall
         */
        private Zeitspanne zeitspanne;
    
        public Messwertstatus getStatus() {
            return status;
        }
    
        public ZeitreihenwertBuilder setStatus(Messwertstatus status) {
            this.status = status;
            return this;
        }
    
        public Messwertstatuszusatz getStatuszusatz() {
            return statuszusatz;
        }
    
        public ZeitreihenwertBuilder setStatuszusatz(Messwertstatuszusatz statuszusatz) {
            this.statuszusatz = statuszusatz;
            return this;
        }
    
        public Double getWert() {
            return wert;
        }
    
        public ZeitreihenwertBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }
    
        public Zeitspanne getZeitspanne() {
            return zeitspanne;
        }
    
        public ZeitreihenwertBuilder setZeitspanne(Zeitspanne zeitspanne) {
            this.zeitspanne = zeitspanne;
            return this;
        }
    
        public Zeitreihenwert build() {
            return new Zeitreihenwert(this);
        }
    }
}