package placeholder;

import java.io.IOException;

/**
 * Zur Kennzeichnung verschiedener Steuersätze und Verfahren.
 */
public enum Steuerkennzeichen {
    RCV, UST_0, UST_16, UST_19, UST_7, VST_0, VST_16, VST_19, VST_7;

    public String toValue() {
        switch (this) {
            case RCV: return "RCV";
            case UST_0: return "UST_0";
            case UST_16: return "UST_16";
            case UST_19: return "UST_19";
            case UST_7: return "UST_7";
            case VST_0: return "VST_0";
            case VST_16: return "VST_16";
            case VST_19: return "VST_19";
            case VST_7: return "VST_7";
        }
        return null;
    }

    public static Steuerkennzeichen forValue(String value) throws IOException {
        if (value.equals("RCV")) return RCV;
        if (value.equals("UST_0")) return UST_0;
        if (value.equals("UST_16")) return UST_16;
        if (value.equals("UST_19")) return UST_19;
        if (value.equals("UST_7")) return UST_7;
        if (value.equals("VST_0")) return VST_0;
        if (value.equals("VST_16")) return VST_16;
        if (value.equals("VST_19")) return VST_19;
        if (value.equals("VST_7")) return VST_7;
        throw new IOException("Cannot deserialize Steuerkennzeichen");
    }
}
