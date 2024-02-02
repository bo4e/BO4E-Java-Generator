package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Bezeichnungen für die Ausschreibungsphasen
 */
public enum Ausschreibungsstatus {
    PHASE1, PHASE2, PHASE3, PHASE4;

    public String toValue() {
        switch (this) {
            case PHASE1: return "PHASE1";
            case PHASE2: return "PHASE2";
            case PHASE3: return "PHASE3";
            case PHASE4: return "PHASE4";
        }
        return null;
    }

    public static Ausschreibungsstatus forValue(String value) throws IOException {
        if (value.equals("PHASE1")) return PHASE1;
        if (value.equals("PHASE2")) return PHASE2;
        if (value.equals("PHASE3")) return PHASE3;
        if (value.equals("PHASE4")) return PHASE4;
        throw new IOException("Cannot deserialize Ausschreibungsstatus");
    }
}
