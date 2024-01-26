package bo4e.enums;

import java.io.IOException;

/**
 * Aufzählung für die Typisierung von Ausschreibungen.
 */
public enum Ausschreibungstyp {
    EUROPAWEIT, OEFFENTLICHRECHTLICH, PRIVATRECHTLICH;

    public String toValue() {
        switch (this) {
            case EUROPAWEIT: return "EUROPAWEIT";
            case OEFFENTLICHRECHTLICH: return "OEFFENTLICHRECHTLICH";
            case PRIVATRECHTLICH: return "PRIVATRECHTLICH";
        }
        return null;
    }

    public static Ausschreibungstyp forValue(String value) throws IOException {
        if (value.equals("EUROPAWEIT")) return EUROPAWEIT;
        if (value.equals("OEFFENTLICHRECHTLICH")) return OEFFENTLICHRECHTLICH;
        if (value.equals("PRIVATRECHTLICH")) return PRIVATRECHTLICH;
        throw new IOException("Cannot deserialize Ausschreibungstyp");
    }
}
