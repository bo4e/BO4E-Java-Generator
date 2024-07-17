package placeholder;

import java.io.IOException;

/**
 * Hier wird festgelegt, ob der Geschäftspartner eine Person, eine Firma oder etwas anderes
 * ist.
 */
public enum Organisationstyp {
    KOMMUNALE_EINRICHTUNG, PRIVATPERSON, STAATLICHE_BEHOERDE, UNTERNEHMEN;

    public String toValue() {
        switch (this) {
            case KOMMUNALE_EINRICHTUNG: return "KOMMUNALE_EINRICHTUNG";
            case PRIVATPERSON: return "PRIVATPERSON";
            case STAATLICHE_BEHOERDE: return "STAATLICHE_BEHOERDE";
            case UNTERNEHMEN: return "UNTERNEHMEN";
        }
        return null;
    }

    public static Organisationstyp forValue(String value) throws IOException {
        if (value.equals("KOMMUNALE_EINRICHTUNG")) return KOMMUNALE_EINRICHTUNG;
        if (value.equals("PRIVATPERSON")) return PRIVATPERSON;
        if (value.equals("STAATLICHE_BEHOERDE")) return STAATLICHE_BEHOERDE;
        if (value.equals("UNTERNEHMEN")) return UNTERNEHMEN;
        throw new IOException("Cannot deserialize Organisationstyp");
    }
}
