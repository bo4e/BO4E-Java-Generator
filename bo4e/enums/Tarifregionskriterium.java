package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Mit diesen Kriterien können regionale Bereiche definiert werden.
 */
public enum Tarifregionskriterium {
    GRUNDVERSORGER_NUMMER, NETZ_NUMMER, ORT, POSTLEITZAHL, REGION;

    public String toValue() {
        switch (this) {
            case GRUNDVERSORGER_NUMMER: return "GRUNDVERSORGER_NUMMER";
            case NETZ_NUMMER: return "NETZ_NUMMER";
            case ORT: return "ORT";
            case POSTLEITZAHL: return "POSTLEITZAHL";
            case REGION: return "REGION";
        }
        return null;
    }

    public static Tarifregionskriterium forValue(String value) throws IOException {
        if (value.equals("GRUNDVERSORGER_NUMMER")) return GRUNDVERSORGER_NUMMER;
        if (value.equals("NETZ_NUMMER")) return NETZ_NUMMER;
        if (value.equals("ORT")) return ORT;
        if (value.equals("POSTLEITZAHL")) return POSTLEITZAHL;
        if (value.equals("REGION")) return REGION;
        throw new IOException("Cannot deserialize Tarifregionskriterium");
    }
}
