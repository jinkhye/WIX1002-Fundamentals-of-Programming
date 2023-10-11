
package l2q3;



import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class L2Q3 {

    public static void main(String[] args) {
/*
Write a program that generates three random numbers. The range of the random
number is 10 to 50. Display the three numbers, sum of the numbers and the average in
two decimal places.
*/
        Random number = new Random();
        IntStream ints = number.ints(3, 10, 50);
        System.out.print("The three numbers are: ");
        int[] array = ints.toArray();
        System.out.println(Arrays.toString(array));
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of the numbers is: " + sum);
        
        double average = sum/3;
        System.out.print("The average of the numbers is: ");
        System.out.printf("%.2f%n", average);
        }
    }
 

