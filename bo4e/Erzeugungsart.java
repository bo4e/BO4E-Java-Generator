package placeholder;

import java.io.IOException;

/**
 * Auflistung der Erzeugungsarten von Energie.
 */
public enum Erzeugungsart {
    BIOGAS, BIOMASSE, FOSSIL, GAS, GEOTHERMIE, KERNKRAFT, KLIMANEUTRALES_GAS, KOHLE, KWK, SOLAR, SONSTIGE, SONSTIGE_EEG, WASSER, WIND;

    public String toValue() {
        switch (this) {
            case BIOGAS: return "BIOGAS";
            case BIOMASSE: return "BIOMASSE";
            case FOSSIL: return "FOSSIL";
            case GAS: return "GAS";
            case GEOTHERMIE: return "GEOTHERMIE";
            case KERNKRAFT: return "KERNKRAFT";
            case KLIMANEUTRALES_GAS: return "KLIMANEUTRALES_GAS";
            case KOHLE: return "KOHLE";
            case KWK: return "KWK";
            case SOLAR: return "SOLAR";
            case SONSTIGE: return "SONSTIGE";
            case SONSTIGE_EEG: return "SONSTIGE_EEG";
            case WASSER: return "WASSER";
            case WIND: return "WIND";
        }
        return null;
    }

    public static Erzeugungsart forValue(String value) throws IOException {
        if (value.equals("BIOGAS")) return BIOGAS;
        if (value.equals("BIOMASSE")) return BIOMASSE;
        if (value.equals("FOSSIL")) return FOSSIL;
        if (value.equals("GAS")) return GAS;
        if (value.equals("GEOTHERMIE")) return GEOTHERMIE;
        if (value.equals("KERNKRAFT")) return KERNKRAFT;
        if (value.equals("KLIMANEUTRALES_GAS")) return KLIMANEUTRALES_GAS;
        if (value.equals("KOHLE")) return KOHLE;
        if (value.equals("KWK")) return KWK;
        if (value.equals("SOLAR")) return SOLAR;
        if (value.equals("SONSTIGE")) return SONSTIGE;
        if (value.equals("SONSTIGE_EEG")) return SONSTIGE_EEG;
        if (value.equals("WASSER")) return WASSER;
        if (value.equals("WIND")) return WIND;
        throw new IOException("Cannot deserialize Erzeugungsart");
    }
}
