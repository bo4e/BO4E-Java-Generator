package bo4e.enums;

import java.io.IOException;

/**
 * Über dieses ENUM kann eine thematische Zuordnung, beispielsweise eines Ansprechpartners,
 * vorgenommen werden.
 */
public enum Themengebiet {
    ALLGEMEINER_INFORMATIONSAUSTAUSCH, ALOCAT, ANSPRECHPARTNER_ALLGEMEIN, ANSPRECHPARTNER_BDEW_DVGW, ANSPRECHPARTNER_IT_TECHNIK, AN_UND_ABMELDUNG, APERAK, BILANZIERUNG, BILANZKREISKOORDINATOR, BILANZKREISVERANTWORTLICHER, CONTRL, DATENFORMATE_ZERTIFIKATE_VERSCHLUESSELUNGEN, DEBITORENMANAGEMENT, DEMAND_SIDE_MANAGEMENT, EDIFACT, EDI_VEREINBARUNG, ENERGIEDATENMANAGEMENT, FAHRPLANMANAGEMENT, GABI, GELI, GERAETERUECKGABE, GERAETEWECHSEL, GPKE, INBETRIEBNAHME, INVOIC, KAPAZITAETSMANAGEMENT, KLAERFAELLE, LASTGAENGE_RLM, LIEFERANTENRAHMENVERTRAG, LIEFERANTENWECHSEL, MABIS, MAHNWESEN, MARKTGEBIETSVERANTWORTLICHER, MARKTKOMMUNIKATION, MEHR_MINDERMENGEN, MSB_MDL, MSCONS, NETZABRECHNUNG, NETZENTGELTE, NETZMANAGEMENT, ORDERS, ORDERSP, RECHT, REGULIERUNGSMANAGEMENT, REKLAMATIONEN, REMADV, SPERREN_ENTSPERREN_INKASSO, STAMMDATEN, STOERUNGSFAELLE, TECHNISCHE_FRAGEN, UMSTELLUNG_INVOIC, UTILMD, VERSCHLUESSELUNG_SIGNATUR, VERTRAGSMANAGEMENT, VERTRIEB, WIM, ZAEHLERSTAENDE_SLP, ZAHLUNGSVERKEHR, ZUORDNUNGSVEREINBARUNG;

