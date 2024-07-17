package placeholder;

import java.io.IOException;

/**
 * Verwendungszweck der Werte Marktlokation
 */
public enum Verwendungszweck {
    BILANZKREISABRECHNUNG, ENDKUNDENABRECHNUNG, ERMITTLUNG_AUSGEGLICHENHEIT_BILANZKREIS, MEHRMINDERMENGENABRECHNUNG, NETZNUTZUNGSABRECHNUNG, UEBERMITTLUNG_AN_DAS_HKNR;

    public String toValue() {
        switch (this) {
            case BILANZKREISABRECHNUNG: return "BILANZKREISABRECHNUNG";
            case ENDKUNDENABRECHNUNG: return "ENDKUNDENABRECHNUNG";
            case ERMITTLUNG_AUSGEGLICHENHEIT_BILANZKREIS: return "ERMITTLUNG_AUSGEGLICHENHEIT_BILANZKREIS";
            case MEHRMINDERMENGENABRECHNUNG: return "MEHRMINDERMENGENABRECHNUNG";
            case NETZNUTZUNGSABRECHNUNG: return "NETZNUTZUNGSABRECHNUNG";
            case UEBERMITTLUNG_AN_DAS_HKNR: return "UEBERMITTLUNG_AN_DAS_HKNR";
        }
        return null;
    }

    public static Verwendungszweck forValue(String value) throws IOException {
        if (value.equals("BILANZKREISABRECHNUNG")) return BILANZKREISABRECHNUNG;
        if (value.equals("ENDKUNDENABRECHNUNG")) return ENDKUNDENABRECHNUNG;
        if (value.equals("ERMITTLUNG_AUSGEGLICHENHEIT_BILANZKREIS")) return ERMITTLUNG_AUSGEGLICHENHEIT_BILANZKREIS;
        if (value.equals("MEHRMINDERMENGENABRECHNUNG")) return MEHRMINDERMENGENABRECHNUNG;
        if (value.equals("NETZNUTZUNGSABRECHNUNG")) return NETZNUTZUNGSABRECHNUNG;
        if (value.equals("UEBERMITTLUNG_AN_DAS_HKNR")) return UEBERMITTLUNG_AN_DAS_HKNR;
        throw new IOException("Cannot deserialize Verwendungszweck");
    }
}
