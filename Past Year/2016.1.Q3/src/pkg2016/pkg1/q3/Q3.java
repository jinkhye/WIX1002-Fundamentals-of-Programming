
package pkg2016.pkg1.q3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 1001);
        }
        
        display(array);
        maximum(array);
        approximation(array);
        reverse(array);
    }
    
    public static void display(int[] array) {
        String display = "";
        for (int i = 0; i < array.length; i++) {
            display += Integer.toString(array[i]) + " ";
        }
        System.out.println("The random integer : " + display);
    }
    
    public static void maximum(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum Number : " + max);
    }
    
    public static void approximation(int[] array) {
        String approximation = "";
        for (int i = 0; i < array.length; i++) {
            double temp = array[i];
            approximation += Integer.toString((int)(Math.round((temp / 10)) * 10)) + " ";
        }
        System.out.println("The random integer : " + approximation);
    }
    
    public static void reverse (int[] array) {
        String reverse = "";
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int reverse2 = 0;
            while (num > 0) {
                reverse2 = (reverse2 * 10) + num % 10;
                num /= 10;
            }
            reverse += Integer.toString(reverse2) + " ";
        }
        System.out.println("The random integer in reverse order: " + reverse);
    }

}
