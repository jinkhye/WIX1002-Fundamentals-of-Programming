
package pkg2016.pkg1.q2;

import java.util.Scanner;


public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int winplayer = 0; int wincomputer = 0;
        while (true) {
            if (winplayer == 3 || wincomputer == 3) {
                break;
            }
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            int type = input.nextInt();
            int type2 = (int)(Math.random() * 3 + 1);
            String player = "";
            String computer = "";
            switch (type) {
                case 1 -> player = "Paper";
                case 2 -> player = "Scissor";
                case 3 -> player = "Rock";
            }
            switch (type2) {
                case 1 -> computer = "Paper";
                case 2 -> computer = "Scissor";
                case 3 -> computer = "Rock";
            }
            System.out.println("Player : " + player + " ----- Computer : " + computer);
            if (type == 1) {
                if (type2 == 2) {
                    wincomputer++;
                    System.out.println("Computer win " + wincomputer + " time(s)");
                }
                if (type2 == 3) {
                    winplayer++;
                    System.out.println("Player win " + winplayer + " time(s)");
                }
            }
            if (type == 2) {
                if (type2 == 1) {
                    winplayer++;
                    System.out.println("Player win " + winplayer + " time(s)");
                }
                if (type2 == 3) {
                    wincomputer++;
                    System.out.println("Computer win " + wincomputer + " time(s)");
                }
            }
            if (type == 3) {
                if (type2 == 2) {
                    winplayer++;
                    System.out.println("Player win " + winplayer + " time(s)");
                }
                if (type2 == 1) {
                    wincomputer++;
                    System.out.println("Computer win " + wincomputer + " time(s)");
                }
            }
            
        }
        if (winplayer > wincomputer) {
                System.out.println("Player wins the game.");
        }
        else {
            System.out.println("Computer wins the game.");
        }
    }

}
