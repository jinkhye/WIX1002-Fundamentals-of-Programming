
package mid.semester.test.pkg2016.q2;

import java.util.Arrays;
import java.util.Scanner;


public class MidSemesterTest2016Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer (-1 to quit): ");
        //5 9 13 5 4 6 4 4 8 9 -1 5 9 5 4 6 4 4 8 9
        String integer = input.nextLine();
        String print = "";
        String[] array1 = integer.split(" ");

        int counter = 0;
        
        for (int i = 0; i < array1.length; i++) {
            if (Integer.parseInt(array1[i]) > 0 && Integer.parseInt(array1[i]) <= 9) {
                print += array1[i] + " ";
            }
            else if (Integer.parseInt(array1[i]) == -1){
                break;
            }
        }
        
        print = print.substring(0, print.length() - 1);
        System.out.println(print);
        
        String[] array2 = print.split(" ");
        int[] array3 = new int[array2.length];
        
        for (int i = 0; i < array2.length; i++) {
            array3[i] = Integer.parseInt(array2[i]);
        } 

        Arrays.sort(array3);
        int min = array3[0];
        
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == min) {
                counter++;
            }
            else {
                break;
            }
        }
        
        System.out.println("The minimum number is " + min);
        System.out.println("The occurence count of " + min + " is " + counter);
    }

}
