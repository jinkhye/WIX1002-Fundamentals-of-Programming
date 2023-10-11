package fop.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KillRequest {
    
    public static ArrayList<String> userid = new ArrayList<>();
    public static ArrayList<String> nopermuserid = new ArrayList<>();
    public static ArrayList<String> copy = new ArrayList<>();
    public static ArrayList<String> copy2 = new ArrayList<>();
                        

    public static void KillRequest(String[][] line){ 

                Scanner input = new Scanner(System.in); 
                header.header("Count Number of Kill Requests"); 
        
                int request = 0;
                int nopermissionrequest = 0;

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
        
                
                
        for (String[] line1 : line) {
            for (int j = 0; j < line1.length; j++) {
                //convert string to int for ease of comparison
                char[] Char_date = line1[0].toCharArray();
                int date = (Char_date[6]-'0')*1000 + (Char_date[7]-'0')*100 + (Char_date[9]-'0')*10 + (Char_date[10]-'0');
                //check if date is during the given date
                if (date>=start && date<=end || _default) {
                    //check keyword to calculate success rate
                    if (line1[j].equals("REQUEST_KILL_JOB")) {
                        if (line1[j + 1].equals("RPC")) {
                            request++;
                            nopermissionrequest++;
                            nopermuserid.add(line1[10]);
                        } else {
                            request++;
                            userid.add(line1[5]);
                        }
                    }
                }
            }
        }

                        
                        for (int i = 0; i < userid.size(); i++) {
                            if (copy.contains(userid.get(i))) {
                    
                            }
                            else {
                                copy.add(userid.get(i));
                            }
                        }
                    
                        for (int i = 0; i < nopermuserid.size(); i++) {
                            if (copy2.contains(nopermuserid.get(i))) {
                    
                            }
                            else {
                                copy2.add(nopermuserid.get(i));
                            }
                        }
                        
                        FOPAssignment.X_DATA = Arrays.copyOf(copy.toArray(), copy.size(), String[].class);
                        FOPAssignment.Y_DATA = new int[FOPAssignment.X_DATA.length];
                        
                        for (int i = 0; i < FOPAssignment.X_DATA.length; i++) {
                            FOPAssignment.Y_DATA[i] = Collections.frequency(userid, copy.get(i));
                        }
                        
                        System.out.println("");
                        System.out.println("Total number of kill requests: " + request);
                        System.out.println("Total number of kill requests without permission: " + nopermissionrequest);
                        System.out.println("User ID       Number of Kill Requests");
                        System.out.println("---------------------------------------");
                        for (int i = 0; i < copy.size(); i++) {
                            System.out.printf("%-15s %10d%n", copy.get(i), Collections.frequency(userid, copy.get(i)));
                        }
                        System.out.println("");
                        System.out.println("User ID       Number of Kill Requests without permission");
                        System.out.println("---------------------------------------------------------------");
                        for (int i = 0; i < copy2.size(); i++) {
                            System.out.printf("%-15s %18d%n", copy2.get(i), Collections.frequency(nopermuserid, copy2.get(i)));
                        }
                    }
    
    public static void NoPermKillRequest() {
        
        FOPAssignment.X_DATA = Arrays.copyOf(copy2.toArray(), copy2.size(), String[].class);
        FOPAssignment.Y_DATA = new int[FOPAssignment.X_DATA.length];
        
        for (int i = 0; i < FOPAssignment.X_DATA.length; i++) {
            FOPAssignment.Y_DATA[i] = Collections.frequency(nopermuserid, copy2.get(i));
        }
    }
    
}