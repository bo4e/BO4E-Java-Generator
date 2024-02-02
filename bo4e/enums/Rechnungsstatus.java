package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Abbildung verschiedener Zustände, die im Rahmen der Rechnungsbearbeitung durchlaufen
 * werden.
 */
public enum Rechnungsstatus {
    BEZAHLT, GEBUCHT, GEPRUEFT_FEHLERHAFT, GEPRUEFT_OK, UNGEPRUEFT;

    public String toValue() {
        switch (this) {
            case BEZAHLT: return "BEZAHLT";
            case GEBUCHT: return "GEBUCHT";
            case GEPRUEFT_FEHLERHAFT: return "GEPRUEFT_FEHLERHAFT";
            case GEPRUEFT_OK: return "GEPRUEFT_OK";
            case UNGEPRUEFT: return "UNGEPRUEFT";
        }
        return null;
    }

    public static Rechnungsstatus forValue(String value) throws IOException {
        if (value.equals("BEZAHLT")) return BEZAHLT;
        if (value.equals("GEBUCHT")) return GEBUCHT;
        if (value.equals("GEPRUEFT_FEHLERHAFT")) return GEPRUEFT_FEHLERHAFT;
        if (value.equals("GEPRUEFT_OK")) return GEPRUEFT_OK;
        if (value.equals("UNGEPRUEFT")) return UNGEPRUEFT;
        throw new IOException("Cannot deserialize Rechnungsstatus");
    }
}
