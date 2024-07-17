package placeholder;

import java.io.IOException;

/**
 * Kundengruppe für eine Marktlokation (orientiert sich an den Standard-Lastprofilen).
 */
public enum Kundengruppe {
    RLM, RLM_KOMMUNAL, SLP_G_GBA, SLP_G_GBD, SLP_G_GBH, SLP_G_GGA, SLP_G_GGB, SLP_G_GHA, SLP_G_GKO, SLP_G_GMF, SLP_G_GMK, SLP_G_GPD, SLP_G_GWA, SLP_G_HEF, SLP_G_HKO, SLP_G_HMF, SLP_G_STANDARD, SLP_KOMMUNAL, SLP_S_EM, SLP_S_G0, SLP_S_G1, SLP_S_G2, SLP_S_G3, SLP_S_G4, SLP_S_G5, SLP_S_G6, SLP_S_G7, SLP_S_H0, SLP_S_HZ, SLP_S_HZ_GEM, SLP_S_L0, SLP_S_L1, SLP_S_L2, SLP_S_SB, SLP_S_WP;

    public String toValue() {
        switch (this) {
            case RLM: return "RLM";
            case RLM_KOMMUNAL: return "RLM_KOMMUNAL";
            case SLP_G_GBA: return "SLP_G_GBA";
            case SLP_G_GBD: return "SLP_G_GBD";
            case SLP_G_GBH: return "SLP_G_GBH";
            case SLP_G_GGA: return "SLP_G_GGA";
            case SLP_G_GGB: return "SLP_G_GGB";
            case SLP_G_GHA: return "SLP_G_GHA";
            case SLP_G_GKO: return "SLP_G_GKO";
            case SLP_G_GMF: return "SLP_G_GMF";
            case SLP_G_GMK: return "SLP_G_GMK";
            case SLP_G_GPD: return "SLP_G_GPD";
            case SLP_G_GWA: return "SLP_G_GWA";
            case SLP_G_HEF: return "SLP_G_HEF";
            case SLP_G_HKO: return "SLP_G_HKO";
            case SLP_G_HMF: return "SLP_G_HMF";
            case SLP_G_STANDARD: return "SLP_G_STANDARD";
            case SLP_KOMMUNAL: return "SLP_KOMMUNAL";
            case SLP_S_EM: return "SLP_S_EM";
            case SLP_S_G0: return "SLP_S_G0";
            case SLP_S_G1: return "SLP_S_G1";
            case SLP_S_G2: return "SLP_S_G2";
            case SLP_S_G3: return "SLP_S_G3";
            case SLP_S_G4: return "SLP_S_G4";
            case SLP_S_G5: return "SLP_S_G5";
            case SLP_S_G6: return "SLP_S_G6";
            case SLP_S_G7: return "SLP_S_G7";
            case SLP_S_H0: return "SLP_S_H0";
            case SLP_S_HZ: return "SLP_S_HZ";
            case SLP_S_HZ_GEM: return "SLP_S_HZ_GEM";
            case SLP_S_L0: return "SLP_S_L0";
            case SLP_S_L1: return "SLP_S_L1";
            case SLP_S_L2: return "SLP_S_L2";
            case SLP_S_SB: return "SLP_S_SB";
            case SLP_S_WP: return "SLP_S_WP";
        }
        return null;
    }

    public static Kundengruppe forValue(String value) throws IOException {
        if (value.equals("RLM")) return RLM;
        if (value.equals("RLM_KOMMUNAL")) return RLM_KOMMUNAL;
        if (value.equals("SLP_G_GBA")) return SLP_G_GBA;
        if (value.equals("SLP_G_GBD")) return SLP_G_GBD;
        if (value.equals("SLP_G_GBH")) return SLP_G_GBH;
        if (value.equals("SLP_G_GGA")) return SLP_G_GGA;
        if (value.equals("SLP_G_GGB")) return SLP_G_GGB;
        if (value.equals("SLP_G_GHA")) return SLP_G_GHA;
        if (value.equals("SLP_G_GKO")) return SLP_G_GKO;
        if (value.equals("SLP_G_GMF")) return SLP_G_GMF;
        if (value.equals("SLP_G_GMK")) return SLP_G_GMK;
        if (value.equals("SLP_G_GPD")) return SLP_G_GPD;
        if (value.equals("SLP_G_GWA")) return SLP_G_GWA;
        if (value.equals("SLP_G_HEF")) return SLP_G_HEF;
        if (value.equals("SLP_G_HKO")) return SLP_G_HKO;
        if (value.equals("SLP_G_HMF")) return SLP_G_HMF;
        if (value.equals("SLP_G_STANDARD")) return SLP_G_STANDARD;
        if (value.equals("SLP_KOMMUNAL")) return SLP_KOMMUNAL;
        if (value.equals("SLP_S_EM")) return SLP_S_EM;
        if (value.equals("SLP_S_G0")) return SLP_S_G0;
        if (value.equals("SLP_S_G1")) return SLP_S_G1;
        if (value.equals("SLP_S_G2")) return SLP_S_G2;
        if (value.equals("SLP_S_G3")) return SLP_S_G3;
        if (value.equals("SLP_S_G4")) return SLP_S_G4;
        if (value.equals("SLP_S_G5")) return SLP_S_G5;
        if (value.equals("SLP_S_G6")) return SLP_S_G6;
        if (value.equals("SLP_S_G7")) return SLP_S_G7;
        if (value.equals("SLP_S_H0")) return SLP_S_H0;
        if (value.equals("SLP_S_HZ")) return SLP_S_HZ;
        if (value.equals("SLP_S_HZ_GEM")) return SLP_S_HZ_GEM;
        if (value.equals("SLP_S_L0")) return SLP_S_L0;
        if (value.equals("SLP_S_L1")) return SLP_S_L1;
        if (value.equals("SLP_S_L2")) return SLP_S_L2;
        if (value.equals("SLP_S_SB")) return SLP_S_SB;
        if (value.equals("SLP_S_WP")) return SLP_S_WP;
        throw new IOException("Cannot deserialize Kundengruppe");
    }
}
