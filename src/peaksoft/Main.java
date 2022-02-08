package peaksoft;

public class Main {

    public static void main(String[] args) {
	At at1 = new At("Kylyk", (byte)1, 301.5);
	At at2 = new At("Jorgo", (byte)2, 302.6);
	At at3 = new At("Konor", (byte)3, 303.7);
	At at4 = new At("Tuz Pik", (byte)4, 304.8);
	At at5 = new At("Fanthom", (byte)5, 305.9);
    At[] attar =  {at1, at2, at3, at4, at5};
    At[] attar1 = {at4,at5};

    Ui ui1 = new Ui("Kashka", (byte) 1, 251.1);
    Ui ui2 = new Ui("Ala", (byte) 2, 252.2);
    Ui ui3 = new Ui("Kara", (byte) 3, 253.3);
    Ui ui4 = new Ui("Sary", (byte) 4, 254.4);
    Ui ui5 = new Ui("Ak", (byte) 5, 255.5);

    Ui[] uilar = {ui1, ui2, ui3, ui4, ui5};
    Ui[] uilar1 = {ui4, ui5};

    Koi koi1 = new Koi("Joosh", (byte)1, 15.1);
    Koi koi2 = new Koi("Jindi", (byte)2, 18.1);
    Koi koi3 = new Koi("Semiz", (byte)3, 17.1);
    Koi koi4 = new Koi("Saran", (byte)4, 19.1);
    Koi koi5 = new Koi("Sarah", (byte)5, 14.1);
    Koi koi6 = new Koi("Bala", (byte) 1, 13.6);
    Koi koi7 = new Koi("Koi", (byte) 2, 14.7);
    Koi koi8 = new Koi("Koi1", (byte) 3, 12.8);

    Koi[] koilor = {koi1,koi2,koi3,koi4,koi5,koi6,koi7,koi8};
    Koi[] koilor1 = {koi5,koi6,koi7,koi8};

    Jailoo jailoo = new Jailoo();
    jailoo.setAty("Zardaly");
    jailoo.setDaregi("Batkende");
    jailoo.setChabandynAty("Kylych");

        System.out.println(jailoo.getAty()+" "+jailoo.getDaregi()+" "+ jailoo.getChabandynAty());
        System.out.println("Коровы-----------------");
        for (Ui ui: uilar) {
            System.out.println(ui.getAty() + " " + ui.getJashy() + " " + ui.isSalmagy() + "kg");
        }
        System.out.println("Бараны-----------------");
        for (Koi barany: koilor) {
            System.out.println(barany.getAty() + " " + barany.getJashy() + " " + barany.isSalmagy() + "kg");
        }
        System.out.println("Лошади-----------------");
    for (At at: attar1) {
        System.out.println(at.getAty() + " " + at.getJashy() + " " + at.isSalmagy() + "kg");

    }
    System.out.println("-----------------------");

    Jailoo jailoo1 = new Jailoo();
    jailoo1.setAty("Suusamyr");
    jailoo1.setDaregi("Jalal-Abad");
    jailoo1.setChabandynAty("Ali");

        System.out.println("-----------------------");
        System.out.println(jailoo1.getAty()+" "+jailoo1.getDaregi()+" "+jailoo1.getChabandynAty());
        System.out.println("Коровы-----------------");
        for (Ui korovy: uilar1) {
            System.out.println(korovy.getAty() + " " + korovy.getJashy() + " " + korovy.isSalmagy() + "kg");
        }
        System.out.println("Бараны-----------------");
        for (Koi barany: koilor1) {
            System.out.println(barany.getAty() + " " + barany.getJashy() + " " + barany.isSalmagy() + "kg");
        }
        System.out.println("Лошади-----------------");
        for (At loshadi: attar) {
            System.out.println(loshadi.getAty() + " " + loshadi.getJashy() + " " + loshadi.isSalmagy() + "kg");

        }
        System.out.println("-----------------------");
    }
}
