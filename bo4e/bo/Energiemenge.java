package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Verbrauch;
import bo4e.enums.Lokationstyp;

/**
 * Abbildung von Mengen, die Lokationen zugeordnet sind
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Energiemenge.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Energiemenge JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Energiemenge.json>`_
 */
public class Energiemenge extends Geschaeftsobjekt {
    private final Typ _typ = Typ.ENERGIEMENGE;
    private Verbrauch[] energieverbrauch;
    private String lokationsId;
    private Lokationstyp lokationstyp;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Eindeutige Nummer der Marktlokation bzw. der Messlokation, zu der die Energiemenge gehört
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Gibt den Verbrauch in einer Zeiteinheit an
     */
    public Verbrauch[] getEnergieverbrauch() { return energieverbrauch; }
    public void setEnergieverbrauch(Verbrauch[] value) { this.energieverbrauch = value; }

    /**
     * Eindeutige Nummer der Marktlokation bzw. der Messlokation, zu der die Energiemenge gehört
     */
    public String getLokationsId() { return lokationsId; }
    public void setLokationsId(String value) { this.lokationsId = value; }

    /**
     * Gibt an, ob es sich um eine Markt- oder Messlokation handelt
     */
    public Lokationstyp getLokationstyp() { return lokationstyp; }
    public void setLokationstyp(Lokationstyp value) { this.lokationstyp = value; }

}
