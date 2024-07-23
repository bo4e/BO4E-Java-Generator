package bo4e.enums;

import java.io.IOException;

/**
 * Gibt ein physikalisches Medium an.
 */
public enum Medium {
    DAMPF, GAS, STROM, WASSER;

    public String toValue() {
        switch (this) {
            case DAMPF: return "DAMPF";
            case GAS: return "GAS";
            case STROM: return "STROM";
            case WASSER: return "WASSER";
        }
        return null;
    }

    public static Medium forValue(String value) throws IOException {
        if (value.equals("DAMPF")) return DAMPF;
        if (value.equals("GAS")) return GAS;
        if (value.equals("STROM")) return STROM;
        if (value.equals("WASSER")) return WASSER;
        throw new IOException("Cannot deserialize Medium");
    }
}
