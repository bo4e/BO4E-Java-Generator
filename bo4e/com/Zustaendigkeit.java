package bo4e.com;

import bo4e.enums.Themengebiet;
import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Enthält die zeitliche Zuordnung eines Ansprechpartners zu Abteilungen und
 * Zuständigkeiten.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zustaendigkeit.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zustaendigkeit JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zustaendigkeit.json>`_
 */
public class Zustaendigkeit extends COM {
    /**
     * Berufliche Rolle des Ansprechpartners/ der Person
     */
    private String abteilung;
    /**
     * Berufliche Rolle des Ansprechpartners/ der Person
     */
    private String position;
    /**
     * Hier kann eine thematische Zuordnung des Ansprechpartners bzw. der Person angegeben werden
     */
    private Themengebiet themengebiet;

    public Zustaendigkeit() {
    }

    private Zustaendigkeit(ZustaendigkeitBuilder builder) {
        super(builder);
        this.abteilung = builder.abteilung;
        this.position = builder.position;
        this.themengebiet = builder.themengebiet;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Themengebiet getThemengebiet() {
        return themengebiet;
    }

    public void setThemengebiet(Themengebiet themengebiet) {
        this.themengebiet = themengebiet;
    }

    public static class ZustaendigkeitBuilder extends COMBuilder {
        /**
         * Berufliche Rolle des Ansprechpartners/ der Person
         */
        private String abteilung;
        /**
         * Berufliche Rolle des Ansprechpartners/ der Person
         */
        private String position;
        /**
         * Hier kann eine thematische Zuordnung des Ansprechpartners bzw. der Person angegeben werden
         */
        private Themengebiet themengebiet;
    
        public String getAbteilung() {
            return abteilung;
        }
    
        public ZustaendigkeitBuilder setAbteilung(String abteilung) {
            this.abteilung = abteilung;
            return this;
        }
    
        public String getPosition() {
            return position;
        }
    
        public ZustaendigkeitBuilder setPosition(String position) {
            this.position = position;
            return this;
        }
    
        public Themengebiet getThemengebiet() {
            return themengebiet;
        }
    
        public ZustaendigkeitBuilder setThemengebiet(Themengebiet themengebiet) {
            this.themengebiet = themengebiet;
            return this;
        }
    
        public ZustaendigkeitBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public ZustaendigkeitBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Zustaendigkeit build() {
            return new Zustaendigkeit(this);
        }
    }
}