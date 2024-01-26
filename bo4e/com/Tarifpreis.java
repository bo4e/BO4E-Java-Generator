package bo4e.com;

import com.example.bo4e.enums.Mengeneinheit;
import com.example.bo4e.enums.Waehrungseinheit;
import com.example.bo4e.enums.Preistyp;
import com.example.bo4e.enums.Preisstatus;
import com.example.StringOderNummer;

/**
 * Abbildung eines Tarifpreises mit Preistyp und Beschreibung abgeleitet von COM Preis.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifpreis.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifpreis JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Tarifpreis.json>`_
 */
public class Tarifpreis extends COM {
    private String beschreibung;
    private Mengeneinheit bezugswert;
    private Waehrungseinheit einheit;
    private Preistyp preistyp;
    private Preisstatus status;
    private StringOderNummer wert;

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public Mengeneinheit getBezugswert() { return bezugswert; }
    public void setBezugswert(Mengeneinheit value) { this.bezugswert = value; }

    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    public Preistyp getPreistyp() { return preistyp; }
    public void setPreistyp(Preistyp value) { this.preistyp = value; }

    public Preisstatus getStatus() { return status; }
    public void setStatus(Preisstatus value) { this.status = value; }

    public StringOderNummer getWert() { return wert; }
    public void setWert(StringOderNummer value) { this.wert = value; }

}
