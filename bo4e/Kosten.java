package placeholder;

import java.util.List;

/**
 * Dieses BO wird zur Übertagung von hierarchischen Kostenstrukturen verwendet.
 * Die Kosten werden dabei in Kostenblöcke und diese wiederum in Kostenpositionen
 * strukturiert.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Kosten.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kosten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Kosten.json>`_
 */
public class Kosten {
    private String id;
    private Typ typ;
    private String version;
    private Zeitraum gueltigkeit;
    private List<Kostenblock> kostenbloecke;
    private Kostenklasse kostenklasse;
    private List<Betrag> summeKosten;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Klasse der Kosten, beispielsweise Fremdkosten
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Für diesen Zeitraum wurden die Kosten ermittelt
     */
    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    /**
     * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
     * Steuern etc
     */
    public List<Kostenblock> getKostenbloecke() { return kostenbloecke; }
    public void setKostenbloecke(List<Kostenblock> value) { this.kostenbloecke = value; }

    /**
     * Klasse der Kosten, beispielsweise Fremdkosten
     */
    public Kostenklasse getKostenklasse() { return kostenklasse; }
    public void setKostenklasse(Kostenklasse value) { this.kostenklasse = value; }

    /**
     * Die Gesamtsumme über alle Kostenblöcke und -positionen
     */
    public List<Betrag> getSummeKosten() { return summeKosten; }
    public void setSummeKosten(List<Betrag> value) { this.summeKosten = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
