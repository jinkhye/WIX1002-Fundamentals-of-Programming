
package l2q1;

import java.util.Scanner;


public class L2Q1 {
    
    public static void main(String[] args) {
/*
Write a program that convert the temperature in degree Fahrenheit to degree Celsius.
The program will display the degree Celsius in two decimal places. 
*/ 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in degree Fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.printf("Celsius = %.2f degree celsius %n", Celsius);
    }

}
