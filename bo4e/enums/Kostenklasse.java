package bo4e.enums;

import java.io.IOException;

/**
 * Kostenklassen bilden die oberste Ebene der verschiedenen Kosten.
 * In der Regel werden die Gesamtkosten einer Kostenklasse in einer App berechnet.
 */
public enum Kostenklasse {
    BESCHAFFUNG, ENERGIEVERSORGUNGSKOSTEN, FREMDKOSTEN, MARGEN, SELBSTKOSTEN;

    public String toValue() {
        switch (this) {
            case BESCHAFFUNG: return "BESCHAFFUNG";
            case ENERGIEVERSORGUNGSKOSTEN: return "ENERGIEVERSORGUNGSKOSTEN";
            case FREMDKOSTEN: return "FREMDKOSTEN";
            case MARGEN: return "MARGEN";
            case SELBSTKOSTEN: return "SELBSTKOSTEN";
        }
        return null;
    }

    public static Kostenklasse forValue(String value) throws IOException {
        if (value.equals("BESCHAFFUNG")) return BESCHAFFUNG;
        if (value.equals("ENERGIEVERSORGUNGSKOSTEN")) return ENERGIEVERSORGUNGSKOSTEN;
        if (value.equals("FREMDKOSTEN")) return FREMDKOSTEN;
        if (value.equals("MARGEN")) return MARGEN;
        if (value.equals("SELBSTKOSTEN")) return SELBSTKOSTEN;
        throw new IOException("Cannot deserialize Kostenklasse");
    }
}
