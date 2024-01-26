package bo4e.com;

import java.time.OffsetDateTime;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Vertragsteil.json>`_
 */
public class Vertragsteil extends COM {
    private String lokation;
    private Menge maximaleAbnahmemenge;
    private Menge minimaleAbnahmemenge;
    private Menge vertraglichFixierteMenge;
    private OffsetDateTime vertragsteilbeginn;
    private OffsetDateTime vertragsteilende;

    public String getLokation() { return lokation; }
    public void setLokation(String value) { this.lokation = value; }

    public Menge getMaximaleAbnahmemenge() { return maximaleAbnahmemenge; }
    public void setMaximaleAbnahmemenge(Menge value) { this.maximaleAbnahmemenge = value; }

    public Menge getMinimaleAbnahmemenge() { return minimaleAbnahmemenge; }
    public void setMinimaleAbnahmemenge(Menge value) { this.minimaleAbnahmemenge = value; }

    public Menge getVertraglichFixierteMenge() { return vertraglichFixierteMenge; }
    public void setVertraglichFixierteMenge(Menge value) { this.vertraglichFixierteMenge = value; }

    public OffsetDateTime getVertragsteilbeginn() { return vertragsteilbeginn; }
    public void setVertragsteilbeginn(OffsetDateTime value) { this.vertragsteilbeginn = value; }

    public OffsetDateTime getVertragsteilende() { return vertragsteilende; }
    public void setVertragsteilende(OffsetDateTime value) { this.vertragsteilende = value; }

}
