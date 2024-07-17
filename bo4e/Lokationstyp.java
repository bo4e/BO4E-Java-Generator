package placeholder;

import java.io.IOException;

/**
 * Gibt an, ob es sich um eine Markt- oder Messlokation handelt.
 */
public enum Lokationstyp {
    MALO, MELO;

    public String toValue() {
        switch (this) {
            case MALO: return "MALO";
            case MELO: return "MELO";
        }
        return null;
    }

    public static Lokationstyp forValue(String value) throws IOException {
        if (value.equals("MALO")) return MALO;
        if (value.equals("MELO")) return MELO;
        throw new IOException("Cannot deserialize Lokationstyp");
    }
}
