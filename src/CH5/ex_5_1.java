package CH5;

public class ex_5_1 {
    /*68.1 kg parasütcünün, t = 10s serbest düstükten sonra 40m/s hıza sahip olabilmesi için
   gerekli direnç katsayısını belirlemek için grafik yaklaşım kullanın. Yerçekimi ivmesi = 9.8*/
    public static void main(String[] args) {
        int t = 10;
        double m = 68.1;
        int v = 40;
        final double yercekimiIvmesi = 9.8;

        System.out.printf("%-5s  %s%n", "c", "f(c)");
        System.out.printf("%-5s  %s%n", "---", "-----");
        for (int c = 4; c <= 16; c++) {
            double fC = (yercekimiIvmesi*m/c)*(1-Math.pow(2.718281,(-c/m)*10))-40;
            System.out.printf("%-5s %1.6f %n", c, fC);
        }
    }
}
