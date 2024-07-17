package placeholder;

import java.io.IOException;

/**
 * Bei diesem Enum handelt es sich um die Abbildung von besonderen Zählertyp-Spezifikationen
 * der Sparten Strom und Gas.
 */
public enum ZaehlertypSpezifikation {
    EDL21, EDL40, MME_MEDA, MME_STANDARD, SONSTIGER_EHZ;

    public String toValue() {
        switch (this) {
            case EDL21: return "EDL21";
            case EDL40: return "EDL40";
            case MME_MEDA: return "MME_MEDA";
            case MME_STANDARD: return "MME_STANDARD";
            case SONSTIGER_EHZ: return "SONSTIGER_EHZ";
        }
        return null;
    }

    public static ZaehlertypSpezifikation forValue(String value) throws IOException {
        if (value.equals("EDL21")) return EDL21;
        if (value.equals("EDL40")) return EDL40;
        if (value.equals("MME_MEDA")) return MME_MEDA;
        if (value.equals("MME_STANDARD")) return MME_STANDARD;
        if (value.equals("SONSTIGER_EHZ")) return SONSTIGER_EHZ;
        throw new IOException("Cannot deserialize ZaehlertypSpezifikation");
    }
}
