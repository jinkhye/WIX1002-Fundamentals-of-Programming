
package l3q3;

import java.util.Scanner;


public class L3Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int volume = input.nextInt();
        String percentage;
        double total;
        if (volume <= 100) {
            percentage = "5%";
            total = volume * 0.05;
        }
        else if (volume <= 500) {
            percentage = "7.5%";
            total = volume * 0.075;
        }
        else if (volume <= 1000) {
            percentage = "10%";
            total = volume * 0.1;
        }
        else {
            percentage = "12.5%";
            total = volume * 0.125;
        }
        
        System.out.println("The commission percentage is " + percentage);
        System.out.println("Commission: " + total);
    }

}
