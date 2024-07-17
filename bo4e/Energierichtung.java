package placeholder;

import java.io.IOException;

/**
 * Spezifiziert die Energierichtung einer Markt- und/oder Messlokation
 */
public enum Energierichtung {
    AUSSP, EINSP;

    public String toValue() {
        switch (this) {
            case AUSSP: return "AUSSP";
            case EINSP: return "EINSP";
        }
        return null;
    }

    public static Energierichtung forValue(String value) throws IOException {
        if (value.equals("AUSSP")) return AUSSP;
        if (value.equals("EINSP")) return EINSP;
        throw new IOException("Cannot deserialize Energierichtung");
    }
}
