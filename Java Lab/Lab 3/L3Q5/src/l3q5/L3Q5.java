
package l3q5;

import java.util.Scanner;


public class L3Q5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter value for a b c d e f (eg: 1 2 3 4 5 6): ");
        String input = keyboard.nextLine();
        String[] numbersStr = input.split(" ");
        int[] numbers = new int[numbersStr.length];

        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        int d = numbers[3];
        int e = numbers[4];
        int f = numbers[5];
        
        if ((a*d - b*c) == 0) {
            System.out.println("The equation has no solution");
        }
        else {
            int x = (e*d-b*f)/(a*d-b*c);
            int y = (a*f - e*c)/(a*d - b*c);
            
            System.out.println("X is " + x + " Y is " + y);
        }
    }

}
