package CH9;

import java.util.Scanner;

public class ex_9_2 {
    public static void main(String[] args) {

        double[][] minorDet= new double [2][2];
        Scanner ina = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 1. denklemin a katsayısını gir: ");
        minorDet[0][0] = ina.nextDouble();
        Scanner inb = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 1. denklemin b katsayısını gir: ");
        minorDet[0][1] = inb.nextDouble();
        System.out.println( );
        Scanner ina2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 2. denklemin a katsayısını gir: ");
        minorDet[1][0] = ina2.nextDouble();
        Scanner inb2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 2. denklemin b katsayısını gir: ");
        minorDet[1][1] = inb2.nextDouble();

        double determinant = (minorDet[0][0]*minorDet[1][1])-(minorDet[0][1]*minorDet[1][0]);

        System.out.println( "denklemin determinantı: "+determinant);
    }
}
