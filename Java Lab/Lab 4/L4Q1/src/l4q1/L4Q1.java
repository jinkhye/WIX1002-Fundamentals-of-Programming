
package l4q1;

import java.util.Scanner;


public class L4Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int integer = input.nextInt();
        String factor = "";
        
       for (int i = 1; i <= integer; i++) {
           if (integer % i == 0) {
               factor += Integer.toString(i) + ", ";
           }
       }
        System.out.println("The factors are: " + factor.substring(0, factor.length() - 2));
    }

}
