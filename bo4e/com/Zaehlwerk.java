package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Energierichtung;
import bo4e.enums.Verbrauchsart;
import bo4e.enums.Waermenutzung;

/**
 * Mit dieser Komponente werden Zählwerke modelliert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zaehlwerk.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zaehlwerk JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Zaehlwerk.json>`_
 */
public class Zaehlwerk extends COM {
    private Long anzahlAblesungen;
    private String bezeichnung;
    private Mengeneinheit einheit;
    private Boolean istAbrechnungsrelevant;
    private Boolean istSchwachlastfaehig;
    private Boolean istSteuerbefreit;
    private Boolean istUnterbrechbar;
    private Konzessionsabgabe konzessionsabgabe;
    private Long nachkommastelle;
    private String obisKennzahl;
    private Energierichtung richtung;
    private Verbrauchsart verbrauchsart;
    private VerwendungszweckProMarktrolle[] verwendungszwecke;
    private Long vorkommastelle;
    private Waermenutzung waermenutzung;
    private Double wandlerfaktor;
    private String zaehlwerkId;
    private Zaehlzeitregister zaehlzeitregister;

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
     * Abrechnungsrelevant
     */
    public Long getAnzahlAblesungen() { return anzahlAblesungen; }
    public void setAnzahlAblesungen(Long value) { this.anzahlAblesungen = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    /**
     * Anzahl der Nachkommastellen
     */
    public Boolean getIstAbrechnungsrelevant() { return istAbrechnungsrelevant; }
    public void setIstAbrechnungsrelevant(Boolean value) { this.istAbrechnungsrelevant = value; }

    /**
     * Schwachlastfaehigkeit
     */
    public Boolean getIstSchwachlastfaehig() { return istSchwachlastfaehig; }
    public void setIstSchwachlastfaehig(Boolean value) { this.istSchwachlastfaehig = value; }

    /**
     * Konzessionsabgabe
     */
    public Boolean getIstSteuerbefreit() { return istSteuerbefreit; }
    public void setIstSteuerbefreit(Boolean value) { this.istSteuerbefreit = value; }

    /**
     * Stromverbrauchsart/Verbrauchsart Marktlokation
     */
    public Boolean getIstUnterbrechbar() { return istUnterbrechbar; }
    public void setIstUnterbrechbar(Boolean value) { this.istUnterbrechbar = value; }

    /**
     * Wärmenutzung Marktlokation
     */
    public Konzessionsabgabe getKonzessionsabgabe() { return konzessionsabgabe; }
    public void setKonzessionsabgabe(Konzessionsabgabe value) { this.konzessionsabgabe = value; }

    /**
     * Anzahl der Vorkommastellen
     */
    public Long getNachkommastelle() { return nachkommastelle; }
    public void setNachkommastelle(Long value) { this.nachkommastelle = value; }

    public String getObisKennzahl() { return obisKennzahl; }
    public void setObisKennzahl(String value) { this.obisKennzahl = value; }

    public Energierichtung getRichtung() { return richtung; }
    public void setRichtung(Energierichtung value) { this.richtung = value; }

    /**
     * Stromverbrauchsart/Verbrauchsart Marktlokation
     */
    public Verbrauchsart getVerbrauchsart() { return verbrauchsart; }
    public void setVerbrauchsart(Verbrauchsart value) { this.verbrauchsart = value; }

    /**
     * Schwachlastfaehigkeit
     */
    public VerwendungszweckProMarktrolle[] getVerwendungszwecke() { return verwendungszwecke; }
    public void setVerwendungszwecke(VerwendungszweckProMarktrolle[] value) { this.verwendungszwecke = value; }

    /**
     * Steuerbefreiung
     */
    public Long getVorkommastelle() { return vorkommastelle; }
    public void setVorkommastelle(Long value) { this.vorkommastelle = value; }

    /**
     * Unterbrechbarkeit Marktlokation
     */
    public Waermenutzung getWaermenutzung() { return waermenutzung; }
    public void setWaermenutzung(Waermenutzung value) { this.waermenutzung = value; }

    public Double getWandlerfaktor() { return wandlerfaktor; }
    public void setWandlerfaktor(Double value) { this.wandlerfaktor = value; }

    public String getZaehlwerkId() { return zaehlwerkId; }
    public void setZaehlwerkId(String value) { this.zaehlwerkId = value; }

    /**
     * Anzahl Ablesungen pro Jahr
     */
    public Zaehlzeitregister getZaehlzeitregister() { return zaehlzeitregister; }
    public void setZaehlzeitregister(Zaehlzeitregister value) { this.zaehlzeitregister = value; }

}
