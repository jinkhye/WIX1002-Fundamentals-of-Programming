
package pkg2020.pkg1.q4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Q4 {

    public static void main(String[] args) {
        int n = 0;
        int numOfJob = 0;
        String[][] records = new String[100][22];
        System.out.println("Reading from log file...");
        System.out.println("*****************************************");
        System.out.println("Records read from log file");
        System.out.println("");
        try {
            Scanner s = new Scanner(new FileInputStream("sampleLog.txt"));
            n = 0;
            while (s.hasNextLine()) {
                n++;
                s.nextLine();
            }
            records = new String[n][22];
            s = new Scanner(new FileInputStream("sampleLog.txt"));
            int i = 0;
            ArrayList<String> users = new ArrayList<>();
            ArrayList<String> jobids = new ArrayList<>();
            ArrayList<String> queues = new ArrayList<>();
            ArrayList<String> starts = new ArrayList<>();
            int[] jobs = new int[13];
            int counter1 = 0;
            while(s.hasNextLine()) {
                records[i] = s.nextLine().split(" ");
                int counter = i + 1;
                System.out.println("Record " + counter + ":");
                for (int j = 0; j < records[i].length; j++) {
                    System.out.println("    " + records[i][j]);
                }
                if (records[i][1].contains(";S;") && records[i][1].contains("user")) {
                    String user = records[i][1].substring(records[i][1].indexOf("user") + 5);
                    if (users.contains(user)) {
                        jobs[users.indexOf(user)]++;
                    }
                    else {
                        users.add(user);
                        jobs[counter1]++;
                        counter1++;
                    }
                }
                
                if (records[i][1].contains(";S;") && records[i][1].contains("user")) {
                    String jobid = records[i][1].substring(records[i][1].indexOf(";S;") + 3, records[i][1].indexOf(".ce2"));
                    jobids.add(jobid);
                    String queue = records[i][4].substring(6);
                    queues.add("Y (" + queue + ")");
                    String start = records[i][8].substring(6);
                    starts.add("Y (" + start + ")");
                    
                }
                i++;
                System.out.println("");
            }
            ArrayList<String> exiteds = new ArrayList<>();
            
            for (int j = 0; j < jobids.size(); j++) {
                boolean test = false;
                String jobid = jobids.get(j);
                for (int k = 0; k < records.length; k++) {
                        if (records[k][1].contains(";E;") && records[k][1].contains(jobid)) {
                            if (records[k][17].equals("Exit_status=1")) {
                                String exited = records[k][16].substring(4);
                                exiteds.add(exited);
                                test = true;
                            }
                            else if (records[k][16].contains("end")){
                                String exited = records[k][17].substring(12);
                                exiteds.add(exited);
                                test = true;
                            }
                        }
                    }
                if (!test) {
                    exiteds.add("null");
                }
            }
            
            System.out.println("total records read: " + n);
            System.out.println("");
            System.out.println("*****************************************");
            System.out.println("Print user submission stat");
            System.out.println("");
            System.out.println("User                 Jobs Submitted");
            System.out.println("----                 --------------");
            for (int j = 0; j < users.size(); j++) {
                System.out.printf("%-21s%d%n", users.get(j), jobs[j]);
            }
            System.out.println("*****************************************");
            System.out.println("Print jobs status");
            System.out.println("");
            System.out.println("Job ID    Submitted (queue)        Started (start time)     Exited (end time/error)");
            System.out.println("------    -----------------        --------------------     -----------------------");
            for (int j = 0; j < jobids.size(); j++) {
                System.out.printf("%-10s%-25s%-25s%-10s%n", jobids.get(j), queues.get(j), starts.get(j), exiteds.get(j));
            }
            System.out.println("");
            System.out.println("*****************************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
