package no.hvl.dat109.controller;

import no.hvl.dat109.model.BåtInfo;
import no.hvl.dat109.model.KundeProfil;

public class Main {

    public static void main(String[] args) {

        BåtInfo båtInfo = new BåtInfo(10, 5, "Ibiza",
                                    "Yamaha", "Diesel");
        System.out.println("Båt Type: " + båtInfo.getBåtType());
        System.out.println("Storrelse: " + båtInfo.getStorrelse());
        System.out.println("Motor Type: " + båtInfo.getMotorType());
        System.out.println("Fremdrift Type: " + båtInfo.getFremdriftType());
        System.out.println("Antall Plasser: " + båtInfo.getAntallPlasser());

        System.out.println();

        KundeProfil kundeProfil = new KundeProfil("Nord Mann", "nordvegen",
                                                "nordmann@nord.no", 12345678, 1111222);

        System.out.println("Navn: " + kundeProfil.getNavn());
        System.out.println("Adresse: " + kundeProfil.getAdresse());
        System.out.println("Epost: " + kundeProfil.getEpost());
        System.out.println("Kredittkort: " + kundeProfil.getKredittkort());
        System.out.println("Telefonnummer: " + kundeProfil.getTelefonnummer());
    }
}
