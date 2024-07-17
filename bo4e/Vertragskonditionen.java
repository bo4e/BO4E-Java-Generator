package placeholder;

import java.util.List;

/**
 * Abbildung für Vertragskonditionen. Die Komponente wird sowohl im Vertrag als auch im
 * Tarif verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Vertragskonditionen.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Vertragskonditionen JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Vertragskonditionen.json>`_
 */
public class Vertragskonditionen {
    private String id;
    private String version;
    private Zeitraum abschlagszyklus;
    private Double anzahlAbschlaege;
    private String beschreibung;
    private Zeitraum kuendigungsfrist;
    private Zeitraum vertragslaufzeit;
    private Zeitraum vertragsverlaengerung;
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
     * In diesen Zyklen werden Abschläge gestellt. Alternativ kann auch die Anzahl in den
     * Konditionen angeben werden.
     */
    public Zeitraum getAbschlagszyklus() { return abschlagszyklus; }
    public void setAbschlagszyklus(Zeitraum value) { this.abschlagszyklus = value; }

    /**
     * Anzahl der vereinbarten Abschläge pro Jahr, z.B. 12
     */
    public Double getAnzahlAbschlaege() { return anzahlAbschlaege; }
    public void setAnzahlAbschlaege(Double value) { this.anzahlAbschlaege = value; }

    /**
     * Freitext zur Beschreibung der Konditionen, z.B. "Standardkonditionen Gas"
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Innerhalb dieser Frist kann der Vertrag gekündigt werden
     */
    public Zeitraum getKuendigungsfrist() { return kuendigungsfrist; }
    public void setKuendigungsfrist(Zeitraum value) { this.kuendigungsfrist = value; }

    /**
     * Über diesen Zeitraum läuft der Vertrag
     */
    public Zeitraum getVertragslaufzeit() { return vertragslaufzeit; }
    public void setVertragslaufzeit(Zeitraum value) { this.vertragslaufzeit = value; }

    /**
     * Falls der Vertrag nicht gekündigt wird, verlängert er sich automatisch um die hier
     * angegebene Zeit
     */
    public Zeitraum getVertragsverlaengerung() { return vertragsverlaengerung; }
    public void setVertragsverlaengerung(Zeitraum value) { this.vertragsverlaengerung = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
