package bo4e.enums;

import java.io.IOException;

/**
 * Abbildung verschiedener Rufnummerntypen.
 */
public enum Rufnummernart {
    ABTEILUNGFAX, ABTEILUNGRUF, FAX_DURCHWAHL, FAX_ZENTRALE, MOBIL_NUMMER, RUF_DURCHWAHL, RUF_ZENTRALE, SAMMELFAX, SAMMELRUF;

    public String toValue() {
        switch (this) {
            case ABTEILUNGFAX: return "ABTEILUNGFAX";
            case ABTEILUNGRUF: return "ABTEILUNGRUF";
            case FAX_DURCHWAHL: return "FAX_DURCHWAHL";
            case FAX_ZENTRALE: return "FAX_ZENTRALE";
            case MOBIL_NUMMER: return "MOBIL_NUMMER";
            case RUF_DURCHWAHL: return "RUF_DURCHWAHL";
            case RUF_ZENTRALE: return "RUF_ZENTRALE";
            case SAMMELFAX: return "SAMMELFAX";
            case SAMMELRUF: return "SAMMELRUF";
        }
        return null;
    }

    public static Rufnummernart forValue(String value) throws IOException {
        if (value.equals("ABTEILUNGFAX")) return ABTEILUNGFAX;
        if (value.equals("ABTEILUNGRUF")) return ABTEILUNGRUF;
        if (value.equals("FAX_DURCHWAHL")) return FAX_DURCHWAHL;
        if (value.equals("FAX_ZENTRALE")) return FAX_ZENTRALE;
        if (value.equals("MOBIL_NUMMER")) return MOBIL_NUMMER;
        if (value.equals("RUF_DURCHWAHL")) return RUF_DURCHWAHL;
        if (value.equals("RUF_ZENTRALE")) return RUF_ZENTRALE;
        if (value.equals("SAMMELFAX")) return SAMMELFAX;
        if (value.equals("SAMMELRUF")) return SAMMELRUF;
        throw new IOException("Cannot deserialize Rufnummernart");
    }
}
