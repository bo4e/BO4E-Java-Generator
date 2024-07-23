package bo4e.com;

import bo4e.ZusatzAttribut;

import java.util.List;

/**
 * Dient der Adressierung über die Liegenschafts-Information.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Katasteradresse.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Katasteradresse JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Katasteradresse.json>`_
 */
public class Katasteradresse extends COM {
    private String flurstueck;
    private String gemarkungFlur;

    public Katasteradresse() {
    }

    private Katasteradresse(KatasteradresseBuilder builder) {
        super(builder);
        this.flurstueck = builder.flurstueck;
        this.gemarkungFlur = builder.gemarkungFlur;
    }

    public String getFlurstueck() {
        return flurstueck;
    }

    public void setFlurstueck(String flurstueck) {
        this.flurstueck = flurstueck;
    }

    public String getGemarkungFlur() {
        return gemarkungFlur;
    }

    public void setGemarkungFlur(String gemarkungFlur) {
        this.gemarkungFlur = gemarkungFlur;
    }

    public static class KatasteradresseBuilder extends COMBuilder {
        private String flurstueck;
        private String gemarkungFlur;
    
        public String getFlurstueck() {
            return flurstueck;
        }
    
        public KatasteradresseBuilder setFlurstueck(String flurstueck) {
            this.flurstueck = flurstueck;
            return this;
        }
    
        public String getGemarkungFlur() {
            return gemarkungFlur;
        }
    
        public KatasteradresseBuilder setGemarkungFlur(String gemarkungFlur) {
            this.gemarkungFlur = gemarkungFlur;
            return this;
        }
    
        public KatasteradresseBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public KatasteradresseBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Katasteradresse build() {
            return new Katasteradresse(this);
        }
    }
}