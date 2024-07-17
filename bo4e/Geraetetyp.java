package placeholder;

import java.io.IOException;

/**
 * Auflistung möglicher abzurechnender Gerätetypen.
 */
public enum Geraetetyp {
    BLOCKSTROMWANDLER, DATENLOGGER, DSL_KOM, EDL_21, EDL_40, EDL_40__ZAEHLERAUFSATZ, ETHERNET_KOM, HOECHSTBELASTUNGS_ANZEIGER, IMPULSGEBER, INTELLIGENTES_MESSYSTEM, KOMBIMESSWANDLER, KOMBIMESSWANDLER_IMS_MME, KOMMUNIKATIONSANSCHLUSS, KOMPAKT_MU, LTE_KOM, MENGENUMWERTER, MESSWANDLERSATZ_IMS_MME, MODEM, MODEM_FESTNETZ, MODEM_FUNK, MODEM_GPRS, MODEM_GPRS_M_LG, MODEM_GSM, MODEM_GSM_M_LG, MODEM_GSM_O_LG, MODERNE_MESSEINRICHTUNG, MULTIPLEXANLAGE, OPTIONALE_ZUS_ZAEHLEINRICHTUNG, PAUSCHALANLAGE, PLC_KOM, RUNDSTEUEREMPFAENGER, RUNDSTEUEREMPFAENGER_IMS_MME, SONSTIGES_GERAET, SPANNUNGSWANDLER, STEUEREINRICHTUNG, STROMWANDLER, SUMMATIONSGERAET, SYSTEM_MU, TARIFSCHALTGERAET, TARIFSCHALTGERAET_IMS_MME, TELEFONANSCHLUSS, TELEKOMMUNIKATIONSEINRICHTUNG, TEMPERATUR_KOMPENSATION, TEMPERATUR_MU, VERSTAERKERANLAGE, ZUSTANDS_MU;

    public String toValue() {
        switch (this) {
            case BLOCKSTROMWANDLER: return "BLOCKSTROMWANDLER";
            case DATENLOGGER: return "DATENLOGGER";
            case DSL_KOM: return "DSL_KOM";
            case EDL_21: return "EDL_21";
            case EDL_40: return "EDL_40";
            case EDL_40__ZAEHLERAUFSATZ: return "EDL_40_ZAEHLERAUFSATZ";
            case ETHERNET_KOM: return "ETHERNET_KOM";
            case HOECHSTBELASTUNGS_ANZEIGER: return "HOECHSTBELASTUNGS_ANZEIGER";
            case IMPULSGEBER: return "IMPULSGEBER";
            case INTELLIGENTES_MESSYSTEM: return "INTELLIGENTES_MESSYSTEM";
            case KOMBIMESSWANDLER: return "KOMBIMESSWANDLER";
            case KOMBIMESSWANDLER_IMS_MME: return "KOMBIMESSWANDLER_IMS_MME";
            case KOMMUNIKATIONSANSCHLUSS: return "KOMMUNIKATIONSANSCHLUSS";
            case KOMPAKT_MU: return "KOMPAKT_MU";
            case LTE_KOM: return "LTE_KOM";
            case MENGENUMWERTER: return "MENGENUMWERTER";
            case MESSWANDLERSATZ_IMS_MME: return "MESSWANDLERSATZ_IMS_MME";
            case MODEM: return "MODEM";
            case MODEM_FESTNETZ: return "MODEM_FESTNETZ";
            case MODEM_FUNK: return "MODEM_FUNK";
            case MODEM_GPRS: return "MODEM_GPRS";
            case MODEM_GPRS_M_LG: return "MODEM_GPRS_M_LG";
            case MODEM_GSM: return "MODEM_GSM";
            case MODEM_GSM_M_LG: return "MODEM_GSM_M_LG";
            case MODEM_GSM_O_LG: return "MODEM_GSM_O_LG";
            case MODERNE_MESSEINRICHTUNG: return "MODERNE_MESSEINRICHTUNG";
            case MULTIPLEXANLAGE: return "MULTIPLEXANLAGE";
            case OPTIONALE_ZUS_ZAEHLEINRICHTUNG: return "OPTIONALE_ZUS_ZAEHLEINRICHTUNG";
            case PAUSCHALANLAGE: return "PAUSCHALANLAGE";
            case PLC_KOM: return "PLC_KOM";
            case RUNDSTEUEREMPFAENGER: return "RUNDSTEUEREMPFAENGER";
            case RUNDSTEUEREMPFAENGER_IMS_MME: return "RUNDSTEUEREMPFAENGER_IMS_MME";
            case SONSTIGES_GERAET: return "SONSTIGES_GERAET";
            case SPANNUNGSWANDLER: return "SPANNUNGSWANDLER";
            case STEUEREINRICHTUNG: return "STEUEREINRICHTUNG";
            case STROMWANDLER: return "STROMWANDLER";
            case SUMMATIONSGERAET: return "SUMMATIONSGERAET";
            case SYSTEM_MU: return "SYSTEM_MU";
            case TARIFSCHALTGERAET: return "TARIFSCHALTGERAET";
            case TARIFSCHALTGERAET_IMS_MME: return "TARIFSCHALTGERAET_IMS_MME";
            case TELEFONANSCHLUSS: return "TELEFONANSCHLUSS";
            case TELEKOMMUNIKATIONSEINRICHTUNG: return "TELEKOMMUNIKATIONSEINRICHTUNG";
            case TEMPERATUR_KOMPENSATION: return "TEMPERATUR_KOMPENSATION";
            case TEMPERATUR_MU: return "TEMPERATUR_MU";
            case VERSTAERKERANLAGE: return "VERSTAERKERANLAGE";
            case ZUSTANDS_MU: return "ZUSTANDS_MU";
        }
        return null;
    }

