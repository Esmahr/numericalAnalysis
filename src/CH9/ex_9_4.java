package CH9;

import java.util.Scanner;

public class ex_9_4 {
    public static void main(String[] args) {
        double[][] minorDet= new double [2][3];
        Scanner ina1 = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 1. denklemin a katsayısını gir: ");
        minorDet[0][0] = ina1.nextDouble();
        Scanner inb1 = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 1. denklemin b katsayısını gir: ");
        minorDet[0][1] = inb1.nextDouble();
        Scanner inc1 = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 1. denklemin c katsayısını gir: ");
        minorDet[0][2] = inc1.nextDouble();
        System.out.println( );
        Scanner ina2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 1. denklemin a katsayısını gir: ");
        minorDet[1][0] = ina2.nextDouble();
        Scanner inb2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 1. denklemin b katsayısını gir: ");
        minorDet[1][1] = inb2.nextDouble();
        Scanner inc2 = new Scanner(System.in);
        System.out.print("ax1 + bx2 = c  formatındaki 1. denklemin c katsayısını gir: ");
        minorDet[1][2] = inc2.nextDouble();


        double x1= ((minorDet[1][1]*minorDet[0][2])-(minorDet[0][1]*minorDet[1][2]))/((minorDet[0][0]*minorDet[1][1])-(minorDet[0][1]*minorDet[1][0]));
        double x2= ((minorDet[0][0]*minorDet[1][2])-(minorDet[1][0]*minorDet[0][2]))/((minorDet[0][0]*minorDet[1][1])-(minorDet[0][1]*minorDet[1][0]));

        System.out.println( "\n"+"x1: "+x1+"\n"+
                "x2: "+x2);
    }
}
