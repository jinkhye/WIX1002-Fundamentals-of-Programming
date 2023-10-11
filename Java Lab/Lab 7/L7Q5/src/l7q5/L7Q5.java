
package l7q5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class L7Q5 {
    
    public static void main(String[] args) {
        String[] namearr;
        int[] agearr;
        char[] genderarr;
        int[] indexarr;

        try {
            ObjectInputStream inputStream = new ObjectInputStream (new FileInputStream("person.dat"));
            int num = inputStream.readInt();
            namearr = new String[num];
            agearr = new int[num];
            genderarr = new char[num];
            indexarr = new int[num];
            
            for (int i = 0; i < num; i++) {
                namearr[i] = inputStream.readUTF();
                agearr[i] = inputStream.readInt();
                genderarr[i] = inputStream.readChar();
            }
            
            for (int i = 0; i < indexarr.length; i++) {
                indexarr[i] = i;
            }
            
            for (int i = 0; i < namearr.length; i++) {
                for (int j = i + 1; j < namearr.length; j++) {
                    if(namearr[i].compareTo(namearr[j]) > 0) {
                        int temp = indexarr[i];
                        indexarr[i] = indexarr[j];
                        indexarr[j] = temp;
                    }
                }
            }
            
            System.out.println("--------------------------------");
            System.out.printf("|%-15s| |%-3s| |%s|%n", "Name", "Age", "Gender");
            System.out.println("--------------------------------");
            for (int i = 0; i < indexarr.length; i++) {
                System.out.printf("|%-15s| |%3d| |  %c   |%n", namearr[indexarr[i]], agearr[indexarr[i]], genderarr[indexarr[i]]);
            }
            System.out.println("--------------------------------");
            
            inputStream.close();
            } catch (IOException e) {
                System.out.println("Problem with data file.");
            }
        }
}
