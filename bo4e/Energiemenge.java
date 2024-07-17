package placeholder;

import java.util.List;

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
public class Energiemenge {
    private String id;
    private Typ typ;
    private String version;
    private List<Verbrauch> energieverbrauch;
    private String lokationsId;
    private Lokationstyp lokationstyp;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Eindeutige Nummer der Marktlokation bzw. der Messlokation, zu der die Energiemenge gehört
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Gibt den Verbrauch in einer Zeiteinheit an
     */
    public List<Verbrauch> getEnergieverbrauch() { return energieverbrauch; }
    public void setEnergieverbrauch(List<Verbrauch> value) { this.energieverbrauch = value; }

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

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