    public String toValue() {
        switch (this) {
            case ALLGEMEINER_INFORMATIONSAUSTAUSCH: return "ALLGEMEINER_INFORMATIONSAUSTAUSCH";
            case ALOCAT: return "ALOCAT";
            case ANSPRECHPARTNER_ALLGEMEIN: return "ANSPRECHPARTNER_ALLGEMEIN";
            case ANSPRECHPARTNER_BDEW_DVGW: return "ANSPRECHPARTNER_BDEW_DVGW";
            case ANSPRECHPARTNER_IT_TECHNIK: return "ANSPRECHPARTNER_IT_TECHNIK";
            case AN_UND_ABMELDUNG: return "AN_UND_ABMELDUNG";
            case APERAK: return "APERAK";
            case BILANZIERUNG: return "BILANZIERUNG";
            case BILANZKREISKOORDINATOR: return "BILANZKREISKOORDINATOR";
            case BILANZKREISVERANTWORTLICHER: return "BILANZKREISVERANTWORTLICHER";
            case CONTRL: return "CONTRL";
            case DATENFORMATE_ZERTIFIKATE_VERSCHLUESSELUNGEN: return "DATENFORMATE_ZERTIFIKATE_VERSCHLUESSELUNGEN";
            case DEBITORENMANAGEMENT: return "DEBITORENMANAGEMENT";
            case DEMAND_SIDE_MANAGEMENT: return "DEMAND_SIDE_MANAGEMENT";
            case EDIFACT: return "EDIFACT";
            case EDI_VEREINBARUNG: return "EDI_VEREINBARUNG";
            case ENERGIEDATENMANAGEMENT: return "ENERGIEDATENMANAGEMENT";
            case FAHRPLANMANAGEMENT: return "FAHRPLANMANAGEMENT";
            case GABI: return "GABI";
            case GELI: return "GELI";
            case GERAETERUECKGABE: return "GERAETERUECKGABE";
            case GERAETEWECHSEL: return "GERAETEWECHSEL";
            case GPKE: return "GPKE";
            case INBETRIEBNAHME: return "INBETRIEBNAHME";
            case INVOIC: return "INVOIC";
            case KAPAZITAETSMANAGEMENT: return "KAPAZITAETSMANAGEMENT";
            case KLAERFAELLE: return "KLAERFAELLE";
            case LASTGAENGE_RLM: return "LASTGAENGE_RLM";
            case LIEFERANTENRAHMENVERTRAG: return "LIEFERANTENRAHMENVERTRAG";
            case LIEFERANTENWECHSEL: return "LIEFERANTENWECHSEL";
            case MABIS: return "MABIS";
            case MAHNWESEN: return "MAHNWESEN";
            case MARKTGEBIETSVERANTWORTLICHER: return "MARKTGEBIETSVERANTWORTLICHER";
            case MARKTKOMMUNIKATION: return "MARKTKOMMUNIKATION";
            case MEHR_MINDERMENGEN: return "MEHR_MINDERMENGEN";
            case MSB_MDL: return "MSB_MDL";
            case MSCONS: return "MSCONS";
            case NETZABRECHNUNG: return "NETZABRECHNUNG";
            case NETZENTGELTE: return "NETZENTGELTE";
            case NETZMANAGEMENT: return "NETZMANAGEMENT";
            case ORDERS: return "ORDERS";
            case ORDERSP: return "ORDERSP";
            case RECHT: return "RECHT";
            case REGULIERUNGSMANAGEMENT: return "REGULIERUNGSMANAGEMENT";
            case REKLAMATIONEN: return "REKLAMATIONEN";
            case REMADV: return "REMADV";
            case SPERREN_ENTSPERREN_INKASSO: return "SPERREN_ENTSPERREN_INKASSO";
            case STAMMDATEN: return "STAMMDATEN";
            case STOERUNGSFAELLE: return "STOERUNGSFAELLE";
            case TECHNISCHE_FRAGEN: return "TECHNISCHE_FRAGEN";
            case UMSTELLUNG_INVOIC: return "UMSTELLUNG_INVOIC";
            case UTILMD: return "UTILMD";
            case VERSCHLUESSELUNG_SIGNATUR: return "VERSCHLUESSELUNG_SIGNATUR";
            case VERTRAGSMANAGEMENT: return "VERTRAGSMANAGEMENT";
            case VERTRIEB: return "VERTRIEB";
            case WIM: return "WIM";
            case ZAEHLERSTAENDE_SLP: return "ZAEHLERSTAENDE_SLP";
            case ZAHLUNGSVERKEHR: return "ZAHLUNGSVERKEHR";
            case ZUORDNUNGSVEREINBARUNG: return "ZUORDNUNGSVEREINBARUNG";
        }
        return null;
    }

