
package l7q4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class L7Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file = input.next(); //text.txt
        //writefile();
        int[] array = count(file);
        int countcharacters = array[0];
        int countwords = array[1];
        int countlines = array[2];
        
        System.out.println("Number of characters: " + countcharacters);
        System.out.println("Number of words: " + countwords);
        System.out.println("Number of lines: " + countlines);
    }
    
    static void writefile() {
        try {
        PrintWriter outputStream = new PrintWriter (new FileOutputStream("text.txt"));
        outputStream.print("Hello World!\n");
        outputStream.print("Hello World!\n");
        outputStream.print("Hello World!\n");
        outputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static int[] count(String file) {
        int[] count = new int[3];
        try {
            Scanner inputStream = new Scanner(new FileInputStream(file));
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                count[0] += line.length();
                String[] countwords = line.split(" ");
                count[1] += countwords.length;
                count[2]++;
            }
            inputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
        }
    return count;
}
}
