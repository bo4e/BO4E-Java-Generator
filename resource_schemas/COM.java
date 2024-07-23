package packagePlaceholder;

import zaImportPlaceholder.ZusatzAttribut;

import java.util.List;

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
    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    private String id;
    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    private final String boVersion = versionPlaceholder;
    private List<ZusatzAttribut> zusatzAttribute;

    public String getId() {
        return id;
    }
    public void setId(String value) {
        this.id = value;
    }

    public String getBoVersion() {
        return boVersion;
    }

    public List<ZusatzAttribut> getZusatzAttribute() {
        return zusatzAttribute;
    }
    public void setZusatzAttribute(List<ZusatzAttribut> value) {
        this.zusatzAttribute = value;
    }
}
