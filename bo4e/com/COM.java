package bo4e.com;

import bo4e.ZusatzAttribut;

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
public abstract class COM {
    private String _id;
    private final String _version = "202401.2.1";
    private ZusatzAttribut[] zusatzAttribute;

    public String getId() { return _id; }
    public void setId(String value) { this._id = value; }

    public String getSchemaVersion() { return _version; }

    public ZusatzAttribut[] getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(ZusatzAttribut[] value) { this.zusatzAttribute = value; }
}
