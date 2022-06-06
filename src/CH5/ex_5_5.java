package CH5;

public class ex_5_5 {
    /* ex_5_1
    68.1 kg parasütcünün, t = 10s serbest düstükten sonra 40m/s hıza sahip olabilmesi için
   gerekli direnç katsayısını belirlemek için grafik yaklaşım kullanın. Yerçekimi ivmesi = 9.8
   sorusunda fonksiyonun 12 ile 16 arasında işaret değiştirdiği görülmektedir. Buna göre, yer değiştirme yöntemiyle kökü bulun
     */
    public static void main(String[] args) {
        double xa = 12;
        double xu = 16;
        double xr = 0;
        double gercekDeger = 14.7802;
        double gercekBagılHata;
        double yaklasikBagilHata = 0;
        double durdurma = 0.5;
        double m = 68.1;
        final double yercekimiIvmesi = 9.8;


        for (int i = 1; i < 10; i++) {

            double fC = (yercekimiIvmesi * m / xa) * (1 - Math.pow(2.718281, (-xa / m) * 10)) - 40;
            double fC1 = (yercekimiIvmesi * m / xu) * (1 - Math.pow(2.718281, (-xu / m) * 10)) - 40;
            double temp = xr;
            xr = xu - ((fC1 * (xa - xu)) / (fC - fC1));
            gercekBagılHata = Math.abs((gercekDeger - xr) / gercekDeger * 100);

            if (i > 1) {
                yaklasikBagilHata = Math.abs((xr - temp) / xr * 100);
            }
            System.out.println("\n" + i + ". iterasyon " + "\n" +
                    "xa= " + xa + "\n" +
                    "xu= " + xu + "\n" +
                    "xr= " + xr + "\n" +
                    "gerçek bagil yuzde hata= " + gercekBagılHata + "\n" +
                    "yaklasil bagil yuzde hata= " + yaklasikBagilHata);

            double fC2 = (yercekimiIvmesi * m / xr) * (1 - Math.pow(2.718281, (-xr / m) * 10)) - 40;

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
