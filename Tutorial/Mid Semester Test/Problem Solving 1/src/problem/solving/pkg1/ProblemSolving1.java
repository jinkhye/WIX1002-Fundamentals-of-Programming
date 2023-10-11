
package problem.solving.pkg1;

import java.util.Scanner;


public class ProblemSolving1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the coordinate X and Y: ");
        String coordinate = keyboard.nextLine();
        String[] coordinate1 = coordinate.split(" ");
       
        int[] coordinate2 = new int[coordinate1.length];
        coordinate2[0] = Integer.parseInt(coordinate1[0]);
        coordinate2[1] = Integer.parseInt(coordinate1[1]);
        
        int x = coordinate2[0];
        int y = coordinate2[1];
        
        System.out.print("Enter the move: ");
        String move = keyboard.next();
        
        for (int i = 0; i < move.length(); i++) {
            String type = move.substring(i, i + 1);
            switch (type) {
                case ("U") -> y++;
                case ("D") -> y--;
                case ("R") -> x++;
                case ("L") -> x--;
                }
            }
        System.out.println("Initial Coordinate (" + coordinate2[0] + "," + coordinate2[1] + ")");
        System.out.println("Final Coordinate (" + x + "," + y + ")");
        }
    }


