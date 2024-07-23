package bo4e.enums;

import java.io.IOException;

/**
 * Auflistung möglicher Netzebenen innerhalb der Energiearten Strom und Gas.
 */
public enum Netzebene {
    HD, HSP, HSP_MSP_UMSP, HSS, HSS_HSP_UMSP, MD, MSP, MSP_NSP_UMSP, ND, NSP;

    public String toValue() {
        switch (this) {
            case HD: return "HD";
            case HSP: return "HSP";
            case HSP_MSP_UMSP: return "HSP_MSP_UMSP";
            case HSS: return "HSS";
            case HSS_HSP_UMSP: return "HSS_HSP_UMSP";
            case MD: return "MD";
            case MSP: return "MSP";
            case MSP_NSP_UMSP: return "MSP_NSP_UMSP";
            case ND: return "ND";
            case NSP: return "NSP";
        }
        return null;
    }

    public static Netzebene forValue(String value) throws IOException {
        if (value.equals("HD")) return HD;
        if (value.equals("HSP")) return HSP;
        if (value.equals("HSP_MSP_UMSP")) return HSP_MSP_UMSP;
        if (value.equals("HSS")) return HSS;
        if (value.equals("HSS_HSP_UMSP")) return HSS_HSP_UMSP;
        if (value.equals("MD")) return MD;
        if (value.equals("MSP")) return MSP;
        if (value.equals("MSP_NSP_UMSP")) return MSP_NSP_UMSP;
        if (value.equals("ND")) return ND;
        if (value.equals("NSP")) return NSP;
        throw new IOException("Cannot deserialize Netzebene");
    }
}
