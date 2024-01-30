package bo4e.com;

import com.example.bo4e.enums.Tarifkalkulationsmethode;
import com.example.StringOderNummer;
import com.example.bo4e.enums.Messpreistyp;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Tarifberechnungsparameter.json>`_
 */
public class Tarifberechnungsparameter extends COM {
    private Tarifkalkulationsmethode berechnungsmethode;
    private Preis hoechstpreisHT;
    private Preis hoechstpreisNT;
    private Boolean istMesspreisInGrundpreisEnthalten;
    private Boolean istMesspreisZuBeruecksichtigen;
    private String kwInklusive;
    private String kwWeitereMengen;
    private Messpreistyp messpreistyp;
    private Preis mindestpreis;
    private Tarifpreis[] zusatzpreise;

    public Tarifkalkulationsmethode getBerechnungsmethode() { return berechnungsmethode; }
    public void setBerechnungsmethode(Tarifkalkulationsmethode value) { this.berechnungsmethode = value; }

    public Preis getHoechstpreisHT() { return hoechstpreisHT; }
    public void setHoechstpreisHT(Preis value) { this.hoechstpreisHT = value; }

    public Preis getHoechstpreisNT() { return hoechstpreisNT; }
    public void setHoechstpreisNT(Preis value) { this.hoechstpreisNT = value; }

    public Boolean getIstMesspreisInGrundpreisEnthalten() { return istMesspreisInGrundpreisEnthalten; }
    public void setIstMesspreisInGrundpreisEnthalten(Boolean value) { this.istMesspreisInGrundpreisEnthalten = value; }

    public Boolean getIstMesspreisZuBeruecksichtigen() { return istMesspreisZuBeruecksichtigen; }
    public void setIstMesspreisZuBeruecksichtigen(Boolean value) { this.istMesspreisZuBeruecksichtigen = value; }

    public String getKwInklusive() { return kwInklusive; }
    public void setKwInklusive(String value) { this.kwInklusive = value; }

    public String getKwWeitereMengen() { return kwWeitereMengen; }
    public void setKwWeitereMengen(String value) { this.kwWeitereMengen = value; }

    public Messpreistyp getMesspreistyp() { return messpreistyp; }
    public void setMesspreistyp(Messpreistyp value) { this.messpreistyp = value; }

    public Preis getMindestpreis() { return mindestpreis; }
    public void setMindestpreis(Preis value) { this.mindestpreis = value; }

    public Tarifpreis[] getZusatzpreise() { return zusatzpreise; }
    public void setZusatzpreise(Tarifpreis[] value) { this.zusatzpreise = value; }
}
