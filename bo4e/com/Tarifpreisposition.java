package bo4e.com;

import com.example.bo4e.enums.Mengeneinheit;
import com.example.bo4e.enums.Waehrungseinheit;
import com.example.bo4e.enums.Preistyp;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Tarifpreisposition.json>`_
 */
public class Tarifpreisposition extends COM {
    private Mengeneinheit bezugseinheit;
    private Waehrungseinheit einheit;
    private Mengeneinheit mengeneinheitstaffel;
    private Preisstaffel[] preisstaffeln;
    private Preistyp preistyp;

    public Mengeneinheit getBezugseinheit() { return bezugseinheit; }
    public void setBezugseinheit(Mengeneinheit value) { this.bezugseinheit = value; }

    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    public Mengeneinheit getMengeneinheitstaffel() { return mengeneinheitstaffel; }
    public void setMengeneinheitstaffel(Mengeneinheit value) { this.mengeneinheitstaffel = value; }

    public Preisstaffel[] getPreisstaffeln() { return preisstaffeln; }
    public void setPreisstaffeln(Preisstaffel[] value) { this.preisstaffeln = value; }

    public Preistyp getPreistyp() { return preistyp; }
    public void setPreistyp(Preistyp value) { this.preistyp = value; }

}
