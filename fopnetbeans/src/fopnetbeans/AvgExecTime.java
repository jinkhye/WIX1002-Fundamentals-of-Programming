package fopnetbeans;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AvgExecTime {
    
    public static double [][] avg = new double [8][5];
    public static String [][] data = new String[8][6];
    
    public static void AvgExecTime(String [][] line) throws ParseException{
        String [][] jobstart = new String [10552][2];
        String [][] jobend = new String [8479][2];
        int counter1=0, counter2=0;
        
        //store submitted job and endded job
        for (int i = 0; i < line.length; i++) {
            if(line[i][1].equals("_slurm_rpc_submit_batch_job:")){
                String [] split = line[i][2].split("=");

                if(split[0].equals("JobId")){
                    jobstart[counter1][0] = split[1];
                    jobstart[counter1][1] = line[i][0];
                    counter1++;
                }
            }

            if(line[i][1].equals("_job_complete:") && line[i][3].equals("done")){
                String [] split = line[i][2].split("=");

                jobend[counter2][0] = split[1];
                jobend[counter2][1] = line[i][0];
                counter2++;                
            }
        }

        //calculate execution time for each job
        //format: jobdiff[jobid][execution time][job start time]
        ArrayList<Integer> jobdiff_overall = new ArrayList<>();
        ArrayList<Integer> jobdiff_june = new ArrayList<>();
        ArrayList<Integer> jobdiff_july = new ArrayList<>();
        ArrayList<Integer> jobdiff_aug = new ArrayList<>();
        ArrayList<Integer> jobdiff_sept = new ArrayList<>();
        ArrayList<Integer> jobdiff_oct = new ArrayList<>();
        ArrayList<Integer> jobdiff_nov = new ArrayList<>();
        ArrayList<Integer> jobdiff_dec = new ArrayList<>();
        
        for (int i = 0; i < jobstart.length; i++) {
            for (int j = 0; j < jobend.length; j++) {
                
                if(jobstart[i][0].equals(jobend[j][0])){
                    // calculate(jobstart[1],jobend[1]);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("'['yyyy-MM-dd'T'HH:mm:ss.SSS']'");
                    Date startTime = dateFormat.parse(jobstart[i][1]);
                    Date endTime = dateFormat.parse(jobend[j][1]);

                    //calculate overall difference
                    long executionTime = endTime.getTime() - startTime.getTime(); //get the execution time in milliseconds

                    jobdiff_overall.add((int)executionTime);
                    
                    //calculate monthly difference
                    String [] checkmonth = jobstart[i][1].split("-");
                    if(checkmonth[1].equals("06")){
                        jobdiff_june.add((int)executionTime);
                    }else if(checkmonth[1].equals("07")){
                        jobdiff_july.add((int)executionTime);
                    }else if(checkmonth[1].equals("08")){
                        jobdiff_aug.add((int)executionTime);
                    }else if(checkmonth[1].equals("09")){
                        jobdiff_sept.add((int)executionTime);
                    }else if(checkmonth[1].equals("10")){
                        jobdiff_oct.add((int)executionTime);
                    }else if(checkmonth[1].equals("11")){
                        jobdiff_nov.add((int)executionTime);
                    }else if(checkmonth[1].equals("12")){
                        jobdiff_dec.add((int)executionTime);
                    }
                    
                }
            }
        }

        
        //calculate average time
        //format avg[month][unit]
        
        //overall
        for (int i = 0; i < jobdiff_overall.size(); i++) {
            avg[0][0] += jobdiff_overall.get(i) /jobdiff_overall.size();   
        }
        //june
        for (int i = 0; i < jobdiff_june.size(); i++) {
            avg[1][0] += jobdiff_june.get(i) /jobdiff_june.size();   
        }
        //july
        for (int i = 0; i < jobdiff_july.size(); i++) {
            avg[2][0] += jobdiff_july.get(i) /jobdiff_july.size();   
        }//aug
        for (int i = 0; i < jobdiff_aug.size(); i++) {
            avg[3][0] += jobdiff_aug.get(i) /jobdiff_aug.size();   
        }//sept
        for (int i = 0; i < jobdiff_sept.size(); i++) {
            avg[4][0] += jobdiff_sept.get(i) /jobdiff_sept.size();   
        }//oct
        for (int i = 0; i < jobdiff_oct.size(); i++) {
            avg[5][0] += jobdiff_oct.get(i) /jobdiff_oct.size();   
        }//nov
        for (int i = 0; i < jobdiff_nov.size(); i++) {
            avg[6][0] += jobdiff_nov.get(i) /jobdiff_nov.size();   
        }//dec
        for (int i = 0; i < jobdiff_dec.size(); i++) {
            avg[7][0] += jobdiff_dec.get(i) /jobdiff_dec.size();   
        }
        
        //unit conversion
        for (int i = 0; i < avg.length; i++) {
            //second
            avg[i][1] = avg[i][0]/1000;
            //minute
            avg[i][2] = avg[i][0]/1000/60;
            //hour
            avg[i][3] = avg[i][0]/1000/60/60;
            //day
            avg[i][4] = avg[i][0]/1000/60/60/24;
        }

        //convert everything to String
        
        
        //category
        data[0][0]="Overall";
        data[1][0]="June";
        data[2][0]="July";
        data[3][0]="August";
        data[4][0]="September";
        data[5][0]="October";
        data[6][0]="November";
        data[7][0]="December";
        
        //data
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data[i].length; j++) {
                DecimalFormat df = new DecimalFormat("#.##");
                data[i][j] = df.format(avg[i][j-1]);   
            }
        }
    }
    
    
}
