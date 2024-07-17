package placeholder;

import java.io.IOException;

/**
 * Befestigungsart von Zählern
 */
public enum Befestigungsart {
    DREIPUNKT, EINSTUTZEN, HUTSCHIENE, STECKTECHNIK, ZWEISTUTZEN;

    public String toValue() {
        switch (this) {
            case DREIPUNKT: return "DREIPUNKT";
            case EINSTUTZEN: return "EINSTUTZEN";
            case HUTSCHIENE: return "HUTSCHIENE";
            case STECKTECHNIK: return "STECKTECHNIK";
            case ZWEISTUTZEN: return "ZWEISTUTZEN";
        }
        return null;
    }

    public static Befestigungsart forValue(String value) throws IOException {
        if (value.equals("DREIPUNKT")) return DREIPUNKT;
        if (value.equals("EINSTUTZEN")) return EINSTUTZEN;
        if (value.equals("HUTSCHIENE")) return HUTSCHIENE;
        if (value.equals("STECKTECHNIK")) return STECKTECHNIK;
        if (value.equals("ZWEISTUTZEN")) return ZWEISTUTZEN;
        throw new IOException("Cannot deserialize Befestigungsart");
    }
}
