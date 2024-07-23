package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Energierichtung;
import bo4e.enums.Verbrauchsart;
import bo4e.enums.Waermenutzung;

import java.util.List;

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
    /**
     * Abrechnungsrelevant
     */
    private Long anzahlAblesungen;
    private String bezeichnung;
    private Mengeneinheit einheit;
    /**
     * Anzahl der Nachkommastellen
     */
    private Boolean istAbrechnungsrelevant;
    /**
     * Schwachlastfaehigkeit
     */
    private Boolean istSchwachlastfaehig;
    /**
     * Konzessionsabgabe
     */
    private Boolean istSteuerbefreit;
    /**
     * Stromverbrauchsart/Verbrauchsart Marktlokation
     */
    private Boolean istUnterbrechbar;
    /**
     * Wärmenutzung Marktlokation
     */
    private Konzessionsabgabe konzessionsabgabe;
    /**
     * Anzahl der Vorkommastellen
     */
    private Long nachkommastelle;
    private String obisKennzahl;
    private Energierichtung richtung;
    /**
     * Stromverbrauchsart/Verbrauchsart Marktlokation
     */
    private Verbrauchsart verbrauchsart;
    /**
     * Schwachlastfaehigkeit
     */
    private List<VerwendungszweckProMarktrolle> verwendungszwecke;
    /**
     * Steuerbefreiung
     */
    private Long vorkommastelle;
    /**
     * Unterbrechbarkeit Marktlokation
     */
    private Waermenutzung waermenutzung;
    private Double wandlerfaktor;
    private String zaehlwerkId;
    /**
     * Anzahl Ablesungen pro Jahr
     */
    private Zaehlzeitregister zaehlzeitregister;

    public Long getAnzahlAblesungen() {
        return AnzahlAblesungen;
    }
    public void setAnzahlAblesungen(Long anzahlAblesungen) {
        this.anzahlAblesungen = anzahlAblesungen;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Mengeneinheit getEinheit() {
        return Einheit;
    }
    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    public Boolean getIstAbrechnungsrelevant() {
        return IstAbrechnungsrelevant;
    }
    public void setIstAbrechnungsrelevant(Boolean istAbrechnungsrelevant) {
        this.istAbrechnungsrelevant = istAbrechnungsrelevant;
    }

    public Boolean getIstSchwachlastfaehig() {
        return IstSchwachlastfaehig;
    }
    public void setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
        this.istSchwachlastfaehig = istSchwachlastfaehig;
    }

    public Boolean getIstSteuerbefreit() {
        return IstSteuerbefreit;
    }
    public void setIstSteuerbefreit(Boolean istSteuerbefreit) {
        this.istSteuerbefreit = istSteuerbefreit;
    }

    public Boolean getIstUnterbrechbar() {
        return IstUnterbrechbar;
    }
    public void setIstUnterbrechbar(Boolean istUnterbrechbar) {
        this.istUnterbrechbar = istUnterbrechbar;
    }

    public Konzessionsabgabe getKonzessionsabgabe() {
        return Konzessionsabgabe;
    }
    public void setKonzessionsabgabe(Konzessionsabgabe konzessionsabgabe) {
        this.konzessionsabgabe = konzessionsabgabe;
    }

    public Long getNachkommastelle() {
        return Nachkommastelle;
    }
    public void setNachkommastelle(Long nachkommastelle) {
        this.nachkommastelle = nachkommastelle;
    }

    public String getObisKennzahl() {
        return ObisKennzahl;
    }
    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    public Energierichtung getRichtung() {
        return Richtung;
    }
    public void setRichtung(Energierichtung richtung) {
        this.richtung = richtung;
    }

    public Verbrauchsart getVerbrauchsart() {
        return Verbrauchsart;
    }
    public void setVerbrauchsart(Verbrauchsart verbrauchsart) {
        this.verbrauchsart = verbrauchsart;
    }

    public List<VerwendungszweckProMarktrolle> getVerwendungszwecke() {
        return Verwendungszwecke;
    }
    public void setVerwendungszwecke(List<VerwendungszweckProMarktrolle> verwendungszwecke) {
        this.verwendungszwecke = verwendungszwecke;
    }

    public Long getVorkommastelle() {
        return Vorkommastelle;
    }
    public void setVorkommastelle(Long vorkommastelle) {
        this.vorkommastelle = vorkommastelle;
    }

    public Waermenutzung getWaermenutzung() {
        return Waermenutzung;
    }
    public void setWaermenutzung(Waermenutzung waermenutzung) {
        this.waermenutzung = waermenutzung;
    }

    public Double getWandlerfaktor() {
        return Wandlerfaktor;
    }
    public void setWandlerfaktor(Double wandlerfaktor) {
        this.wandlerfaktor = wandlerfaktor;
    }

    public String getZaehlwerkId() {
        return ZaehlwerkId;
    }
    public void setZaehlwerkId(String zaehlwerkId) {
        this.zaehlwerkId = zaehlwerkId;
    }

    public Zaehlzeitregister getZaehlzeitregister() {
        return Zaehlzeitregister;
    }
    public void setZaehlzeitregister(Zaehlzeitregister zaehlzeitregister) {
        this.zaehlzeitregister = zaehlzeitregister;
    }
}