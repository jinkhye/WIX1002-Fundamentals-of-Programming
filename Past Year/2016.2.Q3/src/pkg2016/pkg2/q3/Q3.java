
package pkg2016.pkg2.q3;

import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();
        int height = 1;
        int spaces = n - 1;
        while (height <= n) {
            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }
            for (int i = height; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 2; i <= height; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
            height++;
            spaces--;
        }
    }

}
