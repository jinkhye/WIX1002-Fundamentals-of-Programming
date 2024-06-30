package fopnetbeans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    
    public static String[][] line;

    public static void main(String args[]) {
        try{
            //count number of lines
            BufferedReader reader1 = new BufferedReader(new FileReader("extracted_log.txt"));
            int linecount=0;

            while(reader1.readLine()!=null)
                linecount++;

            reader1.close();

            //convert file into 2d array
            BufferedReader reader2 = new BufferedReader(new FileReader("extracted_log.txt"));
            String hold;
            line = new String [linecount][];
            //format: String [line number][word number]
            for (int i = 0; (hold=reader2.readLine())!=null; i++) {
                 line [i] = hold.split(" ");
            }

            reader2.close();
            
            SelectionMenu menu = new SelectionMenu();
            menu.setVisible(true);

        }catch(IOException e){
            System.out.println("problem");
        }
        
    }
}