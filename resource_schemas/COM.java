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
    private String id;
    private final String boVersion = versionPlaceholder;
    private List<ZusatzAttribut> zusatzAttribute;

    public COM() {
    }

    protected COM(COMBuilder builder) {
        this.id = builder.id;
        this.zusatzAttribute = builder.zusatzAttribute;
    }

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getId() {
        return id;
    }

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getBoVersion() {
        return boVersion;
    }

    public List<ZusatzAttribut> getZusatzAttribute() {
        return zusatzAttribute;
    }

    public void setZusatzAttribute(List<ZusatzAttribut> value) {
        this.zusatzAttribute = value;
    }

    public abstract static class COMBuilder {
        private String id;
        private List<ZusatzAttribut> zusatzAttribute;

        /**
         * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
         */
        public String getId() {
            return id;
        }

        /**
         * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
         */
        public COMBuilder setId(String value) {
            this.id = value;
            return this;
        }

        public List<ZusatzAttribut> getZusatzAttribute() {
            return zusatzAttribute;
        }

        public COMBuilder setZusatzAttribute(List<ZusatzAttribut> value) {
            this.zusatzAttribute = value;
            return this;
        }
    }
}
