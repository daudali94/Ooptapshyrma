package peaksoft;

public class Jailoo {
    private String aty;
    private String daregi;
    private String ChabandynAty;
    private At [] attar;
    private Ui [] uilar;
    private Koi [] koilor;

    public Jailoo(){}

    public Jailoo(String aty, String daregi, String chabandynAty, At[] attar, Ui[] uilar, Koi[] koilor) {
        this.aty = aty;
        this.daregi = daregi;
        ChabandynAty = chabandynAty;
        this.attar = attar;
        this.uilar = uilar;
        this.koilor = koilor;
    }

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public String getDaregi() {
        return daregi;
    }

    public void setDaregi(String daregi) {
        this.daregi = daregi;
    }

    public String getChabandynAty() {
        return ChabandynAty;
    }

    public void setChabandynAty(String chabandynAty) {
        ChabandynAty = chabandynAty;
    }

    public At[] getAttar() {
        return attar;
    }

    public void setAttar(At[] attar) {
        this.attar = attar;
    }

    public Ui[] getUilar() {
        return uilar;
    }

    public void setUilar(Ui[] uilar) {
        this.uilar = uilar;
    }

    public Koi[] getKoilor() {
        return koilor;
    }

    public void setKoilor(Koi[] koilor) {
        this.koilor = koilor;
    }
}
