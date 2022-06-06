package CH9;

public class ex_9_8 {
    public static void main(String[] args) {
        float[] probA1 = {1, 0.0667f};
        float[] probA2 = {-0.5f, 1};

        float[] probB1 = {0.5f, 1};
        float[] probB2 = {0.55f, 1};

        float determinant = 0;

        determinant = probA1[0] * probA2[1] - probA2[0] * probA1[1];
        System.out.print("(a) nın determinantı: ");
        System.out.printf("%.2f", determinant);
        System.out.println();

        determinant = probB1[0] * probB2[1] - probB2[0] * probB1[1];
        System.out.print("(b) nın determinantı: ");
        System.out.printf("%.2f", determinant);
        System.out.println();
    }
}
