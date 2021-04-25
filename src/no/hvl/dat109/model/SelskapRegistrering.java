package no.hvl.dat109.model;

//registrerer selskap
public class SelskapRegistrering {

    private String navn;
    private int telefonnummer;
    private String firmaAdresse;


    public SelskapRegistrering(String navn, int telefonnummer, String firmaAdresse) {
        this.navn = navn;
        this.telefonnummer = telefonnummer;
        this.firmaAdresse = firmaAdresse;
    }


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getFirmaAdresse() {
        return firmaAdresse;
    }

    public void setFirmaAdresse(String firmaAdresse) {
        this.firmaAdresse = firmaAdresse;
    }


    @Override
    public String toString() {
        return "SelskapRegistrering{" +
                "navn='" + navn + '\'' +
                ", telefonnummer=" + telefonnummer +
                ", firmaAdresse='" + firmaAdresse + '\'' +
                '}';
    }
}
