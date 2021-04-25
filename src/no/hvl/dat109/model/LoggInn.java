package no.hvl.dat109.model;


public class LoggInn {
    private String brukernavn;
    private String passord;



    public LoggInn(String brukernavn, String passord) {
        super();
        this.brukernavn = brukernavn;
        this.passord = passord;
    }


    public String getBrukernavn() {
        return brukernavn;
    }

    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }


    @Override
    public String toString() {
        return "loggInn{" +
                "brukernavn='" + brukernavn + '\'' +
                ", passord='" + passord + '\'' +
                '}';
    }
}

