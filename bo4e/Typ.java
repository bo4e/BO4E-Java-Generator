package placeholder;

import java.io.IOException;

/**
 * Auflistung sämtlicher existierender Geschäftsobjekte.
 */
public enum Typ {
    ANGEBOT, AUSSCHREIBUNG, BUENDELVERTRAG, ENERGIEMENGE, FREMDKOSTEN, GERAET, GESCHAEFTSOBJEKT, GESCHAEFTSPARTNER, KOSTEN, LASTGANG, MARKTLOKATION, MARKTTEILNEHMER, MESSLOKATION, NETZNUTZUNGSRECHNUNG, PERSON, PREISBLATT, PREISBLATTDIENSTLEISTUNG, PREISBLATTHARDWARE, PREISBLATTKONZESSIONSABGABE, PREISBLATTMESSUNG, PREISBLATTNETZNUTZUNG, PREISBLATTUMLAGEN, RECHNUNG, REGION, REGIONALTARIF, STANDORTEIGENSCHAFTEN, TARIF, TARIFINFO, TARIFKOSTEN, TARIFPREISBLATT, VERTRAG, ZAEHLER, ZEITREIHE;

    public String toValue() {
        switch (this) {
            case ANGEBOT: return "ANGEBOT";
            case AUSSCHREIBUNG: return "AUSSCHREIBUNG";
            case BUENDELVERTRAG: return "BUENDELVERTRAG";
            case ENERGIEMENGE: return "ENERGIEMENGE";
            case FREMDKOSTEN: return "FREMDKOSTEN";
            case GERAET: return "GERAET";
            case GESCHAEFTSOBJEKT: return "GESCHAEFTSOBJEKT";
            case GESCHAEFTSPARTNER: return "GESCHAEFTSPARTNER";
            case KOSTEN: return "KOSTEN";
            case LASTGANG: return "LASTGANG";
            case MARKTLOKATION: return "MARKTLOKATION";
            case MARKTTEILNEHMER: return "MARKTTEILNEHMER";
            case MESSLOKATION: return "MESSLOKATION";
            case NETZNUTZUNGSRECHNUNG: return "NETZNUTZUNGSRECHNUNG";
            case PERSON: return "PERSON";
            case PREISBLATT: return "PREISBLATT";
            case PREISBLATTDIENSTLEISTUNG: return "PREISBLATTDIENSTLEISTUNG";
            case PREISBLATTHARDWARE: return "PREISBLATTHARDWARE";
            case PREISBLATTKONZESSIONSABGABE: return "PREISBLATTKONZESSIONSABGABE";
            case PREISBLATTMESSUNG: return "PREISBLATTMESSUNG";
            case PREISBLATTNETZNUTZUNG: return "PREISBLATTNETZNUTZUNG";
            case PREISBLATTUMLAGEN: return "PREISBLATTUMLAGEN";
            case RECHNUNG: return "RECHNUNG";
            case REGION: return "REGION";
            case REGIONALTARIF: return "REGIONALTARIF";
            case STANDORTEIGENSCHAFTEN: return "STANDORTEIGENSCHAFTEN";
            case TARIF: return "TARIF";
            case TARIFINFO: return "TARIFINFO";
            case TARIFKOSTEN: return "TARIFKOSTEN";
            case TARIFPREISBLATT: return "TARIFPREISBLATT";
            case VERTRAG: return "VERTRAG";
            case ZAEHLER: return "ZAEHLER";
            case ZEITREIHE: return "ZEITREIHE";
        }
        return null;
    }

    public static Typ forValue(String value) throws IOException {
        if (value.equals("ANGEBOT")) return ANGEBOT;
        if (value.equals("AUSSCHREIBUNG")) return AUSSCHREIBUNG;
        if (value.equals("BUENDELVERTRAG")) return BUENDELVERTRAG;
        if (value.equals("ENERGIEMENGE")) return ENERGIEMENGE;
        if (value.equals("FREMDKOSTEN")) return FREMDKOSTEN;
        if (value.equals("GERAET")) return GERAET;
        if (value.equals("GESCHAEFTSOBJEKT")) return GESCHAEFTSOBJEKT;
        if (value.equals("GESCHAEFTSPARTNER")) return GESCHAEFTSPARTNER;
        if (value.equals("KOSTEN")) return KOSTEN;
        if (value.equals("LASTGANG")) return LASTGANG;
        if (value.equals("MARKTLOKATION")) return MARKTLOKATION;
        if (value.equals("MARKTTEILNEHMER")) return MARKTTEILNEHMER;
        if (value.equals("MESSLOKATION")) return MESSLOKATION;
        if (value.equals("NETZNUTZUNGSRECHNUNG")) return NETZNUTZUNGSRECHNUNG;
        if (value.equals("PERSON")) return PERSON;
        if (value.equals("PREISBLATT")) return PREISBLATT;
        if (value.equals("PREISBLATTDIENSTLEISTUNG")) return PREISBLATTDIENSTLEISTUNG;
        if (value.equals("PREISBLATTHARDWARE")) return PREISBLATTHARDWARE;
        if (value.equals("PREISBLATTKONZESSIONSABGABE")) return PREISBLATTKONZESSIONSABGABE;
        if (value.equals("PREISBLATTMESSUNG")) return PREISBLATTMESSUNG;
        if (value.equals("PREISBLATTNETZNUTZUNG")) return PREISBLATTNETZNUTZUNG;
        if (value.equals("PREISBLATTUMLAGEN")) return PREISBLATTUMLAGEN;
        if (value.equals("RECHNUNG")) return RECHNUNG;
        if (value.equals("REGION")) return REGION;
        if (value.equals("REGIONALTARIF")) return REGIONALTARIF;
        if (value.equals("STANDORTEIGENSCHAFTEN")) return STANDORTEIGENSCHAFTEN;
        if (value.equals("TARIF")) return TARIF;
        if (value.equals("TARIFINFO")) return TARIFINFO;
        if (value.equals("TARIFKOSTEN")) return TARIFKOSTEN;
        if (value.equals("TARIFPREISBLATT")) return TARIFPREISBLATT;
        if (value.equals("VERTRAG")) return VERTRAG;
        if (value.equals("ZAEHLER")) return ZAEHLER;
        if (value.equals("ZEITREIHE")) return ZEITREIHE;
        throw new IOException("Cannot deserialize Typ");
    }
}
