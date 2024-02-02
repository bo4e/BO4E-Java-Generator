package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Übersicht möglicher Anreden, z.B. eines Geschäftspartners.
 */
public enum Anrede {
    EHELEUTE, ERBENGEMEINSCHAFT, FAMILIE, FIRMA, FRAU, GRUNDSTUECKSGEMEINSCHAFT, HERR;

    public String toValue() {
        switch (this) {
            case EHELEUTE: return "EHELEUTE";
            case ERBENGEMEINSCHAFT: return "ERBENGEMEINSCHAFT";
            case FAMILIE: return "FAMILIE";
            case FIRMA: return "FIRMA";
            case FRAU: return "FRAU";
            case GRUNDSTUECKSGEMEINSCHAFT: return "GRUNDSTUECKSGEMEINSCHAFT";
            case HERR: return "HERR";
        }
        return null;
    }

    public static Anrede forValue(String value) throws IOException {
        if (value.equals("EHELEUTE")) return EHELEUTE;
        if (value.equals("ERBENGEMEINSCHAFT")) return ERBENGEMEINSCHAFT;
        if (value.equals("FAMILIE")) return FAMILIE;
        if (value.equals("FIRMA")) return FIRMA;
        if (value.equals("FRAU")) return FRAU;
        if (value.equals("GRUNDSTUECKSGEMEINSCHAFT")) return GRUNDSTUECKSGEMEINSCHAFT;
        if (value.equals("HERR")) return HERR;
        throw new IOException("Cannot deserialize Anrede");
    }
}
