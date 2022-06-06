package CH1;

public class ex_1_2 {
    /* Kütlesi 68.1 kg olan bir paraşütçü duran bir hava balonundan atlamaktadır. V(ti+1)=V(i)+[g-(c/m)*V(ti)](h) eşitliğini kullanarak,
    paraşütçünün paraşütünü açmadan önceki hızını hesaplayın.
    (Adım buyutunu 2s alın)
    (Direnç katsayısını 12.5kg/s alın)
    (h=(ti+1)-(ti))
     */
    public static void main(String[] args) {

        int adimBoyutu = 2;
        double kutle = 68.1;
        double yercekimi = 9.8;
        double direnc = 12.5;
        hesap(kutle,yercekimi,direnc,adimBoyutu);
    }

    public static void hesap(double kutle, double yercekimi, double direnc, int adimBoyutu) {

        System.out.printf("%-5s  %s%n", "t", "V(t)");
        System.out.printf("%-5s  %s%n", "---", "-----");
        double hız = 0;

        for (int t = 2; t < 100; t += 2) {
            double hesap = hız+(yercekimi-(direnc/kutle)*hız)*(adimBoyutu);
            System.out.printf("%-5s %1.6f %n", t, hesap);
            hız = hesap;
            if (hesap > 50) {
                break;
            }
        }
    }
}
