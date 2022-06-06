package CH2;

import java.util.Locale;
import java.util.Scanner;

public class ex_2_1 {
    public static void main(String[] args) {
        // İkinci derece bir denklemin kökleri
        double r1=0, r2=0, i1=0, i2=0;
        double discr = 0;

        for (int i = 0; i < 10; i++) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the coefficient a: ");
        int a = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("enter the coefficient b: ");
        int b = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("enter the coefficient c: ");
        int c = input2.nextInt();

        discr = (Math.pow(b, 2) - (4 * a * c));

            if (a == 0) {
                if (b != 0) {
                    r1 = (-c) / b;

                } else
                    System.out.println("Trivial Solution");
            }
            else if (discr >= 0) {
                r1 = ((-b) + (Math.sqrt(discr) / (2 * a)));
                r2 = ((-b) - (Math.sqrt(discr) / (2 * a)));
            } else {
                r1 = b / (2 * a);
                r2 = r1;
                i1 = Math.sqrt((Math.abs(discr)) / (2 * a));
                i2 = -i1;
            }
            System.out.println("The first root is : " + r1);
            System.out.println("The second root is : " + r2);
            System.out.println("i1: " + i1);
            System.out.println("i2: " + i2);

            Scanner in = new Scanner(System.in);
            System.out.print("Would you like to try again? (Type Yes or No) : ");
            String inn = in.nextLine();
            inn = inn.toLowerCase();

            if (inn == "yes") {
                i++;
            } else {
                break;
            }
        }
    }
}

