
package pkg2017.pkg1.q3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        String ASCII = "";
        String read = "";
        for (int i = 0; i < 6; i++) {
            int number = (int)(Math.random() * 58 + 65);
            while (number >= 91 && number <= 96) {
                number = (int)(Math.random() * 58 + 65);
            }
            ASCII += ((char)number);
        }
        System.out.println("The string generated is: " + ASCII);
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
            outputStream.println(ASCII);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            Scanner inputStream = new Scanner(new FileInputStream("data.txt"));
            read = inputStream.nextLine();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] array = read.toCharArray();
        sort(array, '>');
        sort(array, '<');
        System.out.println("Original string from file: " + read);
        
    }
    
    public static void sort(char[] array, char type) {
        if (type == '>') {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        char temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.print("String sorted in ascending order: ");
        }
        
        if (type == '<') {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        char temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.print("String sorted in descending order: ");
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }
}
