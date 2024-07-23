package bo4e.enums;

import java.io.IOException;

/**
 * Zur Kennzeichnung verschiedener Tarifzeiten, beispielsweise zur Bepreisung oder zur
 * Verbrauchsermittlung.
 */
public enum Tarifzeit {
    TZ_HT, TZ_NT, TZ_STANDARD;

    public String toValue() {
        switch (this) {
            case TZ_HT: return "TZ_HT";
            case TZ_NT: return "TZ_NT";
            case TZ_STANDARD: return "TZ_STANDARD";
        }
        return null;
    }

    public static Tarifzeit forValue(String value) throws IOException {
        if (value.equals("TZ_HT")) return TZ_HT;
        if (value.equals("TZ_NT")) return TZ_NT;
        if (value.equals("TZ_STANDARD")) return TZ_STANDARD;
        throw new IOException("Cannot deserialize Tarifzeit");
    }
}
