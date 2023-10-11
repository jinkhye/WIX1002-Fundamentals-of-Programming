
package l6q2;

import java.util.Scanner;


public class L6Q2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        System.out.print("Enter char: ");
        char c = input.next().charAt(0);
        System.out.println();
        //Print triangle
        
        int height = n;
        for (int i = 1; i <= height; i++) {
            multiPrint(i, c);
            System.out.println("");
        }
        System.out.println("");
        
        //Print diamond
        int row = n;
        
        //Print upper half of diamond
        int middle = (2 * row) - 1; //No. of char in middle row
        int i = 1; //No. of char in first row
        
        while (i <= middle) {
            multiPrint(row, ' '); //Print spaces (no. of spaces = no. of rows)
            multiPrint(i, c); //Print char
            row--; //Spaces reduces by 1 every subsequent row
            i += 2; //No. of char increases by 2 every subsequent row
            System.out.println("");
        }
        
        //Print lower half of diamond
        int middle2 = middle - 2; //middle2 = the row after middle (no. of char in middle2)
        int j = 2; //no. of spaces in middle 2
        while (middle2 > 0) {
            multiPrint(j, ' ');
            multiPrint(middle2, c);
            j++;
            middle2 -= 2;
            System.out.println("");
        }
    }

    
    public static void multiPrint(int n, char c) {
        String str = c + "";
        System.out.print(str.repeat(n));
    }
}
