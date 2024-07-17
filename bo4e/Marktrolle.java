package placeholder;

import java.io.IOException;

/**
 * Diese Rollen kann ein Marktteilnehmer einnehmen.
 */
public enum Marktrolle {
    BIKO, BKV, BTR, DP, EIV, ESA, KN, LF, MGV, MSB, NB, RB, UENB;

    public String toValue() {
        switch (this) {
            case BIKO: return "BIKO";
            case BKV: return "BKV";
            case BTR: return "BTR";
            case DP: return "DP";
            case EIV: return "EIV";
            case ESA: return "ESA";
            case KN: return "KN";
            case LF: return "LF";
            case MGV: return "MGV";
            case MSB: return "MSB";
            case NB: return "NB";
            case RB: return "RB";
            case UENB: return "UENB";
        }
        return null;
    }

    public static Marktrolle forValue(String value) throws IOException {
        if (value.equals("BIKO")) return BIKO;
        if (value.equals("BKV")) return BKV;
        if (value.equals("BTR")) return BTR;
        if (value.equals("DP")) return DP;
        if (value.equals("EIV")) return EIV;
        if (value.equals("ESA")) return ESA;
        if (value.equals("KN")) return KN;
        if (value.equals("LF")) return LF;
        if (value.equals("MGV")) return MGV;
        if (value.equals("MSB")) return MSB;
        if (value.equals("NB")) return NB;
        if (value.equals("RB")) return RB;
        if (value.equals("UENB")) return UENB;
        throw new IOException("Cannot deserialize Marktrolle");
    }
}
