package bo4e.enums;

import java.io.IOException;

/**
 * Festlegung, ob der Auf- oder Abschlag mit relativen oder absoluten Werten erfolgt.
 */
public enum AufAbschlagstyp {
    ABSOLUT, RELATIV;

    public String toValue() {
        switch (this) {
            case ABSOLUT: return "ABSOLUT";
            case RELATIV: return "RELATIV";
        }
        return null;
    }

    public static AufAbschlagstyp forValue(String value) throws IOException {
        if (value.equals("ABSOLUT")) return ABSOLUT;
        if (value.equals("RELATIV")) return RELATIV;
        throw new IOException("Cannot deserialize AufAbschlagstyp");
    }
}
