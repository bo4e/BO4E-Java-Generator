package bo4e.com;

import java.time.OffsetDateTime;

/**
 * Eine Kostenposition im Bereich der Fremdkosten
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Fremdkostenposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Fremdkostenposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Fremdkostenposition.json>`_
 */
public class Fremdkostenposition extends COM {
    private String artikelbezeichnung;
    private String artikeldetail;
    private Betrag betragKostenposition;
    private OffsetDateTime bis;
    private Preis einzelpreis;
    private String gebietcodeEic;
    private String linkPreisblatt;
    private String marktpartnercode;
    private String marktpartnername;
    private Menge menge;
    private String positionstitel;
    private OffsetDateTime von;
    private Menge zeitmenge;

    public String getArtikelbezeichnung() { return artikelbezeichnung; }
    public void setArtikelbezeichnung(String value) { this.artikelbezeichnung = value; }

    public String getArtikeldetail() { return artikeldetail; }
    public void setArtikeldetail(String value) { this.artikeldetail = value; }

    public Betrag getBetragKostenposition() { return betragKostenposition; }
    public void setBetragKostenposition(Betrag value) { this.betragKostenposition = value; }

    public OffsetDateTime getBis() { return bis; }
    public void setBis(OffsetDateTime value) { this.bis = value; }

    public Preis getEinzelpreis() { return einzelpreis; }
    public void setEinzelpreis(Preis value) { this.einzelpreis = value; }

    public String getGebietcodeEic() { return gebietcodeEic; }
    public void setGebietcodeEic(String value) { this.gebietcodeEic = value; }

    public String getLinkPreisblatt() { return linkPreisblatt; }
    public void setLinkPreisblatt(String value) { this.linkPreisblatt = value; }

    public String getMarktpartnercode() { return marktpartnercode; }
    public void setMarktpartnercode(String value) { this.marktpartnercode = value; }

    public String getMarktpartnername() { return marktpartnername; }
    public void setMarktpartnername(String value) { this.marktpartnername = value; }

    public Menge getMenge() { return menge; }
    public void setMenge(Menge value) { this.menge = value; }

    public String getPositionstitel() { return positionstitel; }
    public void setPositionstitel(String value) { this.positionstitel = value; }

    public OffsetDateTime getVon() { return von; }
    public void setVon(OffsetDateTime value) { this.von = value; }

    public Menge getZeitmenge() { return zeitmenge; }
    public void setZeitmenge(Menge value) { this.zeitmenge = value; }

}
