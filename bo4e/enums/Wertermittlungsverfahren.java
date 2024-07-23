package bo4e.enums;

import java.io.IOException;

/**
 * Gibt an, ob es sich um eine Prognose oder eine Messung handelt, beispielsweise bei der
 * Abbildung eines Verbrauchs.
 */
public enum Wertermittlungsverfahren {
    MESSUNG, PROGNOSE;

    public String toValue() {
        switch (this) {
            case MESSUNG: return "MESSUNG";
            case PROGNOSE: return "PROGNOSE";
        }
        return null;
    }

    public static Wertermittlungsverfahren forValue(String value) throws IOException {
        if (value.equals("MESSUNG")) return MESSUNG;
        if (value.equals("PROGNOSE")) return PROGNOSE;
        throw new IOException("Cannot deserialize Wertermittlungsverfahren");
    }
}
