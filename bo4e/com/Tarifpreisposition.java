package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preistyp;

import java.util.List;

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen abgebildet werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifpreisposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreisposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifpreisposition.json>`_
 */
public class Tarifpreisposition extends COM {
    /**
     * Größe, auf die sich die Einheit bezieht, beispielsweise kWh, Jahr
     */
    private Mengeneinheit bezugseinheit;
    /**
     * Einheit des Preises (z.B. EURO)
     */
    private Waehrungseinheit einheit;
    /**
     * Gibt an, nach welcher Menge die vorgenannte Einschränkung erfolgt (z.B.
     * Jahresstromverbrauch in kWh)
     */
    private Mengeneinheit mengeneinheitstaffel;
    /**
     * Hier sind die Staffeln mit ihren Preisenangaben definiert
     */
    private List<Preisstaffel> preisstaffeln;
    /**
     * Angabe des Preistypes (z.B. Grundpreis)
     */
    private Preistyp preistyp;

    public Mengeneinheit getBezugseinheit() {
        return bezugseinheit;
    }
    public void setBezugseinheit(Mengeneinheit bezugseinheit) {
        this.bezugseinheit = bezugseinheit;
    }

    public Waehrungseinheit getEinheit() {
        return einheit;
    }
    public void setEinheit(Waehrungseinheit einheit) {
        this.einheit = einheit;
    }

    public Mengeneinheit getMengeneinheitstaffel() {
        return mengeneinheitstaffel;
    }
    public void setMengeneinheitstaffel(Mengeneinheit mengeneinheitstaffel) {
        this.mengeneinheitstaffel = mengeneinheitstaffel;
    }

    public List<Preisstaffel> getPreisstaffeln() {
        return preisstaffeln;
    }
    public void setPreisstaffeln(List<Preisstaffel> preisstaffeln) {
        this.preisstaffeln = preisstaffeln;
    }

    public Preistyp getPreistyp() {
        return preistyp;
    }
    public void setPreistyp(Preistyp preistyp) {
        this.preistyp = preistyp;
    }
}