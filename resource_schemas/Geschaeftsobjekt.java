package placeholder;

/**
 * Das BO Geschäftsobjekt ist der Master für alle Geschäftsobjekte.
 * Alle Attribute, die hier in diesem BO enthalten sind, werden an alle BOs vererbt.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geschaeftsobjekt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geschaeftsobjekt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1-/src/bo4e_schemas/bo/Geschaeftsobjekt.json>`_
 */
public class Geschaeftsobjekt {
    private String id;
    private Typ typ;
    private String version;
    private ZusatzAttribut[] zusatzAttribute;

    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public ZusatzAttribut[] getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(ZusatzAttribut[] value) { this.zusatzAttribute = value; }
}
