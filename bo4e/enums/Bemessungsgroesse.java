package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Zur Abbildung von Messgrössen und zur Verwendung in energiewirtschaftlichen Berechnungen.
 */
public enum Bemessungsgroesse {
    ANZAHL, BENUTZUNGSDAUER, BLINDARBEIT_IND, BLINDARBEIT_KAP, BLINDLEISTUNG_IND, BLINDLEISTUNG_KAP, LEISTUNG_EL, LEISTUNG_TH, VOLUMEN, VOLUMENSTROM, WIRKARBEIT_EL, WIRKARBEIT_TH;

    public String toValue() {
        switch (this) {
            case ANZAHL: return "ANZAHL";
            case BENUTZUNGSDAUER: return "BENUTZUNGSDAUER";
            case BLINDARBEIT_IND: return "BLINDARBEIT_IND";
            case BLINDARBEIT_KAP: return "BLINDARBEIT_KAP";
            case BLINDLEISTUNG_IND: return "BLINDLEISTUNG_IND";
            case BLINDLEISTUNG_KAP: return "BLINDLEISTUNG_KAP";
            case LEISTUNG_EL: return "LEISTUNG_EL";
            case LEISTUNG_TH: return "LEISTUNG_TH";
            case VOLUMEN: return "VOLUMEN";
            case VOLUMENSTROM: return "VOLUMENSTROM";
            case WIRKARBEIT_EL: return "WIRKARBEIT_EL";
            case WIRKARBEIT_TH: return "WIRKARBEIT_TH";
        }
        return null;
    }

    public static Bemessungsgroesse forValue(String value) throws IOException {
        if (value.equals("ANZAHL")) return ANZAHL;
        if (value.equals("BENUTZUNGSDAUER")) return BENUTZUNGSDAUER;
        if (value.equals("BLINDARBEIT_IND")) return BLINDARBEIT_IND;
        if (value.equals("BLINDARBEIT_KAP")) return BLINDARBEIT_KAP;
        if (value.equals("BLINDLEISTUNG_IND")) return BLINDLEISTUNG_IND;
        if (value.equals("BLINDLEISTUNG_KAP")) return BLINDLEISTUNG_KAP;
        if (value.equals("LEISTUNG_EL")) return LEISTUNG_EL;
        if (value.equals("LEISTUNG_TH")) return LEISTUNG_TH;
        if (value.equals("VOLUMEN")) return VOLUMEN;
        if (value.equals("VOLUMENSTROM")) return VOLUMENSTROM;
        if (value.equals("WIRKARBEIT_EL")) return WIRKARBEIT_EL;
        if (value.equals("WIRKARBEIT_TH")) return WIRKARBEIT_TH;
        throw new IOException("Cannot deserialize Bemessungsgroesse");
    }
}
