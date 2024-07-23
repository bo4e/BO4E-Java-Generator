package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Marktrolle;
import bo4e.enums.Rollencodetyp;
import bo4e.enums.Sparte;

import java.util.List;

/**
 * Objekt zur Aufnahme der Information zu einem Marktteilnehmer
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Marktteilnehmer.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Marktteilnehmer JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Marktteilnehmer.json>`_
 */
public class Marktteilnehmer extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.MARKTTEILNEHMER;
    /**
     * Der zu diesem Marktteilnehmer gehörende Geschäftspartner
     */
    private Geschaeftspartner geschaeftspartner;
    /**
     * Die 1:1-Kommunikationsadresse des Marktteilnehmers. Diese wird in der Marktkommunikation
     * verwendet. Konkret kann dies eine eMail-Adresse oder ein AS4-Endpunkt sein.
     */
    private List<String> makoadresse;
    /**
     * Gibt im Klartext die Bezeichnung der Marktrolle an
     */
    private Marktrolle marktrolle;
    /**
     * Gibt die Codenummer der Marktrolle an
     */
    private String rollencodenummer;
    /**
     * Gibt den Typ des Codes an
     */
    private Rollencodetyp rollencodetyp;
    /**
     * Sparte des Marktteilnehmers, z.B. Gas oder Strom
     */
    private Sparte sparte;

    public Marktteilnehmer() {
    }

    private Marktteilnehmer(MarktteilnehmerBuilder builder) {
        super(builder);
        this.geschaeftspartner = builder.geschaeftspartner;
        this.makoadresse = builder.makoadresse;
        this.marktrolle = builder.marktrolle;
        this.rollencodenummer = builder.rollencodenummer;
        this.rollencodetyp = builder.rollencodetyp;
        this.sparte = builder.sparte;
    }

    public Typ getTyp() {
        return typ;
    }

    public Geschaeftspartner getGeschaeftspartner() {
        return geschaeftspartner;
    }

    public void setGeschaeftspartner(Geschaeftspartner geschaeftspartner) {
        this.geschaeftspartner = geschaeftspartner;
    }

    public List<String> getMakoadresse() {
        return makoadresse;
    }

    public void setMakoadresse(List<String> makoadresse) {
        this.makoadresse = makoadresse;
    }

    public Marktrolle getMarktrolle() {
        return marktrolle;
    }

    public void setMarktrolle(Marktrolle marktrolle) {
        this.marktrolle = marktrolle;
    }

    public String getRollencodenummer() {
        return rollencodenummer;
    }

    public void setRollencodenummer(String rollencodenummer) {
        this.rollencodenummer = rollencodenummer;
    }

    public Rollencodetyp getRollencodetyp() {
        return rollencodetyp;
    }

    public void setRollencodetyp(Rollencodetyp rollencodetyp) {
        this.rollencodetyp = rollencodetyp;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public static class MarktteilnehmerBuilder extends GeschaeftsobjektBuilder {
        /**
         * Der zu diesem Marktteilnehmer gehörende Geschäftspartner
         */
        private Geschaeftspartner geschaeftspartner;
        /**
         * Die 1:1-Kommunikationsadresse des Marktteilnehmers. Diese wird in der Marktkommunikation
         * verwendet. Konkret kann dies eine eMail-Adresse oder ein AS4-Endpunkt sein.
         */
        private List<String> makoadresse;
        /**
         * Gibt im Klartext die Bezeichnung der Marktrolle an
         */
        private Marktrolle marktrolle;
        /**
         * Gibt die Codenummer der Marktrolle an
         */
        private String rollencodenummer;
        /**
         * Gibt den Typ des Codes an
         */
        private Rollencodetyp rollencodetyp;
        /**
         * Sparte des Marktteilnehmers, z.B. Gas oder Strom
         */
        private Sparte sparte;
    
        public Geschaeftspartner getGeschaeftspartner() {
            return geschaeftspartner;
        }
    
        public MarktteilnehmerBuilder setGeschaeftspartner(Geschaeftspartner geschaeftspartner) {
            this.geschaeftspartner = geschaeftspartner;
            return this;
        }
    
        public List<String> getMakoadresse() {
            return makoadresse;
        }
    
        public MarktteilnehmerBuilder setMakoadresse(List<String> makoadresse) {
            this.makoadresse = makoadresse;
            return this;
        }
    
        public Marktrolle getMarktrolle() {
            return marktrolle;
        }
    
        public MarktteilnehmerBuilder setMarktrolle(Marktrolle marktrolle) {
            this.marktrolle = marktrolle;
            return this;
        }
    
        public String getRollencodenummer() {
            return rollencodenummer;
        }
    
        public MarktteilnehmerBuilder setRollencodenummer(String rollencodenummer) {
            this.rollencodenummer = rollencodenummer;
            return this;
        }
    
        public Rollencodetyp getRollencodetyp() {
            return rollencodetyp;
        }
    
        public MarktteilnehmerBuilder setRollencodetyp(Rollencodetyp rollencodetyp) {
            this.rollencodetyp = rollencodetyp;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public MarktteilnehmerBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public Marktteilnehmer build() {
            return new Marktteilnehmer(this);
        }
    }
}