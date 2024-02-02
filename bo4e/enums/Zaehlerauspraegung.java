package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Gibt an, ob es sich um einen Einrichtungs- oder Zweirichtungszähler handelt.
 */
public enum Zaehlerauspraegung {
    EINRICHTUNGSZAEHLER, ZWEIRICHTUNGSZAEHLER;

    public String toValue() {
        switch (this) {
            case EINRICHTUNGSZAEHLER: return "EINRICHTUNGSZAEHLER";
            case ZWEIRICHTUNGSZAEHLER: return "ZWEIRICHTUNGSZAEHLER";
        }
        return null;
    }

    public static Zaehlerauspraegung forValue(String value) throws IOException {
        if (value.equals("EINRICHTUNGSZAEHLER")) return EINRICHTUNGSZAEHLER;
        if (value.equals("ZWEIRICHTUNGSZAEHLER")) return ZWEIRICHTUNGSZAEHLER;
        throw new IOException("Cannot deserialize Zaehlerauspraegung");
    }
}
