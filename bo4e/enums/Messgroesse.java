package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Gibt die physikalische Größe an, die gemessen wurde.
 */
public enum Messgroesse {
    BLINDLEISTUNG, BRENNWERT, DRUCK, GRADTZAGSZAHLEN, LASTGANG, LASTPROFIL, PREISE, SPANNUNG, STROM, TEMPERATUR, VOLUMENSTROM, WIRKLEISTUNG, ZZAHL;

    public String toValue() {
        switch (this) {
            case BLINDLEISTUNG: return "BLINDLEISTUNG";
            case BRENNWERT: return "BRENNWERT";
            case DRUCK: return "DRUCK";
            case GRADTZAGSZAHLEN: return "GRADTZAGSZAHLEN";
            case LASTGANG: return "LASTGANG";
            case LASTPROFIL: return "LASTPROFIL";
            case PREISE: return "PREISE";
            case SPANNUNG: return "SPANNUNG";
            case STROM: return "STROM";
            case TEMPERATUR: return "TEMPERATUR";
            case VOLUMENSTROM: return "VOLUMENSTROM";
            case WIRKLEISTUNG: return "WIRKLEISTUNG";
            case ZZAHL: return "ZZAHL";
        }
        return null;
    }

    public static Messgroesse forValue(String value) throws IOException {
        if (value.equals("BLINDLEISTUNG")) return BLINDLEISTUNG;
        if (value.equals("BRENNWERT")) return BRENNWERT;
        if (value.equals("DRUCK")) return DRUCK;
        if (value.equals("GRADTZAGSZAHLEN")) return GRADTZAGSZAHLEN;
        if (value.equals("LASTGANG")) return LASTGANG;
        if (value.equals("LASTPROFIL")) return LASTPROFIL;
        if (value.equals("PREISE")) return PREISE;
        if (value.equals("SPANNUNG")) return SPANNUNG;
        if (value.equals("STROM")) return STROM;
        if (value.equals("TEMPERATUR")) return TEMPERATUR;
        if (value.equals("VOLUMENSTROM")) return VOLUMENSTROM;
        if (value.equals("WIRKLEISTUNG")) return WIRKLEISTUNG;
        if (value.equals("ZZAHL")) return ZZAHL;
        throw new IOException("Cannot deserialize Messgroesse");
    }
}
