
package problem.solving.pkg1.pkg2;

import java.util.Scanner;


public class ProblemSolving12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total = 0;
        while (true) {
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            String type = input.next();
            if (type.equals("Quit")) {
                break;
            }
            System.out.print("Enter the sales in kg: ");
            double sales = input.nextDouble();
            switch (type) {
                case ("MK") -> total += sales * 25;
                case ("HL") -> total += sales * 22;
                case ("D24") -> total += sales * 20;
                case ("UM") -> total += sales * 18;
            }
        }
        System.out.printf("Total Sales : %.2f%n", total);
    }

}
