package packagePlaceholder;
comTypImportPlaceholder
zaImportPlaceholder

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
    private String _id;comTypFieldPlaceholder
    private final String _version = versionPlaceholder;
    private List<ZusatzAttribut> zusatzAttribute;

    protected COM(COMBuilder builder) {
        this._id = builder._id;
        this.zusatzAttribute = builder.zusatzAttribute;
    }

    protected COM() {
    }

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String get_id() {
        return _id;
    }

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public void set_id(String value) {
        this._id = value;
    }comTypGetterPlaceholder

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String get_version() {
        return _version;
    }

    public List<ZusatzAttribut> getZusatzAttribute() {
        return zusatzAttribute;
    }

    public void setZusatzAttribute(List<ZusatzAttribut> value) {
        this.zusatzAttribute = value;
    }

    public abstract static class COMBuilder {
        private String _id;
        private List<ZusatzAttribut> zusatzAttribute;

        /**
         * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
         */
        public COMBuilder set_id(String value) {
            this._id = value;
            return this;
        }

        public COMBuilder setZusatzAttribute(List<ZusatzAttribut> value) {
            this.zusatzAttribute = value;
            return this;
        }

        public abstract COM build();
    }
}
