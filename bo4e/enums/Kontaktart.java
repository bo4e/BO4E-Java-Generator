package bo4e.enums;

import java.io.IOException;

/**
 * Gibt an, auf welchem Weg die Person oder der Geschäftspartner kontaktiert werden kann.
 */
public enum Kontaktart {
    E_MAIL, FAX, POSTWEG, SMS, TELEFON;

    public String toValue() {
        switch (this) {
            case E_MAIL: return "E_MAIL";
            case FAX: return "FAX";
            case POSTWEG: return "POSTWEG";
            case SMS: return "SMS";
            case TELEFON: return "TELEFON";
        }
        return null;
    }

    public static Kontaktart forValue(String value) throws IOException {
        if (value.equals("E_MAIL")) return E_MAIL;
        if (value.equals("FAX")) return FAX;
        if (value.equals("POSTWEG")) return POSTWEG;
        if (value.equals("SMS")) return SMS;
        if (value.equals("TELEFON")) return TELEFON;
        throw new IOException("Cannot deserialize Kontaktart");
    }
}
