package fopnetbeans;

public class DailyReport {
    
    public static int [] hourcounter_submitted = new int [24];
    public static int [] hourcounter_completed = new int [24];
    public static int [] hourcounter_succeed = new int [24];
    public static int [] hourcounter_killjob = new int [24];
    public static int [] hourcounter_error = new int [24];
    public static String[] Activity;
    public static int[] Number;
    public static String[] Hour;
    public static int counter_submitted=0, counter_completed=0, counter_succeed=0, counter_killjob=0, counter_error=0;
    
    public static void DailyReport(String[][] line){

        char[] dategiven_char = DailyReportPromptDate.startdate.toCharArray(); 
        int dategiven = (dategiven_char[0]-'0')*1000 + (dategiven_char[1]-'0')*100 + (dategiven_char[3]-'0')*10 + (dategiven_char[4]-'0');
        
        

        for (int i = 0; i < line.length; i++) {
            //convert string to int for ease of comparison
            char[] Char_date = line[i][0].toCharArray();
            int date = (Char_date[6]-'0')*1000 + (Char_date[7]-'0')*100 + (Char_date[9]-'0')*10 + (Char_date[10]-'0');

            if(dategiven==date){
                if(line[i][1].equals("_slurm_rpc_submit_batch_job:")){
                    counter_submitted++;

                    for (int k = 0; k < 3; k++) {
                        for (int k2 = 0; k2 <= 9; k2++) {
                            if(Char_date[12]-'0' == k && Char_date[13]-'0' == k2){
                                hourcounter_submitted[k*10 + k2]++;
                            }
                        }
                    }
                }
                
                if(line[i][1].equals("_job_complete:") && line[i][3].equals("WEXITSTATUS")){
                    counter_completed++;

                    for (int k = 0; k < 3; k++) {
                        for (int k2 = 0; k2 <= 9; k2++) {
                            if(Char_date[12]-'0' == k && Char_date[13]-'0' == k2){
                                hourcounter_completed[k*10 + k2]++;
                            }
                        }
                    }
                }

                if(line[i][1].equals("_job_complete:") && line[i][3].equals("WEXITSTATUS") && line[i][4].equals("0")){
                    counter_succeed++;

                    for (int k = 0; k < 3; k++) {
                        for (int k2 = 0; k2 <= 9; k2++) {
                            if(Char_date[12]-'0' == k && Char_date[13]-'0' == k2){
                                hourcounter_succeed[k*10 + k2]++;
                            }
                        }
                    }
                }

                for (int j = 0; j < line[i].length; j++) {
                    if(line[i][j].equals("REQUEST_KILL_JOB")){
                        counter_killjob++;
        
                        for (int k = 0; k < 3; k++) {
                            for (int k2 = 0; k2 <= 9; k2++) {
                                if(Char_date[12]-'0' == k && Char_date[13]-'0' == k2){
                                    hourcounter_killjob[k*10 + k2]++;
                                }
                            }
                        }
                    }
                }
                
                if(line[i][1].equals("error:") && line[i][2].equals("This") && line[i][3].equals("association")){
                    counter_error++;

                    for (int k = 0; k < 3; k++) {
                        for (int k2 = 0; k2 <= 9; k2++) {
                            if(Char_date[12]-'0' == k && Char_date[13]-'0' == k2){
                                hourcounter_error[k*10 + k2]++;
                            }
                        }
                    }
                }
            }
        }
        
        int arraylength = hourcounter_submitted.length + hourcounter_completed.length + hourcounter_succeed.length + hourcounter_killjob.length + hourcounter_error.length;
        
        Activity = new String[arraylength];
        Number = new int[arraylength];
        Hour = new String[arraylength];
        
        
        int counter = 0;
        
        for (int i = 0; i < 24; i++) {
            Activity[i] = "Submitted";
            Number[i] = hourcounter_submitted[i];
            Hour[i] = Integer.toString(i);
            counter++;
        }
        
        for (int i = 0; i < 24; i++) {
            Activity[counter] = "Completed";
            Number[counter] = hourcounter_completed[i];
            Hour[counter] = Integer.toString(i);
            counter++;
        }
        
        for (int i = 0; i < 24; i++) {
            Activity[counter] = "Succeeded";
            Number[counter] = hourcounter_succeed[i];
            Hour[counter] = Integer.toString(i);
            counter++;
        }
        
        for (int i = 0; i < 24; i++) {
            Activity[counter] = "Killed";
            Number[counter] = hourcounter_killjob[i];
            Hour[counter] = Integer.toString(i);
            counter++;
        }
        
        for (int i = 0; i < 24; i++) {
            Activity[counter] = "Erorr";
            Number[counter] = hourcounter_error[i];
            Hour[counter] = Integer.toString(i);
            counter++;
        }

        
    }
}