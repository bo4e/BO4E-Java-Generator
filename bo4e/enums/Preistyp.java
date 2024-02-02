package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Aufschlüsselung der Preistypen in Tarifen.
 */
public enum Preistyp {
    ARBEITSPREIS_EINTARIF, ARBEITSPREIS_HT, ARBEITSPREIS_NT, ENTGELT_ABLESUNG, ENTGELT_ABRECHNUNG, ENTGELT_MSB, GRUNDPREIS, LEISTUNGSPREIS, MESSPREIS, PROVISION;

    public String toValue() {
        switch (this) {
            case ARBEITSPREIS_EINTARIF: return "ARBEITSPREIS_EINTARIF";
            case ARBEITSPREIS_HT: return "ARBEITSPREIS_HT";
            case ARBEITSPREIS_NT: return "ARBEITSPREIS_NT";
            case ENTGELT_ABLESUNG: return "ENTGELT_ABLESUNG";
            case ENTGELT_ABRECHNUNG: return "ENTGELT_ABRECHNUNG";
            case ENTGELT_MSB: return "ENTGELT_MSB";
            case GRUNDPREIS: return "GRUNDPREIS";
            case LEISTUNGSPREIS: return "LEISTUNGSPREIS";
            case MESSPREIS: return "MESSPREIS";
            case PROVISION: return "PROVISION";
        }
        return null;
    }

    public static Preistyp forValue(String value) throws IOException {
        if (value.equals("ARBEITSPREIS_EINTARIF")) return ARBEITSPREIS_EINTARIF;
        if (value.equals("ARBEITSPREIS_HT")) return ARBEITSPREIS_HT;
        if (value.equals("ARBEITSPREIS_NT")) return ARBEITSPREIS_NT;
        if (value.equals("ENTGELT_ABLESUNG")) return ENTGELT_ABLESUNG;
        if (value.equals("ENTGELT_ABRECHNUNG")) return ENTGELT_ABRECHNUNG;
        if (value.equals("ENTGELT_MSB")) return ENTGELT_MSB;
        if (value.equals("GRUNDPREIS")) return GRUNDPREIS;
        if (value.equals("LEISTUNGSPREIS")) return LEISTUNGSPREIS;
        if (value.equals("MESSPREIS")) return MESSPREIS;
        if (value.equals("PROVISION")) return PROVISION;
        throw new IOException("Cannot deserialize Preistyp");
    }
}
