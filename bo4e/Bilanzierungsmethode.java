package placeholder;

import java.io.IOException;

/**
 * Mit dieser Aufzählung kann zwischen den Bilanzierungsmethoden bzw. -grundlagen
 * unterschieden werden.
 */
public enum Bilanzierungsmethode {
    PAUSCHAL, RLM, SLP, TLP_GEMEINSAM, TLP_GETRENNT;

    public String toValue() {
        switch (this) {
            case PAUSCHAL: return "PAUSCHAL";
            case RLM: return "RLM";
            case SLP: return "SLP";
            case TLP_GEMEINSAM: return "TLP_GEMEINSAM";
            case TLP_GETRENNT: return "TLP_GETRENNT";
        }
        return null;
    }

    public static Bilanzierungsmethode forValue(String value) throws IOException {
        if (value.equals("PAUSCHAL")) return PAUSCHAL;
        if (value.equals("RLM")) return RLM;
        if (value.equals("SLP")) return SLP;
        if (value.equals("TLP_GEMEINSAM")) return TLP_GEMEINSAM;
        if (value.equals("TLP_GETRENNT")) return TLP_GETRENNT;
        throw new IOException("Cannot deserialize Bilanzierungsmethode");
    }
}
