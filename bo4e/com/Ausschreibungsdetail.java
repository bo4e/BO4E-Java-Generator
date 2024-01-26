package bo4e.com;

import com.example.bo4e.enums.Zaehlertyp;

/**
 * Die Komponente Ausschreibungsdetail wird verwendet um die Informationen zu einer
 * Abnahmestelle innerhalb eines
 * Ausschreibungsloses abzubilden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Ausschreibungsdetail.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Ausschreibungsdetail JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Ausschreibungsdetail.json>`_
 */
public class Ausschreibungsdetail extends COM {
    private Boolean istLastgangVorhanden;
    private String kunde;
    private Zeitraum lieferzeitraum;
    private Adresse marktlokationsadresse;
    private String marktlokationsbezeichnung;
    private String marktlokationsID;
    private String netzbetreiber;
    private String netzebeneLieferung;
    private String netzebeneMessung;
    private Menge prognoseArbeitLieferzeitraum;
    private Menge prognoseJahresarbeit;
    private Menge prognoseLeistung;
    private Adresse rechnungsadresse;
    private String zaehlernummer;
    private Zaehlertyp zaehlertechnik;

    public Boolean getIstLastgangVorhanden() { return istLastgangVorhanden; }
    public void setIstLastgangVorhanden(Boolean value) { this.istLastgangVorhanden = value; }

    public String getKunde() { return kunde; }
    public void setKunde(String value) { this.kunde = value; }

    public Zeitraum getLieferzeitraum() { return lieferzeitraum; }
    public void setLieferzeitraum(Zeitraum value) { this.lieferzeitraum = value; }

    public Adresse getMarktlokationsadresse() { return marktlokationsadresse; }
    public void setMarktlokationsadresse(Adresse value) { this.marktlokationsadresse = value; }

    public String getMarktlokationsbezeichnung() { return marktlokationsbezeichnung; }
    public void setMarktlokationsbezeichnung(String value) { this.marktlokationsbezeichnung = value; }

    public String getMarktlokationsID() { return marktlokationsID; }
    public void setMarktlokationsID(String value) { this.marktlokationsID = value; }

    public String getNetzbetreiber() { return netzbetreiber; }
    public void setNetzbetreiber(String value) { this.netzbetreiber = value; }

    public String getNetzebeneLieferung() { return netzebeneLieferung; }
    public void setNetzebeneLieferung(String value) { this.netzebeneLieferung = value; }

    public String getNetzebeneMessung() { return netzebeneMessung; }
    public void setNetzebeneMessung(String value) { this.netzebeneMessung = value; }

    public Menge getPrognoseArbeitLieferzeitraum() { return prognoseArbeitLieferzeitraum; }
    public void setPrognoseArbeitLieferzeitraum(Menge value) { this.prognoseArbeitLieferzeitraum = value; }

    public Menge getPrognoseJahresarbeit() { return prognoseJahresarbeit; }
    public void setPrognoseJahresarbeit(Menge value) { this.prognoseJahresarbeit = value; }

    public Menge getPrognoseLeistung() { return prognoseLeistung; }
    public void setPrognoseLeistung(Menge value) { this.prognoseLeistung = value; }

    public Adresse getRechnungsadresse() { return rechnungsadresse; }
    public void setRechnungsadresse(Adresse value) { this.rechnungsadresse = value; }

    public String getZaehlernummer() { return zaehlernummer; }
    public void setZaehlernummer(String value) { this.zaehlernummer = value; }

    public Zaehlertyp getZaehlertechnik() { return zaehlertechnik; }
    public void setZaehlertechnik(Zaehlertyp value) { this.zaehlertechnik = value; }

}
