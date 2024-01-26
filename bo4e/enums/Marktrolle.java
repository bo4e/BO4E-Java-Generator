package bo4e.enums;

import java.io.IOException;

/**
 * Diese Rollen kann ein Marktteilnehmer einnehmen.
 */
public enum Marktrolle {
    BKO, BKV, BTR, DL, EIV, INTERESSENT, KUNDE, KUNDE_SELBST_NN, LF, MGV, MSB, NB, RB, UENB;

    public String toValue() {
        switch (this) {
            case BKO: return "BKO";
            case BKV: return "BKV";
            case BTR: return "BTR";
            case DL: return "DL";
            case EIV: return "EIV";
            case INTERESSENT: return "INTERESSENT";
            case KUNDE: return "KUNDE";
            case KUNDE_SELBST_NN: return "KUNDE_SELBST_NN";
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
        if (value.equals("BKO")) return BKO;
        if (value.equals("BKV")) return BKV;
        if (value.equals("BTR")) return BTR;
        if (value.equals("DL")) return DL;
        if (value.equals("EIV")) return EIV;
        if (value.equals("INTERESSENT")) return INTERESSENT;
        if (value.equals("KUNDE")) return KUNDE;
        if (value.equals("KUNDE_SELBST_NN")) return KUNDE_SELBST_NN;
        if (value.equals("LF")) return LF;
        if (value.equals("MGV")) return MGV;
        if (value.equals("MSB")) return MSB;
        if (value.equals("NB")) return NB;
        if (value.equals("RB")) return RB;
        if (value.equals("UENB")) return UENB;
        throw new IOException("Cannot deserialize Marktrolle");
    }
}
