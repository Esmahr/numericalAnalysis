package CH3;

public class ex_3_8 {
    public static void main(String[] args) {
        double term = 1, test = 0, sum = 1, x = 10;

        System.out.printf("%-5s  %s%30s%n", "i", "term", "sum");

        if (sum != test) {
            for (int i = 1; i < 31; i++) {
                System.out.printf("%-5s %1.6f %30s %n", i, term, sum);
               /* i++;*/
                term *= (x / i);
                test = sum;
                sum += term;
            }
            System.out.println("Kesin değer: " + sum);
        }

    }

}

