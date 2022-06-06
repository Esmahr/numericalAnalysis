package CH9;

public class ex_9_6 {
    public static void main(String[] args) {
        float[] denk1 = {1, 2};
        float[] denk2 = {1.1f, 2};
        float[] sonuc = {10, 10.4f};

        double x1 = ((denk2[1] * sonuc[0]) - (denk2[1] * sonuc[1])) / ((denk1[0] * denk2[1]) - (denk1[1] * denk2[0]));
        double x2 = ((denk1[0] * sonuc[1]) - (denk2[0] * sonuc[0])) / ((denk1[0] * denk2[1]) - (denk1[1] * denk2[0]));
        System.out.print("x1: ");
        System.out.printf("%.1f", x1);
        System.out.println();
        System.out.print("x2: ");
        System.out.printf("%.1f", x2);

    }
}
