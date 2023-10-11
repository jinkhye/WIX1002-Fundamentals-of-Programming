
package l4q7;

import java.util.Scanner;


public class L4Q7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double p = input.nextDouble(); // Principal
        System.out.print("Enter interest in %: ");
        double i = input.nextDouble(); // Yearly interest in %
        System.out.print("Enter total number of month(s): ");
        int N = input.nextInt(); // Total number of months
        double total = 0; // Total Interest

        System.out.println("Month          Monthly Payment          Principal          Interest          Unpaid Balance          Total Interest");
        for (int n = 1; n < N + 1; n++) {
        
        // Monthly payment
        double m = (p * (i/(12 * 100))) / (1 - Math.pow((1 + (i / (12 * 100))),-N ));
        
        // Principal portion due
        double C = m * Math.pow(1 + (i / (12 * 100)), -(1+ N - n));
        
        // Interest due
        double L = m - C;
        
        // Remaining principal balance due
        double R = (L / (i / (12 * 100))) - C;
        
        // Total Interest
        total += L;
        
        System.out.printf("%-10d          %10.2f         %10.2f        %10.2f              %10.2f              %10.2f%n", n, m, C, L, R, total);
        
        }
    }

}
