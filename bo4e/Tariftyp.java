package placeholder;

import java.io.IOException;

/**
 * Zur Differenzierung von Grund/Ersatzversorgungstarifen und sonstigen angebotenen Tarifen.
 */
public enum Tariftyp {
    ERSATZVERSORGUNG, GRUNDVERSORGUNG, GRUND_ERSATZVERSORGUNG, SONDERTARIF;

    public String toValue() {
        switch (this) {
            case ERSATZVERSORGUNG: return "ERSATZVERSORGUNG";
            case GRUNDVERSORGUNG: return "GRUNDVERSORGUNG";
            case GRUND_ERSATZVERSORGUNG: return "GRUND_ERSATZVERSORGUNG";
            case SONDERTARIF: return "SONDERTARIF";
        }
        return null;
    }

    public static Tariftyp forValue(String value) throws IOException {
        if (value.equals("ERSATZVERSORGUNG")) return ERSATZVERSORGUNG;
        if (value.equals("GRUNDVERSORGUNG")) return GRUNDVERSORGUNG;
        if (value.equals("GRUND_ERSATZVERSORGUNG")) return GRUND_ERSATZVERSORGUNG;
        if (value.equals("SONDERTARIF")) return SONDERTARIF;
        throw new IOException("Cannot deserialize Tariftyp");
    }
}
