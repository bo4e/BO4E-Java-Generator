package bo4e.enums;

import java.io.IOException;

/**
 * Unterscheidungsmöglichkeiten für die Sparte.
 */
public enum Sparte {
    ABWASSER, FERNWAERME, GAS, NAHWAERME, STROM, STROM_UND_GAS, WASSER;

    public String toValue() {
        switch (this) {
            case ABWASSER: return "ABWASSER";
            case FERNWAERME: return "FERNWAERME";
            case GAS: return "GAS";
            case NAHWAERME: return "NAHWAERME";
            case STROM: return "STROM";
            case STROM_UND_GAS: return "STROM_UND_GAS";
            case WASSER: return "WASSER";
        }
        return null;
    }

    public static Sparte forValue(String value) throws IOException {
        if (value.equals("ABWASSER")) return ABWASSER;
        if (value.equals("FERNWAERME")) return FERNWAERME;
        if (value.equals("GAS")) return GAS;
        if (value.equals("NAHWAERME")) return NAHWAERME;
        if (value.equals("STROM")) return STROM;
        if (value.equals("STROM_UND_GAS")) return STROM_UND_GAS;
        if (value.equals("WASSER")) return WASSER;
        throw new IOException("Cannot deserialize Sparte");
    }
}
