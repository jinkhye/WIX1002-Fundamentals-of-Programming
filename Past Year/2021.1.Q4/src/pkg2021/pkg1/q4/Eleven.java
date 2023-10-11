package pkg2021.pkg1.q4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public abstract class Eleven {

    int[] array;
    String filename;
    
    public Eleven (String filename) {
       try {
           ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
           int counter = 0;
           try {
               while (true) {
                   inputStream.readInt();
                   counter++;
               }
           } catch (EOFException e) {}
           array = new int[counter];
           inputStream = new ObjectInputStream(new FileInputStream(filename));
           int counter2 = 0;
           try {
               while (true) {
                   array[counter2] = inputStream.readInt();
                   counter2++;
               }
           } catch (EOFException e) {}
           inputStream.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
    
    public abstract String divide();
}