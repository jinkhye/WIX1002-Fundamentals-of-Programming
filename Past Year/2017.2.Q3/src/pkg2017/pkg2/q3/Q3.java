
package pkg2017.pkg2.q3;

import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random() * 10001);
        }
        display(array);
        System.out.println("Minimum Number : " + minimum(array));
        approximation(array);
        reverse(array);
    }
    
    public static void display(int[] array) {
        System.out.print("The random integer : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
    }
    
    public static int minimum(int[] array) {
        int min = 10001;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static void approximation(int[] array) {
        String approximation = "";
        for (int i = 0; i < array.length; i++) {
            double temp = array[i];
            approximation += (int)(Math.round(temp / 100) * 100) + "  ";
        }
        System.out.println("The approximation of the integer to the nearest hundred  : " + approximation);
    }
    
    public static void reverse(int[] array) {
        System.out.print("The random integer in reverse order: ");
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int reverse = 0;
            while (n > 0) {
                reverse = (reverse * 10) + n % 10;
                n /= 10;
            }
            System.out.print(reverse + "  ");
        }
        System.out.println("");
    }

}
