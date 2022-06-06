package CH5;

public class ex_5_3 {
    /* ex_5_1
    68.1 kg parasütcünün, t = 10s serbest düstükten sonra 40m/s hıza sahip olabilmesi için
   gerekli direnç katsayısını belirlemek için grafik yaklaşım kullanın. Yerçekimi ivmesi = 9.8
   sorusunda fonksiyonun 12 ile 16 arasında işaret değiştirdiği görülmektedir. Buna göre, ikiye bölme yöntemiyle kökü bulun
     */
    public static void main(String[] args) {

        double xa = 12;
        double xu = 16;
        double xr = 0;
        double gercekDeger = 14.7802;
        double gercekBagılHata;
        double yaklasikBagilHata = 0;
        double durdurma = 0.5;

        String sablon = "%5s %10s %10s %10s %15s %20s %n";
        System.out.printf(sablon, "iterasyon", "xa", "xu", "xr", "    gerçek bagil yuzde hata", "     yaklasil bagil yuzde hata");
        System.out.printf(sablon, "---------", "--", "--", "--", "    ------------------------", "    --------------------------");

        for (int i = 1; i < 10; i++) {
            String sablon2 = "%5s %15s %10s %10s %25s %25s %n";

            double fC = Math.sin(10 * xa) + Math.cos(3 * xa);
            double temp = xr;
            xr = (xa + xu) / 2;
            gercekBagılHata = Math.abs((gercekDeger - xr) / gercekDeger * 100);

            if (i > 1) {
                yaklasikBagilHata = Math.abs((xr - temp) / xr * 100);
            }
            System.out.printf(sablon2, i, xa, xu, xr, yaklasikBagilHata, gercekBagılHata);

            double fC2 = Math.sin(10 * xr) + Math.cos(3 * xr);

            if (fC * fC2 < 0) {
                xu = xr;
            }
            if (fC * fC2 > 0) {
                xa = xr;
            }
            if (fC - fC2 == 0) {
                System.out.println("Kök: " + xr);
                break;
            }
            if (gercekBagılHata < durdurma)
                break;
        }

    }

}

