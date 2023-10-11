package fop.assignment;

import java.util.*;

public class DailyReport {
    
    public static void DailyReport(String[][] line){
        header.header("Daily Report");
        //+errors

        Scanner input = new Scanner(System.in);

        //number of task submitted each day
        System.out.print("Prompt date: ");
        char[] dategiven_char = (input.nextLine()).toCharArray(); 
        int dategiven = (dategiven_char[0]-'0')*1000 + (dategiven_char[1]-'0')*100 + (dategiven_char[3]-'0')*10 + (dategiven_char[4]-'0');
        int counter_submitted=0, counter_completed=0, counter_succeed=0, counter_killjob=0, counter_error=0;
        int [] hourcounter_submitted = new int [24];
        int [] hourcounter_completed = new int [24];
        int [] hourcounter_succeed = new int [24];
        int [] hourcounter_killjob = new int [24];
        int [] hourcounter_error = new int [24];

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

        System.out.println("Job submitted that day: " + counter_submitted);
        System.out.println("Job completed that day: " + counter_completed);
        System.out.println("Job completed that day: " + counter_succeed);
        System.out.println("Job completed that day: " + counter_killjob);
        System.out.println("Job completed that day: " + counter_error);

        System.out.println("  Hour\t\tJob Submitted\t\tJob Completed\t\tJob Succeed\t\tKill Job Request\t\tJob Error");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 24; i++) {
            System.out.print("   ");
            System.out.printf("%-11s %10d %23d %23d %26d %26d %n", i, hourcounter_submitted[i], hourcounter_completed[i], hourcounter_succeed[i], hourcounter_killjob[i], hourcounter_error[i]);
        }
        
        int arraylength = hourcounter_submitted.length + hourcounter_completed.length + hourcounter_succeed.length + hourcounter_killjob.length + hourcounter_error.length;
        
        LineChart.Activity = new String[arraylength];
        LineChart.Number = new int[arraylength];
        LineChart.Hour = new String[arraylength];
        
        
        int counter = 0;
        
        for (int i = 0; i < 24; i++) {
            LineChart.Activity[i] = "Submitted";
            LineChart.Number[i] = hourcounter_submitted[i];
            LineChart.Hour[i] = Integer.toString(i);
            counter++;
        }
        
        for (int i = 0; i < 24; i++) {
            LineChart.Activity[counter] = "Completed";
            LineChart.Number[counter] = hourcounter_completed[i];
            LineChart.Hour[counter] = Integer.toString(i);
            counter++;
        }
        
        for (int i = 0; i < 24; i++) {
            LineChart.Activity[counter] = "Succeeded";
            LineChart.Number[counter] = hourcounter_succeed[i];
            LineChart.Hour[counter] = Integer.toString(i);
            counter++;
        }
        
        for (int i = 0; i < 24; i++) {
            LineChart.Activity[counter] = "Killed";
            LineChart.Number[counter] = hourcounter_killjob[i];
            LineChart.Hour[counter] = Integer.toString(i);
            counter++;
        }
        
        for (int i = 0; i < 24; i++) {
            LineChart.Activity[counter] = "Erorr";
            LineChart.Number[counter] = hourcounter_error[i];
            LineChart.Hour[counter] = Integer.toString(i);
            counter++;
        }
        
    }
}