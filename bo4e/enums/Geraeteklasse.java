package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Auflistung möglicher übergreifenden Geräteklassen.
 */
public enum Geraeteklasse {
    KOMMUNIKATIONSEINRICHTUNG, MENGENUMWERTER, SMARTMETER_GATEWAY, STEUERBOX, TECHNISCHE_STEUEREINRICHTUNG, WANDLER, ZAEHLEINRICHTUNG;

    public String toValue() {
        switch (this) {
            case KOMMUNIKATIONSEINRICHTUNG: return "KOMMUNIKATIONSEINRICHTUNG";
            case MENGENUMWERTER: return "MENGENUMWERTER";
            case SMARTMETER_GATEWAY: return "SMARTMETER_GATEWAY";
            case STEUERBOX: return "STEUERBOX";
            case TECHNISCHE_STEUEREINRICHTUNG: return "TECHNISCHE_STEUEREINRICHTUNG";
            case WANDLER: return "WANDLER";
            case ZAEHLEINRICHTUNG: return "ZAEHLEINRICHTUNG";
        }
        return null;
    }

    public static Geraeteklasse forValue(String value) throws IOException {
        if (value.equals("KOMMUNIKATIONSEINRICHTUNG")) return KOMMUNIKATIONSEINRICHTUNG;
        if (value.equals("MENGENUMWERTER")) return MENGENUMWERTER;
        if (value.equals("SMARTMETER_GATEWAY")) return SMARTMETER_GATEWAY;
        if (value.equals("STEUERBOX")) return STEUERBOX;
        if (value.equals("TECHNISCHE_STEUEREINRICHTUNG")) return TECHNISCHE_STEUEREINRICHTUNG;
        if (value.equals("WANDLER")) return WANDLER;
        if (value.equals("ZAEHLEINRICHTUNG")) return ZAEHLEINRICHTUNG;
        throw new IOException("Cannot deserialize Geraeteklasse");
    }
}
