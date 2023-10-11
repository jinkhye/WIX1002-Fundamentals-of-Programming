
package l4q6;

import java.util.Random;


public class L4Q6 {

    public static void main(String[] args) {
        Random number = new Random();
        
        int random = Math.abs(number.nextInt());
        
        String length = Integer.toString(random);
        System.out.println("Random number: " + random);
        System.out.println("Number of digits: " + length.length());
    }

}
