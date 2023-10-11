
package pkg2017.pkg1.q2;

import java.util.Scanner;


public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double initial = input.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate = input.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = input.nextInt();
        
        System.out.println("");
        System.out.printf("Computed tuition fee for year 3 is: %.2f%n", computeFee(initial, rate, year));
    }
    
    public static double computeFee(double initial, double rate, int year) {
        int counter = 2;
        double fee = initial;
        while (counter <= year) {
            fee = fee * (rate/100 + 1);
            counter++;
        }
        return fee;
    }

}
