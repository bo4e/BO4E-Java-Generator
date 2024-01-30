package bo4e.bo;

import com.example.bo4e.enums.Typ;
import com.example.bo4e.enums.Bilanzierungsmethode;
import com.example.bo4e.enums.Energierichtung;
import com.example.bo4e.enums.Gasqualitaet;
import com.example.bo4e.enums.Gebiettyp;
import com.example.bo4e.com.Geokoordinaten;
import com.example.bo4e.com.Katasteradresse;
import com.example.bo4e.enums.Kundentyp;
import com.example.bo4e.com.Adresse;
import com.example.bo4e.enums.Netzebene;
import com.example.bo4e.enums.Sparte;
import com.example.bo4e.enums.Verbrauchsart;
import com.example.bo4e.com.Messlokationszuordnung;

/**
 * Object containing information about a Marktlokation
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Marktlokation.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Marktlokation JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Marktlokation.json>`_
 */
public class Marktlokation extends Geschaeftsobjekt {
    private final Typ typ = Typ.MARKTLOKATION;
    private String bilanzierungsgebiet;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Geschaeftspartner endkunde;
    private Energierichtung energierichtung;
    private Gasqualitaet gasqualitaet;
    private Gebiettyp gebietstyp;
    private Geokoordinaten geoadresse;
    private String grundversorgercodenr;
    private Boolean istUnterbrechbar;
    private Katasteradresse katasterinformation;
    private Kundentyp[] kundengruppen;
    private Adresse lokationsadresse;
    private String marktlokationsId;
    private String netzbetreibercodenr;
    private Netzebene netzebene;
    private String netzgebietsnr;
    private Sparte sparte;
    private Verbrauchsart verbrauchsart;
    private Messlokationszuordnung zugehoerigeMesslokation;

    public Typ getTyp() { return typ; }

    public String getBilanzierungsgebiet() { return bilanzierungsgebiet; }
    public void setBilanzierungsgebiet(String value) { this.bilanzierungsgebiet = value; }

    public Bilanzierungsmethode getBilanzierungsmethode() { return bilanzierungsmethode; }
    public void setBilanzierungsmethode(Bilanzierungsmethode value) { this.bilanzierungsmethode = value; }

    public Geschaeftspartner getEndkunde() { return endkunde; }
    public void setEndkunde(Geschaeftspartner value) { this.endkunde = value; }

    public Energierichtung getEnergierichtung() { return energierichtung; }
    public void setEnergierichtung(Energierichtung value) { this.energierichtung = value; }

    public Gasqualitaet getGasqualitaet() { return gasqualitaet; }
    public void setGasqualitaet(Gasqualitaet value) { this.gasqualitaet = value; }

    public Gebiettyp getGebietstyp() { return gebietstyp; }
    public void setGebietstyp(Gebiettyp value) { this.gebietstyp = value; }

    public Geokoordinaten getGeoadresse() { return geoadresse; }
    public void setGeoadresse(Geokoordinaten value) { this.geoadresse = value; }

    public String getGrundversorgercodenr() { return grundversorgercodenr; }
    public void setGrundversorgercodenr(String value) { this.grundversorgercodenr = value; }

    public Boolean getIstUnterbrechbar() { return istUnterbrechbar; }
    public void setIstUnterbrechbar(Boolean value) { this.istUnterbrechbar = value; }

    public Katasteradresse getKatasterinformation() { return katasterinformation; }
    public void setKatasterinformation(Katasteradresse value) { this.katasterinformation = value; }

    public Kundentyp[] getKundengruppen() { return kundengruppen; }
    public void setKundengruppen(Kundentyp[] value) { this.kundengruppen = value; }

    public Adresse getLokationsadresse() { return lokationsadresse; }
    public void setLokationsadresse(Adresse value) { this.lokationsadresse = value; }

    public String getMarktlokationsId() { return marktlokationsId; }
    public void setMarktlokationsId(String value) { this.marktlokationsId = value; }

    public String getNetzbetreibercodenr() { return netzbetreibercodenr; }
    public void setNetzbetreibercodenr(String value) { this.netzbetreibercodenr = value; }

    public Netzebene getNetzebene() { return netzebene; }
    public void setNetzebene(Netzebene value) { this.netzebene = value; }

    public String getNetzgebietsnr() { return netzgebietsnr; }
    public void setNetzgebietsnr(String value) { this.netzgebietsnr = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public Verbrauchsart getVerbrauchsart() { return verbrauchsart; }
    public void setVerbrauchsart(Verbrauchsart value) { this.verbrauchsart = value; }

    public Messlokationszuordnung getZugehoerigeMesslokation() { return zugehoerigeMesslokation; }
    public void setZugehoerigeMesslokation(Messlokationszuordnung value) { this.zugehoerigeMesslokation = value; }

}
