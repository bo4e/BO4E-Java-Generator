package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Messwertstatus;
import bo4e.enums.Wertermittlungsverfahren;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Abbildung eines zeitlich abgegrenzten Verbrauchs
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Verbrauch.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Verbrauch JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Verbrauch.json>`_
 */
public class Verbrauch extends COM {
    /**
     * Gibt die Einheit zum jeweiligen Wert an
     */
    private Mengeneinheit einheit;
    /**
     * Exklusives Ende des Zeitraumes, für den der Verbrauch angegeben wird
     */
    private OffsetDateTime enddatum;
    /**
     * Messwertstatus includes the plausibility of the value
     */
    private Messwertstatus messwertstatus;
    /**
     * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
     * z.B. '1-0:
     */
    private String obisKennzahl;
    /**
     * Inklusiver Beginn des Zeitraumes, für den der Verbrauch angegeben wird
     */
    private OffsetDateTime startdatum;
    /**
     * Gibt den absoluten Wert der Menge an
     */
    private Double wert;
    /**
     * Gibt an, ob es sich um eine PROGNOSE oder eine MESSUNG handelt
     */
    private Wertermittlungsverfahren wertermittlungsverfahren;

    public Verbrauch() {
    }

    private Verbrauch(VerbrauchBuilder builder) {
        super(builder);
        this.einheit = builder.einheit;
        this.enddatum = builder.enddatum;
        this.messwertstatus = builder.messwertstatus;
        this.obisKennzahl = builder.obisKennzahl;
        this.startdatum = builder.startdatum;
        this.wert = builder.wert;
        this.wertermittlungsverfahren = builder.wertermittlungsverfahren;
    }

    public Mengeneinheit getEinheit() {
        return einheit;
    }

    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    public OffsetDateTime getEnddatum() {
        return enddatum;
    }

    public void setEnddatum(OffsetDateTime enddatum) {
        this.enddatum = enddatum;
    }

    public Messwertstatus getMesswertstatus() {
        return messwertstatus;
    }

    public void setMesswertstatus(Messwertstatus messwertstatus) {
        this.messwertstatus = messwertstatus;
    }

    public String getObisKennzahl() {
        return obisKennzahl;
    }

    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    public OffsetDateTime getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(OffsetDateTime startdatum) {
        this.startdatum = startdatum;
    }

    public Double getWert() {
        return wert;
    }

    public void setWert(Double wert) {
        this.wert = wert;
    }

    public Wertermittlungsverfahren getWertermittlungsverfahren() {
        return wertermittlungsverfahren;
    }

    public void setWertermittlungsverfahren(Wertermittlungsverfahren wertermittlungsverfahren) {
        this.wertermittlungsverfahren = wertermittlungsverfahren;
    }

    public static class VerbrauchBuilder extends COMBuilder {
        /**
         * Gibt die Einheit zum jeweiligen Wert an
         */
        private Mengeneinheit einheit;
        /**
         * Exklusives Ende des Zeitraumes, für den der Verbrauch angegeben wird
         */
        private OffsetDateTime enddatum;
        /**
         * Messwertstatus includes the plausibility of the value
         */
        private Messwertstatus messwertstatus;
        /**
         * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
         * z.B. '1-0:
         */
        private String obisKennzahl;
        /**
         * Inklusiver Beginn des Zeitraumes, für den der Verbrauch angegeben wird
         */
        private OffsetDateTime startdatum;
        /**
         * Gibt den absoluten Wert der Menge an
         */
        private Double wert;
        /**
         * Gibt an, ob es sich um eine PROGNOSE oder eine MESSUNG handelt
         */
        private Wertermittlungsverfahren wertermittlungsverfahren;
    
        public Mengeneinheit getEinheit() {
            return einheit;
        }
    
        public VerbrauchBuilder setEinheit(Mengeneinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public OffsetDateTime getEnddatum() {
            return enddatum;
        }
    
        public VerbrauchBuilder setEnddatum(OffsetDateTime enddatum) {
            this.enddatum = enddatum;
            return this;
        }
    
        public Messwertstatus getMesswertstatus() {
            return messwertstatus;
        }
    
        public VerbrauchBuilder setMesswertstatus(Messwertstatus messwertstatus) {
            this.messwertstatus = messwertstatus;
            return this;
        }
    
        public String getObisKennzahl() {
            return obisKennzahl;
        }
    
        public VerbrauchBuilder setObisKennzahl(String obisKennzahl) {
            this.obisKennzahl = obisKennzahl;
            return this;
        }
    
        public OffsetDateTime getStartdatum() {
            return startdatum;
        }
    
        public VerbrauchBuilder setStartdatum(OffsetDateTime startdatum) {
            this.startdatum = startdatum;
            return this;
        }
    
        public Double getWert() {
            return wert;
        }
    
        public VerbrauchBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }
    
        public Wertermittlungsverfahren getWertermittlungsverfahren() {
            return wertermittlungsverfahren;
        }
    
        public VerbrauchBuilder setWertermittlungsverfahren(Wertermittlungsverfahren wertermittlungsverfahren) {
            this.wertermittlungsverfahren = wertermittlungsverfahren;
            return this;
        }
    
        public Verbrauch build() {
            return new Verbrauch(this);
        }
    }
}