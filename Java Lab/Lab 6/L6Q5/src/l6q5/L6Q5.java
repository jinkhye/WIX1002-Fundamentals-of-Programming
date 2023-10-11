
package l6q5;

import java.util.Scanner;


public class L6Q5 {
    
    static int score = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter negative number to quit.");
            int x = (int)(Math.random() * 13);
            int y = (int)(Math.random() * 13);
            System.out.print(x + " x " + y + " = ");
            int answer = input.nextInt();
            if (answer < 0) {
                break;
            }
            score(x,y,answer);
        }
        System.out.println("Your Score is " + score);
    }
    
    static void score(int x, int y, int answer) {
        if (x * y == answer) {
            score++;
        }
    }

}
