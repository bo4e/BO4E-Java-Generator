package bo4e.enums;

import java.io.IOException;

/**
 * Aufzählung der Labels für Öko-Strom von verschiedenen Herausgebern.
 */
public enum Oekolabel {
    ENERGREEN, GASGREEN, GASGREEN_GRUENER_STROM, GRUENER_STROM, GRUENER_STROM_GOLD, GRUENER_STROM_SILBER, GRUENES_GAS, NATURWATT_STROM, OK_POWER, RENEWABLE_PLUS, WATERGREEN, WATERGREEN_PLUS;

    public String toValue() {
        switch (this) {
            case ENERGREEN: return "ENERGREEN";
            case GASGREEN: return "GASGREEN";
            case GASGREEN_GRUENER_STROM: return "GASGREEN_GRUENER_STROM";
            case GRUENER_STROM: return "GRUENER_STROM";
            case GRUENER_STROM_GOLD: return "GRUENER_STROM_GOLD";
            case GRUENER_STROM_SILBER: return "GRUENER_STROM_SILBER";
            case GRUENES_GAS: return "GRUENES_GAS";
            case NATURWATT_STROM: return "NATURWATT_STROM";
            case OK_POWER: return "OK_POWER";
            case RENEWABLE_PLUS: return "RENEWABLE_PLUS";
            case WATERGREEN: return "WATERGREEN";
            case WATERGREEN_PLUS: return "WATERGREEN_PLUS";
        }
        return null;
    }

    public static Oekolabel forValue(String value) throws IOException {
        if (value.equals("ENERGREEN")) return ENERGREEN;
        if (value.equals("GASGREEN")) return GASGREEN;
        if (value.equals("GASGREEN_GRUENER_STROM")) return GASGREEN_GRUENER_STROM;
        if (value.equals("GRUENER_STROM")) return GRUENER_STROM;
        if (value.equals("GRUENER_STROM_GOLD")) return GRUENER_STROM_GOLD;
        if (value.equals("GRUENER_STROM_SILBER")) return GRUENER_STROM_SILBER;
        if (value.equals("GRUENES_GAS")) return GRUENES_GAS;
        if (value.equals("NATURWATT_STROM")) return NATURWATT_STROM;
        if (value.equals("OK_POWER")) return OK_POWER;
        if (value.equals("RENEWABLE_PLUS")) return RENEWABLE_PLUS;
        if (value.equals("WATERGREEN")) return WATERGREEN;
        if (value.equals("WATERGREEN_PLUS")) return WATERGREEN_PLUS;
        throw new IOException("Cannot deserialize Oekolabel");
    }
}
