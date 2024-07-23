package bo4e.com;

import bo4e.enums.Marktrolle;
import bo4e.enums.Verwendungszweck;

import java.util.List;

/**
 * Dient zur Identifizierung des Verwendungszwecks der Marktrolle an der Marktlokation, der
 * die Werte zu übermitteln sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Verwendungszweck.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Verwendungszweck JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Verwendungszweck.json>`_
 */
public class VerwendungszweckProMarktrolle extends COM {
    /**
     * Zwecke: Optional[list["Verwendungszweck"]] = None
     */
    private Marktrolle marktrolle;
    /**
     * Verwendungszwecke
     */
    private List<Verwendungszweck> zwecke;

    public VerwendungszweckProMarktrolle() {}
    private VerwendungszweckProMarktrolle(VerwendungszweckProMarktrolleBuilder builder) {
        this.marktrolle = builder.marktrolle;
        this.zwecke = builder.zwecke;
    }

    public Marktrolle getMarktrolle() {
        return marktrolle;
    }
    public void setMarktrolle(Marktrolle marktrolle) {
        this.marktrolle = marktrolle;
    }

    public List<Verwendungszweck> getZwecke() {
        return zwecke;
    }
    public void setZwecke(List<Verwendungszweck> zwecke) {
        this.zwecke = zwecke;
    }

    public static class VerwendungszweckProMarktrolleBuilder extends COMBuilder {
        /**
         * Zwecke: Optional[list["Verwendungszweck"]] = None
         */
        private Marktrolle marktrolle;
        /**
         * Verwendungszwecke
         */
        private List<Verwendungszweck> zwecke;
    
        public Marktrolle getMarktrolle() {
            return marktrolle;
        }
        public VerwendungszweckProMarktrolleBuilder setMarktrolle(Marktrolle marktrolle) {
            this.marktrolle = marktrolle;
            return this;
        }
    
        public List<Verwendungszweck> getZwecke() {
            return zwecke;
        }
        public VerwendungszweckProMarktrolleBuilder setZwecke(List<Verwendungszweck> zwecke) {
            this.zwecke = zwecke;
            return this;
        }
    
        public VerwendungszweckProMarktrolle build() {
            return new VerwendungszweckProMarktrolle(this);
        }
    }
}