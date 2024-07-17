package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Führt die verschiedenen Ausprägungen der Angebotsberechnung auf
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Angebotsvariante.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebotsvariante JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Angebotsvariante.json>`_
 */
public class Angebotsvariante {
    private String id;
    private String version;
    private Angebotsstatus angebotsstatus;
    private OffsetDateTime bindefrist;
    private OffsetDateTime erstellungsdatum;
    private Betrag gesamtkosten;
    private Menge gesamtmenge;
    private List<Angebotsteil> teile;
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
     * Gibt den Status eines Angebotes an.
     */
    public Angebotsstatus getAngebotsstatus() { return angebotsstatus; }
    public void setAngebotsstatus(Angebotsstatus value) { this.angebotsstatus = value; }

    /**
     * Bis zu diesem Zeitpunkt gilt die Angebotsvariante
     */
    public OffsetDateTime getBindefrist() { return bindefrist; }
    public void setBindefrist(OffsetDateTime value) { this.bindefrist = value; }

    /**
     * Datum der Erstellung der Angebotsvariante
     */
    public OffsetDateTime getErstellungsdatum() { return erstellungsdatum; }
    public void setErstellungsdatum(OffsetDateTime value) { this.erstellungsdatum = value; }

    /**
     * Aufsummierte Kosten aller Angebotsteile
     */
    public Betrag getGesamtkosten() { return gesamtkosten; }
    public void setGesamtkosten(Betrag value) { this.gesamtkosten = value; }

    /**
     * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
     */
    public Menge getGesamtmenge() { return gesamtmenge; }
    public void setGesamtmenge(Menge value) { this.gesamtmenge = value; }

    /**
     * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
     */
    public List<Angebotsteil> getTeile() { return teile; }
    public void setTeile(List<Angebotsteil> value) { this.teile = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
