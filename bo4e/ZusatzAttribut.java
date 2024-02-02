package placeholder;

/**
 * Viele Datenobjekte weisen in unterschiedlichen Systemen eine eindeutige ID (Kundennummer,
 * GP-Nummer etc.) auf.
 * Beim Austausch von Datenobjekten zwischen verschiedenen Systemen ist es daher hilfreich,
 * sich die eindeutigen IDs der anzubindenden Systeme zu merken.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/ZusatzAttribut.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `ZusatzAttribut JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/ZusatzAttribut.json>`_
 */
public class ZusatzAttribut {
    private String name;
    private Object wert;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Object getWert() { return wert; }
    public void setWert(Object value) { this.wert = value; }
}
