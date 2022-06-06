package CH6;

public class ex_6_3 {
    public static void main(String[] args) {
        /* Newton Raphson yöntemi kullanarak f(X)= e^-x - x fonksiyonunun köklerini x0=0 ilk tahminini yaparak bulun*/

        double x0 = 0;
        double gercekBagilHata = 100.0;
        double denk;
        double turevliDenk;
        double xr = 0;
        double e = 2.718281;

        String sablon = "%5s %20s %25s %n";
        System.out.printf(sablon, "iterasyon", "xi", "    gercek bagil yuzde hata");
        System.out.printf(sablon, "---------", "--", "    ------------------------");

        for (int i = 0; i <= 4; i++) {
            String sablon2 = "%5s %25s %25s %n";

            denk = (Math.pow(e, -x0)) - x0;

            turevliDenk = -(Math.pow(e, -x0)) - 1;

            double temp = xr;
            xr = x0 - (denk / turevliDenk);

            gercekBagilHata = Math.abs((xr - temp) / xr * 100);

            System.out.printf(sablon2, i, x0, gercekBagilHata);
            x0 = xr;
        }

    }
}

