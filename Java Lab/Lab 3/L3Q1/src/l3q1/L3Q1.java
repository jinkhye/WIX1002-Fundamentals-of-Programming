
package l3q1;

import java.util.Scanner;


public class L3Q1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        String input = keyboard.nextLine();
        String[] numbersStr = input.split(" ");
        int [] numbers = new int[numbersStr.length];
        numbers[0] = Integer.parseInt(numbersStr[0]);
        numbers[1] = Integer.parseInt(numbersStr[1]);
        System.out.print("Enter the operand: ");
        char operand = keyboard.next().charAt(0);
        int answer = 0;
        switch (operand) {
            case ('+') -> answer = numbers[0] + numbers[1];
            case ('-') -> answer = numbers[0] - numbers[1];
            case ('*') -> answer = numbers[0] * numbers[1];
            case ('/') -> answer = numbers[0] / numbers[1];
            case ('%') -> answer = numbers[0] % numbers[1];
        }
        
        System.out.println(numbers[0] + " " + operand + " " + numbers[1] + " = " + answer);
        
    }

}
