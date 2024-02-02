package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Die Registeranzahl wird verwendet zur Charakterisierung von Zählern und daraus
 * resultierenden Tarifen.
 */
public enum Registeranzahl {
    EINTARIF, MEHRTARIF, ZWEITARIF;

    public String toValue() {
        switch (this) {
            case EINTARIF: return "EINTARIF";
            case MEHRTARIF: return "MEHRTARIF";
            case ZWEITARIF: return "ZWEITARIF";
        }
        return null;
    }

    public static Registeranzahl forValue(String value) throws IOException {
        if (value.equals("EINTARIF")) return EINTARIF;
        if (value.equals("MEHRTARIF")) return MEHRTARIF;
        if (value.equals("ZWEITARIF")) return ZWEITARIF;
        throw new IOException("Cannot deserialize Registeranzahl");
    }
}
