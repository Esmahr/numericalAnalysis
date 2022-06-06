package CH6;

public class ex_6_1 {
    public static void main(String[] args) {
        /* basit sabit noktalı iterasyon kullanarak  f(x) = e^-x - x fonk. köklerinin yerini bul.*/
        double ilkTahmin = 0;
        double yaklasikBagilHata = 100.0;
        double duzenlenmisDenk = 0;

        String sablon = "%5s %20s %25s %n";
        System.out.printf(sablon, "iterasyon", "xi", "    yaklasik bagil yuzde hata");
        System.out.printf(sablon, "---------", "--", "    ------------------------");

        for (int i = 1; i <= 10; i++) {
            String sablon2 = "%5s %25s %25s %n";

            double temp = duzenlenmisDenk;
            duzenlenmisDenk = Math.pow(2.718281, -ilkTahmin);

            System.out.printf(sablon2, i, duzenlenmisDenk, yaklasikBagilHata);

            ilkTahmin = duzenlenmisDenk;

            if (i > 1) {
                yaklasikBagilHata = Math.abs((duzenlenmisDenk - temp) / duzenlenmisDenk * 100);
            }
        }

    }
}
