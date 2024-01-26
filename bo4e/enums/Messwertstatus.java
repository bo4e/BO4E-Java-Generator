package bo4e.enums;

import java.io.IOException;

/**
 * Der Status eines Zählerstandes
 */
public enum Messwertstatus {
    ABGELESEN, ANGABE_FUER_LIEFERSCHEIN, ENERGIEMENGESUMMIERT, ERSATZWERT, FEHLT, NICHT_VERWENDBAR, PROGNOSEWERT, VORLAEUFIGERWERT, VORSCHLAGSWERT;

    public String toValue() {
        switch (this) {
            case ABGELESEN: return "ABGELESEN";
            case ANGABE_FUER_LIEFERSCHEIN: return "ANGABE_FUER_LIEFERSCHEIN";
            case ENERGIEMENGESUMMIERT: return "ENERGIEMENGESUMMIERT";
            case ERSATZWERT: return "ERSATZWERT";
            case FEHLT: return "FEHLT";
            case NICHT_VERWENDBAR: return "NICHT_VERWENDBAR";
            case PROGNOSEWERT: return "PROGNOSEWERT";
            case VORLAEUFIGERWERT: return "VORLAEUFIGERWERT";
            case VORSCHLAGSWERT: return "VORSCHLAGSWERT";
        }
        return null;
    }

    public static Messwertstatus forValue(String value) throws IOException {
        if (value.equals("ABGELESEN")) return ABGELESEN;
        if (value.equals("ANGABE_FUER_LIEFERSCHEIN")) return ANGABE_FUER_LIEFERSCHEIN;
        if (value.equals("ENERGIEMENGESUMMIERT")) return ENERGIEMENGESUMMIERT;
        if (value.equals("ERSATZWERT")) return ERSATZWERT;
        if (value.equals("FEHLT")) return FEHLT;
        if (value.equals("NICHT_VERWENDBAR")) return NICHT_VERWENDBAR;
        if (value.equals("PROGNOSEWERT")) return PROGNOSEWERT;
        if (value.equals("VORLAEUFIGERWERT")) return VORLAEUFIGERWERT;
        if (value.equals("VORSCHLAGSWERT")) return VORSCHLAGSWERT;
        throw new IOException("Cannot deserialize Messwertstatus");
    }
}
