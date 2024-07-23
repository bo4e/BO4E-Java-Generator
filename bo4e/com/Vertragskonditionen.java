package bo4e.com;

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
public class Vertragskonditionen extends COM {
    /**
     * In diesen Zyklen werden Abschläge gestellt. Alternativ kann auch die Anzahl in den
     * Konditionen angeben werden.
     */
    private Zeitraum abschlagszyklus;
    /**
     * Anzahl der vereinbarten Abschläge pro Jahr, z.B. 12
     */
    private Double anzahlAbschlaege;
    /**
     * Freitext zur Beschreibung der Konditionen, z.B. "Standardkonditionen Gas"
     */
    private String beschreibung;
    /**
     * Innerhalb dieser Frist kann der Vertrag gekündigt werden
     */
    private Zeitraum kuendigungsfrist;
    /**
     * Über diesen Zeitraum läuft der Vertrag
     */
    private Zeitraum vertragslaufzeit;
    /**
     * Falls der Vertrag nicht gekündigt wird, verlängert er sich automatisch um die hier
     * angegebene Zeit
     */
    private Zeitraum vertragsverlaengerung;

    public Zeitraum getAbschlagszyklus() {
        return Abschlagszyklus;
    }
    public void setAbschlagszyklus(Zeitraum abschlagszyklus) {
        this.abschlagszyklus = abschlagszyklus;
    }

    public Double getAnzahlAbschlaege() {
        return AnzahlAbschlaege;
    }
    public void setAnzahlAbschlaege(Double anzahlAbschlaege) {
        this.anzahlAbschlaege = anzahlAbschlaege;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Zeitraum getKuendigungsfrist() {
        return Kuendigungsfrist;
    }
    public void setKuendigungsfrist(Zeitraum kuendigungsfrist) {
        this.kuendigungsfrist = kuendigungsfrist;
    }

    public Zeitraum getVertragslaufzeit() {
        return Vertragslaufzeit;
    }
    public void setVertragslaufzeit(Zeitraum vertragslaufzeit) {
        this.vertragslaufzeit = vertragslaufzeit;
    }

    public Zeitraum getVertragsverlaengerung() {
        return Vertragsverlaengerung;
    }
    public void setVertragsverlaengerung(Zeitraum vertragsverlaengerung) {
        this.vertragsverlaengerung = vertragsverlaengerung;
    }
}