
package problem.solving.pkg2.pkg2;

import java.util.Scanner;


public class ProblemSolving22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int question = 0;
        int score = 0;
        
        while (true) {
            System.out.print("Enter a number (-1 to quit) : ");
            int number = input.nextInt();
            
            if (number == -1) {
                break;
            }
            
            System.out.print("Enter a factor : ");
            int factor = input.nextInt();
            
            System.out.print(factor + " is a factor of " + number + "? (true/false): ");
            boolean check = input.nextBoolean();
            if (number % factor == 0) {
                if (check == true) {
                    score++;
                    System.out.println("Your answer is correct.");
                }
                else {
                    System.out.println("Your answer is incorrect.");
                }
            }
            else if (check == false) {
                score++;
                System.out.println("Your answer is correct.");
            }
            else {
                System.out.println("Your answer is incorrect.");
            }
            question++;
        }
        System.out.println("The final score is " + score + "/" + question);
    }

}
