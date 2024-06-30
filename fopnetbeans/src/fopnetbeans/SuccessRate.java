package fopnetbeans;
        
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SuccessRate{
    
    public static int jobSubmissions = 0;
    public static int jobCompletions = 0;
    public static int successfulJobs = 0;
    public static double dayDifference = 0;
    
    public static void SuccessRate(String[][] line){
        

        //Value of start and end time here doesn't matter, will be overwritten later
        String String_start = "06/12", String_end = "12/24"; 

        boolean _default = SelectionMenu._default;
        
        String_start = PromptDate.startdate;
        String_end = PromptDate.enddate;
        
        //using SimpleDateFormat class with the format of MM/DD which same as the input
        SimpleDateFormat obj = new SimpleDateFormat("MM/dd");
        Date startDate = new Date();
        Date endDate = new Date();
        
        long endTime = 0;
        long startTime = 0;
        
        try {   
            // Use parse method to get date object of both dates  
            startDate = obj.parse(String_start);   
            endDate = obj.parse(String_end);
            
            //Get end time and start time in milliseconds
            endTime = endDate.getTime();
            startTime = startDate.getTime();
            
            // Calculate time difference in milliseconds   
            long time_difference = endTime - startTime;
            
            // Calculate time difference in days  
            dayDifference = (time_difference / (1000*60*60*24)) % 365;
        }   
        // Catch parse exception   
        catch (ParseException e) {   
            e.printStackTrace();   
        }    

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                char[] Char_date = line[i][0].toCharArray();
                
                //String concatenation to get date in MM/dd
                String date = "" + Char_date[6] + Char_date[7] + "/" + Char_date[9] + Char_date[10];
                   
                // Use parse method to get date object of logFileDate  
                Date logFileDate = new Date();
                try {
                     logFileDate = obj.parse(date);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                
                //get the currentDate in milliseconds
                long logFileTime = logFileDate.getTime();
                //check if date is during the given date
                if(logFileTime >= startTime && logFileTime <= endTime || _default) {
                    //check keyword to calculate success rate
                    if (line[i][j].equals("_slurm_rpc_submit_batch_job:"))
                        jobSubmissions++; 
                    if (line[i][j].equals("_job_complete:") && line[i][j+2].equals("WEXITSTATUS")){
                        jobCompletions++;
                        if (line[i][j+3].equals("0"))
                            successfulJobs++;
                        }
                }
            }
        }
    }
}
