package com.example.bo4e.com;

import com.example.bo4e.enums.Mengeneinheit;
import com.example.bo4e.enums.Messwertstatus;
import com.example.bo4e.enums.Wertermittlungsverfahren;
import java.time.OffsetDateTime;

/**
 * Abbildung eines zeitlich abgegrenzten Verbrauchs
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Verbrauch.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Verbrauch JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Verbrauch.json>`_
 */
public class Verbrauch extends COM {
    private Mengeneinheit einheit;
    private OffsetDateTime enddatum;
    private Messwertstatus messwertstatus;
    private String obisKennzahl;
    private OffsetDateTime startdatum;
    private String wert;
    private Wertermittlungsverfahren wertermittlungsverfahren;

    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    public OffsetDateTime getEnddatum() { return enddatum; }
    public void setEnddatum(OffsetDateTime value) { this.enddatum = value; }

    public Messwertstatus getMesswertstatus() { return messwertstatus; }
    public void setMesswertstatus(Messwertstatus value) { this.messwertstatus = value; }

    public String getObisKennzahl() { return obisKennzahl; }
    public void setObisKennzahl(String value) { this.obisKennzahl = value; }

    public OffsetDateTime getStartdatum() { return startdatum; }
    public void setStartdatum(OffsetDateTime value) { this.startdatum = value; }

    public String getWert() { return wert; }
    public void setWert(String value) { this.wert = value; }

    public Wertermittlungsverfahren getWertermittlungsverfahren() { return wertermittlungsverfahren; }
    public void setWertermittlungsverfahren(Wertermittlungsverfahren value) { this.wertermittlungsverfahren = value; }

}
