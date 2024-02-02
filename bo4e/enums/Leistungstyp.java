package com.example.bo4e.enums;

import java.io.IOException;

public enum Leistungstyp {
    ABLAV_UMLAGE, ABLESUNG_ZUSAETZLICH, ABRECHNUNG, ABRECHNUNG_ZUSAETZLICH, ARBEITSPREIS_BLINDARBEIT_IND, ARBEITSPREIS_BLINDARBEIT_KAP, ARBEITSPREIS_WIRKARBEIT, AUSLESUNG_ZUSAETZLICH, BILANZIERUNG_UMLAGE, DIENSTLEISTUNG, EEG_UMLAGE, ENERGIESTEUER, ENTSPERRUNG, GRUNDPREIS, GRUNDPREIS_ARBEIT, GRUNDPREIS_LEISTUNG, INKASSOKOSTEN, KONZESSIONS_ABGABE, KWK_UMLAGE, LEISTUNGSPREIS_WIRKLEISTUNG, MAHNKOSTEN, MEHRMINDERMENGE, MESSDIENSTLEISTUNG, MESSDIENSTLEISTUNG_INKL_MESSUNG, MESSPREIS, MESSSTELLENBETRIEB, NETZPREIS, OFFSHORE_UMLAGE, REGELENERGIE_UMLAGE, SONDERKUNDEN_UMLAGE, SONSTIGER_PREIS, SPERRUNG;

    public String toValue() {
        switch (this) {
            case ABLAV_UMLAGE: return "ABLAV_UMLAGE";
            case ABLESUNG_ZUSAETZLICH: return "ABLESUNG_ZUSAETZLICH";
            case ABRECHNUNG: return "ABRECHNUNG";
            case ABRECHNUNG_ZUSAETZLICH: return "ABRECHNUNG_ZUSAETZLICH";
            case ARBEITSPREIS_BLINDARBEIT_IND: return "ARBEITSPREIS_BLINDARBEIT_IND";
            case ARBEITSPREIS_BLINDARBEIT_KAP: return "ARBEITSPREIS_BLINDARBEIT_KAP";
            case ARBEITSPREIS_WIRKARBEIT: return "ARBEITSPREIS_WIRKARBEIT";
            case AUSLESUNG_ZUSAETZLICH: return "AUSLESUNG_ZUSAETZLICH";
            case BILANZIERUNG_UMLAGE: return "BILANZIERUNG_UMLAGE";
            case DIENSTLEISTUNG: return "DIENSTLEISTUNG";
            case EEG_UMLAGE: return "EEG_UMLAGE";
            case ENERGIESTEUER: return "ENERGIESTEUER";
            case ENTSPERRUNG: return "ENTSPERRUNG";
            case GRUNDPREIS: return "GRUNDPREIS";
            case GRUNDPREIS_ARBEIT: return "GRUNDPREIS_ARBEIT";
            case GRUNDPREIS_LEISTUNG: return "GRUNDPREIS_LEISTUNG";
            case INKASSOKOSTEN: return "INKASSOKOSTEN";
            case KONZESSIONS_ABGABE: return "KONZESSIONS_ABGABE";
            case KWK_UMLAGE: return "KWK_UMLAGE";
            case LEISTUNGSPREIS_WIRKLEISTUNG: return "LEISTUNGSPREIS_WIRKLEISTUNG";
            case MAHNKOSTEN: return "MAHNKOSTEN";
            case MEHRMINDERMENGE: return "MEHRMINDERMENGE";
            case MESSDIENSTLEISTUNG: return "MESSDIENSTLEISTUNG";
            case MESSDIENSTLEISTUNG_INKL_MESSUNG: return "MESSDIENSTLEISTUNG_INKL_MESSUNG";
            case MESSPREIS: return "MESSPREIS";
            case MESSSTELLENBETRIEB: return "MESSSTELLENBETRIEB";
            case NETZPREIS: return "NETZPREIS";
            case OFFSHORE_UMLAGE: return "OFFSHORE_UMLAGE";
            case REGELENERGIE_UMLAGE: return "REGELENERGIE_UMLAGE";
            case SONDERKUNDEN_UMLAGE: return "SONDERKUNDEN_UMLAGE";
            case SONSTIGER_PREIS: return "SONSTIGER_PREIS";
            case SPERRUNG: return "SPERRUNG";
        }
        return null;
    }

