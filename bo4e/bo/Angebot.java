package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Sparte;
import bo4e.com.Angebotsvariante;
import java.time.OffsetDateTime;

/**
 * Mit diesem BO kann ein Versorgungsangebot zur Strom- oder Gasversorgung oder die
 * Teilnahme an einer Ausschreibung
 * übertragen werden. Es können verschiedene Varianten enthalten sein (z.B. ein- und
 * mehrjährige Laufzeit).
 * Innerhalb jeder Variante können Teile enthalten sein, die jeweils für eine oder mehrere
 * Marktlokationen erstellt
 * werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Angebot.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebot JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.2.1/src/bo4e_schemas/bo/Angebot.json>`_
 */
public class Angebot extends Geschaeftsobjekt {
    private final Typ _typ = Typ.ANGEBOT;
    private String anfragereferenz;
    private OffsetDateTime angebotsdatum;
    private Geschaeftspartner angebotsgeber;
    private Geschaeftspartner angebotsnehmer;
    private String angebotsnummer;
    private OffsetDateTime bindefrist;
    private Sparte sparte;
    private Person unterzeichnerAngebotsgeber;
    private Person unterzeichnerAngebotsnehmer;
    private Angebotsvariante[] varianten;

    /**
     * Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer oder eine GUID)
     */
    /**
     * Eindeutige Nummer des Angebotes
     */
    public Typ getTyp() { return _typ; }

    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
     */
    public String getAnfragereferenz() { return anfragereferenz; }
    public void setAnfragereferenz(String value) { this.anfragereferenz = value; }

    /**
     * Erstellungsdatum des Angebots
     */
    public OffsetDateTime getAngebotsdatum() { return angebotsdatum; }
    public void setAngebotsdatum(OffsetDateTime value) { this.angebotsdatum = value; }

    /**
     * Ersteller des Angebots
     */
    public Geschaeftspartner getAngebotsgeber() { return angebotsgeber; }
    public void setAngebotsgeber(Geschaeftspartner value) { this.angebotsgeber = value; }

    /**
     * Empfänger des Angebots
     */
    public Geschaeftspartner getAngebotsnehmer() { return angebotsnehmer; }
    public void setAngebotsnehmer(Geschaeftspartner value) { this.angebotsnehmer = value; }

    /**
     * Eindeutige Nummer des Angebotes
     */
    public String getAngebotsnummer() { return angebotsnummer; }
    public void setAngebotsnummer(String value) { this.angebotsnummer = value; }

    /**
     * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
     */
    public OffsetDateTime getBindefrist() { return bindefrist; }
    public void setBindefrist(OffsetDateTime value) { this.bindefrist = value; }

    /**
     * Sparte, für die das Angebot abgegeben wird (Strom/Gas)
     */
    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    /**
     * Person, die als Angebotsgeber das Angebots ausgestellt hat
     */
    public Person getUnterzeichnerAngebotsgeber() { return unterzeichnerAngebotsgeber; }
    public void setUnterzeichnerAngebotsgeber(Person value) { this.unterzeichnerAngebotsgeber = value; }

    /**
     * Person, die als Angebotsnehmer das Angebot angenommen hat
     */
    public Person getUnterzeichnerAngebotsnehmer() { return unterzeichnerAngebotsnehmer; }
    public void setUnterzeichnerAngebotsnehmer(Person value) { this.unterzeichnerAngebotsnehmer = value; }

    /**
     * Eine oder mehrere Varianten des Angebots mit den Angebotsteilen;
     * Ein Angebot besteht mindestens aus einer Variante.
     */
    public Angebotsvariante[] getVarianten() { return varianten; }
    public void setVarianten(Angebotsvariante[] value) { this.varianten = value; }

}
