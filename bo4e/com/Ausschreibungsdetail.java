package bo4e.com;

import bo4e.enums.Zaehlertyp;

/**
 * Die Komponente Ausschreibungsdetail wird verwendet um die Informationen zu einer
 * Abnahmestelle innerhalb eines
 * Ausschreibungsloses abzubilden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Ausschreibungsdetail.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Ausschreibungsdetail JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Ausschreibungsdetail.json>`_
 */
public class Ausschreibungsdetail extends COM {
    private Boolean istLastgangVorhanden;
    private String kunde;
    private Zeitraum lieferzeitraum;
    private Adresse marktlokationsadresse;
    private String marktlokationsbezeichnung;
    private String marktlokationsId;
    private String netzbetreiber;
    private String netzebeneLieferung;
    private String netzebeneMessung;
    private Menge prognoseArbeitLieferzeitraum;
    private Menge prognoseJahresarbeit;
    private Menge prognoseLeistung;
    private Adresse rechnungsadresse;
    private String zaehlernummer;
    private Zaehlertyp zaehlertechnik;

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
    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
     */
    public Boolean getIstLastgangVorhanden() { return istLastgangVorhanden; }
    public void setIstLastgangVorhanden(Boolean value) { this.istLastgangVorhanden = value; }

    /**
     * Bezeichnung des Kunden, der die Marktlokation nutzt
     */
    public String getKunde() { return kunde; }
    public void setKunde(String value) { this.kunde = value; }

    /**
     * Angefragter Zeitraum für die ausgeschriebene Belieferung
     */
    public Zeitraum getLieferzeitraum() { return lieferzeitraum; }
    public void setLieferzeitraum(Zeitraum value) { this.lieferzeitraum = value; }

    /**
     * Die Adresse an der die Marktlokation sich befindet
     */
    public Adresse getMarktlokationsadresse() { return marktlokationsadresse; }
    public void setMarktlokationsadresse(Adresse value) { this.marktlokationsadresse = value; }

    /**
     * Bezeichnung für die Lokation, z.B. 'Zentraler Einkauf, Hamburg'
     */
    public String getMarktlokationsbezeichnung() { return marktlokationsbezeichnung; }
    public void setMarktlokationsbezeichnung(String value) { this.marktlokationsbezeichnung = value; }

    /**
     * Identifikation einer ausgeschriebenen Marktlokation
     */
    public String getMarktlokationsId() { return marktlokationsId; }
    public void setMarktlokationsId(String value) { this.marktlokationsId = value; }

    /**
     * Bezeichnung des zuständigen Netzbetreibers, z.B. 'Stromnetz Hamburg GmbH'
     */
    public String getNetzbetreiber() { return netzbetreiber; }
    public void setNetzbetreiber(String value) { this.netzbetreiber = value; }

    /**
     * In der angegebenen Netzebene wird die Marktlokation versorgt, z.B. MSP für Mittelspannung
     */
    public String getNetzebeneLieferung() { return netzebeneLieferung; }
    public void setNetzebeneLieferung(String value) { this.netzebeneLieferung = value; }

    /**
     * In der angegebenen Netzebene wird die Lokation gemessen, z.B. NSP für Niederspannung
     */
    public String getNetzebeneMessung() { return netzebeneMessung; }
    public void setNetzebeneMessung(String value) { this.netzebeneMessung = value; }

    /**
     * Ein Prognosewert für die Arbeit innerhalb des angefragten Lieferzeitraums der
     * ausgeschriebenen Lokation
     */
    public Menge getPrognoseArbeitLieferzeitraum() { return prognoseArbeitLieferzeitraum; }
    public void setPrognoseArbeitLieferzeitraum(Menge value) { this.prognoseArbeitLieferzeitraum = value; }

    /**
     * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
     */
    public Menge getPrognoseJahresarbeit() { return prognoseJahresarbeit; }
    public void setPrognoseJahresarbeit(Menge value) { this.prognoseJahresarbeit = value; }

    /**
     * Prognosewert für die abgenommene maximale Leistung der ausgeschriebenen Lokation
     */
    public Menge getPrognoseLeistung() { return prognoseLeistung; }
    public void setPrognoseLeistung(Menge value) { this.prognoseLeistung = value; }

    /**
     * Die (evtl. abweichende) Rechnungsadresse
     */
    public Adresse getRechnungsadresse() { return rechnungsadresse; }
    public void setRechnungsadresse(Adresse value) { this.rechnungsadresse = value; }

    /**
     * Die Bezeichnung des Zählers an der Marktlokation
     */
    public String getZaehlernummer() { return zaehlernummer; }
    public void setZaehlernummer(String value) { this.zaehlernummer = value; }

    /**
     * Spezifikation, um welche Zählertechnik es sich im vorliegenden Fall handelt, z.B.
     * Leistungsmessung
     */
    public Zaehlertyp getZaehlertechnik() { return zaehlertechnik; }
    public void setZaehlertechnik(Zaehlertyp value) { this.zaehlertechnik = value; }

}
