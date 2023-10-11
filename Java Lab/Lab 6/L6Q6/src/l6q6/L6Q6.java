
package l6q6;

import java.util.Arrays;


public class L6Q6 {

    public static void main(String[] args) {
        int counter = 0;
        int counter2 = 0;
        int i = 0;
        int j = 0;
        int[] array1 = new int[20];
        int[] array2 = new int[20];
        while (true) {
            if (isPalindromicPrime(i) == true) {
                array1[counter] = i;
                counter++;
            }
            
            if (counter == 20 ) {
                break;
            }
            
            i++;
        }
        
        while (true) {
            if (isEmirp(j) == true) {
                array2[counter2] = j;
                counter2++;
            }
            
            if (counter2 == 20 ) {
                break;
            }
            
            j++;
        }
        System.out.println("The first 20 palindromic prime are: " + Arrays.toString(array1));
        System.out.println("The first 20 emirp are: " + Arrays.toString(array2));
    }
    
    public static boolean isPalindromicPrime(int x) {
        int num = x;
        int reverse = 0;
        int counter = 0;
        for (int i = 1; i <= num; i++) {
           if (num % i == 0) {
               counter++;
           }
        }
        if (counter != 2) {
            return false;
        }
        
        while (num > 0) {
            reverse = reverse*10 + num % 10;
            num = num / 10;
        }
        return (x == reverse);
    }
    
    public static boolean isEmirp(int x) {
        int num = x;
        int reverse = 0;
        int counter = 0;
        int counter2 = 0;
        
        for (int i = 1; i <= num; i++) {
           if (num % i == 0) {
               counter++;
           }
        }
        
        if (counter != 2) {
            return false;
        }
        
        while (num > 0) {
            reverse = reverse*10 + num % 10;
            num = num / 10;
        }
        
        if (x == reverse) {
            return false;
        }
        
        for (int i = 1; i <= reverse; i++) {
           if (reverse % i == 0) {
               counter2++;
           }
        }
        return (counter2 == 2);
    }
}
