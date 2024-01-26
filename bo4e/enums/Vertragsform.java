package bo4e.enums;

import java.io.IOException;

/**
 * Aufzählung der Möglichkeiten zu Vertragsformen in Ausschreibungen.
 */
public enum Vertragsform {
    DIREKT, FAX, ONLINE;

    public String toValue() {
        switch (this) {
            case DIREKT: return "DIREKT";
            case FAX: return "FAX";
            case ONLINE: return "ONLINE";
        }
        return null;
    }

    public static Vertragsform forValue(String value) throws IOException {
        if (value.equals("DIREKT")) return DIREKT;
        if (value.equals("FAX")) return FAX;
        if (value.equals("ONLINE")) return ONLINE;
        throw new IOException("Cannot deserialize Vertragsform");
    }
}
