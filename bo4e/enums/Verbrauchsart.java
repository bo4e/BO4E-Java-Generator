package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Verbrauchsart einer Marktlokation.
 */
public enum Verbrauchsart {
    KL, KLW, KLWS, W, WS;

    public String toValue() {
        switch (this) {
            case KL: return "KL";
            case KLW: return "KLW";
            case KLWS: return "KLWS";
            case W: return "W";
            case WS: return "WS";
        }
        return null;
    }

    public static Verbrauchsart forValue(String value) throws IOException {
        if (value.equals("KL")) return KL;
        if (value.equals("KLW")) return KLW;
        if (value.equals("KLWS")) return KLWS;
        if (value.equals("W")) return W;
        if (value.equals("WS")) return WS;
        throw new IOException("Cannot deserialize Verbrauchsart");
    }
}
