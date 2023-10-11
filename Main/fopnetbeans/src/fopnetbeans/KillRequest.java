package fopnetbeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KillRequest {
    
    public static ArrayList<String> userid = new ArrayList<>();
    public static ArrayList<String> nopermuserid = new ArrayList<>();
    public static ArrayList<String> copy = new ArrayList<>();
    public static ArrayList<String> copy2 = new ArrayList<>();
    
    public static String[] X_DATA;
    public static String[] Y_DATA;
    public static String[] X_DATA2;
    public static String[] Y_DATA2;
    
    public static int request = 0;
    public static int nopermissionrequest = 0;                    

    public static void KillRequest(String[][] line){        

        //Value of start and end time here doesn't matter, will be overwritten later 
        
        String String_start = "06/12", String_end = "12/24"; 
        
        boolean _default = SelectionMenu._default;
                
        String_start = PromptDate.startdate;
        String_end = PromptDate.enddate;
                
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
            if (copy.contains(userid.get(i))) {}
            else {
                copy.add(userid.get(i));
            }
        }
        for (int i = 0; i < nopermuserid.size(); i++) {
            if (copy2.contains(nopermuserid.get(i))) {}
            else {
                copy2.add(nopermuserid.get(i));
            }
        }
                        
        X_DATA = Arrays.copyOf(copy.toArray(), copy.size(), String[].class);
        Y_DATA = new String [X_DATA.length];
        for (int i = 0; i < X_DATA.length; i++) {
            Y_DATA[i] = Integer.toString(Collections.frequency(userid, copy.get(i)));
        }
        X_DATA2 = Arrays.copyOf(copy2.toArray(), copy2.size(), String[].class);
        Y_DATA2 = new String [X_DATA2.length];
        for (int i = 0; i < X_DATA2.length; i++) {
            Y_DATA2[i] = Integer.toString(Collections.frequency(nopermuserid, copy2.get(i)));
        }
    }
}