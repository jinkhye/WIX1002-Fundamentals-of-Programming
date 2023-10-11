
package l2q5;

import java.util.Random;


public class L2Q5 {

    public static void main(String[] args) {
/*
Write a program that generates one random number. The range of the random
number is 0 to 10000. Display the number and the sum of all the digits in the number.
*/
        Random number = new Random();
        int num = number.nextInt(10001);
        System.out.println("The randomly generated number is: " + num);
        int tenthousands = num / 10000;
        int thousands = (num % 10000) / 1000;
        int hundreds = (num % 1000) / 100;
        int tens = (num % 100) / 10;
        int ones = (num % 10);
        
        int sum = tenthousands + thousands + hundreds + tens + ones;
        System.out.println("The sum of all the digits in the number is: " + sum);
        
    }

}
