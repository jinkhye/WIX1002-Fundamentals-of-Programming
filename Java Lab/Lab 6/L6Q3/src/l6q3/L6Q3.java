
package l6q3;

import java.util.Arrays;
import java.util.Scanner;

public class L6Q3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 10 integers: ");
        String numbers = input.nextLine();
        String[] numbers2 = numbers.split(" ");
        int[] array = new int[10];
        
        for (int i = 0; i < numbers2.length; i++) {
            array[i] = Integer.parseInt(numbers2[i]);
        }
        reverse(array);
    }
    
    public static void reverse(int array[]) {
        int[] reverse = new int[10];
        int j = 10;
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[j - 1];
            j--;
        }
        System.out.println(Arrays.toString(reverse));
    }
    
}

