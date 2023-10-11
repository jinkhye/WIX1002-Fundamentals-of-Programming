
package pkg2020.pkg1.q3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("raw.txt"));
            System.out.println("Frequency Distribution Table");
            int[] numbers = new int[10];
            while (inputStream.hasNextInt()) {
                int n = inputStream.nextInt();
                numbers[n - 1]++;
            }
            int max = numbers[0];
            int position = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    System.out.println(i + 1 + " : " + numbers[i]);
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                    position = i + 1;
                }
            }
            System.out.println("The mode of the dataset is : " + position);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
