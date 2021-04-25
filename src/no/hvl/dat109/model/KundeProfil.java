package no.hvl.dat109.model;

import java.util.Objects;
import java.util.SplittableRandom;


public class KundeProfil {

    private String navn;
    private String adresse;
    private String epost;
    private int telefonnummer;
    private int kredittkort;


    public KundeProfil(String navn, String adresse, String epost, int telefonnummer, int kredittkort) {
        this.navn = navn;
        this.adresse = adresse;
        this.epost = epost;
        this.telefonnummer = telefonnummer;
        this.kredittkort = kredittkort;
    }


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public int getKredittkort() {
        return kredittkort;
    }

    public void setKredittkort(int kredittkort) {
        this.kredittkort = kredittkort;
    }


    @Override
    public String toString() {
        return "kundeProfil{" +
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnummer=" + telefonnummer +
                ", epost='" + epost + '\'' +
                ", kredittkort=" + kredittkort +
                '}';
    }
}