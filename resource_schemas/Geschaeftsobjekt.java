package packagePlaceholder;

import typImportPlaceholder.Typ;
import zaImportPlaceholder.ZusatzAttribut;

import java.util.List;

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
public abstract class Geschaeftsobjekt {
    private String id;
    private final Typ typ = Typ.GESCHAEFTSOBJEKT;
    private final String boVersion = versionPlaceholder;
    private List<ZusatzAttribut> zusatzAttribute;

    public Geschaeftsobjekt() {
    }

    protected Geschaeftsobjekt(GeschaeftsobjektBuilder builder) {
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
     * Typ des Geschaeftsobjekts
     */
    public Typ getTyp() {
        return typ;
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

    public abstract static class GeschaeftsobjektBuilder {
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
        public GeschaeftsobjektBuilder setId(String value) {
            this.id = value;
            return this;
        }

        public List<ZusatzAttribut> getZusatzAttribute() {
            return zusatzAttribute;
        }

        public GeschaeftsobjektBuilder setZusatzAttribute(List<ZusatzAttribut> value) {
            this.zusatzAttribute = value;
            return this;
        }
    }
}
