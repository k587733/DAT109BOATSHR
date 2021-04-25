package no.hvl.dat109.model;


public class BåtInfo {
    private int storrelse;
    private int antallPlasser;
    private String båtType;
    private String motorType;
    private String fremdriftType;


    public BåtInfo(int storrelse, int antallPlasser, String båtType, String motorType, String fremdriftType) {
        this.storrelse = storrelse;
        this.antallPlasser = antallPlasser;
        this.båtType = båtType;
        this.motorType = motorType;
        this.fremdriftType = fremdriftType;
    }

    public BåtInfo() {

    }


    public int getStorrelse() {
        return storrelse;
    }

    public void setStorrelse(int storrelse) {
        this.storrelse = storrelse;
    }

    public int getAntallPlasser() {
        return antallPlasser;
    }

    public void setAntallPlasser(int antallPlasser) {
        this.antallPlasser = antallPlasser;
    }

    public String getBåtType() {
        return båtType;
    }

    public void setBåtType(String båtType) {
        this.båtType = båtType;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getFremdriftType() {
        return fremdriftType;
    }

    public void setFremdriftType(String fremdriftType) {
        this.fremdriftType = fremdriftType;
    }


    @Override
    public String toString() {
        return "BåtInfo{" +
                "storrelse=" + storrelse +
                ", antallPlasser=" + antallPlasser +
                ", båtType='" + båtType + '\'' +
                ", motorType='" + motorType + '\'' +
                ", fremdriftType='" + fremdriftType + '\'' +
                '}';
    }
}
