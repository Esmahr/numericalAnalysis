package CH1;
public class ex_1_1 {
    /* Kütlesi 68.1 kg olan bir paraşütçü duran bir hava balonundan atlamaktadır. V(t)=(g*m/c)(1-e^(1(c/m)*t)) eşitliğini kullanarak,
    paraşütçünün paraşütünü açmadan önceki hızını hesaplayın.(Direnç katsayısını 12.5kg/s alın)
     */
    public static void main(String[] args) {

        double kutle = 68.1;
        double yercekimi = 9.8;
        double direnc = 12.5;
        final double eSayisi = 2.718281;
        hesap(kutle, yercekimi, direnc, eSayisi);
    }

    public static void hesap(double kutle, double yercekimi, double direnc, double eSayisi) {

        System.out.printf("%-5s  %s%n", "t", "V(t)");
        System.out.printf("%-5s  %s%n", "---", "-----");

        for (int t = 0; t < 100; t += 2) {
            double hesap = (yercekimi * kutle / direnc) * (1 - Math.pow(eSayisi, (-(direnc / kutle) * t)));
            System.out.printf("%-5s %1.6f %n", t, hesap);
            if (hesap > 50) {
                break;
            }
        }
    }
}
