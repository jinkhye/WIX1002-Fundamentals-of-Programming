
package problem.solving.pkg2;

import java.util.Random;
import java.util.Scanner;


public class ProblemSolving2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of staff [N] : ");
        int staff = input.nextInt();
        int weekend = 0;
        
        for (int i = 0; i != staff; i++) {
            int id = random.nextInt(90000) + 10000;
            System.out.println("Staff ID : " + id);
            
            int second = (id/1000) %10;
            int fourth = (id/10) % 10;
            
            if (second % 2 == 1 && fourth % 2 == 0) {
                System.out.println("Weekend Duty");
                weekend++;
            }
            else {
                System.out.println("Weekend Off");
            }
        }
        System.out.println("The number of staffs work during weekend is " + weekend);
    }

}
