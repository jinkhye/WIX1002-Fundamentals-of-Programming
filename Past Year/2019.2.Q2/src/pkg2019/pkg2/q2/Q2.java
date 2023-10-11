
package pkg2019.pkg2.q2;

import java.util.Scanner;


public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int numberOfBags = input.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        double unitWeight = input.nextDouble();
        
        System.out.println("Price per kilogram :  %5.99");
        System.out.println("Sales tax :            7.25%");
        double totalPrice = unitWeight * numberOfBags * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        System.out.printf("Total price :          $ %.2f%n", totalPriceWithTax);
    }

}
