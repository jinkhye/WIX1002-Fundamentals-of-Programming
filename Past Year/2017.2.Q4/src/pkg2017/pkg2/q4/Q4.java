
package pkg2017.pkg2.q4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Q4 {

    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream (new FileInputStream("Q4.dat"));
            try {
                while(true) {
                    String temp = inputStream.readUTF();
                    int q = Integer.parseInt(temp.substring(0,2));
                    int m = Integer.parseInt(temp.substring(2,4));
                    int y = Integer.parseInt(temp.substring(4));
                    DayOfTheWeek DayOfTheWeek = new DayOfTheWeek(q, m, y);
                    System.out.println(DayOfTheWeek);
                }
                } catch (EOFException e) {}
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
