
package pkg2016.pkg1.q4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Q4 {

    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("Q4.txt"));
            while (inputStream.hasNextLine()) {
                int uppercase = 0; int lowercase = 0; int digit = 0; int alpha = 0;
                String password = inputStream.nextLine();
                char[] array = password.toCharArray();
                if (password.length() >= 8) {
                    for (int i = 0; i < array.length; i++) {
                        if (Character.isUpperCase(array[i])) uppercase++;
                        if (Character.isLowerCase(array[i])) lowercase++;
                        if (Character.isDigit(array[i])) digit++;
                        if (!Character.isLetterOrDigit(array[i])) alpha++;
                    }
                }
                if (uppercase > 0 && lowercase > 0 && digit > 0 && alpha > 0) {
                    System.out.println("Strong password.");
                }
                else {
                    System.out.println("Not a strong password.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
