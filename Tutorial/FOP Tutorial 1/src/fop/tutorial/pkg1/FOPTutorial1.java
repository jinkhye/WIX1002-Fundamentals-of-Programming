package fop.tutorial.pkg1;

import java.util.Scanner;
import java.util.Random;

public class FOPTutorial1 {
    public static void main(String[] args) {
        System.out.println("WIX1002 FOP Tutorial 1");
        int question = 4;
        switch (question) {
            case 1: {
            //Request two numbers from the user and print the multiplication of the numbers.
            Scanner number = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double number1 = number.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = number.nextDouble();
            
            double finalans = number1*number2;
            
            System.out.println(finalans);
            }
            case 2: {
            //Determine whether a random number is greater than 50.
            Random number = new Random();
            int upperbound = 101;
            int int_random = number.nextInt(upperbound);
            if (int_random > 50) {
                System.out.println("The number " + int_random + " is greater than 50");
            }
            else {
                System.out.println("The number " + int_random + " is not greater than 50");
            }
            }
            
            case 3: {
            //Print the pass/fail grade based on the mark entered by user. The passing mark is atleast 40.
            Scanner mark = new Scanner(System.in);
            System.out.print("Enter mark: ");
            int mark1 = mark.nextInt();
            
            if (mark1 >= 40) {
                System.out.println("Passed");
            }
            else {
                System.out.println("Failed");
            }
            }
            
            case 4: {
            //Print the results of the two players’ dice game.
            Random number = new Random();
            int upperbound = 9;
            int dice1 = number.nextInt(upperbound);
            int dice2 = number.nextInt(upperbound);
            
            System.out.println("Player 1 rolls " + dice1);
            System.out.println("Player 2 rolls " + dice2);
            if (dice1 > dice2) {
                
                System.out.println("Player 1 wins.");
            }
            else if (dice2 > dice1){
                System.out.println("Player 2 wins.");
            }
            else {
                System.out.println("The game is tied.");
            }
            }
            
            
                
        }
    }
    
}
