package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Sparte;
import com.example.bo4e.com.Angebotsvariante;
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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Angebot.json>`_
 */
public class Angebot extends Geschaeftsobjekt {
    private final Typ typ = Typ.ANGEBOT;
    private String anfragereferenz;
    private OffsetDateTime angebotsdatum;
    private Geschaeftspartner angebotsgeber;
    private Geschaeftspartner angebotsnehmer;
    private String angebotsnummer;
    private OffsetDateTime bindefrist;
    private Sparte sparte;
    private Ansprechpartner unterzeichnerAngebotsgeber;
    private Ansprechpartner unterzeichnerAngebotsnehmer;
    private Angebotsvariante[] varianten;

    public Typ getTyp() { return typ; }

    public String getAnfragereferenz() { return anfragereferenz; }
    public void setAnfragereferenz(String value) { this.anfragereferenz = value; }

    public OffsetDateTime getAngebotsdatum() { return angebotsdatum; }
    public void setAngebotsdatum(OffsetDateTime value) { this.angebotsdatum = value; }

    public Geschaeftspartner getAngebotsgeber() { return angebotsgeber; }
    public void setAngebotsgeber(Geschaeftspartner value) { this.angebotsgeber = value; }

    public Geschaeftspartner getAngebotsnehmer() { return angebotsnehmer; }
    public void setAngebotsnehmer(Geschaeftspartner value) { this.angebotsnehmer = value; }

    public String getAngebotsnummer() { return angebotsnummer; }
    public void setAngebotsnummer(String value) { this.angebotsnummer = value; }

    public OffsetDateTime getBindefrist() { return bindefrist; }
    public void setBindefrist(OffsetDateTime value) { this.bindefrist = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public Ansprechpartner getUnterzeichnerAngebotsgeber() { return unterzeichnerAngebotsgeber; }
    public void setUnterzeichnerAngebotsgeber(Ansprechpartner value) { this.unterzeichnerAngebotsgeber = value; }

    public Ansprechpartner getUnterzeichnerAngebotsnehmer() { return unterzeichnerAngebotsnehmer; }
    public void setUnterzeichnerAngebotsnehmer(Ansprechpartner value) { this.unterzeichnerAngebotsnehmer = value; }

    public Angebotsvariante[] getVarianten() { return varianten; }
    public void setVarianten(Angebotsvariante[] value) { this.varianten = value; }

}
