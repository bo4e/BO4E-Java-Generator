package placeholder;

import java.io.IOException;

/**
 * Statusinformation für Preise
 */
public enum Preisstatus {
    ENDGUELTIG, VORLAEUFIG;

    public String toValue() {
        switch (this) {
            case ENDGUELTIG: return "ENDGUELTIG";
            case VORLAEUFIG: return "VORLAEUFIG";
        }
        return null;
    }

    public static Preisstatus forValue(String value) throws IOException {
        if (value.equals("ENDGUELTIG")) return ENDGUELTIG;
        if (value.equals("VORLAEUFIG")) return VORLAEUFIG;
        throw new IOException("Cannot deserialize Preisstatus");
    }
}
