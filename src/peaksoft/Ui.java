package peaksoft;

public class Ui {
    private String aty;
    private byte jashy;
    private double salmagy;

    public Ui() {}

    public Ui(String aty, byte jashy, double salmagy) {
        this.aty = aty;
        this.jashy = jashy;
        this.salmagy = salmagy;
    }

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public byte getJashy() {
        return jashy;
    }

    public void setJashy(byte jashy) {
        this.jashy = jashy;
    }

    public double isSalmagy() {
        return salmagy;
    }

    public void setSalmagy(double salmagy) {
        this.salmagy = salmagy;
    }
}