    public static Themengebiet forValue(String value) throws IOException {
        if (value.equals("ALLGEMEINER_INFORMATIONSAUSTAUSCH")) return ALLGEMEINER_INFORMATIONSAUSTAUSCH;
        if (value.equals("ALOCAT")) return ALOCAT;
        if (value.equals("ANSPRECHPARTNER_ALLGEMEIN")) return ANSPRECHPARTNER_ALLGEMEIN;
        if (value.equals("ANSPRECHPARTNER_BDEW_DVGW")) return ANSPRECHPARTNER_BDEW_DVGW;
        if (value.equals("ANSPRECHPARTNER_IT_TECHNIK")) return ANSPRECHPARTNER_IT_TECHNIK;
        if (value.equals("AN_UND_ABMELDUNG")) return AN_UND_ABMELDUNG;
        if (value.equals("APERAK")) return APERAK;
        if (value.equals("BILANZIERUNG")) return BILANZIERUNG;
        if (value.equals("BILANZKREISKOORDINATOR")) return BILANZKREISKOORDINATOR;
        if (value.equals("BILANZKREISVERANTWORTLICHER")) return BILANZKREISVERANTWORTLICHER;
        if (value.equals("CONTRL")) return CONTRL;
        if (value.equals("DATENFORMATE_ZERTIFIKATE_VERSCHLUESSELUNGEN")) return DATENFORMATE_ZERTIFIKATE_VERSCHLUESSELUNGEN;
        if (value.equals("DEBITORENMANAGEMENT")) return DEBITORENMANAGEMENT;
        if (value.equals("DEMAND_SIDE_MANAGEMENT")) return DEMAND_SIDE_MANAGEMENT;
        if (value.equals("EDIFACT")) return EDIFACT;
        if (value.equals("EDI_VEREINBARUNG")) return EDI_VEREINBARUNG;
        if (value.equals("ENERGIEDATENMANAGEMENT")) return ENERGIEDATENMANAGEMENT;
        if (value.equals("FAHRPLANMANAGEMENT")) return FAHRPLANMANAGEMENT;
        if (value.equals("GABI")) return GABI;
        if (value.equals("GELI")) return GELI;
        if (value.equals("GERAETERUECKGABE")) return GERAETERUECKGABE;
        if (value.equals("GERAETEWECHSEL")) return GERAETEWECHSEL;
        if (value.equals("GPKE")) return GPKE;
        if (value.equals("INBETRIEBNAHME")) return INBETRIEBNAHME;
        if (value.equals("INVOIC")) return INVOIC;
        if (value.equals("KAPAZITAETSMANAGEMENT")) return KAPAZITAETSMANAGEMENT;
        if (value.equals("KLAERFAELLE")) return KLAERFAELLE;
        if (value.equals("LASTGAENGE_RLM")) return LASTGAENGE_RLM;
        if (value.equals("LIEFERANTENRAHMENVERTRAG")) return LIEFERANTENRAHMENVERTRAG;
        if (value.equals("LIEFERANTENWECHSEL")) return LIEFERANTENWECHSEL;
        if (value.equals("MABIS")) return MABIS;
        if (value.equals("MAHNWESEN")) return MAHNWESEN;
        if (value.equals("MARKTGEBIETSVERANTWORTLICHER")) return MARKTGEBIETSVERANTWORTLICHER;
        if (value.equals("MARKTKOMMUNIKATION")) return MARKTKOMMUNIKATION;
        if (value.equals("MEHR_MINDERMENGEN")) return MEHR_MINDERMENGEN;
        if (value.equals("MSB_MDL")) return MSB_MDL;
        if (value.equals("MSCONS")) return MSCONS;
        if (value.equals("NETZABRECHNUNG")) return NETZABRECHNUNG;
        if (value.equals("NETZENTGELTE")) return NETZENTGELTE;
        if (value.equals("NETZMANAGEMENT")) return NETZMANAGEMENT;
        if (value.equals("ORDERS")) return ORDERS;
        if (value.equals("ORDERSP")) return ORDERSP;
        if (value.equals("RECHT")) return RECHT;
        if (value.equals("REGULIERUNGSMANAGEMENT")) return REGULIERUNGSMANAGEMENT;
        if (value.equals("REKLAMATIONEN")) return REKLAMATIONEN;
        if (value.equals("REMADV")) return REMADV;
        if (value.equals("SPERREN_ENTSPERREN_INKASSO")) return SPERREN_ENTSPERREN_INKASSO;
        if (value.equals("STAMMDATEN")) return STAMMDATEN;
        if (value.equals("STOERUNGSFAELLE")) return STOERUNGSFAELLE;
        if (value.equals("TECHNISCHE_FRAGEN")) return TECHNISCHE_FRAGEN;
        if (value.equals("UMSTELLUNG_INVOIC")) return UMSTELLUNG_INVOIC;
        if (value.equals("UTILMD")) return UTILMD;
        if (value.equals("VERSCHLUESSELUNG_SIGNATUR")) return VERSCHLUESSELUNG_SIGNATUR;
        if (value.equals("VERTRAGSMANAGEMENT")) return VERTRAGSMANAGEMENT;
        if (value.equals("VERTRIEB")) return VERTRIEB;
        if (value.equals("WIM")) return WIM;
        if (value.equals("ZAEHLERSTAENDE_SLP")) return ZAEHLERSTAENDE_SLP;
        if (value.equals("ZAHLUNGSVERKEHR")) return ZAHLUNGSVERKEHR;
        if (value.equals("ZUORDNUNGSVEREINBARUNG")) return ZUORDNUNGSVEREINBARUNG;
        throw new IOException("Cannot deserialize Themengebiet");
    }
}
