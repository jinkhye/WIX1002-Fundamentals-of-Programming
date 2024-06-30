package fopnetbeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Errors  {
    
    private static ArrayList<String> username;
    private static ArrayList<String> copy = new ArrayList<>();
    
    public static String[] X_DATA;
    public static String[] Y_DATA;
    
    public static int errors = 0;
    
    public static void Errors(String[][] line) {
        
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

       username = new ArrayList<>(); 
       
       for (int i = 0; i < line.length; i++) { 
            for (int j = 0; j < line[i].length; j++) {
                //convert string to int for ease of comparison 
                char[] Char_date = line[i][0].toCharArray();
                int date = (Char_date[6]-'0')*1000 + (Char_date[7]-'0')*100 + (Char_date[9]-'0')*10 + (Char_date[10]-'0');
                //check if date is during the given date 
                if(date>=start && date<=end || _default){
                    //check keyword to calculate success rate 
                    if (line[i][j].equals("This") && line[i][j + 1].equals("association")) {
                        errors++;
                        username.add(line[i][5].substring(6, line[i][5].length()-2));
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

                X_DATA = Arrays.copyOf(copy.toArray(), copy.size(), String[].class);
                Y_DATA = new String[X_DATA.length];
                
                for (int i = 0; i < X_DATA.length; i++) {
                    Y_DATA[i] = Integer.toString(Collections.frequency(username, copy.get(i)));
                }
                
        }
}