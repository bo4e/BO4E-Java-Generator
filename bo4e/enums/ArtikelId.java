package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Liste von Artikel-IDs, z.B. für standardisierte vom BDEW herausgegebene Artikel,
 * die im Strommarkt die BDEW-Artikelnummer ablösen
 */
public enum ArtikelId {
    THE_2017001, THE_2017002, THE_2017003, THE_2017004, THE_2017005, THE_2017006, THE_2020001, THE_2020002;

    public String toValue() {
        switch (this) {
            case THE_2017001: return "2-01-7-001";
            case THE_2017002: return "2-01-7-002";
            case THE_2017003: return "2-01-7-003";
            case THE_2017004: return "2-01-7-004";
            case THE_2017005: return "2-01-7-005";
            case THE_2017006: return "2-01-7-006";
            case THE_2020001: return "2-02-0-001";
            case THE_2020002: return "2-02-0-002";
        }
        return null;
    }

    public static ArtikelId forValue(String value) throws IOException {
        if (value.equals("2-01-7-001")) return THE_2017001;
        if (value.equals("2-01-7-002")) return THE_2017002;
        if (value.equals("2-01-7-003")) return THE_2017003;
        if (value.equals("2-01-7-004")) return THE_2017004;
        if (value.equals("2-01-7-005")) return THE_2017005;
        if (value.equals("2-01-7-006")) return THE_2017006;
        if (value.equals("2-02-0-001")) return THE_2020001;
        if (value.equals("2-02-0-002")) return THE_2020002;
        throw new IOException("Cannot deserialize ArtikelId");
    }
}
