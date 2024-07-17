package placeholder;

import java.util.List;

/**
 * Die Komponente wird dazu verwendet, die Kontaktwege innerhalb des BOs Person
 * darzustellen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kontakt.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kontakt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Kontakt.json>`_
 */
public class Kontaktweg {
    private String id;
    private String version;
    private String beschreibung;
    private Boolean istBevorzugterKontaktweg;
    private Kontaktart kontaktart;
    private String kontaktwert;
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
     * Spezifikation, beispielsweise "Durchwahl", "Sammelnummer" etc.
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Gibt an, ob es sich um den bevorzugten Kontaktweg handelt.
     */
    public Boolean getIstBevorzugterKontaktweg() { return istBevorzugterKontaktweg; }
    public void setIstBevorzugterKontaktweg(Boolean value) { this.istBevorzugterKontaktweg = value; }

    /**
     * Gibt die Kontaktart des Kontaktes an.
     */
    public Kontaktart getKontaktart() { return kontaktart; }
    public void setKontaktart(Kontaktart value) { this.kontaktart = value; }

    /**
     * Die Nummer oder E-Mail-Adresse.
     */
    public String getKontaktwert() { return kontaktwert; }
    public void setKontaktwert(String value) { this.kontaktwert = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
