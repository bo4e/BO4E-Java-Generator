package bo4e.enums;

import java.io.IOException;

/**
 * Diese Rollen kann ein Geschäftspartner einnehmen.
 */
public enum Geschaeftspartnerrolle {
    DIENSTLEISTER, INTERESSENT, KUNDE, LIEFERANT, MARKTPARTNER;

    public String toValue() {
        switch (this) {
            case DIENSTLEISTER: return "DIENSTLEISTER";
            case INTERESSENT: return "INTERESSENT";
            case KUNDE: return "KUNDE";
            case LIEFERANT: return "LIEFERANT";
            case MARKTPARTNER: return "MARKTPARTNER";
        }
        return null;
    }

    public static Geschaeftspartnerrolle forValue(String value) throws IOException {
        if (value.equals("DIENSTLEISTER")) return DIENSTLEISTER;
        if (value.equals("INTERESSENT")) return INTERESSENT;
        if (value.equals("KUNDE")) return KUNDE;
        if (value.equals("LIEFERANT")) return LIEFERANT;
        if (value.equals("MARKTPARTNER")) return MARKTPARTNER;
        throw new IOException("Cannot deserialize Geschaeftspartnerrolle");
    }
}
