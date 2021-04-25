package no.hvl.dat109.model;

import no.hvl.dat109.view.GPSLokasjon;


public class BåtplassRegistrering {
    private String navn;
    private String adresse;
    private int antallLedige;
    private GPSLokasjon gpsLokasjon;


    public BåtplassRegistrering(String navn, String adresse, int antallLedigeBåtplasser) {
        this.navn = navn;
        this.adresse = adresse;
        antallLedige = 0;
        gpsLokasjon = null;
    }


    public String getNavn() { return navn; }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAntallLedige() {
        return antallLedige;
    }

    public void setAntallLedige(int antallLedige) { this.antallLedige = antallLedige; }


    @Override
    public String toString() {
        return "BåtplassRegistrering{" +
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", antallLedige=" + antallLedige +
                ", gpsLokasjon=" + gpsLokasjon +
                '}';
    }
}