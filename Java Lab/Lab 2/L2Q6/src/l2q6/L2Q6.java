
package l2q6;

import java.util.Scanner;


public class L2Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double M = (input.nextDouble()) / 1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialtemp = (((input.nextDouble()) - 32) * 5)/ 9;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finaltemp = (((input.nextDouble()) - 32) * 5)/ 9;
        
        double Q = M* (finaltemp - initialtemp) * 4184;
        System.out.print("The energy needed is: ");
        System.out.printf("%1.6e%n", Q);
        
    }

}
