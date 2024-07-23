package bo4e.com;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Eine Zeitspanne ist definiert aus Start und/oder Ende.
 * Der Unterschied zur Menge (die auch zur Abbildung von Zeitmengen genutzt wird) ist, dass
 * konkrete Start- und Endzeitpunkte angegeben werden.
 * Die Zeitspanne ist aus dem COM Zeitraum hervorgegangen, das in Zeitspanne und Menge
 * aufgeteilt wurde.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitspanne.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitspanne JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zeitspanne.json>`_
 */
public class Zeitspanne extends COM {
    /**
     * inklusiver Beginn
     */
    private OffsetDateTime ende;
    /**
     * inklusiver Beginn
     */
    private OffsetDateTime start;

    public Zeitspanne() {}
    private Zeitspanne(ZeitspanneBuilder builder) {
        this.ende = builder.ende;
        this.start = builder.start;
    }

    public OffsetDateTime getEnde() {
        return ende;
    }
    public void setEnde(OffsetDateTime ende) {
        this.ende = ende;
    }

    public OffsetDateTime getStart() {
        return start;
    }
    public void setStart(OffsetDateTime start) {
        this.start = start;
    }

    public static class ZeitspanneBuilder extends COMBuilder {
        /**
         * inklusiver Beginn
         */
        private OffsetDateTime ende;
        /**
         * inklusiver Beginn
         */
        private OffsetDateTime start;
    
        public OffsetDateTime getEnde() {
            return ende;
        }
        public ZeitspanneBuilder setEnde(OffsetDateTime ende) {
            this.ende = ende;
            return this;
        }
    
        public OffsetDateTime getStart() {
            return start;
        }
        public ZeitspanneBuilder setStart(OffsetDateTime start) {
            this.start = start;
            return this;
        }
    
        public Zeitspanne build() {
            return new Zeitspanne(this);
        }
    }
}