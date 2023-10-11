
package pkg2018.pkg1.q2;

import java.util.Scanner;


public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int n = input.nextInt();
        int AAA = 0, AA = 0, A = 0;
        String numbers = "";
        for (int i = 0; i < n; i++) {
            int random =( int)(Math.random() * 101 + 50);
            if (random % 10>= 7) A++;
            else if (random % 10 >=4) AA++;
            else AAA++;
            numbers += random + " ";
        }
        System.out.println("The random numbers are: " + numbers);
        System.out.println("Group AAA : " + AAA);
        System.out.println("Group AA : " + AA);
        System.out.println("Group A : " + A);
    }

}
