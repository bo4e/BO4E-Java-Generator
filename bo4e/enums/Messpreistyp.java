package bo4e.enums;

import java.io.IOException;

/**
 * Festlegung, welcher Typ von Messung mit einem Preis belegt wird
 */
public enum Messpreistyp {
    AUFSCHLAG_TARIFSCHALTUNG, AUFSCHLAG_WANDLER, ELEKTRONISCHER_AUFSATZ, MESSPREIS_G10, MESSPREIS_G16, MESSPREIS_G25, MESSPREIS_G2_5, MESSPREIS_G4, MESSPREIS_G40, MESSPREIS_G6, SMART_METER_MESSPREIS_G10, SMART_METER_MESSPREIS_G16, SMART_METER_MESSPREIS_G25, SMART_METER_MESSPREIS_G2_5, SMART_METER_MESSPREIS_G4, SMART_METER_MESSPREIS_G40, SMART_METER_MESSPREIS_G6, VERRECHNUNGSPREIS_ET_DREH, VERRECHNUNGSPREIS_ET_WECHSEL, VERRECHNUNGSPREIS_L_ET, VERRECHNUNGSPREIS_L_ZT, VERRECHNUNGSPREIS_SM, VERRECHNUNGSPREIS_ZT_DREH, VERRECHNUNGSPREIS_ZT_WECHSEL;

    public String toValue() {
        switch (this) {
            case AUFSCHLAG_TARIFSCHALTUNG: return "AUFSCHLAG_TARIFSCHALTUNG";
            case AUFSCHLAG_WANDLER: return "AUFSCHLAG_WANDLER";
            case ELEKTRONISCHER_AUFSATZ: return "ELEKTRONISCHER_AUFSATZ";
            case MESSPREIS_G10: return "MESSPREIS_G10";
            case MESSPREIS_G16: return "MESSPREIS_G16";
            case MESSPREIS_G25: return "MESSPREIS_G25";
            case MESSPREIS_G2_5: return "MESSPREIS_G2_5";
            case MESSPREIS_G4: return "MESSPREIS_G4";
            case MESSPREIS_G40: return "MESSPREIS_G40";
            case MESSPREIS_G6: return "MESSPREIS_G6";
            case SMART_METER_MESSPREIS_G10: return "SMART_METER_MESSPREIS_G10";
            case SMART_METER_MESSPREIS_G16: return "SMART_METER_MESSPREIS_G16";
            case SMART_METER_MESSPREIS_G25: return "SMART_METER_MESSPREIS_G25";
            case SMART_METER_MESSPREIS_G2_5: return "SMART_METER_MESSPREIS_G2_5";
            case SMART_METER_MESSPREIS_G4: return "SMART_METER_MESSPREIS_G4";
            case SMART_METER_MESSPREIS_G40: return "SMART_METER_MESSPREIS_G40";
            case SMART_METER_MESSPREIS_G6: return "SMART_METER_MESSPREIS_G6";
            case VERRECHNUNGSPREIS_ET_DREH: return "VERRECHNUNGSPREIS_ET_DREH";
            case VERRECHNUNGSPREIS_ET_WECHSEL: return "VERRECHNUNGSPREIS_ET_WECHSEL";
            case VERRECHNUNGSPREIS_L_ET: return "VERRECHNUNGSPREIS_L_ET";
            case VERRECHNUNGSPREIS_L_ZT: return "VERRECHNUNGSPREIS_L_ZT";
            case VERRECHNUNGSPREIS_SM: return "VERRECHNUNGSPREIS_SM";
            case VERRECHNUNGSPREIS_ZT_DREH: return "VERRECHNUNGSPREIS_ZT_DREH";
            case VERRECHNUNGSPREIS_ZT_WECHSEL: return "VERRECHNUNGSPREIS_ZT_WECHSEL";
        }
        return null;
    }

    public static Messpreistyp forValue(String value) throws IOException {
        if (value.equals("AUFSCHLAG_TARIFSCHALTUNG")) return AUFSCHLAG_TARIFSCHALTUNG;
        if (value.equals("AUFSCHLAG_WANDLER")) return AUFSCHLAG_WANDLER;
        if (value.equals("ELEKTRONISCHER_AUFSATZ")) return ELEKTRONISCHER_AUFSATZ;
        if (value.equals("MESSPREIS_G10")) return MESSPREIS_G10;
        if (value.equals("MESSPREIS_G16")) return MESSPREIS_G16;
        if (value.equals("MESSPREIS_G25")) return MESSPREIS_G25;
        if (value.equals("MESSPREIS_G2_5")) return MESSPREIS_G2_5;
        if (value.equals("MESSPREIS_G4")) return MESSPREIS_G4;
        if (value.equals("MESSPREIS_G40")) return MESSPREIS_G40;
        if (value.equals("MESSPREIS_G6")) return MESSPREIS_G6;
        if (value.equals("SMART_METER_MESSPREIS_G10")) return SMART_METER_MESSPREIS_G10;
        if (value.equals("SMART_METER_MESSPREIS_G16")) return SMART_METER_MESSPREIS_G16;
        if (value.equals("SMART_METER_MESSPREIS_G25")) return SMART_METER_MESSPREIS_G25;
        if (value.equals("SMART_METER_MESSPREIS_G2_5")) return SMART_METER_MESSPREIS_G2_5;
        if (value.equals("SMART_METER_MESSPREIS_G4")) return SMART_METER_MESSPREIS_G4;
        if (value.equals("SMART_METER_MESSPREIS_G40")) return SMART_METER_MESSPREIS_G40;
        if (value.equals("SMART_METER_MESSPREIS_G6")) return SMART_METER_MESSPREIS_G6;
        if (value.equals("VERRECHNUNGSPREIS_ET_DREH")) return VERRECHNUNGSPREIS_ET_DREH;
        if (value.equals("VERRECHNUNGSPREIS_ET_WECHSEL")) return VERRECHNUNGSPREIS_ET_WECHSEL;
        if (value.equals("VERRECHNUNGSPREIS_L_ET")) return VERRECHNUNGSPREIS_L_ET;
        if (value.equals("VERRECHNUNGSPREIS_L_ZT")) return VERRECHNUNGSPREIS_L_ZT;
        if (value.equals("VERRECHNUNGSPREIS_SM")) return VERRECHNUNGSPREIS_SM;
        if (value.equals("VERRECHNUNGSPREIS_ZT_DREH")) return VERRECHNUNGSPREIS_ZT_DREH;
        if (value.equals("VERRECHNUNGSPREIS_ZT_WECHSEL")) return VERRECHNUNGSPREIS_ZT_WECHSEL;
        throw new IOException("Cannot deserialize Messpreistyp");
    }
}
