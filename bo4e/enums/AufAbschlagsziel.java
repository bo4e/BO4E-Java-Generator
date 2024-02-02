package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Der Preis, auf den sich ein Auf- oder Abschlag bezieht.
 */
public enum AufAbschlagsziel {
    ARBEITSPREIS_EINTARIF, ARBEITSPREIS_HT, ARBEITSPREIS_HT_NT, ARBEITSPREIS_NT, GESAMTPREIS, GRUNDPREIS;

    public String toValue() {
        switch (this) {
            case ARBEITSPREIS_EINTARIF: return "ARBEITSPREIS_EINTARIF";
            case ARBEITSPREIS_HT: return "ARBEITSPREIS_HT";
            case ARBEITSPREIS_HT_NT: return "ARBEITSPREIS_HT_NT";
            case ARBEITSPREIS_NT: return "ARBEITSPREIS_NT";
            case GESAMTPREIS: return "GESAMTPREIS";
            case GRUNDPREIS: return "GRUNDPREIS";
        }
        return null;
    }

    public static AufAbschlagsziel forValue(String value) throws IOException {
        if (value.equals("ARBEITSPREIS_EINTARIF")) return ARBEITSPREIS_EINTARIF;
        if (value.equals("ARBEITSPREIS_HT")) return ARBEITSPREIS_HT;
        if (value.equals("ARBEITSPREIS_HT_NT")) return ARBEITSPREIS_HT_NT;
        if (value.equals("ARBEITSPREIS_NT")) return ARBEITSPREIS_NT;
        if (value.equals("GESAMTPREIS")) return GESAMTPREIS;
        if (value.equals("GRUNDPREIS")) return GRUNDPREIS;
        throw new IOException("Cannot deserialize AufAbschlagsziel");
    }
}
