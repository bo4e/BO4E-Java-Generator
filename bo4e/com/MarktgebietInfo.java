package bo4e.com;

import java.util.List;

/**
 * Informationen zum Marktgebiet im Gas.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/MarktgebietInfo.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `MarktgebietInfo JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/MarktgebietInfo.json>`_
 */
public class MarktgebietInfo extends COM {
    /**
     * Der Name des Marktgebietes
     */
    private String marktgebiet;
    /**
     * Der Name des Marktgebietes
     */
    private String marktgebietcode;

    public MarktgebietInfo() {
    }

    private MarktgebietInfo(MarktgebietInfoBuilder builder) {
        super(builder);
        this.marktgebiet = builder.marktgebiet;
        this.marktgebietcode = builder.marktgebietcode;
    }

    public String getMarktgebiet() {
        return marktgebiet;
    }

    public void setMarktgebiet(String marktgebiet) {
        this.marktgebiet = marktgebiet;
    }

    public String getMarktgebietcode() {
        return marktgebietcode;
    }

    public void setMarktgebietcode(String marktgebietcode) {
        this.marktgebietcode = marktgebietcode;
    }

    public static class MarktgebietInfoBuilder extends COMBuilder {
        /**
         * Der Name des Marktgebietes
         */
        private String marktgebiet;
        /**
         * Der Name des Marktgebietes
         */
        private String marktgebietcode;
    
        public String getMarktgebiet() {
            return marktgebiet;
        }
    
        public MarktgebietInfoBuilder setMarktgebiet(String marktgebiet) {
            this.marktgebiet = marktgebiet;
            return this;
        }
    
        public String getMarktgebietcode() {
            return marktgebietcode;
        }
    
        public MarktgebietInfoBuilder setMarktgebietcode(String marktgebietcode) {
            this.marktgebietcode = marktgebietcode;
            return this;
        }
    
        public MarktgebietInfo build() {
            return new MarktgebietInfo(this);
        }
    }
}