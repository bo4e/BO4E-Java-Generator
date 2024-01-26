package bo4e.com;

import com.example.bo4e.enums.ArithmetischeOperation;
import java.time.OffsetDateTime;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Messlokationszuordnung.json>`_
 */
public class Messlokationszuordnung extends COM {
    private ArithmetischeOperation arithmetik;
    private OffsetDateTime gueltigBis;
    private OffsetDateTime gueltigSeit;
    private String messlokationsID;

    public ArithmetischeOperation getArithmetik() { return arithmetik; }
    public void setArithmetik(ArithmetischeOperation value) { this.arithmetik = value; }

    public OffsetDateTime getGueltigBis() { return gueltigBis; }
    public void setGueltigBis(OffsetDateTime value) { this.gueltigBis = value; }

    public OffsetDateTime getGueltigSeit() { return gueltigSeit; }
    public void setGueltigSeit(OffsetDateTime value) { this.gueltigSeit = value; }

    public String getMesslokationsID() { return messlokationsID; }
    public void setMesslokationsID(String value) { this.messlokationsID = value; }

}
