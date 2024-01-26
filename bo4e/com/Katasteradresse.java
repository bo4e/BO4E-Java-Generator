package bo4e.com;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Katasteradresse.json>`_
 */
public class Katasteradresse extends COM {
    private String flurstueck;
    private String gemarkungFlur;

    public String getFlurstueck() { return flurstueck; }
    public void setFlurstueck(String value) { this.flurstueck = value; }

    public String getGemarkungFlur() { return gemarkungFlur; }
    public void setGemarkungFlur(String value) { this.gemarkungFlur = value; }

}
