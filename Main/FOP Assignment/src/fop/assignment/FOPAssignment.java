
package fop.assignment;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import org.jfree.ui.RefineryUtilities;


public class FOPAssignment {
    
    public static String[] X_DATA;
    public static int[] Y_DATA;
    private static JButton bok = new JButton("Next");
    
    public static void main(String[] args) {
        
        try{ 

            Scanner input = new Scanner(System.in); 

            BufferedReader reader = new BufferedReader(new FileReader("extracted_log.txt")); 

            String hold; 

            String[][] line = new String [44055][]; 

            //format: String [line number][word number] 

            for (int i = 0; (hold=reader.readLine())!=null; i++) { 

                 line [i] = hold.split(" "); 

            } 

            reader.close();
            
            FileProperties(line); 
            KillRequest.KillRequest(line);
            BarChart();
//            KillRequest.KillRequest(line);
//            PieChart("test", "test");
            
//            BarChart();
//Errors.Errors(line);
           
//            run();
            
            
//            DailyReport.DailyReport(line);
            
            
            
//            LineChart();
            // WordCount(line); 

            

            /* 

             * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 

             */ 

 

            input.close(); 

 

        }catch(IOException e){ 

            System.out.println("problem"); 

        } 

    }
    
//    public static void run() {
//                JFrame frame = new JFrame();
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                BoxAndWhiskerDemo demo = new BoxAndWhiskerDemo();
//                frame.add(demo.getChartPanel(), BorderLayout.CENTER);
//                frame.add(demo.getControlPanel(), BorderLayout.SOUTH);
//                frame.pack();
//                frame.setLocationRelativeTo(null);
//                frame.setVisible(true);
//            }
//    
    
    

