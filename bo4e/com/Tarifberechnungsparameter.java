package bo4e.com;

import bo4e.enums.Tarifkalkulationsmethode;
import bo4e.enums.Messpreistyp;

import java.util.List;

/**
 * In dieser Komponente sind die Berechnungsparameter für die Ermittlung der Tarifkosten
 * zusammengefasst.
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Tarifberechnungsparameter.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Tarifberechnungsparameter JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/com/Tarifberechnungsparameter.json>`_
 */
public class Tarifberechnungsparameter extends COM {
    /**
     * Gibt an, wie die Einzelpreise des Tarifes zu verarbeiten sind
     */
    private Tarifkalkulationsmethode berechnungsmethode;
    /**
     * Höchstpreis für den Durchschnitts-Arbeitspreis HT
     */
    private Preis hoechstpreisHT;
    /**
     * Höchstpreis für den Durchschnitts-Arbeitspreis NT
     */
    private Preis hoechstpreisNT;
    /**
     * True, falls der Messpreis im Grundpreis (GP) enthalten ist
     */
    private Boolean istMesspreisInGrundpreisEnthalten;
    /**
     * Typ des Messpreises
     */
    private Boolean istMesspreisZuBeruecksichtigen;
    /**
     * Im Preis bereits eingeschlossene Leistung (für Gas)
     */
    private Double kwInklusive;
    /**
     * Intervall, indem die über "kwInklusive" hinaus abgenommene Leistung kostenpflichtig wird
     * (z.B. je 5 kW 20 EURO)
     */
    private Double kwWeitereMengen;
    /**
     * Typ des Messpreises
     */
    private Messpreistyp messpreistyp;
    /**
     * Mindestpreis für den Durchschnitts-Arbeitspreis
     */
    private Preis mindestpreis;
    /**
     * Liste mit zusätzlichen Preisen, beispielsweise Messpreise und/oder Leistungspreise
     */
    private List<Tarifpreis> zusatzpreise;

    public Tarifkalkulationsmethode getBerechnungsmethode() {
        return Berechnungsmethode;
    }
    public void setBerechnungsmethode(Tarifkalkulationsmethode berechnungsmethode) {
        this.berechnungsmethode = berechnungsmethode;
    }

    public Preis getHoechstpreisHT() {
        return HoechstpreisHT;
    }
    public void setHoechstpreisHT(Preis hoechstpreisHT) {
        this.hoechstpreisHT = hoechstpreisHT;
    }

    public Preis getHoechstpreisNT() {
        return HoechstpreisNT;
    }
    public void setHoechstpreisNT(Preis hoechstpreisNT) {
        this.hoechstpreisNT = hoechstpreisNT;
    }

    public Boolean getIstMesspreisInGrundpreisEnthalten() {
        return IstMesspreisInGrundpreisEnthalten;
    }
    public void setIstMesspreisInGrundpreisEnthalten(Boolean istMesspreisInGrundpreisEnthalten) {
        this.istMesspreisInGrundpreisEnthalten = istMesspreisInGrundpreisEnthalten;
    }

    public Boolean getIstMesspreisZuBeruecksichtigen() {
        return IstMesspreisZuBeruecksichtigen;
    }
    public void setIstMesspreisZuBeruecksichtigen(Boolean istMesspreisZuBeruecksichtigen) {
        this.istMesspreisZuBeruecksichtigen = istMesspreisZuBeruecksichtigen;
    }

    public Double getKwInklusive() {
        return KwInklusive;
    }
    public void setKwInklusive(Double kwInklusive) {
        this.kwInklusive = kwInklusive;
    }

    public Double getKwWeitereMengen() {
        return KwWeitereMengen;
    }
    public void setKwWeitereMengen(Double kwWeitereMengen) {
        this.kwWeitereMengen = kwWeitereMengen;
    }

    public Messpreistyp getMesspreistyp() {
        return Messpreistyp;
    }
    public void setMesspreistyp(Messpreistyp messpreistyp) {
        this.messpreistyp = messpreistyp;
    }

    public Preis getMindestpreis() {
        return Mindestpreis;
    }
    public void setMindestpreis(Preis mindestpreis) {
        this.mindestpreis = mindestpreis;
    }

    public List<Tarifpreis> getZusatzpreise() {
        return Zusatzpreise;
    }
    public void setZusatzpreise(List<Tarifpreis> zusatzpreise) {
        this.zusatzpreise = zusatzpreise;
    }
}