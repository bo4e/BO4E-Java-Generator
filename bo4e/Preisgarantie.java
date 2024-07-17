package placeholder;

import java.util.List;

/**
 * Definition für eine Preisgarantie mit der Möglichkeit verschiedener Ausprägungen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisgarantie.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisgarantie JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preisgarantie.json>`_
 */
public class Preisgarantie {
    private String id;
    private String version;
    private String beschreibung;
    private Preisgarantietyp preisgarantietyp;
    private Zeitraum zeitlicheGueltigkeit;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * zusatz_attribute: Optional[list["ZusatzAttribut"]] = None
     *
     * # pylint: disable=duplicate-code
     * model_config = ConfigDict(
     * alias_generator=camelize,
     * populate_by_name=True,
     * extra="allow",
     * # json_encoders is deprecated, but there is no easy-to-use alternative. The best way
     * would be to create
     * # an annotated version of Decimal, but you would have to use it everywhere in the
     * pydantic models.
     * # See this issue for more info: https://github.com/pydantic/pydantic/issues/6375
     * json_encoders={Decimal: str},
     * )
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Festlegung, auf welche Preisbestandteile die Garantie gewährt wird.
     */
    public Preisgarantietyp getPreisgarantietyp() { return preisgarantietyp; }
    public void setPreisgarantietyp(Preisgarantietyp value) { this.preisgarantietyp = value; }

    /**
     * Freitext zur Beschreibung der Preisgarantie.
     */
    public Zeitraum getZeitlicheGueltigkeit() { return zeitlicheGueltigkeit; }
    public void setZeitlicheGueltigkeit(Zeitraum value) { this.zeitlicheGueltigkeit = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
