
package pkg2019.pkg1.q4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Q4 {

    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("myAmbition.txt"));
            String temp = "";
            int word = 0;
            int[] array = new int[26];
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                temp += line;
                line = line.trim();
                String[] wordcounter = line.split(" ");
                word += wordcounter.length;
                for (int i = 0; i < wordcounter.length; i++) {
                    for (int j = 0; j < wordcounter[i].length(); j++) {
                        String temp2 = wordcounter[i].toUpperCase();
                        if (Character.isLetter(temp2.charAt(j))) {
                            int index = (int)(temp2.charAt(j)) - (int)'A';
                            array[index]++;
                        }
                        
                    }
                }
            }
            
            String[] sentence = temp.split("\\.");
            System.out.println("Number of sentences : " + sentence.length);
            System.out.println("Number of words : " + word);
            
            for (int i = 0; i < array.length; i++) {
                System.out.print((char)(i + (int)'A') + " : " + array[i] + " ");
                if ((i + 1) % 8 == 0) System.out.println("");
            }
            
            System.out.println("");
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
