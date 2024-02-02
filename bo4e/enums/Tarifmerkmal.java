package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Produktmerkmale im Zusammenhang mit der Tarifdefinition.
 */
public enum Tarifmerkmal {
    BAUSTROM, FESTPREIS, HAUSLICHT, HEIZSTROM, KOMBI, ONLINE, PAKET, STANDARD, VORKASSE;

    public String toValue() {
        switch (this) {
            case BAUSTROM: return "BAUSTROM";
            case FESTPREIS: return "FESTPREIS";
            case HAUSLICHT: return "HAUSLICHT";
            case HEIZSTROM: return "HEIZSTROM";
            case KOMBI: return "KOMBI";
            case ONLINE: return "ONLINE";
            case PAKET: return "PAKET";
            case STANDARD: return "STANDARD";
            case VORKASSE: return "VORKASSE";
        }
        return null;
    }

    public static Tarifmerkmal forValue(String value) throws IOException {
        if (value.equals("BAUSTROM")) return BAUSTROM;
        if (value.equals("FESTPREIS")) return FESTPREIS;
        if (value.equals("HAUSLICHT")) return HAUSLICHT;
        if (value.equals("HEIZSTROM")) return HEIZSTROM;
        if (value.equals("KOMBI")) return KOMBI;
        if (value.equals("ONLINE")) return ONLINE;
        if (value.equals("PAKET")) return PAKET;
        if (value.equals("STANDARD")) return STANDARD;
        if (value.equals("VORKASSE")) return VORKASSE;
        throw new IOException("Cannot deserialize Tarifmerkmal");
    }
}
