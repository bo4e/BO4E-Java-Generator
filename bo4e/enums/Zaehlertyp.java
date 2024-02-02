package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Bei diesem Enum handelt es sich um die Abbildung von Zählertypen der Sparten Strom und
 * Gas.
 */
public enum Zaehlertyp {
    BALGENGASZAEHLER, DREHKOLBENZAEHLER, DREHSTROMZAEHLER, ELEKTRONISCHER_ZAEHLER, INTELLIGENTES_MESSSYSTEM, LEISTUNGSZAEHLER, MAXIMUMZAEHLER, MODERNE_MESSEINRICHTUNG, TURBINENRADGASZAEHLER, ULTRASCHALLGASZAEHLER, WECHSELSTROMZAEHLER, WIRBELGASZAEHLER;

    public String toValue() {
        switch (this) {
            case BALGENGASZAEHLER: return "BALGENGASZAEHLER";
            case DREHKOLBENZAEHLER: return "DREHKOLBENZAEHLER";
            case DREHSTROMZAEHLER: return "DREHSTROMZAEHLER";
            case ELEKTRONISCHER_ZAEHLER: return "ELEKTRONISCHER_ZAEHLER";
            case INTELLIGENTES_MESSSYSTEM: return "INTELLIGENTES_MESSSYSTEM";
            case LEISTUNGSZAEHLER: return "LEISTUNGSZAEHLER";
            case MAXIMUMZAEHLER: return "MAXIMUMZAEHLER";
            case MODERNE_MESSEINRICHTUNG: return "MODERNE_MESSEINRICHTUNG";
            case TURBINENRADGASZAEHLER: return "TURBINENRADGASZAEHLER";
            case ULTRASCHALLGASZAEHLER: return "ULTRASCHALLGASZAEHLER";
            case WECHSELSTROMZAEHLER: return "WECHSELSTROMZAEHLER";
            case WIRBELGASZAEHLER: return "WIRBELGASZAEHLER";
        }
        return null;
    }

    public static Zaehlertyp forValue(String value) throws IOException {
        if (value.equals("BALGENGASZAEHLER")) return BALGENGASZAEHLER;
        if (value.equals("DREHKOLBENZAEHLER")) return DREHKOLBENZAEHLER;
        if (value.equals("DREHSTROMZAEHLER")) return DREHSTROMZAEHLER;
        if (value.equals("ELEKTRONISCHER_ZAEHLER")) return ELEKTRONISCHER_ZAEHLER;
        if (value.equals("INTELLIGENTES_MESSSYSTEM")) return INTELLIGENTES_MESSSYSTEM;
        if (value.equals("LEISTUNGSZAEHLER")) return LEISTUNGSZAEHLER;
        if (value.equals("MAXIMUMZAEHLER")) return MAXIMUMZAEHLER;
        if (value.equals("MODERNE_MESSEINRICHTUNG")) return MODERNE_MESSEINRICHTUNG;
        if (value.equals("TURBINENRADGASZAEHLER")) return TURBINENRADGASZAEHLER;
        if (value.equals("ULTRASCHALLGASZAEHLER")) return ULTRASCHALLGASZAEHLER;
        if (value.equals("WECHSELSTROMZAEHLER")) return WECHSELSTROMZAEHLER;
        if (value.equals("WIRBELGASZAEHLER")) return WIRBELGASZAEHLER;
        throw new IOException("Cannot deserialize Zaehlertyp");
    }
}
