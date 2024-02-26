package placeholder;

/**
 * base class for all components
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/COM.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `COM JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1-/src/bo4e_schemas/com/COM.json>`_
 */
public class COM {
    private String id;
    private String version;
    private ZusatzAttribut[] zusatzAttribute;

    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public ZusatzAttribut[] getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(ZusatzAttribut[] value) { this.zusatzAttribute = value; }
}
