package CH6;

public class ex_6_6 {
    /* Sekant yöntemi kullanarak f(X)= e^-x - x fonksiyonunun köklerini x-1=0 ve x0=1.0 ilk tahminini yaparak bulun*/
    public static void main(String[] args) {

        double xEski = 0;
        double xSimdi = 1.0;
        double xYeni = 0;
        double e = 2.718281;
        double gercekBagilHata = 100.0;

        String sablon = "%5s %20s %25s %n";
        System.out.printf(sablon, "iterasyon", "x yeni", "    gercek bagil yuzde hata");
        System.out.printf(sablon, "---------", "-------", "    ------------------------");

        for (int i = 1; i < 4; i++) {
            String sablon2 = "%5s %25s %25s %n";
            double temp = xYeni;
           double denk1 = (Math.pow(e, -xEski)) - xEski;
           double denk2 = (Math.pow(e, -xSimdi)) - xSimdi;

           xYeni= xSimdi-(((denk2)*(xEski-xSimdi))/(denk1-denk2));

            gercekBagilHata = Math.abs((0.567143 - xYeni) / 0.567143 * 100);

            System.out.printf(sablon2, i, xYeni, gercekBagilHata);

            xEski = xSimdi;
            xSimdi = xYeni;

        }


    }
}
