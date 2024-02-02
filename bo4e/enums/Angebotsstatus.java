package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Gibt den Status eines Angebotes an.
 */
public enum Angebotsstatus {
    ABGELEHNT, AUSSTEHEND, BEAUFTRAGT, ERLEDIGT, KONZEPTION, NACHGEFASST, UNGUELTIG, UNVERBINDLICH, VERBINDLICH;

    public String toValue() {
        switch (this) {
            case ABGELEHNT: return "ABGELEHNT";
            case AUSSTEHEND: return "AUSSTEHEND";
            case BEAUFTRAGT: return "BEAUFTRAGT";
            case ERLEDIGT: return "ERLEDIGT";
            case KONZEPTION: return "KONZEPTION";
            case NACHGEFASST: return "NACHGEFASST";
            case UNGUELTIG: return "UNGUELTIG";
            case UNVERBINDLICH: return "UNVERBINDLICH";
            case VERBINDLICH: return "VERBINDLICH";
        }
        return null;
    }

    public static Angebotsstatus forValue(String value) throws IOException {
        if (value.equals("ABGELEHNT")) return ABGELEHNT;
        if (value.equals("AUSSTEHEND")) return AUSSTEHEND;
        if (value.equals("BEAUFTRAGT")) return BEAUFTRAGT;
        if (value.equals("ERLEDIGT")) return ERLEDIGT;
        if (value.equals("KONZEPTION")) return KONZEPTION;
        if (value.equals("NACHGEFASST")) return NACHGEFASST;
        if (value.equals("UNGUELTIG")) return UNGUELTIG;
        if (value.equals("UNVERBINDLICH")) return UNVERBINDLICH;
        if (value.equals("VERBINDLICH")) return VERBINDLICH;
        throw new IOException("Cannot deserialize Angebotsstatus");
    }
}
