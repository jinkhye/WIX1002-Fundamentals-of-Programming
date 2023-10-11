
package l2q2;

import java.util.Scanner;


public class L2Q2 {

    public static void main(String[] args) {
/*
Write a program to calculate the monthly payment for car loan. The following are the
inputs of the program. Output the monthly payment in two decimal places.
*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of the car: ");
        double P = input.nextDouble();
        System.out.print("Enter down payment: ");
        double D = input.nextDouble();
        System.out.print("Enter interest rate in %: ");
        double R = input.nextDouble();
        System.out.print("Enter loan duration in year: ");
        double Y = input.nextDouble();
        System.out.print("Enter monthly payment: ");
        double M = input.nextDouble();
        
        M = (P-D) * (1+R*Y/100) / (Y * 12);
        
        System.out.print("The monthly payment is: RM");
        System.out.printf("%.2f%n", M);
    }

}
