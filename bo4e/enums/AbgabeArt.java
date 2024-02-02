package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Art der Konzessionsabgabe
 */
public enum AbgabeArt {
    KAS, SA, SAS, TA, TAS, TK, TKS, TS, TSS;

    public String toValue() {
        switch (this) {
            case KAS: return "KAS";
            case SA: return "SA";
            case SAS: return "SAS";
            case TA: return "TA";
            case TAS: return "TAS";
            case TK: return "TK";
            case TKS: return "TKS";
            case TS: return "TS";
            case TSS: return "TSS";
        }
        return null;
    }

    public static AbgabeArt forValue(String value) throws IOException {
        if (value.equals("KAS")) return KAS;
        if (value.equals("SA")) return SA;
        if (value.equals("SAS")) return SAS;
        if (value.equals("TA")) return TA;
        if (value.equals("TAS")) return TAS;
        if (value.equals("TK")) return TK;
        if (value.equals("TKS")) return TKS;
        if (value.equals("TS")) return TS;
        if (value.equals("TSS")) return TSS;
        throw new IOException("Cannot deserialize AbgabeArt");
    }
}
