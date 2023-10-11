
package l3q4;

import java.util.Random;
import java.util.Scanner;


public class L3Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random dice = new Random();
        String enterkey;
        int player1 = 0;
        int player2 = 0;
        
            System.out.print("Player 1 press enter to roll: ");
            enterkey = input.nextLine();
            
            if (enterkey.equals("")) {
            int p1r1 = dice.nextInt(6) + 1;
            System.out.println("Player 1 first roll is: " + p1r1);
            player1 += p1r1;
            }
            
            System.out.print("Player 2 press enter to roll: ");
            enterkey = input.nextLine();
            
            if (enterkey.equals("")) {
            int p2r1 = dice.nextInt(6) + 1;
            System.out.println("Player 2 first roll is: " + p2r1);
            player2 += p2r1;
            
            System.out.print("Player 1 press enter to roll again: ");
            enterkey = input.nextLine();
            
            if (enterkey.equals("")) {
            int p1r2 = dice.nextInt(6) + 1;
            System.out.println("Player 1 second roll is: " + p1r2);
            player1 += p1r2;
            
            System.out.print("Player 2 press enter to roll: ");
            enterkey = input.nextLine();
            if (enterkey.equals("")) {
            int p2r2 = dice.nextInt(6) + 1;
            System.out.println("Player 2 second roll is: " + p2r2);
            player2 += p2r2;
                System.out.println("Player 1 score is: " + player1);
                System.out.println("Player 2 score is: " + player2);
                System.out.println("");
                
            if (player1 > player2) {
                System.out.println("Player 1 wins!");
            }
            else if (player2 > player1) {
                System.out.println("Player 2 wins!");
            }
            else {
                System.out.println("The game is tied.");
            }
}
}
}
}
}
