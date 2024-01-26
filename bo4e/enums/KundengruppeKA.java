package bo4e.enums;

import java.io.IOException;

/**
 * Eine Aufzählung zur Einordnung für die Höhe der Konzessionsabgabe.
 */
public enum KundengruppeKA {
    G_KOWA_100000, G_KOWA_25000, G_KOWA_500000, G_KOWA_G_500000, G_SONDERKUNDE, G_TARIF_100000, G_TARIF_25000, G_TARIF_500000, G_TARIF_G_500000, SONDER_KAS, SONDER_SAS, SONDER_TAS, SONDER_TKS, SONDER_TSS, S_SCHWACHLAST, S_SONDERKUNDE, S_TARIF_100000, S_TARIF_25000, S_TARIF_500000, S_TARIF_G_500000;

    public String toValue() {
        switch (this) {
            case G_KOWA_100000: return "G_KOWA_100000";
            case G_KOWA_25000: return "G_KOWA_25000";
            case G_KOWA_500000: return "G_KOWA_500000";
            case G_KOWA_G_500000: return "G_KOWA_G_500000";
            case G_SONDERKUNDE: return "G_SONDERKUNDE";
            case G_TARIF_100000: return "G_TARIF_100000";
            case G_TARIF_25000: return "G_TARIF_25000";
            case G_TARIF_500000: return "G_TARIF_500000";
            case G_TARIF_G_500000: return "G_TARIF_G_500000";
            case SONDER_KAS: return "SONDER_KAS";
            case SONDER_SAS: return "SONDER_SAS";
            case SONDER_TAS: return "SONDER_TAS";
            case SONDER_TKS: return "SONDER_TKS";
            case SONDER_TSS: return "SONDER_TSS";
            case S_SCHWACHLAST: return "S_SCHWACHLAST";
            case S_SONDERKUNDE: return "S_SONDERKUNDE";
            case S_TARIF_100000: return "S_TARIF_100000";
            case S_TARIF_25000: return "S_TARIF_25000";
            case S_TARIF_500000: return "S_TARIF_500000";
            case S_TARIF_G_500000: return "S_TARIF_G_500000";
        }
        return null;
    }

    public static KundengruppeKA forValue(String value) throws IOException {
        if (value.equals("G_KOWA_100000")) return G_KOWA_100000;
        if (value.equals("G_KOWA_25000")) return G_KOWA_25000;
        if (value.equals("G_KOWA_500000")) return G_KOWA_500000;
        if (value.equals("G_KOWA_G_500000")) return G_KOWA_G_500000;
        if (value.equals("G_SONDERKUNDE")) return G_SONDERKUNDE;
        if (value.equals("G_TARIF_100000")) return G_TARIF_100000;
        if (value.equals("G_TARIF_25000")) return G_TARIF_25000;
        if (value.equals("G_TARIF_500000")) return G_TARIF_500000;
        if (value.equals("G_TARIF_G_500000")) return G_TARIF_G_500000;
        if (value.equals("SONDER_KAS")) return SONDER_KAS;
        if (value.equals("SONDER_SAS")) return SONDER_SAS;
        if (value.equals("SONDER_TAS")) return SONDER_TAS;
        if (value.equals("SONDER_TKS")) return SONDER_TKS;
        if (value.equals("SONDER_TSS")) return SONDER_TSS;
        if (value.equals("S_SCHWACHLAST")) return S_SCHWACHLAST;
        if (value.equals("S_SONDERKUNDE")) return S_SONDERKUNDE;
        if (value.equals("S_TARIF_100000")) return S_TARIF_100000;
        if (value.equals("S_TARIF_25000")) return S_TARIF_25000;
        if (value.equals("S_TARIF_500000")) return S_TARIF_500000;
        if (value.equals("S_TARIF_G_500000")) return S_TARIF_G_500000;
        throw new IOException("Cannot deserialize KundengruppeKA");
    }
}
