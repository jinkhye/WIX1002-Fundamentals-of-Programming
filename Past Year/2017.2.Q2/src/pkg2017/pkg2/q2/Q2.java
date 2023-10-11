
package pkg2017.pkg2.q2;

import java.util.Arrays;
import java.util.Scanner;


public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int number = Integer.parseInt(input.nextLine());
        int counter = 1;
        String[][] array = new String[number][2];
        while (counter <= number) {
            System.out.print("Enter team " + counter + " name: ");
            array[counter - 1][0] = input.nextLine();
            
            System.out.print("Enter team " + counter + " score: ");
            array[counter - 1][1] = input.nextLine();
            counter++;
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
            if (Integer.parseInt(array[j][1]) > Integer.parseInt(array[j + 1][1])) {
                String temp1 = array[j + 1][0];
                String temp2 = array[j + 1][1];
                
                array[j + 1][0] = array[j][0];
                array[j + 1][1] = array[j][1];
                
                array[j][0] = temp1;
                array[j][1] = temp2;
            }
            }
        }
        System.out.println("List of team with the highest team score first");
        for (int i = array.length - 1; i > -1; i--) {
            System.out.print(array[i][0] + "  (" + array[i][1] + ") |  ");
        }
        System.out.println();
    }

}
