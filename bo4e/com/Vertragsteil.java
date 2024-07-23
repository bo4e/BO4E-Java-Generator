package bo4e.com;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Abbildung für einen Vertragsteil. Der Vertragsteil wird dazu verwendet,
 * eine vertragliche Leistung in Bezug zu einer Lokation (Markt- oder Messlokation)
 * festzulegen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Vertragsteil.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Vertragsteil JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Vertragsteil.json>`_
 */
public class Vertragsteil extends COM {
    /**
     * vertraglich_fixierte_menge: Optional["Menge"] = None
     */
    private String lokation;
    /**
     * Für die Lokation festgelegte maximale Abnahmemenge (exklusiv)
     */
    private Menge maximaleAbnahmemenge;
    /**
     * maximale_abnahmemenge: Optional["Menge"] = None
     */
    private Menge minimaleAbnahmemenge;
    /**
     * minimale_abnahmemenge: Optional["Menge"] = None
     */
    private Menge vertraglichFixierteMenge;
    /**
     * vertragsteilende: Optional[pydantic.AwareDatetime] = None
     */
    private OffsetDateTime vertragsteilbeginn;
    /**
     * lokation: Optional[str] = None
     */
    private OffsetDateTime vertragsteilende;

    public Vertragsteil() {}
    private Vertragsteil(VertragsteilBuilder builder) {
        this.lokation = builder.lokation;
        this.maximaleAbnahmemenge = builder.maximaleAbnahmemenge;
        this.minimaleAbnahmemenge = builder.minimaleAbnahmemenge;
        this.vertraglichFixierteMenge = builder.vertraglichFixierteMenge;
        this.vertragsteilbeginn = builder.vertragsteilbeginn;
        this.vertragsteilende = builder.vertragsteilende;
    }

    public String getLokation() {
        return lokation;
    }
    public void setLokation(String lokation) {
        this.lokation = lokation;
    }

    public Menge getMaximaleAbnahmemenge() {
        return maximaleAbnahmemenge;
    }
    public void setMaximaleAbnahmemenge(Menge maximaleAbnahmemenge) {
        this.maximaleAbnahmemenge = maximaleAbnahmemenge;
    }

    public Menge getMinimaleAbnahmemenge() {
        return minimaleAbnahmemenge;
    }
    public void setMinimaleAbnahmemenge(Menge minimaleAbnahmemenge) {
        this.minimaleAbnahmemenge = minimaleAbnahmemenge;
    }

    public Menge getVertraglichFixierteMenge() {
        return vertraglichFixierteMenge;
    }
    public void setVertraglichFixierteMenge(Menge vertraglichFixierteMenge) {
        this.vertraglichFixierteMenge = vertraglichFixierteMenge;
    }

    public OffsetDateTime getVertragsteilbeginn() {
        return vertragsteilbeginn;
    }
    public void setVertragsteilbeginn(OffsetDateTime vertragsteilbeginn) {
        this.vertragsteilbeginn = vertragsteilbeginn;
    }

    public OffsetDateTime getVertragsteilende() {
        return vertragsteilende;
    }
    public void setVertragsteilende(OffsetDateTime vertragsteilende) {
        this.vertragsteilende = vertragsteilende;
    }

    public static class VertragsteilBuilder extends COMBuilder {
        /**
         * vertraglich_fixierte_menge: Optional["Menge"] = None
         */
        private String lokation;
        /**
         * Für die Lokation festgelegte maximale Abnahmemenge (exklusiv)
         */
        private Menge maximaleAbnahmemenge;
        /**
         * maximale_abnahmemenge: Optional["Menge"] = None
         */
        private Menge minimaleAbnahmemenge;
        /**
         * minimale_abnahmemenge: Optional["Menge"] = None
         */
        private Menge vertraglichFixierteMenge;
        /**
         * vertragsteilende: Optional[pydantic.AwareDatetime] = None
         */
        private OffsetDateTime vertragsteilbeginn;
        /**
         * lokation: Optional[str] = None
         */
        private OffsetDateTime vertragsteilende;
    
        public String getLokation() {
            return lokation;
        }
        public VertragsteilBuilder setLokation(String lokation) {
            this.lokation = lokation;
            return this;
        }
    
        public Menge getMaximaleAbnahmemenge() {
            return maximaleAbnahmemenge;
        }
        public VertragsteilBuilder setMaximaleAbnahmemenge(Menge maximaleAbnahmemenge) {
            this.maximaleAbnahmemenge = maximaleAbnahmemenge;
            return this;
        }
    
        public Menge getMinimaleAbnahmemenge() {
            return minimaleAbnahmemenge;
        }
        public VertragsteilBuilder setMinimaleAbnahmemenge(Menge minimaleAbnahmemenge) {
            this.minimaleAbnahmemenge = minimaleAbnahmemenge;
            return this;
        }
    
        public Menge getVertraglichFixierteMenge() {
            return vertraglichFixierteMenge;
        }
        public VertragsteilBuilder setVertraglichFixierteMenge(Menge vertraglichFixierteMenge) {
            this.vertraglichFixierteMenge = vertraglichFixierteMenge;
            return this;
        }
    
        public OffsetDateTime getVertragsteilbeginn() {
            return vertragsteilbeginn;
        }
        public VertragsteilBuilder setVertragsteilbeginn(OffsetDateTime vertragsteilbeginn) {
            this.vertragsteilbeginn = vertragsteilbeginn;
            return this;
        }
    
        public OffsetDateTime getVertragsteilende() {
            return vertragsteilende;
        }
        public VertragsteilBuilder setVertragsteilende(OffsetDateTime vertragsteilende) {
            this.vertragsteilende = vertragsteilende;
            return this;
        }
    
        public Vertragsteil build() {
            return new Vertragsteil(this);
        }
    }
}