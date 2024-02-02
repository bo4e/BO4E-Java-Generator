package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Bezeichnung der Preismodelle in Ausschreibungen für die Energielieferung.
 */
public enum Preismodell {
    FESTPREIS, TRANCHE;

    public String toValue() {
        switch (this) {
            case FESTPREIS: return "FESTPREIS";
            case TRANCHE: return "TRANCHE";
        }
        return null;
    }

    public static Preismodell forValue(String value) throws IOException {
        if (value.equals("FESTPREIS")) return FESTPREIS;
        if (value.equals("TRANCHE")) return TRANCHE;
        throw new IOException("Cannot deserialize Preismodell");
    }
}
