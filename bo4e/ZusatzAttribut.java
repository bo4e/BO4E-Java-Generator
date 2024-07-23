package bo4e;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/ZusatzAttribut.json>`_
 */
public class ZusatzAttribut {
    /**
     * Bezeichnung der externen Referenz (z.B. "microservice xyz" oder "SAP CRM GP-Nummer")
     */
    private String name;
    /**
     * Bezeichnung der externen Referenz (z.B. "microservice xyz" oder "SAP CRM GP-Nummer")
     */
    private Object wert;

    public ZusatzAttribut() {
    }

    private ZusatzAttribut(ZusatzAttributBuilder builder) {
        this.name = builder.name;
        this.wert = builder.wert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getWert() {
        return wert;
    }

    public void setWert(Object wert) {
        this.wert = wert;
    }

    public static class ZusatzAttributBuilder {
        /**
         * Bezeichnung der externen Referenz (z.B. "microservice xyz" oder "SAP CRM GP-Nummer")
         */
        private String name;
        /**
         * Bezeichnung der externen Referenz (z.B. "microservice xyz" oder "SAP CRM GP-Nummer")
         */
        private Object wert;
    
        public String getName() {
            return name;
        }
    
        public ZusatzAttributBuilder setName(String name) {
            this.name = name;
            return this;
        }
    
        public Object getWert() {
            return wert;
        }
    
        public ZusatzAttributBuilder setWert(Object wert) {
            this.wert = wert;
            return this;
        }
    
        public ZusatzAttribut build() {
            return new ZusatzAttribut(this);
        }
    }
}