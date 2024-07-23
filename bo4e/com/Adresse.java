package bo4e.com;

import bo4e.enums.Landescode;

/**
 * Contains an address that can be used for most purposes.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Adresse.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Adresse JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Adresse.json>`_
 */
public class Adresse extends COM {
    private String adresszusatz;
    private String coErgaenzung;
    private String hausnummer;
    private Landescode landescode;
    private String ort;
    private String ortsteil;
    private String postfach;
    private String postleitzahl;
    private String strasse;

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
     * Zusatzhinweis zum Auffinden der Adresse, z.B. "3. Stock linke Wohnung"
     */
    public String getAdresszusatz() { return adresszusatz; }
    public void setAdresszusatz(String value) { this.adresszusatz = value; }

    /**
     * Im Falle einer c/o-Adresse steht in diesem Attribut die Anrede. Z.B. "c/o Veronica
     * Hauptmieterin"
     */
    public String getCoErgaenzung() { return coErgaenzung; }
    public void setCoErgaenzung(String value) { this.coErgaenzung = value; }

    /**
     * Hausnummer inkl. Zusatz; z.B. "3", "4a"
     */
    public String getHausnummer() { return hausnummer; }
    public void setHausnummer(String value) { this.hausnummer = value; }

    /**
     * Offizieller ISO-Landescode
     */
    public Landescode getLandescode() { return landescode; }
    public void setLandescode(Landescode value) { this.landescode = value; }

    /**
     * Bezeichnung der Stadt; z.B. "Hückelhoven"
     */
    public String getOrt() { return ort; }
    public void setOrt(String value) { this.ort = value; }

    /**
     * Bezeichnung des Ortsteils; z.B. "Mitte"
     */
    public String getOrtsteil() { return ortsteil; }
    public void setOrtsteil(String value) { this.ortsteil = value; }

    /**
     * Im Falle einer Postfachadresse das Postfach; Damit werden Straße und Hausnummer nicht
     * berücksichtigt
     */
    public String getPostfach() { return postfach; }
    public void setPostfach(String value) { this.postfach = value; }

    /**
     * Die Postleitzahl; z.B: "41836"
     */
    public String getPostleitzahl() { return postleitzahl; }
    public void setPostleitzahl(String value) { this.postleitzahl = value; }

    /**
     * Bezeichnung der Straße; z.B. "Weserstraße"
     */
    public String getStrasse() { return strasse; }
    public void setStrasse(String value) { this.strasse = value; }

}
