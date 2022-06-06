package CH6;

public class ex_6_5 {
    public static void main(String[] args) {
        /* Newton Raphson yöntemi kullanarak f(X)= x^10 - 1 fonksiyonunun köklerini x0=0.5 ilk tahminini yaparak bulun*/

        double x0 = 0.5;
        double denk;
        double turevliDenk;
        double xr = 0;
        double e = 2.718281;

        String sablon = "%5s %20s %n";
        System.out.printf(sablon, "iterasyon", "xi");
        System.out.printf(sablon, "---------", "--");

        for (int i = 0; i <= 5; i++) {
            String sablon2 = "%5s %25s %n";

            denk = (Math.pow(x0, 10)) - 1;

            turevliDenk = 10*(Math.pow(x0, 9));

            double temp = xr;
            xr = x0 - (denk / turevliDenk);

            System.out.printf(sablon2, i, x0);
            x0 = xr;
        }

    }
}