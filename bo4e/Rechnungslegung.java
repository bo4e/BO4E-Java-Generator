package placeholder;

import java.io.IOException;

/**
 * Aufzählung der Möglichkeiten zur Rechnungslegung in Ausschreibungen.
 */
public enum Rechnungslegung {
    ABSCHL_JAHRESRECHN, ABSCHL_MONATSRECHN, MONATSRECHN, MONATSRECHN_JAHRESRECHN, VORKASSE;

    public String toValue() {
        switch (this) {
            case ABSCHL_JAHRESRECHN: return "ABSCHL_JAHRESRECHN";
            case ABSCHL_MONATSRECHN: return "ABSCHL_MONATSRECHN";
            case MONATSRECHN: return "MONATSRECHN";
            case MONATSRECHN_JAHRESRECHN: return "MONATSRECHN_JAHRESRECHN";
            case VORKASSE: return "VORKASSE";
        }
        return null;
    }

    public static Rechnungslegung forValue(String value) throws IOException {
        if (value.equals("ABSCHL_JAHRESRECHN")) return ABSCHL_JAHRESRECHN;
        if (value.equals("ABSCHL_MONATSRECHN")) return ABSCHL_MONATSRECHN;
        if (value.equals("MONATSRECHN")) return MONATSRECHN;
        if (value.equals("MONATSRECHN_JAHRESRECHN")) return MONATSRECHN_JAHRESRECHN;
        if (value.equals("VORKASSE")) return VORKASSE;
        throw new IOException("Cannot deserialize Rechnungslegung");
    }
}
