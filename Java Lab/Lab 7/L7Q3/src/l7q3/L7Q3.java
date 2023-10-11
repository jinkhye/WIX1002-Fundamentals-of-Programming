
package l7q3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class L7Q3 {

    public static void main(String[] args) {
        writefile();
        reverse();
    }
    
    static void writefile() {
        try {
        PrintWriter outputStream = new PrintWriter (new FileOutputStream("text.txt"));
        outputStream.print("Hello World!\n");
        outputStream.print("Hello!");
        outputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void reverse() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("text.txt"));
            PrintWriter outputStream = new PrintWriter (new FileOutputStream("reverse.txt"));
            while (inputStream.hasNextLine()) {
                String reverse = "";
                String line = inputStream.nextLine();
                System.out.println(line);
                for (int i = line.length() - 1; i > -1 ; i--) {
                    reverse += line.charAt(i);
                }
                System.out.println(reverse);
                
                    outputStream.print(reverse + "\n");
                }
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
        }
    }
}
