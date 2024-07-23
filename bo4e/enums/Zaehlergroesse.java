package bo4e.enums;

import java.io.IOException;

/**
 * Auflistung möglicher Größen von Zählern
 */
public enum Zaehlergroesse {
    G10, G100, G1000, G10000, G12500, G16, G160, G1600, G16000, G25, G250, G2500, G2_KOMMA5, G4, G40, G400, G4000, G6, G65, G650, G6500;

    public String toValue() {
        switch (this) {
            case G10: return "G10";
            case G100: return "G100";
            case G1000: return "G1000";
            case G10000: return "G10000";
            case G12500: return "G12500";
            case G16: return "G16";
            case G160: return "G160";
            case G1600: return "G1600";
            case G16000: return "G16000";
            case G25: return "G25";
            case G250: return "G250";
            case G2500: return "G2500";
            case G2_KOMMA5: return "G2KOMMA5";
            case G4: return "G4";
            case G40: return "G40";
            case G400: return "G400";
            case G4000: return "G4000";
            case G6: return "G6";
            case G65: return "G65";
            case G650: return "G650";
            case G6500: return "G6500";
        }
        return null;
    }

    public static Zaehlergroesse forValue(String value) throws IOException {
        if (value.equals("G10")) return G10;
        if (value.equals("G100")) return G100;
        if (value.equals("G1000")) return G1000;
        if (value.equals("G10000")) return G10000;
        if (value.equals("G12500")) return G12500;
        if (value.equals("G16")) return G16;
        if (value.equals("G160")) return G160;
        if (value.equals("G1600")) return G1600;
        if (value.equals("G16000")) return G16000;
        if (value.equals("G25")) return G25;
        if (value.equals("G250")) return G250;
        if (value.equals("G2500")) return G2500;
        if (value.equals("G2KOMMA5")) return G2_KOMMA5;
        if (value.equals("G4")) return G4;
        if (value.equals("G40")) return G40;
        if (value.equals("G400")) return G400;
        if (value.equals("G4000")) return G4000;
        if (value.equals("G6")) return G6;
        if (value.equals("G65")) return G65;
        if (value.equals("G650")) return G650;
        if (value.equals("G6500")) return G6500;
        throw new IOException("Cannot deserialize Zaehlergroesse");
    }
}
