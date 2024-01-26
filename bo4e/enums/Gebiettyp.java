package bo4e.enums;

import java.io.IOException;

/**
 * List of possible Gebiettypen.
 */
public enum Gebiettyp {
    AREALNETZ, BILANZIERUNGSGEBIET, GRUNDVERSORGUNGSGEBIET, MARKTGEBIET, REGELZONE, REGIONALNETZ, TRANSPORTNETZ, VERSORGUNGSGEBIET, VERTEILNETZ;

    public String toValue() {
        switch (this) {
            case AREALNETZ: return "AREALNETZ";
            case BILANZIERUNGSGEBIET: return "BILANZIERUNGSGEBIET";
            case GRUNDVERSORGUNGSGEBIET: return "GRUNDVERSORGUNGSGEBIET";
            case MARKTGEBIET: return "MARKTGEBIET";
            case REGELZONE: return "REGELZONE";
            case REGIONALNETZ: return "REGIONALNETZ";
            case TRANSPORTNETZ: return "TRANSPORTNETZ";
            case VERSORGUNGSGEBIET: return "VERSORGUNGSGEBIET";
            case VERTEILNETZ: return "VERTEILNETZ";
        }
        return null;
    }

    public static Gebiettyp forValue(String value) throws IOException {
        if (value.equals("AREALNETZ")) return AREALNETZ;
        if (value.equals("BILANZIERUNGSGEBIET")) return BILANZIERUNGSGEBIET;
        if (value.equals("GRUNDVERSORGUNGSGEBIET")) return GRUNDVERSORGUNGSGEBIET;
        if (value.equals("MARKTGEBIET")) return MARKTGEBIET;
        if (value.equals("REGELZONE")) return REGELZONE;
        if (value.equals("REGIONALNETZ")) return REGIONALNETZ;
        if (value.equals("TRANSPORTNETZ")) return TRANSPORTNETZ;
        if (value.equals("VERSORGUNGSGEBIET")) return VERSORGUNGSGEBIET;
        if (value.equals("VERTEILNETZ")) return VERTEILNETZ;
        throw new IOException("Cannot deserialize Gebiettyp");
    }
}