    public static Geraetetyp forValue(String value) throws IOException {
        if (value.equals("BLOCKSTROMWANDLER")) return BLOCKSTROMWANDLER;
        if (value.equals("DATENLOGGER")) return DATENLOGGER;
        if (value.equals("DSL_KOM")) return DSL_KOM;
        if (value.equals("EDL_21")) return EDL_21;
        if (value.equals("EDL_40")) return EDL_40;
        if (value.equals("EDL_40_ZAEHLERAUFSATZ")) return EDL_40__ZAEHLERAUFSATZ;
        if (value.equals("ETHERNET_KOM")) return ETHERNET_KOM;
        if (value.equals("HOECHSTBELASTUNGS_ANZEIGER")) return HOECHSTBELASTUNGS_ANZEIGER;
        if (value.equals("IMPULSGEBER")) return IMPULSGEBER;
        if (value.equals("INTELLIGENTES_MESSYSTEM")) return INTELLIGENTES_MESSYSTEM;
        if (value.equals("KOMBIMESSWANDLER")) return KOMBIMESSWANDLER;
        if (value.equals("KOMBIMESSWANDLER_IMS_MME")) return KOMBIMESSWANDLER_IMS_MME;
        if (value.equals("KOMMUNIKATIONSANSCHLUSS")) return KOMMUNIKATIONSANSCHLUSS;
        if (value.equals("KOMPAKT_MU")) return KOMPAKT_MU;
        if (value.equals("LTE_KOM")) return LTE_KOM;
        if (value.equals("MENGENUMWERTER")) return MENGENUMWERTER;
        if (value.equals("MESSWANDLERSATZ_IMS_MME")) return MESSWANDLERSATZ_IMS_MME;
        if (value.equals("MODEM")) return MODEM;
        if (value.equals("MODEM_FESTNETZ")) return MODEM_FESTNETZ;
        if (value.equals("MODEM_FUNK")) return MODEM_FUNK;
        if (value.equals("MODEM_GPRS")) return MODEM_GPRS;
        if (value.equals("MODEM_GPRS_M_LG")) return MODEM_GPRS_M_LG;
        if (value.equals("MODEM_GSM")) return MODEM_GSM;
        if (value.equals("MODEM_GSM_M_LG")) return MODEM_GSM_M_LG;
        if (value.equals("MODEM_GSM_O_LG")) return MODEM_GSM_O_LG;
        if (value.equals("MODERNE_MESSEINRICHTUNG")) return MODERNE_MESSEINRICHTUNG;
        if (value.equals("MULTIPLEXANLAGE")) return MULTIPLEXANLAGE;
        if (value.equals("OPTIONALE_ZUS_ZAEHLEINRICHTUNG")) return OPTIONALE_ZUS_ZAEHLEINRICHTUNG;
        if (value.equals("PAUSCHALANLAGE")) return PAUSCHALANLAGE;
        if (value.equals("PLC_KOM")) return PLC_KOM;
        if (value.equals("RUNDSTEUEREMPFAENGER")) return RUNDSTEUEREMPFAENGER;
        if (value.equals("RUNDSTEUEREMPFAENGER_IMS_MME")) return RUNDSTEUEREMPFAENGER_IMS_MME;
        if (value.equals("SONSTIGES_GERAET")) return SONSTIGES_GERAET;
        if (value.equals("SPANNUNGSWANDLER")) return SPANNUNGSWANDLER;
        if (value.equals("STEUEREINRICHTUNG")) return STEUEREINRICHTUNG;
        if (value.equals("STROMWANDLER")) return STROMWANDLER;
        if (value.equals("SUMMATIONSGERAET")) return SUMMATIONSGERAET;
        if (value.equals("SYSTEM_MU")) return SYSTEM_MU;
        if (value.equals("TARIFSCHALTGERAET")) return TARIFSCHALTGERAET;
        if (value.equals("TARIFSCHALTGERAET_IMS_MME")) return TARIFSCHALTGERAET_IMS_MME;
        if (value.equals("TELEFONANSCHLUSS")) return TELEFONANSCHLUSS;
        if (value.equals("TELEKOMMUNIKATIONSEINRICHTUNG")) return TELEKOMMUNIKATIONSEINRICHTUNG;
        if (value.equals("TEMPERATUR_KOMPENSATION")) return TEMPERATUR_KOMPENSATION;
        if (value.equals("TEMPERATUR_MU")) return TEMPERATUR_MU;
        if (value.equals("VERSTAERKERANLAGE")) return VERSTAERKERANLAGE;
        if (value.equals("ZUSTANDS_MU")) return ZUSTANDS_MU;
        throw new IOException("Cannot deserialize Geraetetyp");
    }
}