    public static void AET(String [][] line) throws ParseException{
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
        String [][] jobdiff = new String [7966][3];
        int counter3=0;
        for (int i = 0; i < jobstart.length; i++) {
            for (int j = 0; j < jobend.length; j++) {

                if(jobstart[i][0].equals(jobend[j][0])){
                    // calculate(jobstart[1],jobend[1]);
                    SimpleDateFormat dateFormat = new SimpleDateFormat("'['yyyy-MM-dd'T'HH:mm:ss.SSS']'");
                    Date startTime = dateFormat.parse(jobstart[i][1]);
                    Date endTime = dateFormat.parse(jobend[j][1]);

                    long executionTime = endTime.getTime() - startTime.getTime(); //get the execution time in milliseconds

                    jobdiff[counter3][0] = jobstart[i][0];
                    jobdiff[counter3][1] = executionTime+"";
                    jobdiff[counter3][2] = jobstart[i][1];
                    counter3++;
                }
            }
        }

        //calculate average time
        double avg_ms=0;
        //format: avg[month][unit]
        double [][] avg = new double[7][5];
        int counter[] = new int [7]; 
        for (int i = 0; i < jobdiff.length; i++) {
            
            String [] date = jobdiff[i][2].split("-");
            int month = Integer.parseInt(date[1]);
            

            if(jobdiff[i][0] != null){
                avg_ms += Double.parseDouble(jobdiff[i][1]) / jobdiff.length;
            }

            //calculate monthly average time
            //vvv need correction here vvv
            avg[month-6][0] += Double.parseDouble(jobdiff[i][1]);
            counter[month-6]++;
        }

        double avg_sec = avg_ms/1000;
        double avg_min = avg_ms/1000/60;
        double avg_hour = avg_ms/1000/60/60;
        double avg_day = avg_ms/1000/60/60/24;

        //calculate monthly average time
        for (int i = 0; i < avg.length; i++) {
            avg[i][0] /= counter[i];
            avg[i][1] = avg[i][0]/1000;
            avg[i][2] = avg[i][0]/1000/60;
            avg[i][3] = avg[i][0]/1000/60/60;
            avg[i][4] = avg[i][0]/1000/60/60/24;
        }

        System.out.println("Average time(second): " + avg_sec);
        System.out.println("Average time(min): " + avg_min);
        System.out.println("Average time(hour): " + avg_hour);
        System.out.println("Average time(day): " + avg_day);

        System.out.println("  Month\t\tin Millisecond\t\t\tin Seconds\t\tin Minutes\t\t    in Hours\t\t      in Days");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%-11s %20f %23f %23f %26f %26f %n", i+6, avg[i][0], avg[i][1], avg[i][2], avg[i][3], avg[i][4]);
        }
       
    }


    

    
    public static void test() {
      BarChart_AWT chart = new BarChart_AWT("Car Usage Statistics", "Which car do you like?", "category");
        chart.pack();
        chart.setLayout(null);
        JButton button = new JButton("Next");
        JButton button2 = new JButton("Previous");
        button.setBounds(0, 0, 80, 25);
        chart.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
		chart.dispose();
                KillRequest.NoPermKillRequest();
                BarChart_AWT chart = new BarChart_AWT("Car Usage Statistics", "Which car do you like?", "category");
                chart.pack();
                chart.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                chart.setVisible(true);
            }
        });
		
		chart.setVisible(true);
                chart.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
    
        
   
	
    public static void PieChart(String appTitle, String chartTitle) {
        PieChart CC = new PieChart(appTitle, chartTitle);
        CC.pack();
        CC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        CC.setVisible(true);
    }
    
    public static void BarChart() {
        BarChart_AWT chart = new BarChart_AWT("Car Usage Statistics", "Which car do you like?", "category");
        chart.pack();
        chart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        chart.setVisible(true);
    }
    
    public static void LineChart() {
        LineChart LineChart = new LineChart("School Vs Years", "Number of Schools vs years");
        LineChart.pack();
        RefineryUtilities.centerFrameOnScreen(LineChart);
        LineChart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LineChart.setVisible(true);
    }

    public static void FileProperties(String [][] line){ 

        header.header("Properties of file"); 

        WordCount(line); 

        TotalPeriod(line); 

        //number of user? 

        //number of partitions 

    } 

 

    public static void WordCount(String [][] line){ 

        // header("Word count in log file"); 

 

        int CharacterCount=0, WordCount=0, LineCount=0; 

        for (int i = 0; i < line.length; i++) { 

            for (int j = 0; j < line[i].length; j++) { 

                char [] charhold = line[i][j].toCharArray(); 

                for (int k = 0; k < charhold.length; k++) { 

                    CharacterCount++; 

                } 

                WordCount++; 

            } 

            LineCount++; 

        } 

        System.out.println("Number of characters: " + CharacterCount); 

        System.out.println("Number of words: " + WordCount); 

        System.out.println("Number of lines: " + LineCount); 

    } 

 

    public static void TotalPeriod(String [][] line){ 

        char[] Char_date_start = line[0][0].toCharArray(); 

        char[] Char_date_end = line[44054][0].toCharArray(); 

 

        int month = ((Char_date_end[6]-'0')*10 + (Char_date_end[7]-'0')) - ((Char_date_start[6]-'0')*10 + (Char_date_start[7]-'0')); 

        int day = ((Char_date_end[9]-'0')*10 + (Char_date_end[10]-'0')) - ((Char_date_start[9]-'0')*10 + (Char_date_start[10]-'0')); 

 

        System.out.println(month + " month(s) " + day + " day(s)"); 

 

    } 
    
    public static void SuccessRate (String[][] line){ 

        Scanner input = new Scanner(System.in); 

 

        header.header("Count Number of Errors"); 

  

        int jobSubmissions = 0; 

        int jobCompletions = 0; 

        int successfulJobs = 0; 

 

        //Value of start and end time here doesn't matter, will be overwritten later 

        String String_start = "06/12", String_end = "12/24"; 

        boolean _default = false; 

 

        //Prompt user to choose between look up in specific time range or look up the whole file 

        System.out.println("1. Within a specific period:"); 

        System.out.println("2. Throughout the log file"); 

        System.out.print("Prompt: "); 

        int menu = input.nextInt(); 

 

        switch (menu) { 

            case 1: 

                System.out.print("Start time (MM/DD): "); 

                String_start = input.next(); 

                System.out.print("End time (MM/DD): "); 

                String_end = input.next(); 

                input.close(); 

                break; 

         

            case 2: 

                _default=true;  

                break; 

        } 

         

 

        //convert string to int for ease of comparison 

        char[] Char_start = String_start.toCharArray(); 

        char[] Char_end = String_end.toCharArray(); 

        int start = (Char_start[0]-'0')*1000 + (Char_start[1]-'0')*100 + (Char_start[3]-'0')*10 + (Char_start[4]-'0'); 

        int end = (Char_end[0]-'0')*1000 + (Char_end[1]-'0')*100 + (Char_end[3]-'0')*10 + (Char_end[4]-'0'); 

 

        for (int i = 0; i < line.length; i++) { 

            for (int j = 0; j < line[i].length; j++) { 

 

                //convert string to int for ease of comparison 

                char[] Char_date = line[i][0].toCharArray(); 

                int date = (Char_date[6]-'0')*1000 + (Char_date[7]-'0')*100 + (Char_date[9]-'0')*10 + (Char_date[10]-'0'); 

 

                //check if date is during the given date 

                if(date>=start && date<=end || _default){ 

 

                    //check keyword to calculate success rate 

                    if (line[i][j].equals("_slurm_rpc_submit_batch_job:")) 

                        jobSubmissions++;  

                    if (line[i][j].equals("_job_complete:"))  

                        jobCompletions++; 

                    if (line[i][j].equals("WEXITSTATUS") && line[i][j+1].equals("0")) 

                        successfulJobs++; 

                } 

            } 

        } 

 

        //calculate success rate 

        System.out.println("Total job submissions: " + jobSubmissions); 

        System.out.println("Total job completions: " + jobCompletions); 

        System.out.println("Total job successed: " + successfulJobs); 

        System.out.println("Successful job rate: " + String.format("%.2f",(successfulJobs / (float) jobCompletions) * 100) + "%"); 

    }
    
    

} 

            
