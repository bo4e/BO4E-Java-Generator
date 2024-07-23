package bo4e.com;

import bo4e.enums.ArithmetischeOperation;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Mit dieser Komponente werden Messlokationen zu Marktlokationen zugeordnet.
 * Dabei kann eine arithmetische Operation (Addition, Subtraktion, Multiplikation, Division)
 * angegeben werden,
 * mit der die Messlokation zum Verbrauch der Marktlokation beiträgt.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Messlokationszuordnung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Messlokationszuordnung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Messlokationszuordnung.json>`_
 */
public class Messlokationszuordnung extends COM {
    private ArithmetischeOperation arithmetik;
    /**
     * exklusives Endedatum
     */
    private OffsetDateTime gueltigBis;
    /**
     * gueltig_bis: Optional[pydantic.AwareDatetime] = None
     */
    private OffsetDateTime gueltigSeit;
    /**
     * arithmetik: Optional["ArithmetischeOperation"] = None
     *
     * gueltig_seit: Optional[pydantic.AwareDatetime] = None
     */
    private String messlokationsId;

    public Messlokationszuordnung() {
    }

    private Messlokationszuordnung(MesslokationszuordnungBuilder builder) {
        super(builder);
        this.arithmetik = builder.arithmetik;
        this.gueltigBis = builder.gueltigBis;
        this.gueltigSeit = builder.gueltigSeit;
        this.messlokationsId = builder.messlokationsId;
    }

    public ArithmetischeOperation getArithmetik() {
        return arithmetik;
    }

    public void setArithmetik(ArithmetischeOperation arithmetik) {
        this.arithmetik = arithmetik;
    }

    public OffsetDateTime getGueltigBis() {
        return gueltigBis;
    }

    public void setGueltigBis(OffsetDateTime gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    public OffsetDateTime getGueltigSeit() {
        return gueltigSeit;
    }

    public void setGueltigSeit(OffsetDateTime gueltigSeit) {
        this.gueltigSeit = gueltigSeit;
    }

    public String getMesslokationsId() {
        return messlokationsId;
    }

    public void setMesslokationsId(String messlokationsId) {
        this.messlokationsId = messlokationsId;
    }

    public static class MesslokationszuordnungBuilder extends COMBuilder {
        private ArithmetischeOperation arithmetik;
        /**
         * exklusives Endedatum
         */
        private OffsetDateTime gueltigBis;
        /**
         * gueltig_bis: Optional[pydantic.AwareDatetime] = None
         */
        private OffsetDateTime gueltigSeit;
        /**
         * arithmetik: Optional["ArithmetischeOperation"] = None
         *
         * gueltig_seit: Optional[pydantic.AwareDatetime] = None
         */
        private String messlokationsId;
    
        public ArithmetischeOperation getArithmetik() {
            return arithmetik;
        }
    
        public MesslokationszuordnungBuilder setArithmetik(ArithmetischeOperation arithmetik) {
            this.arithmetik = arithmetik;
            return this;
        }
    
        public OffsetDateTime getGueltigBis() {
            return gueltigBis;
        }
    
        public MesslokationszuordnungBuilder setGueltigBis(OffsetDateTime gueltigBis) {
            this.gueltigBis = gueltigBis;
            return this;
        }
    
        public OffsetDateTime getGueltigSeit() {
            return gueltigSeit;
        }
    
        public MesslokationszuordnungBuilder setGueltigSeit(OffsetDateTime gueltigSeit) {
            this.gueltigSeit = gueltigSeit;
            return this;
        }
    
        public String getMesslokationsId() {
            return messlokationsId;
        }
    
        public MesslokationszuordnungBuilder setMesslokationsId(String messlokationsId) {
            this.messlokationsId = messlokationsId;
            return this;
        }
    
        public Messlokationszuordnung build() {
            return new Messlokationszuordnung(this);
        }
    }
}