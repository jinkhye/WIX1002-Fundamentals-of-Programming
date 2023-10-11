
package javaapplication166;

import java.util.Scanner;


public class JavaApplication166 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int n = input.nextInt();
        
        int[] random = new int[n];
        
        for (int i = 0; i < random.length; i++) {
            random[i] = (int)(Math.random() * 10001);
        }
        
        display(random);
        
        System.out.println("Minimum Number : " + minimum(random));
        
        approximation(random);
        
        reverse(random);
    }
    
    public static void display(int[] array) {
        String print = "";
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10001);
            print += array[i] + "  ";
        }
        System.out.println("The random integer : " + print);
    }
    
    public static int minimum(int[] array) {
        int min = 10001;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    
    public static void approximation(int[] array) {
        String print = "";
        for (int i = 0; i < array.length; i++) {
            double temp = array[i];
            double approximation = Math.round(temp / 100) * 100;
            print += (int)approximation + "  ";
        }
        System.out.println("The approximation of the integer to the nearest hundred  : " + print);
    }
    
    public static void reverse(int[] array) {
        String print = "";
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int reverse = 0;
            while (n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }
            print += reverse + " ";
        }
        System.out.println("The approximation of the integer to the nearest hundred  : " + print);
    }

}
