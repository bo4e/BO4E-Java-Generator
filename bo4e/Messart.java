package placeholder;

import java.io.IOException;

/**
 * Gibt an, auf welche Art gemessen wurde.
 */
public enum Messart {
    AKTUELLERWERT, MAXIMALWERT, MITTELWERT;

    public String toValue() {
        switch (this) {
            case AKTUELLERWERT: return "AKTUELLERWERT";
            case MAXIMALWERT: return "MAXIMALWERT";
            case MITTELWERT: return "MITTELWERT";
        }
        return null;
    }

    public static Messart forValue(String value) throws IOException {
        if (value.equals("AKTUELLERWERT")) return AKTUELLERWERT;
        if (value.equals("MAXIMALWERT")) return MAXIMALWERT;
        if (value.equals("MITTELWERT")) return MITTELWERT;
        throw new IOException("Cannot deserialize Messart");
    }
}
