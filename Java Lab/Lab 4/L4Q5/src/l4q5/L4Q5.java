
package l4q5;

import java.util.Random;
import java.util.Scanner;


public class L4Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random dice = new Random();
        
        int player1 = 0;
        int player2 = 0;
        String enterkey;
        
        int roll;
        
        while (true) {
            if (player1 > 99 || player2 > 99) {
                break;
            }
            System.out.print("Player 1 press Enter to roll: ");
            enterkey = input.nextLine();
            roll = dice.nextInt(6) + 1;
            player1 += roll;
            System.out.println("Player 1 has rolled " + roll);
            
            while (roll == 6) {
            System.out.print("Player 1 has rolled a 6, Player 1 may roll again (Press Enter) : ");
            enterkey = input.nextLine();
            roll = dice.nextInt(6) + 1;
            player1 += roll;
            System.out.println("Player 1 has rolled " + roll);
            }
            
            System.out.print("Player 2 press Enter to roll: ");
            enterkey = input.nextLine();
            roll = dice.nextInt(6) + 1;
            player2 += roll;
            System.out.println("Player 2 has rolled " + roll);
            
            while (roll == 6) {
            System.out.print("Player 2 has rolled a 6, Player 2 may roll again (Press Enter) : ");
            enterkey = input.nextLine();
            roll = dice.nextInt(6) + 1;
            player2 += roll;
            System.out.println("Player 2 has rolled " + roll);
            }
        }
        
        System.out.println();
        System.out.println("Player 1 score: " + player1 +  " | " + "Player 2 score: " + player2);
        if (player1 > player2) {
            System.out.println("Player 1 wins!");
        }
        else {
            System.out.println("Player 2 wins!");
        }
    }

}
