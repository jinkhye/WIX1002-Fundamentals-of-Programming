package fopnetbeans;

public class MonthlyReport {
    
    public static int counter_submitted=0, counter_completed=0, counter_succeed=0, counter_killjob=0, counter_error=0;
    public static int [] monthcounter_submitted = new int [7];
    public static int [] monthcounter_completed = new int [7];
    public static int [] monthcounter_succeed = new int [7];
    public static int [] monthcounter_killjob = new int [7];
    public static int [] monthcounter_error = new int [7];
    public static String[] Activity;
    public static int[] Number;
    public static String[] Hour;
    
    public static void MonthlyReport(String[][] line){
        
        //number of task submitted each day

        for (int i = 0; i < line.length; i++) {
            //convert string to int for ease of comparison
            String [] date = line[i][0].split("-");
            int month = Integer.parseInt(date[1]);


                if(line[i][1].equals("_slurm_rpc_submit_batch_job:")){
                    counter_submitted++;
                    monthcounter_submitted[month-6]++;
                }
                
                if(line[i][1].equals("_job_complete:") && line[i][3].equals("WEXITSTATUS")){
                    counter_completed++;
                    monthcounter_completed[month-6]++;
                }

                if(line[i][1].equals("_job_complete:") && line[i][3].equals("WEXITSTATUS") && line[i][4].equals("0")){
                    counter_succeed++;
                    monthcounter_succeed[month-6]++;
                }


                if((line[i][1].equals("_slurm_rpc_kill_job:") && line[i][2].equals("REQUEST_KILL_JOB")) || (line[i][1].equals("error:") && line[i][3].equals("REQUEST_KILL_JOB"))){
                    counter_killjob++;
                    monthcounter_killjob[month-6]++;
                }
                
                
                if(line[i][1].equals("error:") && line[i][2].equals("This") && line[i][3].equals("association")){
                    counter_error++;
                    monthcounter_error[month-6]++;
                }
        }
        
        
        
int arraylength = monthcounter_submitted.length + monthcounter_completed.length + monthcounter_succeed.length + monthcounter_killjob.length + monthcounter_error.length;
        
        Activity = new String[arraylength];
        Number = new int[arraylength];
        Hour = new String[arraylength];
        
        
        int counter = 0;
        
        for (int i = 0; i < 7; i++) {
            Activity[i] = "Submitted";
            Number[i] = monthcounter_submitted[i];
            Hour[i] = Integer.toString(i+6);
            counter++;
        }
        
        for (int i = 0; i < 7; i++) {
            Activity[counter] = "Completed";
            Number[counter] = monthcounter_completed[i];
            Hour[counter] = Integer.toString(i+6);
            counter++;
        }
        
        for (int i = 0; i < 7; i++) {
            Activity[counter] = "Succeeded";
            Number[counter] = monthcounter_succeed[i];
            Hour[counter] = Integer.toString(i+6);
            counter++;
        }
        
        for (int i = 0; i < 7; i++) {
            Activity[counter] = "Killed";
            Number[counter] = monthcounter_killjob[i];
            Hour[counter] = Integer.toString(i+6);
            counter++;
        }
        
        for (int i = 0; i < 7; i++) {
            Activity[counter] = "Error";
            Number[counter] = monthcounter_error[i];
            Hour[counter] = Integer.toString(i+6);
            counter++;
        }

        
    }
}
