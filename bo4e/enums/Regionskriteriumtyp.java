package bo4e.enums;

import java.io.IOException;

/**
 * Klassifizierung der Kriterien für eine regionale Eingrenzung.
 */
public enum Regionskriteriumtyp {
    BILANZIERUNGS_GEBIET_NUMMER, BUNDESLANDKENNZIFFER, BUNDESLAND_NAME, BUNDESWEIT, EINWOHNERZAHL_GEMEINDE, EINWOHNERZAHL_ORT, GEMEINDEKENNZIFFER, GEMEINDE_NAME, GRUNDVERSORGER_NAME_GAS, GRUNDVERSORGER_NAME_STROM, GRUNDVERSORGER_NUMMER_GAS, GRUNDVERSORGER_NUMMER_STROM, KM_UMKREIS, KREISKENNZIFFER, KREIS_NAME, MARKTGEBIET_NAME, MARKTGEBIET_NUMMER, MSB_NAME, MSB_NUMMER, NETZBETREIBER_NAME_GAS, NETZBETREIBER_NAME_STROM, NETZBETREIBER_NUMMER_GAS, NETZBETREIBER_NUMMER_STROM, NETZ_GAS, NETZ_STROM, ORT, PLZ_BEREICH, POSTLEITZAHL, POSTORT, REGELGEBIET_NAME, REGELGEBIET_NUMMER, VERSORGER_NAME, VERSORGER_NUMMER;

    public String toValue() {
        switch (this) {
            case BILANZIERUNGS_GEBIET_NUMMER: return "BILANZIERUNGS_GEBIET_NUMMER";
            case BUNDESLANDKENNZIFFER: return "BUNDESLANDKENNZIFFER";
            case BUNDESLAND_NAME: return "BUNDESLAND_NAME";
            case BUNDESWEIT: return "BUNDESWEIT";
            case EINWOHNERZAHL_GEMEINDE: return "EINWOHNERZAHL_GEMEINDE";
            case EINWOHNERZAHL_ORT: return "EINWOHNERZAHL_ORT";
            case GEMEINDEKENNZIFFER: return "GEMEINDEKENNZIFFER";
            case GEMEINDE_NAME: return "GEMEINDE_NAME";
            case GRUNDVERSORGER_NAME_GAS: return "GRUNDVERSORGER_NAME_GAS";
            case GRUNDVERSORGER_NAME_STROM: return "GRUNDVERSORGER_NAME_STROM";
            case GRUNDVERSORGER_NUMMER_GAS: return "GRUNDVERSORGER_NUMMER_GAS";
            case GRUNDVERSORGER_NUMMER_STROM: return "GRUNDVERSORGER_NUMMER_STROM";
            case KM_UMKREIS: return "KM_UMKREIS";
            case KREISKENNZIFFER: return "KREISKENNZIFFER";
            case KREIS_NAME: return "KREIS_NAME";
            case MARKTGEBIET_NAME: return "MARKTGEBIET_NAME";
            case MARKTGEBIET_NUMMER: return "MARKTGEBIET_NUMMER";
            case MSB_NAME: return "MSB_NAME";
            case MSB_NUMMER: return "MSB_NUMMER";
            case NETZBETREIBER_NAME_GAS: return "NETZBETREIBER_NAME_GAS";
            case NETZBETREIBER_NAME_STROM: return "NETZBETREIBER_NAME_STROM";
            case NETZBETREIBER_NUMMER_GAS: return "NETZBETREIBER_NUMMER_GAS";
            case NETZBETREIBER_NUMMER_STROM: return "NETZBETREIBER_NUMMER_STROM";
            case NETZ_GAS: return "NETZ_GAS";
            case NETZ_STROM: return "NETZ_STROM";
            case ORT: return "ORT";
            case PLZ_BEREICH: return "PLZ_BEREICH";
            case POSTLEITZAHL: return "POSTLEITZAHL";
            case POSTORT: return "POSTORT";
            case REGELGEBIET_NAME: return "REGELGEBIET_NAME";
            case REGELGEBIET_NUMMER: return "REGELGEBIET_NUMMER";
            case VERSORGER_NAME: return "VERSORGER_NAME";
            case VERSORGER_NUMMER: return "VERSORGER_NUMMER";
        }
        return null;
    }

    public static Regionskriteriumtyp forValue(String value) throws IOException {
        if (value.equals("BILANZIERUNGS_GEBIET_NUMMER")) return BILANZIERUNGS_GEBIET_NUMMER;
        if (value.equals("BUNDESLANDKENNZIFFER")) return BUNDESLANDKENNZIFFER;
        if (value.equals("BUNDESLAND_NAME")) return BUNDESLAND_NAME;
        if (value.equals("BUNDESWEIT")) return BUNDESWEIT;
        if (value.equals("EINWOHNERZAHL_GEMEINDE")) return EINWOHNERZAHL_GEMEINDE;
        if (value.equals("EINWOHNERZAHL_ORT")) return EINWOHNERZAHL_ORT;
        if (value.equals("GEMEINDEKENNZIFFER")) return GEMEINDEKENNZIFFER;
        if (value.equals("GEMEINDE_NAME")) return GEMEINDE_NAME;
        if (value.equals("GRUNDVERSORGER_NAME_GAS")) return GRUNDVERSORGER_NAME_GAS;
        if (value.equals("GRUNDVERSORGER_NAME_STROM")) return GRUNDVERSORGER_NAME_STROM;
        if (value.equals("GRUNDVERSORGER_NUMMER_GAS")) return GRUNDVERSORGER_NUMMER_GAS;
        if (value.equals("GRUNDVERSORGER_NUMMER_STROM")) return GRUNDVERSORGER_NUMMER_STROM;
        if (value.equals("KM_UMKREIS")) return KM_UMKREIS;
        if (value.equals("KREISKENNZIFFER")) return KREISKENNZIFFER;
        if (value.equals("KREIS_NAME")) return KREIS_NAME;
        if (value.equals("MARKTGEBIET_NAME")) return MARKTGEBIET_NAME;
        if (value.equals("MARKTGEBIET_NUMMER")) return MARKTGEBIET_NUMMER;
        if (value.equals("MSB_NAME")) return MSB_NAME;
        if (value.equals("MSB_NUMMER")) return MSB_NUMMER;
        if (value.equals("NETZBETREIBER_NAME_GAS")) return NETZBETREIBER_NAME_GAS;
        if (value.equals("NETZBETREIBER_NAME_STROM")) return NETZBETREIBER_NAME_STROM;
        if (value.equals("NETZBETREIBER_NUMMER_GAS")) return NETZBETREIBER_NUMMER_GAS;
        if (value.equals("NETZBETREIBER_NUMMER_STROM")) return NETZBETREIBER_NUMMER_STROM;
        if (value.equals("NETZ_GAS")) return NETZ_GAS;
        if (value.equals("NETZ_STROM")) return NETZ_STROM;
        if (value.equals("ORT")) return ORT;
        if (value.equals("PLZ_BEREICH")) return PLZ_BEREICH;
        if (value.equals("POSTLEITZAHL")) return POSTLEITZAHL;
        if (value.equals("POSTORT")) return POSTORT;
        if (value.equals("REGELGEBIET_NAME")) return REGELGEBIET_NAME;
        if (value.equals("REGELGEBIET_NUMMER")) return REGELGEBIET_NUMMER;
        if (value.equals("VERSORGER_NAME")) return VERSORGER_NAME;
        if (value.equals("VERSORGER_NUMMER")) return VERSORGER_NUMMER;
        throw new IOException("Cannot deserialize Regionskriteriumtyp");
    }
}