    public static Leistungstyp forValue(String value) throws IOException {
        if (value.equals("ABLAV_UMLAGE")) return ABLAV_UMLAGE;
        if (value.equals("ABLESUNG_ZUSAETZLICH")) return ABLESUNG_ZUSAETZLICH;
        if (value.equals("ABRECHNUNG")) return ABRECHNUNG;
        if (value.equals("ABRECHNUNG_ZUSAETZLICH")) return ABRECHNUNG_ZUSAETZLICH;
        if (value.equals("ARBEITSPREIS_BLINDARBEIT_IND")) return ARBEITSPREIS_BLINDARBEIT_IND;
        if (value.equals("ARBEITSPREIS_BLINDARBEIT_KAP")) return ARBEITSPREIS_BLINDARBEIT_KAP;
        if (value.equals("ARBEITSPREIS_WIRKARBEIT")) return ARBEITSPREIS_WIRKARBEIT;
        if (value.equals("AUSLESUNG_ZUSAETZLICH")) return AUSLESUNG_ZUSAETZLICH;
        if (value.equals("BILANZIERUNG_UMLAGE")) return BILANZIERUNG_UMLAGE;
        if (value.equals("DIENSTLEISTUNG")) return DIENSTLEISTUNG;
        if (value.equals("EEG_UMLAGE")) return EEG_UMLAGE;
        if (value.equals("ENERGIESTEUER")) return ENERGIESTEUER;
        if (value.equals("ENTSPERRUNG")) return ENTSPERRUNG;
        if (value.equals("GRUNDPREIS")) return GRUNDPREIS;
        if (value.equals("GRUNDPREIS_ARBEIT")) return GRUNDPREIS_ARBEIT;
        if (value.equals("GRUNDPREIS_LEISTUNG")) return GRUNDPREIS_LEISTUNG;
        if (value.equals("INKASSOKOSTEN")) return INKASSOKOSTEN;
        if (value.equals("KONZESSIONS_ABGABE")) return KONZESSIONS_ABGABE;
        if (value.equals("KWK_UMLAGE")) return KWK_UMLAGE;
        if (value.equals("LEISTUNGSPREIS_WIRKLEISTUNG")) return LEISTUNGSPREIS_WIRKLEISTUNG;
        if (value.equals("MAHNKOSTEN")) return MAHNKOSTEN;
        if (value.equals("MEHRMINDERMENGE")) return MEHRMINDERMENGE;
        if (value.equals("MESSDIENSTLEISTUNG")) return MESSDIENSTLEISTUNG;
        if (value.equals("MESSDIENSTLEISTUNG_INKL_MESSUNG")) return MESSDIENSTLEISTUNG_INKL_MESSUNG;
        if (value.equals("MESSPREIS")) return MESSPREIS;
        if (value.equals("MESSSTELLENBETRIEB")) return MESSSTELLENBETRIEB;
        if (value.equals("NETZPREIS")) return NETZPREIS;
        if (value.equals("OFFSHORE_UMLAGE")) return OFFSHORE_UMLAGE;
        if (value.equals("REGELENERGIE_UMLAGE")) return REGELENERGIE_UMLAGE;
        if (value.equals("SONDERKUNDEN_UMLAGE")) return SONDERKUNDEN_UMLAGE;
        if (value.equals("SONSTIGER_PREIS")) return SONSTIGER_PREIS;
        if (value.equals("SPERRUNG")) return SPERRUNG;
        throw new IOException("Cannot deserialize Leistungstyp");
    }
}
