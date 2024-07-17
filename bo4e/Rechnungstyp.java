package placeholder;

import java.io.IOException;

/**
 * Abbildung verschiedener Rechnungstypen zur Kennzeichnung von Rechnungen
 */
public enum Rechnungstyp {
    AUSGLEICHSENERGIERECHNUNG, BESCHAFFUNGSRECHNUNG, ENDKUNDENRECHNUNG, MEHRMINDERMENGENRECHNUNG, MESSSTELLENBETRIEBSRECHNUNG, NETZNUTZUNGSRECHNUNG;

    public String toValue() {
        switch (this) {
            case AUSGLEICHSENERGIERECHNUNG: return "AUSGLEICHSENERGIERECHNUNG";
            case BESCHAFFUNGSRECHNUNG: return "BESCHAFFUNGSRECHNUNG";
            case ENDKUNDENRECHNUNG: return "ENDKUNDENRECHNUNG";
            case MEHRMINDERMENGENRECHNUNG: return "MEHRMINDERMENGENRECHNUNG";
            case MESSSTELLENBETRIEBSRECHNUNG: return "MESSSTELLENBETRIEBSRECHNUNG";
            case NETZNUTZUNGSRECHNUNG: return "NETZNUTZUNGSRECHNUNG";
        }
        return null;
    }

    public static Rechnungstyp forValue(String value) throws IOException {
        if (value.equals("AUSGLEICHSENERGIERECHNUNG")) return AUSGLEICHSENERGIERECHNUNG;
        if (value.equals("BESCHAFFUNGSRECHNUNG")) return BESCHAFFUNGSRECHNUNG;
        if (value.equals("ENDKUNDENRECHNUNG")) return ENDKUNDENRECHNUNG;
        if (value.equals("MEHRMINDERMENGENRECHNUNG")) return MEHRMINDERMENGENRECHNUNG;
        if (value.equals("MESSSTELLENBETRIEBSRECHNUNG")) return MESSSTELLENBETRIEBSRECHNUNG;
        if (value.equals("NETZNUTZUNGSRECHNUNG")) return NETZNUTZUNGSRECHNUNG;
        throw new IOException("Cannot deserialize Rechnungstyp");
    }
}
