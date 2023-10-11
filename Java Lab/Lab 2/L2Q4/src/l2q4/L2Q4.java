
package l2q4;

import java.util.Scanner;


public class L2Q4 {

    public static void main(String[] args) {
/*
Write a program that converts the seconds to hours, minutes and seconds.
*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = input.nextInt();
        int seconds2 = seconds % 60;
        int minutes = (seconds / 60) % 60;
        int hours = (seconds / 3600) % 60;
        
        System.out.println(seconds + " seconds is " + hours + " hours, " + minutes + " minutes and " + seconds2 + " seconds");
    }

}
