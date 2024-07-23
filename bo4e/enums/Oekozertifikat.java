package bo4e.enums;

import java.io.IOException;

/**
 * Zertifikate für Ökostrom von verschiedenen Herausgebern.
 */
public enum Oekozertifikat {
    BET, CMS_EE01, CMS_EE02, EECS, FRAUNHOFER, FREIBERG, KLIMA_INVEST, LGA, RECS, REGS_EGL, TUEV, TUEV_HESSEN, TUEV_NORD, TUEV_RHEINLAND, TUEV_SUED, TUEV_SUED_EE01, TUEV_SUED_EE02;

    public String toValue() {
        switch (this) {
            case BET: return "BET";
            case CMS_EE01: return "CMS_EE01";
            case CMS_EE02: return "CMS_EE02";
            case EECS: return "EECS";
            case FRAUNHOFER: return "FRAUNHOFER";
            case FREIBERG: return "FREIBERG";
            case KLIMA_INVEST: return "KLIMA_INVEST";
            case LGA: return "LGA";
            case RECS: return "RECS";
            case REGS_EGL: return "REGS_EGL";
            case TUEV: return "TUEV";
            case TUEV_HESSEN: return "TUEV_HESSEN";
            case TUEV_NORD: return "TUEV_NORD";
            case TUEV_RHEINLAND: return "TUEV_RHEINLAND";
            case TUEV_SUED: return "TUEV_SUED";
            case TUEV_SUED_EE01: return "TUEV_SUED_EE01";
            case TUEV_SUED_EE02: return "TUEV_SUED_EE02";
        }
        return null;
    }

    public static Oekozertifikat forValue(String value) throws IOException {
        if (value.equals("BET")) return BET;
        if (value.equals("CMS_EE01")) return CMS_EE01;
        if (value.equals("CMS_EE02")) return CMS_EE02;
        if (value.equals("EECS")) return EECS;
        if (value.equals("FRAUNHOFER")) return FRAUNHOFER;
        if (value.equals("FREIBERG")) return FREIBERG;
        if (value.equals("KLIMA_INVEST")) return KLIMA_INVEST;
        if (value.equals("LGA")) return LGA;
        if (value.equals("RECS")) return RECS;
        if (value.equals("REGS_EGL")) return REGS_EGL;
        if (value.equals("TUEV")) return TUEV;
        if (value.equals("TUEV_HESSEN")) return TUEV_HESSEN;
        if (value.equals("TUEV_NORD")) return TUEV_NORD;
        if (value.equals("TUEV_RHEINLAND")) return TUEV_RHEINLAND;
        if (value.equals("TUEV_SUED")) return TUEV_SUED;
        if (value.equals("TUEV_SUED_EE01")) return TUEV_SUED_EE01;
        if (value.equals("TUEV_SUED_EE02")) return TUEV_SUED_EE02;
        throw new IOException("Cannot deserialize Oekozertifikat");
    }
}
