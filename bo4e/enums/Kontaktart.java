package bo4e.enums;

import java.io.IOException;

/**
 * Art des Kontaktes zwischen Geschäftspartnern.
 */
public enum Kontaktart {
    ANSCHREIBEN, E_MAIL, FAX, SMS, TELEFONAT;

    public String toValue() {
        switch (this) {
            case ANSCHREIBEN: return "ANSCHREIBEN";
            case E_MAIL: return "E_MAIL";
            case FAX: return "FAX";
            case SMS: return "SMS";
            case TELEFONAT: return "TELEFONAT";
        }
        return null;
    }

    public static Kontaktart forValue(String value) throws IOException {
        if (value.equals("ANSCHREIBEN")) return ANSCHREIBEN;
        if (value.equals("E_MAIL")) return E_MAIL;
        if (value.equals("FAX")) return FAX;
        if (value.equals("SMS")) return SMS;
        if (value.equals("TELEFONAT")) return TELEFONAT;
        throw new IOException("Cannot deserialize Kontaktart");
    }
}
