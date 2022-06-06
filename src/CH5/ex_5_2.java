package CH5;

public class ex_5_2 {
    /* f(x) = sin10x + cos3x fonksiyonunun x = 0 ile x = 5 arasında birçok kökü vardır.*/
    public static void main(String[] args) {

        System.out.printf("%-5s  %s%n", "c", "f(c)");
        System.out.printf("%-5s  %s%n", "---", "-----");

        for (double x = 0; x <= 5; x++) {
            double fC = Math.sin(10*x)+Math.cos(3*x);
            System.out.printf("%-5s %1.6f %n", x, fC);
        }
    }
}
