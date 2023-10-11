
package pkg3n.pkg1.problem;

import java.util.Scanner;


public class Problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        while (n != 1) {
            if (n%2 == 1) {
                n = 3*n + 1;
                System.out.println(n);
            }
            else
                n = n/2;
                System.out.println(n);
        }
    }

}
