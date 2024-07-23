package bo4e.enums;

import java.io.IOException;

/**
 * Angabe, wie eine Menge in Bezug auf einen Wert zu bilden ist.
 */
public enum Mengenoperator {
    GLEICH, GROESSER_ALS, KLEINER_ALS;

    public String toValue() {
        switch (this) {
            case GLEICH: return "GLEICH";
            case GROESSER_ALS: return "GROESSER_ALS";
            case KLEINER_ALS: return "KLEINER_ALS";
        }
        return null;
    }

    public static Mengenoperator forValue(String value) throws IOException {
        if (value.equals("GLEICH")) return GLEICH;
        if (value.equals("GROESSER_ALS")) return GROESSER_ALS;
        if (value.equals("KLEINER_ALS")) return KLEINER_ALS;
        throw new IOException("Cannot deserialize Mengenoperator");
    }
}
