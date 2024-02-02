package com.example.bo4e.com;

import com.example.bo4e.enums.BDEWArtikelnummer;
import com.example.bo4e.enums.Mengeneinheit;
import java.time.OffsetDateTime;

/**
 * Über Rechnungspositionen werden Rechnungen strukturiert.
 * In einem Rechnungsteil wird jeweils eine in sich geschlossene Leistung abgerechnet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Rechnungsposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Rechnungsposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/com/Rechnungsposition.json>`_
 */
public class Rechnungsposition extends COM {
    private String artikelId;
    private BDEWArtikelnummer artikelnummer;
    private Preis einzelpreis;
    private OffsetDateTime lieferungBis;
    private OffsetDateTime lieferungVon;
    private String lokationsId;
    private Menge positionsMenge;
    private Long positionsnummer;
    private String positionstext;
    private Betrag teilrabattNetto;
    private Betrag teilsummeNetto;
    private Steuerbetrag teilsummeSteuer;
    private Menge zeitbezogeneMenge;
    private Mengeneinheit zeiteinheit;

    public String getArtikelId() { return artikelId; }
    public void setArtikelId(String value) { this.artikelId = value; }

    public BDEWArtikelnummer getArtikelnummer() { return artikelnummer; }
    public void setArtikelnummer(BDEWArtikelnummer value) { this.artikelnummer = value; }

    public Preis getEinzelpreis() { return einzelpreis; }
    public void setEinzelpreis(Preis value) { this.einzelpreis = value; }

    public OffsetDateTime getLieferungBis() { return lieferungBis; }
    public void setLieferungBis(OffsetDateTime value) { this.lieferungBis = value; }

    public OffsetDateTime getLieferungVon() { return lieferungVon; }
    public void setLieferungVon(OffsetDateTime value) { this.lieferungVon = value; }

    public String getLokationsId() { return lokationsId; }
    public void setLokationsId(String value) { this.lokationsId = value; }

    public Menge getPositionsMenge() { return positionsMenge; }
    public void setPositionsMenge(Menge value) { this.positionsMenge = value; }

    public Long getPositionsnummer() { return positionsnummer; }
    public void setPositionsnummer(Long value) { this.positionsnummer = value; }

    public String getPositionstext() { return positionstext; }
    public void setPositionstext(String value) { this.positionstext = value; }

    public Betrag getTeilrabattNetto() { return teilrabattNetto; }
    public void setTeilrabattNetto(Betrag value) { this.teilrabattNetto = value; }

    public Betrag getTeilsummeNetto() { return teilsummeNetto; }
    public void setTeilsummeNetto(Betrag value) { this.teilsummeNetto = value; }

    public Steuerbetrag getTeilsummeSteuer() { return teilsummeSteuer; }
    public void setTeilsummeSteuer(Steuerbetrag value) { this.teilsummeSteuer = value; }

    public Menge getZeitbezogeneMenge() { return zeitbezogeneMenge; }
    public void setZeitbezogeneMenge(Menge value) { this.zeitbezogeneMenge = value; }

    public Mengeneinheit getZeiteinheit() { return zeiteinheit; }
    public void setZeiteinheit(Mengeneinheit value) { this.zeiteinheit = value; }

}
