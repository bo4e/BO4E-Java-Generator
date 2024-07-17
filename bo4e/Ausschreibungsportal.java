package placeholder;

import java.io.IOException;

/**
 * Aufzählung der unterstützten Ausschreibungsportale.
 */
public enum Ausschreibungsportal {
    BMWI, BUND, DTAD, ENERGIEMARKTPLATZ, ENERGIE_AGENTUR, ENERGIE_HANDELSPLATZ, ENPORTAL, EVERGABE, ISPEX, VERA_ONLINE;

    public String toValue() {
        switch (this) {
            case BMWI: return "BMWI";
            case BUND: return "BUND";
            case DTAD: return "DTAD";
            case ENERGIEMARKTPLATZ: return "ENERGIEMARKTPLATZ";
            case ENERGIE_AGENTUR: return "ENERGIE_AGENTUR";
            case ENERGIE_HANDELSPLATZ: return "ENERGIE_HANDELSPLATZ";
            case ENPORTAL: return "ENPORTAL";
            case EVERGABE: return "EVERGABE";
            case ISPEX: return "ISPEX";
            case VERA_ONLINE: return "VERA_ONLINE";
        }
        return null;
    }

    public static Ausschreibungsportal forValue(String value) throws IOException {
        if (value.equals("BMWI")) return BMWI;
        if (value.equals("BUND")) return BUND;
        if (value.equals("DTAD")) return DTAD;
        if (value.equals("ENERGIEMARKTPLATZ")) return ENERGIEMARKTPLATZ;
        if (value.equals("ENERGIE_AGENTUR")) return ENERGIE_AGENTUR;
        if (value.equals("ENERGIE_HANDELSPLATZ")) return ENERGIE_HANDELSPLATZ;
        if (value.equals("ENPORTAL")) return ENPORTAL;
        if (value.equals("EVERGABE")) return EVERGABE;
        if (value.equals("ISPEX")) return ISPEX;
        if (value.equals("VERA_ONLINE")) return VERA_ONLINE;
        throw new IOException("Cannot deserialize Ausschreibungsportal");
    }
}
