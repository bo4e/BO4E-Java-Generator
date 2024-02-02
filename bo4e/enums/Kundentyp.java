package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Auflistung der Typen von Endkunden. Daraus kann das Verbrauchsprofil abgeleitet werden.
 */
public enum Kundentyp {
    BELEUCHTUNG_OEFFENTLICH, BELEUCHTUNG_STRASSE, DIREKTHEIZUNG, GEMEINSCHAFT_MFH, GEWERBE, HAUSHALT, KIRCHE, KWK, LADESAEULE, LANDWIRT, PRIVAT, SONSTIGE, SPEICHERHEIZUNG, UNTERBR_EINRICHTUNG, WAERMEPUMPE;

    public String toValue() {
        switch (this) {
            case BELEUCHTUNG_OEFFENTLICH: return "BELEUCHTUNG_OEFFENTLICH";
            case BELEUCHTUNG_STRASSE: return "BELEUCHTUNG_STRASSE";
            case DIREKTHEIZUNG: return "DIREKTHEIZUNG";
            case GEMEINSCHAFT_MFH: return "GEMEINSCHAFT_MFH";
            case GEWERBE: return "GEWERBE";
            case HAUSHALT: return "HAUSHALT";
            case KIRCHE: return "KIRCHE";
            case KWK: return "KWK";
            case LADESAEULE: return "LADESAEULE";
            case LANDWIRT: return "LANDWIRT";
            case PRIVAT: return "PRIVAT";
            case SONSTIGE: return "SONSTIGE";
            case SPEICHERHEIZUNG: return "SPEICHERHEIZUNG";
            case UNTERBR_EINRICHTUNG: return "UNTERBR_EINRICHTUNG";
            case WAERMEPUMPE: return "WAERMEPUMPE";
        }
        return null;
    }

    public static Kundentyp forValue(String value) throws IOException {
        if (value.equals("BELEUCHTUNG_OEFFENTLICH")) return BELEUCHTUNG_OEFFENTLICH;
        if (value.equals("BELEUCHTUNG_STRASSE")) return BELEUCHTUNG_STRASSE;
        if (value.equals("DIREKTHEIZUNG")) return DIREKTHEIZUNG;
        if (value.equals("GEMEINSCHAFT_MFH")) return GEMEINSCHAFT_MFH;
        if (value.equals("GEWERBE")) return GEWERBE;
        if (value.equals("HAUSHALT")) return HAUSHALT;
        if (value.equals("KIRCHE")) return KIRCHE;
        if (value.equals("KWK")) return KWK;
        if (value.equals("LADESAEULE")) return LADESAEULE;
        if (value.equals("LANDWIRT")) return LANDWIRT;
        if (value.equals("PRIVAT")) return PRIVAT;
        if (value.equals("SONSTIGE")) return SONSTIGE;
        if (value.equals("SPEICHERHEIZUNG")) return SPEICHERHEIZUNG;
        if (value.equals("UNTERBR_EINRICHTUNG")) return UNTERBR_EINRICHTUNG;
        if (value.equals("WAERMEPUMPE")) return WAERMEPUMPE;
        throw new IOException("Cannot deserialize Kundentyp");
    }
}
