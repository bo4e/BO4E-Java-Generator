package bo4e.enums;

import java.io.IOException;

/**
 * Wärmenutzung Marktlokation
 */
public enum Waermenutzung {
    DIREKTHEIZUNG, SPEICHERHEIZUNG, WAERMEPUMPE;

    public String toValue() {
        switch (this) {
            case DIREKTHEIZUNG: return "DIREKTHEIZUNG";
            case SPEICHERHEIZUNG: return "SPEICHERHEIZUNG";
            case WAERMEPUMPE: return "WAERMEPUMPE";
        }
        return null;
    }

    public static Waermenutzung forValue(String value) throws IOException {
        if (value.equals("DIREKTHEIZUNG")) return DIREKTHEIZUNG;
        if (value.equals("SPEICHERHEIZUNG")) return SPEICHERHEIZUNG;
        if (value.equals("WAERMEPUMPE")) return WAERMEPUMPE;
        throw new IOException("Cannot deserialize Waermenutzung");
    }
}
