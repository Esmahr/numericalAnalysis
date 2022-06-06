package CH7;

public class ex_7_2 {
    public static void main(String[] args) {
        double x1 = 4.5;
        double x2 = 5.5;
        double x3 = 5;

        String sablon = "%5s %20s %25s %n";
        System.out.printf(sablon, "iterasyon", "xr", "    gercek bagil yuzde hata");
        System.out.printf(sablon, "---------", "--", "    ------------------------");

        for (int i = 0; i < 5; i++) {
            String sablon2 = "%5s %25s %25s %n";
            double denk1 = Math.pow(x1, 3) - (13 * x1) - 12;
            double denk2 = Math.pow(x2, 3) - (13 * x2) - 12;
            double denk3 = Math.pow(x3, 3) - (13 * x3) - 12;

            double h0 = x2 - x1;
            double h1 = x3 - x2;

            double s0 = ((denk2 - denk1) / (x2 - x1));
            double s1 = ((denk3 - denk2) / (x3 - x2));

            double a = ((s1 - s0) / (h1 + h0));
            double b = (a * h1) + s1;
            double c = denk3;

            double yeniKok = x3 + ((-2 * c) / (b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))));
            double gercekYuzdeBagılHata = Math.abs((yeniKok - x3) / yeniKok) * 100;

            System.out.printf(sablon2, i, yeniKok, gercekYuzdeBagılHata);

            x1 = x2;
            x2 = x3;
            x3 = yeniKok;
        }

    }
}
