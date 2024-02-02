package com.example.bo4e.com;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Vertragskonditionen.json>`_
 */
public class Vertragskonditionen extends COM {
    private Zeitraum abschlagszyklus;
    private String anzahlAbschlaege;
    private String beschreibung;
    private Zeitraum kuendigungsfrist;
    private Zeitraum vertragslaufzeit;
    private Zeitraum vertragsverlaengerung;

    public Zeitraum getAbschlagszyklus() { return abschlagszyklus; }
    public void setAbschlagszyklus(Zeitraum value) { this.abschlagszyklus = value; }

    public String getAnzahlAbschlaege() { return anzahlAbschlaege; }
    public void setAnzahlAbschlaege(String value) { this.anzahlAbschlaege = value; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public Zeitraum getKuendigungsfrist() { return kuendigungsfrist; }
    public void setKuendigungsfrist(Zeitraum value) { this.kuendigungsfrist = value; }

    public Zeitraum getVertragslaufzeit() { return vertragslaufzeit; }
    public void setVertragslaufzeit(Zeitraum value) { this.vertragslaufzeit = value; }

    public Zeitraum getVertragsverlaengerung() { return vertragsverlaengerung; }
    public void setVertragsverlaengerung(Zeitraum value) { this.vertragsverlaengerung = value; }

}
