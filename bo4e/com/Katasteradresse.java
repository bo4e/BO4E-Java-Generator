package bo4e.com;

import java.util.List;

/**
 * Dient der Adressierung über die Liegenschafts-Information.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Katasteradresse.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Katasteradresse JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Katasteradresse.json>`_
 */
public class Katasteradresse extends COM {
    private String flurstueck;
    private String gemarkungFlur;

    public String getFlurstueck() {
        return Flurstueck;
    }
    public void setFlurstueck(String flurstueck) {
        this.flurstueck = flurstueck;
    }

    public String getGemarkungFlur() {
        return GemarkungFlur;
    }
    public void setGemarkungFlur(String gemarkungFlur) {
        this.gemarkungFlur = gemarkungFlur;
    }
}