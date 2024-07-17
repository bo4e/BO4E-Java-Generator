package placeholder;

import java.util.List;

/**
 * Preis für eine definierte Lieferung oder Leistung innerhalb eines Preisblattes
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Preisposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Preisposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Preisposition.json>`_
 */
public class Preisposition {
    private String id;
    private String version;
    private BDEWArtikelnummer bdewArtikelnummer;
    private Kalkulationsmethode berechnungsmethode;
    private Mengeneinheit bezugsgroesse;
    private Double freimengeBlindarbeit;
    private Double freimengeLeistungsfaktor;
    private String gruppenartikelId;
    private String leistungsbezeichnung;
    private Leistungstyp leistungstyp;
    private Waehrungseinheit preiseinheit;
    private List<Preisstaffel> preisstaffeln;
    private Tarifzeit tarifzeit;
    private Mengeneinheit zeitbasis;
    private Bemessungsgroesse zonungsgroesse;
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
     * Mit der Menge der hier angegebenen Größe wird die Staffelung/Zonung durchgeführt. Z.B.
     * Vollbenutzungsstunden
     */
    public BDEWArtikelnummer getBdewArtikelnummer() { return bdewArtikelnummer; }
    public void setBdewArtikelnummer(BDEWArtikelnummer value) { this.bdewArtikelnummer = value; }

    /**
     * Das Modell, das der Preisbildung zugrunde liegt
     */
    public Kalkulationsmethode getBerechnungsmethode() { return berechnungsmethode; }
    public void setBerechnungsmethode(Kalkulationsmethode value) { this.berechnungsmethode = value; }

    /**
     * Hier wird festgelegt, auf welche Bezugsgrösse sich der Preis bezieht, z.B. kWh oder Stück
     */
    public Mengeneinheit getBezugsgroesse() { return bezugsgroesse; }
    public void setBezugsgroesse(Mengeneinheit value) { this.bezugsgroesse = value; }

    /**
     * Der Anteil der Menge der Blindarbeit in Prozent von der Wirkarbeit, für die keine
     * Abrechnung erfolgt
     */
    public Double getFreimengeBlindarbeit() { return freimengeBlindarbeit; }
    public void setFreimengeBlindarbeit(Double value) { this.freimengeBlindarbeit = value; }

    /**
     * gruppenartikel_id: Optional[str] = None
     */
    public Double getFreimengeLeistungsfaktor() { return freimengeLeistungsfaktor; }
    public void setFreimengeLeistungsfaktor(Double value) { this.freimengeLeistungsfaktor = value; }

    /**
     * Übergeordnete Gruppen-ID, die sich ggf. auf die Artikel-ID in der Preisstaffel bezieht
     */
    public String getGruppenartikelId() { return gruppenartikelId; }
    public void setGruppenartikelId(String value) { this.gruppenartikelId = value; }

    /**
     * Bezeichnung für die in der Position abgebildete Leistungserbringung
     */
    public String getLeistungsbezeichnung() { return leistungsbezeichnung; }
    public void setLeistungsbezeichnung(String value) { this.leistungsbezeichnung = value; }

    /**
     * Standardisierte Bezeichnung für die abgerechnete Leistungserbringung
     */
    public Leistungstyp getLeistungstyp() { return leistungstyp; }
    public void setLeistungstyp(Leistungstyp value) { this.leistungstyp = value; }

    /**
     * Festlegung, mit welcher Preiseinheit abgerechnet wird, z.B. Ct. oder €
     */
    public Waehrungseinheit getPreiseinheit() { return preiseinheit; }
    public void setPreiseinheit(Waehrungseinheit value) { this.preiseinheit = value; }

    /**
     * Preisstaffeln, die zu dieser Preisposition gehören
     */
    public List<Preisstaffel> getPreisstaffeln() { return preisstaffeln; }
    public void setPreisstaffeln(List<Preisstaffel> value) { this.preisstaffeln = value; }

    /**
     * Festlegung, für welche Tarifzeit der Preis hier festgelegt ist
     */
    public Tarifzeit getTarifzeit() { return tarifzeit; }
    public void setTarifzeit(Tarifzeit value) { this.tarifzeit = value; }

    /**
     * Festlegung, für welche Tarifzeit der Preis hier festgelegt ist
     */
    public Mengeneinheit getZeitbasis() { return zeitbasis; }
    public void setZeitbasis(Mengeneinheit value) { this.zeitbasis = value; }

    /**
     * Mit der Menge der hier angegebenen Größe wird die Staffelung/Zonung durchgeführt. Z.B.
     * Vollbenutzungsstunden
     */
    public Bemessungsgroesse getZonungsgroesse() { return zonungsgroesse; }
    public void setZonungsgroesse(Bemessungsgroesse value) { this.zonungsgroesse = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
