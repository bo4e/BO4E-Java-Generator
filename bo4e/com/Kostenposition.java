package com.example.bo4e.com;

import java.time.OffsetDateTime;

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Kostenposition verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kostenposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kostenposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Kostenposition.json>`_
 */
public class Kostenposition extends COM {
    private String artikelbezeichnung;
    private String artikeldetail;
    private Betrag betragKostenposition;
    private OffsetDateTime bis;
    private Preis einzelpreis;
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

    public Menge getMenge() { return menge; }
    public void setMenge(Menge value) { this.menge = value; }

    public String getPositionstitel() { return positionstitel; }
    public void setPositionstitel(String value) { this.positionstitel = value; }

    public OffsetDateTime getVon() { return von; }
    public void setVon(OffsetDateTime value) { this.von = value; }

    public Menge getZeitmenge() { return zeitmenge; }
    public void setZeitmenge(Menge value) { this.zeitmenge = value; }

}
