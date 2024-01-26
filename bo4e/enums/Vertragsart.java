package bo4e.enums;

import java.io.IOException;

/**
 * Aufzählung der Vertragsarten.
 */
public enum Vertragsart {
    BILANZIERUNGSVERTRAG, BUENDELVERTRAG, ENERGIELIEFERVERTRAG, MESSSTELLENBETRIEBSVERTRAG, NETZNUTZUNGSVERTRAG;

    public String toValue() {
        switch (this) {
            case BILANZIERUNGSVERTRAG: return "BILANZIERUNGSVERTRAG";
            case BUENDELVERTRAG: return "BUENDELVERTRAG";
            case ENERGIELIEFERVERTRAG: return "ENERGIELIEFERVERTRAG";
            case MESSSTELLENBETRIEBSVERTRAG: return "MESSSTELLENBETRIEBSVERTRAG";
            case NETZNUTZUNGSVERTRAG: return "NETZNUTZUNGSVERTRAG";
        }
        return null;
    }

    public static Vertragsart forValue(String value) throws IOException {
        if (value.equals("BILANZIERUNGSVERTRAG")) return BILANZIERUNGSVERTRAG;
        if (value.equals("BUENDELVERTRAG")) return BUENDELVERTRAG;
        if (value.equals("ENERGIELIEFERVERTRAG")) return ENERGIELIEFERVERTRAG;
        if (value.equals("MESSSTELLENBETRIEBSVERTRAG")) return MESSSTELLENBETRIEBSVERTRAG;
        if (value.equals("NETZNUTZUNGSVERTRAG")) return NETZNUTZUNGSVERTRAG;
        throw new IOException("Cannot deserialize Vertragsart");
    }
}
