package bo4e.enums;

import java.io.IOException;

/**
 * Einheit: Messgrößen, die per Messung oder Vorgabe ermittelt werden können.
 */
public enum Mengeneinheit {
    HALBJAHR, JAHR, KUBIKMETER, KVAR, KVARH, KW, KWH, KWHK, MINUTE, MONAT, MW, MWH, PROZENT, QUARTAL, SEKUNDE, STUECK, STUNDE, TAG, VAR, VARH, VIERTEL_STUNDE, W, WH, WOCHE;

    public String toValue() {
        switch (this) {
            case HALBJAHR: return "HALBJAHR";
            case JAHR: return "JAHR";
            case KUBIKMETER: return "KUBIKMETER";
            case KVAR: return "KVAR";
            case KVARH: return "KVARH";
            case KW: return "KW";
            case KWH: return "KWH";
            case KWHK: return "KWHK";
            case MINUTE: return "MINUTE";
            case MONAT: return "MONAT";
            case MW: return "MW";
            case MWH: return "MWH";
            case PROZENT: return "PROZENT";
            case QUARTAL: return "QUARTAL";
            case SEKUNDE: return "SEKUNDE";
            case STUECK: return "STUECK";
            case STUNDE: return "STUNDE";
            case TAG: return "TAG";
            case VAR: return "VAR";
            case VARH: return "VARH";
            case VIERTEL_STUNDE: return "VIERTEL_STUNDE";
            case W: return "W";
            case WH: return "WH";
            case WOCHE: return "WOCHE";
        }
        return null;
    }

    public static Mengeneinheit forValue(String value) throws IOException {
        if (value.equals("HALBJAHR")) return HALBJAHR;
        if (value.equals("JAHR")) return JAHR;
        if (value.equals("KUBIKMETER")) return KUBIKMETER;
        if (value.equals("KVAR")) return KVAR;
        if (value.equals("KVARH")) return KVARH;
        if (value.equals("KW")) return KW;
        if (value.equals("KWH")) return KWH;
        if (value.equals("KWHK")) return KWHK;
        if (value.equals("MINUTE")) return MINUTE;
        if (value.equals("MONAT")) return MONAT;
        if (value.equals("MW")) return MW;
        if (value.equals("MWH")) return MWH;
        if (value.equals("PROZENT")) return PROZENT;
        if (value.equals("QUARTAL")) return QUARTAL;
        if (value.equals("SEKUNDE")) return SEKUNDE;
        if (value.equals("STUECK")) return STUECK;
        if (value.equals("STUNDE")) return STUNDE;
        if (value.equals("TAG")) return TAG;
        if (value.equals("VAR")) return VAR;
        if (value.equals("VARH")) return VARH;
        if (value.equals("VIERTEL_STUNDE")) return VIERTEL_STUNDE;
        if (value.equals("W")) return W;
        if (value.equals("WH")) return WH;
        if (value.equals("WOCHE")) return WOCHE;
        throw new IOException("Cannot deserialize Mengeneinheit");
    }
}
