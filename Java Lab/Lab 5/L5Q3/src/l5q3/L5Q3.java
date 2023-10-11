
package l5q3;

import java.util.Scanner;


public class L5Q3 {

    public static void main(String[] args) {
        int N = 5;
        int[] hours = new int[7];
        
        
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            if (i == 1) {
            System.out.println("(Work hours) Sun Mon Tue Wed Thu Fri Sat");
            }
            else {
            System.out.println("             Sun Mon Tue Wed Thu Fri Sat");    
            }
            System.out.print("Employee " + i + ": ");
            for (int j = 0; j < hours.length; j++) {
                hours[j] = (int)(Math.random()* 8 + 1);
                sum += hours[j];
                System.out.printf("  %1d ", hours[j]);
            }
            System.out.println("   Total: " + sum + " hours");
            
        }
    }

}
