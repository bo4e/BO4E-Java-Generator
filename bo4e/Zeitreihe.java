package placeholder;

import java.util.List;

/**
 * Abbildung einer allgemeinen Zeitreihe mit einem Wertvektor.
 * Die Werte können mit wahlfreier zeitlicher Distanz im Vektor abgelegt sein.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Zeitreihe.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitreihe JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Zeitreihe.json>`_
 */
public class Zeitreihe {
    private String id;
    private Typ typ;
    private String beschreibung;
    private String bezeichnung;
    private Mengeneinheit einheit;
    private Medium medium;
    private Messart messart;
    private Messgroesse messgroesse;
    private String version;
    private List<Zeitreihenwert> werte;
    private Wertermittlungsverfahren wertherkunft;
    private List<ZusatzAttribut> zusatzAttribute;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    public String getid() { return id; }
    public void setid(String value) { this.id = value; }

    /**
     * Bezeichnung für die Zeitreihe
     */
    public Typ getTyp() { return typ; }
    public void setTyp(Typ value) { this.typ = value; }

    /**
     * Beschreibt die Verwendung der Zeitreihe
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Bezeichnung für die Zeitreihe
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Alle Werte in der Tabelle haben die Einheit, die hier angegeben ist
     */
    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    /**
     * Medium, das gemessen wurde (z.B. Wasser, Dampf, Strom, Gas)
     */
    public Medium getMedium() { return medium; }
    public void setMedium(Medium value) { this.medium = value; }

    /**
     * Beschreibt die Art der Messung (z.B. aktueller Wert, mittlerer Wert, maximaler Wert)
     */
    public Messart getMessart() { return messart; }
    public void setMessart(Messart value) { this.messart = value; }

    /**
     * Beschreibt, was gemessen wurde (z.B. Strom, Spannung, Wirkleistung, Scheinleistung)
     */
    public Messgroesse getMessgroesse() { return messgroesse; }
    public void setMessgroesse(Messgroesse value) { this.messgroesse = value; }

    /**
     * Version der Zeitreihe
     */
    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    /**
     * Hier liegen jeweils die Werte
     */
    public List<Zeitreihenwert> getWerte() { return werte; }
    public void setWerte(List<Zeitreihenwert> value) { this.werte = value; }

    /**
     * Kennzeichnung, wie die Werte entstanden sind, z.B. durch Messung
     */
    public Wertermittlungsverfahren getWertherkunft() { return wertherkunft; }
    public void setWertherkunft(Wertermittlungsverfahren value) { this.wertherkunft = value; }

    public List<ZusatzAttribut> getZusatzAttribute() { return zusatzAttribute; }
    public void setZusatzAttribute(List<ZusatzAttribut> value) { this.zusatzAttribute = value; }
}
