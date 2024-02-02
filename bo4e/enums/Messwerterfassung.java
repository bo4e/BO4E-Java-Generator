package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Die Messwerterfassung des Zählers
 */
public enum Messwerterfassung {
    FERNAUSLESBAR, MANUELL_AUSGELESENE;

    public String toValue() {
        switch (this) {
            case FERNAUSLESBAR: return "FERNAUSLESBAR";
            case MANUELL_AUSGELESENE: return "MANUELL_AUSGELESENE";
        }
        return null;
    }

    public static Messwerterfassung forValue(String value) throws IOException {
        if (value.equals("FERNAUSLESBAR")) return FERNAUSLESBAR;
        if (value.equals("MANUELL_AUSGELESENE")) return MANUELL_AUSGELESENE;
        throw new IOException("Cannot deserialize Messwerterfassung");
    }
}
