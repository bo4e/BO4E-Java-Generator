package bo4e.enums;

import java.io.IOException;

/**
 * Abbildung verschiedener in der INVOIC angegebenen Rechnungstypen.
 */
public enum NetznutzungRechnungstyp {
    ABSCHLAGSRECHNUNG, ABSCHLUSSRECHNUNG, INTEGRIERTE_13_TE_RECHNUNG, MEHRMINDERMENGENRECHNUNG, MONATSRECHNUNG, TURNUSRECHNUNG, WIMRECHNUNG, ZUSAETZLICHE_13_TE_RECHNUNG, ZWISCHENRECHNUNG;

    public String toValue() {
        switch (this) {
            case ABSCHLAGSRECHNUNG: return "ABSCHLAGSRECHNUNG";
            case ABSCHLUSSRECHNUNG: return "ABSCHLUSSRECHNUNG";
            case INTEGRIERTE_13_TE_RECHNUNG: return "INTEGRIERTE_13TE_RECHNUNG";
            case MEHRMINDERMENGENRECHNUNG: return "MEHRMINDERMENGENRECHNUNG";
            case MONATSRECHNUNG: return "MONATSRECHNUNG";
            case TURNUSRECHNUNG: return "TURNUSRECHNUNG";
            case WIMRECHNUNG: return "WIMRECHNUNG";
            case ZUSAETZLICHE_13_TE_RECHNUNG: return "ZUSAETZLICHE_13TE_RECHNUNG";
            case ZWISCHENRECHNUNG: return "ZWISCHENRECHNUNG";
        }
        return null;
    }

    public static NetznutzungRechnungstyp forValue(String value) throws IOException {
        if (value.equals("ABSCHLAGSRECHNUNG")) return ABSCHLAGSRECHNUNG;
        if (value.equals("ABSCHLUSSRECHNUNG")) return ABSCHLUSSRECHNUNG;
        if (value.equals("INTEGRIERTE_13TE_RECHNUNG")) return INTEGRIERTE_13_TE_RECHNUNG;
        if (value.equals("MEHRMINDERMENGENRECHNUNG")) return MEHRMINDERMENGENRECHNUNG;
        if (value.equals("MONATSRECHNUNG")) return MONATSRECHNUNG;
        if (value.equals("TURNUSRECHNUNG")) return TURNUSRECHNUNG;
        if (value.equals("WIMRECHNUNG")) return WIMRECHNUNG;
        if (value.equals("ZUSAETZLICHE_13TE_RECHNUNG")) return ZUSAETZLICHE_13_TE_RECHNUNG;
        if (value.equals("ZWISCHENRECHNUNG")) return ZWISCHENRECHNUNG;
        throw new IOException("Cannot deserialize NetznutzungRechnungstyp");
    }
}
