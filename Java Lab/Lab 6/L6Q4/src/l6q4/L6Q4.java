
package l6q4;

import java.util.Scanner;


public class L6Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive integers (A,B): ");
        String number = input.nextLine();
        String[] temp = number.split(",");
        String tempx = temp[0].substring(1);
        String tempy = temp[1].substring(0, temp[1].length() - 1);
        int A = Integer.parseInt(tempx);
        int B = Integer.parseInt(tempy);
        System.out.println("The GCD for " + number + " is " + GCD(A,B));
    }
    
    static int GCD(int A, int B) {
        while (true) {
            if (A == 0 || B == 0) {
                break;
            }
            int remainder = A % B;
            A = B;
            B = remainder;
        }
        if (A > B) {
            return A;
        }
        else {
            return B;
        }
    }

}
