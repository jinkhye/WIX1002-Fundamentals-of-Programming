
package l5q5;

import java.util.Arrays;
import java.util.Collections;


public class L5Q5 {
    public static void main(String[] args) {
    int number = 41;        
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 101);
        }
        System.out.println("A list of 20 random integer within 0 to 100");
        printarray(array);
        Arrays.sort(array);
        reverse(array);
        System.out.println("Array in descending order");
        printarray(array);
        linearsearch(array, number);
        binarysearch(array, number);
    }
    
    public static void reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
    
    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
            System.out.print(array[i] + ", ");
            else
            System.out.println(array[i]);
        }
    }
    
    public static int linearsearch(int[] array, int number){
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == number) {
            System.out.println(number + " found");
            System.out.println("Linear Search - " + counter + " loop(s)");
            return 1;
        }
        counter++;
    }
        System.out.println(number + " not found");
        System.out.println("Linear Search - " + counter + " loop(s)");
        return -1;
    }
    
    public static int binarysearch(int[] array, int number) {
        int low = 0, high = array.length - 1, counter = 0;
        while (low <= high) {
            int middle = (low + high)/2;
            if(array[middle] == number) {
                System.out.println(number + " found");
                System.out.println("Binary Search - " + counter + " loop(s)");
                return 1;
            }
            else if (array[middle] < number)
                high = middle - 1;
            else
                low = middle + 1;
            counter++;
        }
        System.out.println(number + " not found");
        System.out.println("Binary Search - " + counter + " loop(s)");
        return -1;
    }
}
    


