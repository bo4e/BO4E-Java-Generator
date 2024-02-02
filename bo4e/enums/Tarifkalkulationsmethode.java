package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Auflistung der verschiedenen Berechnungsmethoden für ein Preisblatt.
 */
public enum Tarifkalkulationsmethode {
    BESTABRECHNUNG_STAFFEL, KEINE, PAKETPREIS, STAFFELN, ZONEN;

    public String toValue() {
        switch (this) {
            case BESTABRECHNUNG_STAFFEL: return "BESTABRECHNUNG_STAFFEL";
            case KEINE: return "KEINE";
            case PAKETPREIS: return "PAKETPREIS";
            case STAFFELN: return "STAFFELN";
            case ZONEN: return "ZONEN";
        }
        return null;
    }

    public static Tarifkalkulationsmethode forValue(String value) throws IOException {
        if (value.equals("BESTABRECHNUNG_STAFFEL")) return BESTABRECHNUNG_STAFFEL;
        if (value.equals("KEINE")) return KEINE;
        if (value.equals("PAKETPREIS")) return PAKETPREIS;
        if (value.equals("STAFFELN")) return STAFFELN;
        if (value.equals("ZONEN")) return ZONEN;
        throw new IOException("Cannot deserialize Tarifkalkulationsmethode");
    }
}
