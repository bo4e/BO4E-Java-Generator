package placeholder;

import java.io.IOException;

/**
 * Unterscheidung für hoch- und niedrig-kalorisches Gas.
 */
public enum Gasqualitaet {
    H_GAS, L_GAS;

    public String toValue() {
        switch (this) {
            case H_GAS: return "H_GAS";
            case L_GAS: return "L_GAS";
        }
        return null;
    }

    public static Gasqualitaet forValue(String value) throws IOException {
        if (value.equals("H_GAS")) return H_GAS;
        if (value.equals("L_GAS")) return L_GAS;
        throw new IOException("Cannot deserialize Gasqualitaet");
    }
}
