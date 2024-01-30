package bo4e.com;

import com.example.bo4e.enums.Mengeneinheit;
import com.example.bo4e.enums.Energierichtung;
import com.example.bo4e.enums.Verbrauchsart;
import com.example.bo4e.enums.Waermenutzung;
import com.example.StringOderNummer;

/**
 * Mit dieser Komponente werden Zählwerke modelliert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zaehlwerk.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zaehlwerk JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Zaehlwerk.json>`_
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
    private String wandlerfaktor;
    private String zaehlwerkId;
    private Zaehlzeitregister zaehlzeitregister;

    public Long getAnzahlAblesungen() { return anzahlAblesungen; }
    public void setAnzahlAblesungen(Long value) { this.anzahlAblesungen = value; }

    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    public Boolean getIstAbrechnungsrelevant() { return istAbrechnungsrelevant; }
    public void setIstAbrechnungsrelevant(Boolean value) { this.istAbrechnungsrelevant = value; }

    public Boolean getIstSchwachlastfaehig() { return istSchwachlastfaehig; }
    public void setIstSchwachlastfaehig(Boolean value) { this.istSchwachlastfaehig = value; }

    public Boolean getIstSteuerbefreit() { return istSteuerbefreit; }
    public void setIstSteuerbefreit(Boolean value) { this.istSteuerbefreit = value; }

    public Boolean getIstUnterbrechbar() { return istUnterbrechbar; }
    public void setIstUnterbrechbar(Boolean value) { this.istUnterbrechbar = value; }

    public Konzessionsabgabe getKonzessionsabgabe() { return konzessionsabgabe; }
    public void setKonzessionsabgabe(Konzessionsabgabe value) { this.konzessionsabgabe = value; }

    public Long getNachkommastelle() { return nachkommastelle; }
    public void setNachkommastelle(Long value) { this.nachkommastelle = value; }

    public String getObisKennzahl() { return obisKennzahl; }
    public void setObisKennzahl(String value) { this.obisKennzahl = value; }

    public Energierichtung getRichtung() { return richtung; }
    public void setRichtung(Energierichtung value) { this.richtung = value; }

    public Verbrauchsart getVerbrauchsart() { return verbrauchsart; }
    public void setVerbrauchsart(Verbrauchsart value) { this.verbrauchsart = value; }

    public VerwendungszweckProMarktrolle[] getVerwendungszwecke() { return verwendungszwecke; }
    public void setVerwendungszwecke(VerwendungszweckProMarktrolle[] value) { this.verwendungszwecke = value; }

    public Long getVorkommastelle() { return vorkommastelle; }
    public void setVorkommastelle(Long value) { this.vorkommastelle = value; }

    public Waermenutzung getWaermenutzung() { return waermenutzung; }
    public void setWaermenutzung(Waermenutzung value) { this.waermenutzung = value; }

    public String getWandlerfaktor() { return wandlerfaktor; }
    public void setWandlerfaktor(String value) { this.wandlerfaktor = value; }

    public String getZaehlwerkId() { return zaehlwerkId; }
    public void setZaehlwerkId(String value) { this.zaehlwerkId = value; }

    public Zaehlzeitregister getZaehlzeitregister() { return zaehlzeitregister; }
    public void setZaehlzeitregister(Zaehlzeitregister value) { this.zaehlzeitregister = value; }

}
