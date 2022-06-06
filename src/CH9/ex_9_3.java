package CH9;

import java.util.Scanner;

public class ex_9_3 {
    public static void main(String[] args) {
        double[][] minorDet= new double [3][4];
        Scanner ina1 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin a katsayısını gir: ");
        minorDet[0][0] = ina1.nextDouble();
        Scanner inb1 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin b katsayısını gir: ");
        minorDet[0][1] = inb1.nextDouble();
        Scanner inc1 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin c katsayısını gir: ");
        minorDet[0][2] = inc1.nextDouble();
        Scanner ind1 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin d katsayısını gir: ");
        minorDet[0][3] = inc1.nextDouble();
        System.out.println( );
        Scanner ina2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin a katsayısını gir: ");
        minorDet[1][0] = ina2.nextDouble();
        Scanner inb2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin b katsayısını gir: ");
        minorDet[1][1] = inb2.nextDouble();
        Scanner inc2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin c katsayısını gir: ");
        minorDet[1][2] = inc2.nextDouble();
        Scanner ind2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin d katsayısını gir: ");
        minorDet[1][3] = inc2.nextDouble();
        System.out.println( );
        Scanner ina3 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin a katsayısını gir: ");
        minorDet[2][0] = ina3.nextDouble();
        Scanner inb3 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin b katsayısını gir: ");
        minorDet[2][1] = inb3.nextDouble();
        Scanner inc3 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin c katsayısını gir: ");
        minorDet[2][2] = inc3.nextDouble();
        Scanner ind3 = new Scanner(System.in);
        System.out.print("ax1 + bx2 + cx3 = d  formatındaki 1. denklemin d katsayısını gir: ");
        minorDet[2][3] = inc3.nextDouble();

        double minor1 = (minorDet[1][1] * minorDet[2][2]) - (minorDet[1][2] * minorDet[2][1]);
        double minor2 = (minorDet[1][0] * minorDet[2][2]) - (minorDet[1][2] * minorDet[2][0]);
        double minor3 = (minorDet[1][0] * minorDet[2][1]) - (minorDet[1][1] * minorDet[2][0]);
        double determinant1 = (minorDet[0][0]*minor1)-(minorDet[0][1]*minor2)+(minorDet[0][2]*minor3);

        double minorx11 = (minorDet[1][1] * minorDet[2][2]) - (minorDet[1][2] * minorDet[2][1]);
        double minorx12 = (minorDet[1][3] * minorDet[2][2]) - (minorDet[1][2] * minorDet[2][3]);
        double minorx13 = (minorDet[1][3] * minorDet[2][1]) - (minorDet[1][1] * minorDet[2][3]);
        double determinantx1 = (minorDet[0][3]*minorx11)-(minorDet[0][1]*minorx12)+(minorDet[0][2]*minorx13);

        double x1 = determinantx1/determinant1;

        double minorx21 = (minorDet[1][3] * minorDet[2][2]) - (minorDet[1][2] * minorDet[2][3]);
        double minorx22 = (minorDet[1][0] * minorDet[2][2]) - (minorDet[1][2] * minorDet[2][0]);
        double minorx23 = (minorDet[1][0] * minorDet[2][3]) - (minorDet[1][3] * minorDet[2][0]);
        double determinantx2 = (minorDet[0][0]*minorx21)-(minorDet[0][3]*minorx22)+(minorDet[0][2]*minorx23);

        double x2 = determinantx2/determinant1;

        double minorx31 = (minorDet[1][1] * minorDet[2][3]) - (minorDet[1][3] * minorDet[2][1]);
        double minorx32 = (minorDet[1][0] * minorDet[2][3]) - (minorDet[1][3] * minorDet[2][0]);
        double minorx33 = (minorDet[1][0] * minorDet[2][1]) - (minorDet[1][1] * minorDet[2][0]);
        double determinantx3 = (minorDet[0][0]*minorx31)-(minorDet[0][1]*minorx32)+(minorDet[0][3]*minorx33);

        double x3 = determinantx3/determinant1;

        System.out.println( "x1: "+x1+"\n"+
                "x2: "+x2+"\n"+
                "x3: "+x3);
    }
}
