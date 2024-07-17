package placeholder;

import java.io.IOException;

/**
 * Abbildung einer Statusinformation für Verträge.
 */
public enum Vertragsstatus {
    ABGELEHNT, AKTIV, ANGENOMMEN, BEENDET, GEKUENDIGT, IN_ARBEIT, STORNIERT, UEBERMITTELT, WIDERRUFEN;

    public String toValue() {
        switch (this) {
            case ABGELEHNT: return "ABGELEHNT";
            case AKTIV: return "AKTIV";
            case ANGENOMMEN: return "ANGENOMMEN";
            case BEENDET: return "BEENDET";
            case GEKUENDIGT: return "GEKUENDIGT";
            case IN_ARBEIT: return "IN_ARBEIT";
            case STORNIERT: return "STORNIERT";
            case UEBERMITTELT: return "UEBERMITTELT";
            case WIDERRUFEN: return "WIDERRUFEN";
        }
        return null;
    }

    public static Vertragsstatus forValue(String value) throws IOException {
        if (value.equals("ABGELEHNT")) return ABGELEHNT;
        if (value.equals("AKTIV")) return AKTIV;
        if (value.equals("ANGENOMMEN")) return ANGENOMMEN;
        if (value.equals("BEENDET")) return BEENDET;
        if (value.equals("GEKUENDIGT")) return GEKUENDIGT;
        if (value.equals("IN_ARBEIT")) return IN_ARBEIT;
        if (value.equals("STORNIERT")) return STORNIERT;
        if (value.equals("UEBERMITTELT")) return UEBERMITTELT;
        if (value.equals("WIDERRUFEN")) return WIDERRUFEN;
        throw new IOException("Cannot deserialize Vertragsstatus");
    }
}
