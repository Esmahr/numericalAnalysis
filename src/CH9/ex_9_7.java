package CH9;

public class ex_9_7 {
    public static void main(String[] args) {
        float[] probA1 = {3, 2};
        float[] probA2 = {-1, 2};

        float[] probB1 = {1, 2};
        float[] probB2 = {1.1f, 2};

        float determinant = 0;

        determinant = probA1[0] * probA2[1] - probA2[0] * probA1[1];
        System.out.print("(a) nın determinantı: ");
        System.out.printf("%.1f", determinant);
        System.out.println();

        determinant = probB1[0] * probB2[1] - probB2[0] * probB1[1];
        System.out.print("(b) nın determinantı: ");
        System.out.printf("%.1f", determinant);
        System.out.println();

        determinant = 10 * probB1[0] * 10 * probB2[1] - 10 * probB2[0] * 10 * probB1[1];
        System.out.print("(c) nın determinantı: ");
        System.out.printf("%.1f", determinant);
    }
}
