
package pkg2018.pkg2.q3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        String[] names = new String[10];
        double[] marks = new double[10];
        int counter = 0;
        int absent = 0;
        try {
            Scanner inputStream = new Scanner(new FileInputStream("student.txt"));
            while (inputStream.hasNextLine()) {
                String[] temp = inputStream.nextLine().split(", ");
                names[counter] = temp[0];
                marks[counter] = Double.parseDouble(temp[1]);
                counter++;
                if (Double.parseDouble(temp[1]) == -1) absent++;
            }
            
            
            for (int i = 0; i < marks.length - 1; i++) {
                for (int j = 0; j < marks.length - i - 1; j++) {
                    if (marks[j] > marks[j + 1]) {
                        String temp = names[j + 1];
                        names[j + 1] = names[j];
                        names[j] = temp;
                        
                        double temp2 = marks[j + 1];
                        marks[j + 1] = marks[j];
                        marks[j] = temp2;
                    }
                }
            }
            
            System.out.println("The student with the highest mark : "  + names[9] + " " + (int)(marks[9]));
            System.out.println("The student with the lowest mark : "  + names[absent] + " " + (int)(marks[absent]));
            System.out.println("The number of students who were abesent from the exam : " + absent);
            
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
