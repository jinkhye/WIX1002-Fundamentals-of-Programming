
package javaapplication167;

import java.io.*;


public class JavaApplication167 {

    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Q4.dat"));
            try {
                while (true) {
                    String date = inputStream.readUTF();
                    int q = Integer.parseInt(date.substring(0, 2));
                    int m = Integer.parseInt(date.substring(2, 4));
                    int y = Integer.parseInt(date.substring(4));
                    DayOfTheWeek a = new DayOfTheWeek(q,m,y);
                    System.out.println(q + "/" + m + "/" + y + " " + a.dayoftheweek());
                }
            } catch (EOFException e) {}
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }

}
