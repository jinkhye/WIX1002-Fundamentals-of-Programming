package fop.assignment;

//import static fop.assignment.FOPAssignment.X_DATA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Errors {
    
    public static ArrayList<String> username;
    public static ArrayList<String> copy = new ArrayList<>();

    

    public static void Errors (String[][] line){ 

        Scanner input = new Scanner(System.in); 
        header.header("Count Number of Errors caused by Users"); 

        int errors = 0;

        //Value of start and end time here doesn't matter, will be overwritten later 

        String String_start = "06/12", String_end = "12/24"; 

        boolean _default = false; 

 

        //Prompt user to choose between look up in specific time range or look up the whole file 

        System.out.println("1. Within a specific period:"); 

        System.out.println("2. Throughout the log file"); 

        System.out.print("Prompt: "); 

        int menu = input.nextInt(); 

 

        switch (menu) { 

            case 1 -> {
                System.out.print("Start time (MM/DD): ");
                String_start = input.next();
                System.out.print("End time (MM/DD): ");
                String_end = input.next();
                input.close();
            }
            case 2 -> _default=true;
        } 

        //convert string to int for ease of comparison 

        char[] Char_start = String_start.toCharArray(); 
        char[] Char_end = String_end.toCharArray(); 
        int start = (Char_start[0]-'0')*1000 + (Char_start[1]-'0')*100 + (Char_start[3]-'0')*10 + (Char_start[4]-'0'); 
        int end = (Char_end[0]-'0')*1000 + (Char_end[1]-'0')*100 + (Char_end[3]-'0')*10 + (Char_end[4]-'0'); 

       username = new ArrayList<>(); 
       
        for (String[] line1 : line) {
            for (int j = 0; j < line1.length; j++) {
                //convert string to int for ease of comparison
                char[] Char_date = line1[0].toCharArray();
                int date = (Char_date[6]-'0')*1000 + (Char_date[7]-'0')*100 + (Char_date[9]-'0')*10 + (Char_date[10]-'0');
                //check if date is during the given date
                if (date>=start && date<=end || _default) {
                    //check keyword to calculate success rate
                    if (line1[j].equals("This") && line1[j + 1].equals("association")) {
                        errors++;
                        username.add(line1[5].substring(6, line1[5].length() - 2));
                    }
                }
            }
        }
                
       
                
        
                for (int i = 0; i < username.size(); i++) {
                    if (copy.contains(username.get(i))) {

                    }
                    else {
                        copy.add(username.get(i));
                    }
                }
                
                FOPAssignment.X_DATA = Arrays.copyOf(copy.toArray(), copy.size(), String[].class);
                FOPAssignment.Y_DATA = new int[FOPAssignment.X_DATA.length];
                
                for (int i = 0; i < FOPAssignment.X_DATA.length; i++) {
                    FOPAssignment.Y_DATA[i] = Collections.frequency(username, copy.get(i));
                }
                
                System.out.println("");
                System.out.println("Total number of errors: " + errors);
                System.out.println("Username          Number of Errors");
                System.out.println("---------------------------------------");
                for (int i = 0; i < copy.size(); i++) {
                    System.out.printf("%-15s %10d%n", copy.get(i), Collections.frequency(username, copy.get(i)));
                }
            }
}