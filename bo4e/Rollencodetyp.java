package placeholder;

import java.io.IOException;

/**
 * Gibt den Codetyp einer Rolle, beispielsweise einer Marktrolle, an.
 */
public enum Rollencodetyp {
    BDEW, DVGW, GLN;

    public String toValue() {
        switch (this) {
            case BDEW: return "BDEW";
            case DVGW: return "DVGW";
            case GLN: return "GLN";
        }
        return null;
    }

    public static Rollencodetyp forValue(String value) throws IOException {
        if (value.equals("BDEW")) return BDEW;
        if (value.equals("DVGW")) return DVGW;
        if (value.equals("GLN")) return GLN;
        throw new IOException("Cannot deserialize Rollencodetyp");
    }
}
