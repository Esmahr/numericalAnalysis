package CH9;

public class ex_9_5 {
    public static void main(String[] args) {

        float[][] matrisA = {{3f, -0.1f, -0.2f}, {0.1f, 7f, -0.3f}, {0.3f, -0.2f, 10f}};
        float[] matrisB = {7.85f, -19.3f, 71.4f};
        float[][] matrisAtemp = new float[3][3];
        float[] matrisBtemp = new float[3];
        System.out.println("A MATRIS");
        yazdırmaA(matrisA);
        System.out.println("\n" + "B MATRIS");
        yazdırmaB(matrisB);
        psedoCodeHessap(matrisA, matrisB, matrisAtemp, matrisBtemp);

    }

    private static void psedoCodeHessap(float[][] matrisA, float[] matrisB, float[][] matrisAtemp, float[] matrisBtemp) {
        for (int k = 0; k < matrisA.length - 1; k++) {
            for (int i = k + 1; i < matrisA.length; i++) {
                float carpan = matrisA[i][k] / matrisA[k][k];
                for (int j = k + 1; j < matrisA.length; j++) {
                    matrisAtemp[i][j] = matrisA[i][j] - carpan * matrisA[k][j];
                }
                matrisB[i] = matrisB[i] - carpan * matrisB[k];
            }
        }
        System.out.println("--A MATRIS--");
        yazdırma(matrisAtemp, matrisA.length, matrisA[0].length);
        System.out.println( );
        System.out.println("--B MATRIS--");
        yazdırmaB(matrisB);


    }

    private static void yazdırmaA(float[][] matrisA) {
        for (int i = 0; i < matrisA.length; i++) {
            System.out.format("%10s %20s  %20s ",
                    matrisA[i][0], matrisA[i][1], matrisA[i][2]);
            System.out.println();
        }
    }

    private static void yazdırma(float[][] matrisA, float matrisAlength, float matris0leng) {
        for (int i = 0; i < matrisA.length; i++) {
            System.out.format("%10s %20s  %20s ",
                    matrisA[i][0], matrisA[i][1], matrisA[i][2]);
            System.out.println();
        }
    }

    private static void yazdırmaB(float[] matrisB) {
        for (int i = 0; i < matrisB.length; i++) {
            System.out.printf("%10s ", matrisB[i]);
            System.out.println();
        }

    }
}


