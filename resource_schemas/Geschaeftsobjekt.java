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
    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    private String id;
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.GESCHAEFTSOBJEKT;
    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    private final String boVersion = versionPlaceholder;
    private List<ZusatzAttribut> zusatzAttribute;

    public Geschaeftsobjekt() {
    }

    protected Geschaeftsobjekt(GeschaeftsobjektBuilder builder) {
        this.id = builder.id;
        this.zusatzAttribute = builder.zusatzAttribute;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Typ getTyp() {
        return typ;
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

    public abstract static class GeschaeftsobjektBuilder {
        /**
         * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
         */
        private String id;
        private List<ZusatzAttribut> zusatzAttribute;

        public String getId() {
            return id;
        }

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
