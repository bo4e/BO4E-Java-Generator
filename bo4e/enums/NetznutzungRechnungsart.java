package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Abbildung verschiedener in der INVOIC angegebenen Rechnungsarten.
 */
public enum NetznutzungRechnungsart {
    HANDELSRECHNUNG, SELBSTAUSGESTELLT;

    public String toValue() {
        switch (this) {
            case HANDELSRECHNUNG: return "HANDELSRECHNUNG";
            case SELBSTAUSGESTELLT: return "SELBSTAUSGESTELLT";
        }
        return null;
    }

    public static NetznutzungRechnungsart forValue(String value) throws IOException {
        if (value.equals("HANDELSRECHNUNG")) return HANDELSRECHNUNG;
        if (value.equals("SELBSTAUSGESTELLT")) return SELBSTAUSGESTELLT;
        throw new IOException("Cannot deserialize NetznutzungRechnungsart");
    }
}
