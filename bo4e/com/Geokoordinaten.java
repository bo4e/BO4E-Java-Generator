package bo4e.com;

import com.example.StringOderNummer;

/**
 * This component provides the geo-coordinates for a location.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Geokoordinaten.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geokoordinaten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Geokoordinaten.json>`_
 */
public class Geokoordinaten extends COM {
    private StringOderNummer breitengrad;
    private StringOderNummer laengengrad;

    public StringOderNummer getBreitengrad() { return breitengrad; }
    public void setBreitengrad(StringOderNummer value) { this.breitengrad = value; }

    public StringOderNummer getLaengengrad() { return laengengrad; }
    public void setLaengengrad(StringOderNummer value) { this.laengengrad = value; }

}
