
package l7q1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class L7Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String coursecode = input.next();
        writefile();
        System.out.println("Course name: " + search(coursecode));
    }
    
    static String search(String coursecode) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream (new FileInputStream("coursename.dat"));
            try {
                while(true) {
                    String temp = inputStream.readUTF();
                    String[] array = temp.split(",");
                    if (coursecode.equals(array[0])) {
                        String coursename = array[1];
                        return coursename;
                    }
                }
                } catch (EOFException e) {}
                
                inputStream.close();
            } catch (IOException e) {
                System.out.println("Problem with data file.");
            }
            return "Course code not found.";
        }
    
    
    static void writefile () {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream (new FileOutputStream("coursename.dat"));
            outputStream.writeUTF("WXES1116,Programming I\n");
            outputStream.writeUTF("WXES1115,Data Structure\n");
            outputStream.writeUTF("WXES1110,Operating System\n");
            outputStream.writeUTF("WXES1112,Computing Mathematics I\n");
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem when writing file.");
        }
    }

}
