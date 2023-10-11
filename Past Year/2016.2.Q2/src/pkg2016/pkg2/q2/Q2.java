
package pkg2016.pkg2.q2;

import java.util.Scanner;


public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int reverse = 0;
        while (number > 0) {
            reverse += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits is " + reverse);
    }

}
