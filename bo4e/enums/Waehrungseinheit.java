package com.example.bo4e.enums;

import java.io.IOException;

/**
 * In diesem Enum werden die Währungen und ihre Untereinheiten definiert, beispielsweise für
 * die Verwendung in Preisen.
 */
public enum Waehrungseinheit {
    CT, EUR;

    public String toValue() {
        switch (this) {
            case CT: return "CT";
            case EUR: return "EUR";
        }
        return null;
    }

    public static Waehrungseinheit forValue(String value) throws IOException {
        if (value.equals("CT")) return CT;
        if (value.equals("EUR")) return EUR;
        throw new IOException("Cannot deserialize Waehrungseinheit");
    }
}
