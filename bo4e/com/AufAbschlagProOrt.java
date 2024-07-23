package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen im Zusammenhang
 * mit örtlichen Gültigkeiten abgebildet werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagProOrt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagProOrt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/AufAbschlagProOrt.json>`_
 */
public class AufAbschlagProOrt extends COM {
    /**
     * Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
     */
    private String netznr;
    /**
     * Der Ort für den der Aufschlag gilt.
     */
    private String ort;
    /**
     * Die Postleitzahl des Ortes für den der Aufschlag gilt.
     */
    private String postleitzahl;
    /**
     * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
     */
    private List<AufAbschlagstaffelProOrt> staffeln;

    public AufAbschlagProOrt() {
    }

    private AufAbschlagProOrt(AufAbschlagProOrtBuilder builder) {
        super(builder);
        this.netznr = builder.netznr;
        this.ort = builder.ort;
        this.postleitzahl = builder.postleitzahl;
        this.staffeln = builder.staffeln;
    }

    public String getNetznr() {
        return netznr;
    }

    public void setNetznr(String netznr) {
        this.netznr = netznr;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public List<AufAbschlagstaffelProOrt> getStaffeln() {
        return staffeln;
    }

    public void setStaffeln(List<AufAbschlagstaffelProOrt> staffeln) {
        this.staffeln = staffeln;
    }

    public static class AufAbschlagProOrtBuilder extends COMBuilder {
        /**
         * Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
         */
        private String netznr;
        /**
         * Der Ort für den der Aufschlag gilt.
         */
        private String ort;
        /**
         * Die Postleitzahl des Ortes für den der Aufschlag gilt.
         */
        private String postleitzahl;
        /**
         * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
         */
        private List<AufAbschlagstaffelProOrt> staffeln;
    
        public String getNetznr() {
            return netznr;
        }
    
        public AufAbschlagProOrtBuilder setNetznr(String netznr) {
            this.netznr = netznr;
            return this;
        }
    
        public String getOrt() {
            return ort;
        }
    
        public AufAbschlagProOrtBuilder setOrt(String ort) {
            this.ort = ort;
            return this;
        }
    
        public String getPostleitzahl() {
            return postleitzahl;
        }
    
        public AufAbschlagProOrtBuilder setPostleitzahl(String postleitzahl) {
            this.postleitzahl = postleitzahl;
            return this;
        }
    
        public List<AufAbschlagstaffelProOrt> getStaffeln() {
            return staffeln;
        }
    
        public AufAbschlagProOrtBuilder setStaffeln(List<AufAbschlagstaffelProOrt> staffeln) {
            this.staffeln = staffeln;
            return this;
        }
    
        public AufAbschlagProOrtBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public AufAbschlagProOrtBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public AufAbschlagProOrt build() {
            return new AufAbschlagProOrt(this);
        }
    }
}