package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.ZusatzAttribut;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Geschaeftsobjekt.json>`_
 */
public abstract class Geschaeftsobjekt {
    private String _id;
    private final Typ typ = Typ.GESCHAEFTSOBJEKT;
    private final String _version = "202401.0.0";
    private ZusatzAttribut[] zusatzAttribute;

    public String getId() { return _id; }
    public void setId(String value) { this._id = value; }

    public Typ getTyp() { return typ; }

    public String getSchemaVersion() { return _version; }

    public ZusatzAttribut[] getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(ZusatzAttribut[] value) { this.zusatzAttribute = value; }
}
