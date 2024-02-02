package com.example.bo4e.enums;

import java.io.IOException;

/**
 * Aufzählung der Möglichkeiten für die Vergabe von Preisgarantien
 */
public enum Preisgarantietyp {
    ALLE_PREISBESTANDTEILE_BRUTTO, ALLE_PREISBESTANDTEILE_NETTO, NUR_ENERGIEPREIS, PREISBESTANDTEILE_OHNE_ABGABEN;

    public String toValue() {
        switch (this) {
            case ALLE_PREISBESTANDTEILE_BRUTTO: return "ALLE_PREISBESTANDTEILE_BRUTTO";
            case ALLE_PREISBESTANDTEILE_NETTO: return "ALLE_PREISBESTANDTEILE_NETTO";
            case NUR_ENERGIEPREIS: return "NUR_ENERGIEPREIS";
            case PREISBESTANDTEILE_OHNE_ABGABEN: return "PREISBESTANDTEILE_OHNE_ABGABEN";
        }
        return null;
    }

    public static Preisgarantietyp forValue(String value) throws IOException {
        if (value.equals("ALLE_PREISBESTANDTEILE_BRUTTO")) return ALLE_PREISBESTANDTEILE_BRUTTO;
        if (value.equals("ALLE_PREISBESTANDTEILE_NETTO")) return ALLE_PREISBESTANDTEILE_NETTO;
        if (value.equals("NUR_ENERGIEPREIS")) return NUR_ENERGIEPREIS;
        if (value.equals("PREISBESTANDTEILE_OHNE_ABGABEN")) return PREISBESTANDTEILE_OHNE_ABGABEN;
        throw new IOException("Cannot deserialize Preisgarantietyp");
    }
}
