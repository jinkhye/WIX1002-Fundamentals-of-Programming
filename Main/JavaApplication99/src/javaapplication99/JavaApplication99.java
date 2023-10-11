
package javaapplication99;

import java.util.Arrays;
import java.util.Collections;

/*
Write a method called middleSplit that takes in 1 parameter, an integer array. 
The method will take the integer in the middle of the array
and then split the array into a 2D array with 2 rows, 1st row contians numbers
1st row contians numbers that are smaller than the middle value while the
2nd row contains numbers that are bigger than the middle value.
If there are an even number of integer in the array, the middle value will
be the lower middle
*/

public class JavaApplication99 {

    public static void main(String[] args) {
        int[] odd = {1,5,6,2,3,9,3,4,3}; //11 middle = 4
        int[] even = {9,1,9,2,1,9}; //8 middle = 2
        int[] test;
        int[][] multiarray;
        
        
        System.out.println("Original odd array: " + Arrays.toString(odd));
        multiarray = middleSplit(odd);
        System.out.println(Arrays.deepToString(multiarray));
        //ascending
        for (int i = 0; i < even.length; i++){  
            for (int j = i + 1; j < even.length; j++){  
            int tmp = 0;  
            if (even[i] > even[j])   
            {             
                tmp = even[i];  
                even[i] = even[j];  
                even[j] = tmp;  
                }  
            } 
        }
        //descending
        for (int i = 0; i < even.length; i++)   
            { int temp = 0;  
for (int j = i + 1; j < even.length; j++)   
{  
if (even[i] < even[j])   
{  
temp = even[i];  
even[i] = even[j];  
even[j] = temp;  
}  
}  
}  
        System.out.println("Original even array: " + Arrays.toString(even));
        multiarray = middleSplit(even);
        System.out.println(Arrays.deepToString(multiarray));
        
    }
    
    public static int[][] middleSplit(int[] array) {
        int[][] multiarray;
        int middle;
        int middle1;
        int middle2;
        int[] lowerarray;
        int[] upperarray;
        int sizecounter1 = 0; int sizecounter2 = 0;
        int counter1 = 0; int counter2 = 0;
        
        if (array.length % 2 != 0) { 
            middle = array[array.length / 2];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < middle) {
                    sizecounter1++;
                }
                else {
                    sizecounter2++;
                }
            }
            
            lowerarray = new int[sizecounter1];
            upperarray = new int[sizecounter2 - 1];
            
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] < middle) {
                    lowerarray[counter1] = array[i];
                    counter1++;
                }
                else {
                    upperarray[counter2] = array[i];
                    counter2++;
                }
            }
            
            for (int i = array.length / 2 + 1; i < array.length; i++) {
                if (array[i] < middle) {
                    lowerarray[counter1] = array[i];
                    counter1++;
                }
                else {
                    upperarray[counter2] = array[i];
                    counter2++;
                }
            }
        }
        
        
        else {
            middle1 = array[array.length / 2 - 1];
            middle2 = array[array.length / 2];
            if (middle1 > middle2) {
                middle = middle2;
                
                for (int i = 0; i < array.length; i++) {
                if (array[i] < middle) {
                    sizecounter1++;
                }
                else {
                    sizecounter2++;
                }
                
                
                
            }
            
            lowerarray = new int[sizecounter1];
            upperarray = new int[sizecounter2 - 1];
            
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] < middle) {
                    lowerarray[counter1] = array[i];
                    counter1++;
                }
                else {
                    upperarray[counter2] = array[i];
                    counter2++;
                }
            }
            
            for (int i = array.length / 2 + 1; i < array.length; i++) {
                if (array[i] < middle) {
                    lowerarray[counter1] = array[i];
                    counter1++;
                }
                else {
                    upperarray[counter2] = array[i];
                    counter2++;
                }
            }
                
            }
            else {
                middle = middle1;
                for (int i = 0; i < array.length; i++) {
                if (array[i] < middle) {
                    sizecounter1++;
                }
                else {
                    sizecounter2++;
                }
            }
            
            lowerarray = new int[sizecounter1];
            upperarray = new int[sizecounter2 - 1];
            
            for (int i = 0; i < array.length / 2 - 1; i++) {
                if (array[i] < middle) {
                    lowerarray[counter1] = array[i];
                    counter1++;
                }
                else {
                    upperarray[counter2] = array[i];
                    counter2++;
                }
            }
            
            for (int i = array.length / 2; i < array.length; i++) {
                if (array[i] < middle) {
                    lowerarray[counter1] = array[i];
                    counter1++;
                }
                else {
                    upperarray[counter2] = array[i];
                    counter2++;
                }
            }
            }
            
            
            
            
            
        }
        System.out.println(middle);
        multiarray = new int[][] {lowerarray, upperarray};
        return multiarray;
    }
}
