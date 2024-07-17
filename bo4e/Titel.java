package placeholder;

import java.io.IOException;

/**
 * Übersicht möglicher Titel, z.B. eines Geschäftspartners.
 */
public enum Titel {
    DR, PROF, PROF_DR;

    public String toValue() {
        switch (this) {
            case DR: return "DR";
            case PROF: return "PROF";
            case PROF_DR: return "PROF_DR";
        }
        return null;
    }

    public static Titel forValue(String value) throws IOException {
        if (value.equals("DR")) return DR;
        if (value.equals("PROF")) return PROF;
        if (value.equals("PROF_DR")) return PROF_DR;
        throw new IOException("Cannot deserialize Titel");
    }
}
