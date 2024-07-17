package placeholder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Modell für die Abbildung von Vertragsbeziehungen;
 * Das Objekt dient dazu, alle Arten von Verträgen, die in der Energiewirtschaft Verwendung
 * finden, abzubilden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Vertrag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Vertrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Vertrag.json>`_
 */
public class Vertrag {
    private String id;
    private Typ typ;
    private String version;
    private String beschreibung;
    private Sparte sparte;
    private List<Unterschrift> unterzeichnervp1;
    private List<Unterschrift> unterzeichnervp2;
    private Vertragsart vertragsart;
    private OffsetDateTime vertragsbeginn;
    private OffsetDateTime vertragsende;
    private Vertragskonditionen vertragskonditionen;
    private String vertragsnummer;
    private Geschaeftspartner vertragspartner1;
    private Geschaeftspartner vertragspartner2;
    private Vertragsstatus vertragsstatus;
    private List<Vertragsteil> vertragsteile;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Der Typ des Geschäftsobjektes
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Beschreibung zum Vertrag
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Unterscheidungsmöglichkeiten für die Sparte
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    /**
     * Unterzeichner des Vertragspartners 1
     */
    public List<Unterschrift> getUnterzeichnervp1() { return unterzeichnervp1; }
    public void setUnterzeichnervp1(List<Unterschrift> value) { this.unterzeichnervp1 = value; }

    /**
     * Unterzeichner des Vertragspartners 2
     */
    public List<Unterschrift> getUnterzeichnervp2() { return unterzeichnervp2; }
    public void setUnterzeichnervp2(List<Unterschrift> value) { this.unterzeichnervp2 = value; }

    /**
     * Hier ist festgelegt, um welche Art von Vertrag es sich handelt.
     */
    public Vertragsart getVertragsart() { return vertragsart; }
    public void setVertragsart(Vertragsart value) { this.vertragsart = value; }

    /**
     * Gibt an, wann der Vertrag beginnt (inklusiv)
     */
    public OffsetDateTime getVertragsbeginn() { return vertragsbeginn; }
    public void setVertragsbeginn(OffsetDateTime value) { this.vertragsbeginn = value; }

    /**
     * Gibt an, wann der Vertrag (voraussichtlich) endet oder beendet wurde (exklusiv)
     */
    public OffsetDateTime getVertragsende() { return vertragsende; }
    public void setVertragsende(OffsetDateTime value) { this.vertragsende = value; }

    /**
     * Festlegungen zu Laufzeiten und Kündigungsfristen
     */
    public Vertragskonditionen getVertragskonditionen() { return vertragskonditionen; }
    public void setVertragskonditionen(Vertragskonditionen value) { this.vertragskonditionen = value; }

    /**
     * Eine im Verwendungskontext eindeutige Nummer für den Vertrag
     */
    public String getVertragsnummer() { return vertragsnummer; }
    public void setVertragsnummer(String value) { this.vertragsnummer = value; }

    /**
     * Der "erstgenannte" Vertragspartner.
     * In der Regel der Aussteller des Vertrags.
     * Beispiel: "Vertrag zwischen Vertragspartner 1 ..."
     */
    public Geschaeftspartner getVertragspartner1() { return vertragspartner1; }
    public void setVertragspartner1(Geschaeftspartner value) { this.vertragspartner1 = value; }

    /**
     * vertragsteile: Optional[list["Vertragsteil"]] = None
     */
    public Geschaeftspartner getVertragspartner2() { return vertragspartner2; }
    public void setVertragspartner2(Geschaeftspartner value) { this.vertragspartner2 = value; }

    /**
     * Gibt den Status des Vertrags an
     */
    public Vertragsstatus getVertragsstatus() { return vertragsstatus; }
    public void setVertragsstatus(Vertragsstatus value) { this.vertragsstatus = value; }

    /**
     * Beschreibung zum Vertrag
     */
    public List<Vertragsteil> getVertragsteile() { return vertragsteile; }
    public void setVertragsteile(List<Vertragsteil> value) { this.vertragsteile = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
