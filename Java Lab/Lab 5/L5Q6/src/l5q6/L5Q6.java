
package l5q6;

import java.util.Scanner;


public class L5Q6 {
    public static void main(String[] args) {
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The Pascal Triangle with " + n + " row(s)");
        for (int line = 0; line < n; line++) {
            int counter = n;
            for (int i = 0; i <= line; i++) {
                System.out.print(binomialCoeff(line, i) + "  ");
                counter--;
            }
            for (int j = 0; j < counter; j++) {
                    System.out.print("0  ");
                }
            System.out.println();
        }
    }
    
    static int binomialCoeff(int n, int k) {
        int res = 1;
        
        if (k > n - k)
            k = n - k;
        
        for (int i = 0; i < k; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
        
    }

}
