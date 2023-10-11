
package l4q4;

import java.util.Scanner;


public class L4Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int startday = input.nextInt();
        
        int month = 1;
        int numberofdays = 31;
        
        while (month < 3){
            switch (month) {
                case 1: {
                    System.out.println("\t  May " + year);
                    break;
                }
                case 2: {
                    System.out.println("\t August " + year);
                    break;
                }
            }
            System.out.println("---------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < startday; i++) {
                System.out.print("    ");
            }
            for (int i = 1; i <= numberofdays; i++) {
                System.out.printf(" %2d ", i);
                if ((i + startday) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println();
            month++;
        }
    }

}
