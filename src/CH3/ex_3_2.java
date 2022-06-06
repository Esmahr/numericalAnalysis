package CH3;

public class ex_3_2 {

    public static void main(String[] args) {
        final double durdurma = 0.05;
        double e = 1;

        for (int i = 1; i < 5; i++) {
            double temp = e;
            System.out.println();
            System.out.println(i + ". iterasyon");
            System.out.println("sonuc: " + e + "\n" + "Gerçek bağıl yüzde hata: " + gercekBagilYuzde(e));

            e += (Math.pow(0.5, i) / (faktoriyel(i)));

            System.out.println("Yaklaşık bagik yüzde hata: " + yaklasikBagilYuzde(e, temp));
        }
    }

    public static double faktoriyel(int n) {
        for (int i = 1; i < n; i++) {
            n *= i;
        }
        return n;
    }

    public static double gercekBagilYuzde(double e) {
        double hesap = (((1.648721 - e) / 1.648721) * 100);
        return hesap;
    }

    public static double yaklasikBagilYuzde(double e, double temp) {
        double hesap1 = Math.abs(((e - temp) / e) * 100);
        return hesap1;
    }
}
