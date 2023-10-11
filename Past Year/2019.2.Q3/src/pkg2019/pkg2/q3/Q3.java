
package pkg2019.pkg2.q3;

import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            System.out.print("What is " + number1 + " + " + number2 + " ? ");
            int answer = Integer.parseInt(input.nextLine());
            String result = number1 + " + " + number2 + " = " + answer + " is ";
            
            if (number1 + number2 == answer)  {
                System.out.println(result += "true");
            }
            else  {
                System.out.println(result += "false");
            }
            
            System.out.print("Do you want to try another question (y/n) ?: ");
            String cont = input.nextLine();
            if (cont.equals("n")) break;
        }
    }

}
