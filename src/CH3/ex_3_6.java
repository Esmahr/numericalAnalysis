package CH3;

public class ex_3_6 {
    public static void main(String[] args) {
        int i;
        double sum1 = 0, sum2 = 0, sum3 = 0;
        double x1 = 1, x2 = Math.pow(10,(-5)),x3 = Math.pow(10,(-5));

        for (int j = 0; j < 100000; j++) {
            sum1 += x1;
            sum2 += x2;
            sum3 += x3;
        }
        System.out.println("sum1: "+sum1);
        System.out.println("sum2: "+sum2);
        System.out.println("sum3: "+sum3);
    }
}
