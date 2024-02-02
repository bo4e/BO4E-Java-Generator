package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Übersicht der verschiedenen Gültigkeiten zur Umsetzung von Positiv- bzw. Negativlisten.
 */
public enum Gueltigkeitstyp {
    NICHT_IN, NUR_IN, NUR_IN_KOMBINATION_MIT;

    public String toValue() {
        switch (this) {
            case NICHT_IN: return "NICHT_IN";
            case NUR_IN: return "NUR_IN";
            case NUR_IN_KOMBINATION_MIT: return "NUR_IN_KOMBINATION_MIT";
        }
        return null;
    }

    public static Gueltigkeitstyp forValue(String value) throws IOException {
        if (value.equals("NICHT_IN")) return NICHT_IN;
        if (value.equals("NUR_IN")) return NUR_IN;
        if (value.equals("NUR_IN_KOMBINATION_MIT")) return NUR_IN_KOMBINATION_MIT;
        throw new IOException("Cannot deserialize Gueltigkeitstyp");
    }
}
