package CH5;

public class ex_5_6 {
    public static void main(String[] args) {
        /* İkiye bölme ve yer değiştirme kullanarak f(x)=x^10 -1 denk. köklerini x=0 ile x=1.3 aralığında belirle*/

        //ikiye bölme
        double xa = 0;
        double xu = 1.3;
        double xr = 0;
        double yaklasikBagilHata = 100.0;

        String sablon = "%5s %20s %25s %25s %15s %n";
        System.out.printf(sablon, "iterasyon", "xa", "xu", "xr", "    gerçek bagil yuzde hata");
        System.out.printf(sablon, "---------", "--", "--", "--", "    ------------------------");

        for (int i = 1; i < 6; i++) {
            String sablon2 = "%5s %25s %25s %25s %25s %n";

            double fC = Math.pow(xa,10)-1;
            double temp = xr;
            xr = (xa + xu) / 2;

            if (i > 1) {
                yaklasikBagilHata = Math.abs((xr - temp) / xr * 100);
            }
            System.out.printf(sablon2, i, xa, xu, xr, yaklasikBagilHata);

            double fC2 = Math.pow(xr,10)-1;

            if (fC * fC2 < 0) {
                xu = xr;
            }
            if (fC * fC2 > 0) {
                xa = xr;
            }
            if (fC * fC2 == 0) {
                break;
            }

        }

    }
}
