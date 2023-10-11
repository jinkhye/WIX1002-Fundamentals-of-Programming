
package l5q2;


import java.util.Arrays;

public class L5Q2 {

    public static void main(String[] args) {
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 21);
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < i; j++) {
                if (array[i] == array[j]) {
                    array[i] = (int)(Math.random() * 21);
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
