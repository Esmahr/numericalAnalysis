package CH3;

public class prob_3_12 {
    public static void main(String[] args) {

    int i;
    float sum1=0, sum2=0, x1=1, x2=0.00001f;
    double sum3=0, x3=1.0e-5;

        for (int j = 1; j <=100000 ; j++) {
            sum1 += x1;
            sum2 +=x2;
            sum3 += x3;
        }
        System.out.printf("Toplam1 : %f\n" , sum1);
        System.out.printf("Toplam2 : %.6f\n" , sum2);
        System.out.printf("Toplam3 : %.15e\n" , sum3);
}}
