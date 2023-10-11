package fopnetbeans;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileProperties {
    
    public static int CharacterCount=0, WordCount=0, LineCount=0;
    public static double d,h,m,s;
    public static ArrayList<String> unfiltered_partition = new ArrayList<>();
    public static ArrayList<String> filtered_partition = new ArrayList<>();
    public static ArrayList<String> userid = new ArrayList<>();
    public static ArrayList<String> copy = new ArrayList<>();
    public static long bytes;
    
    public static void FileProperties(String [][] line) throws ParseException{
        WordCount(line);
        TotalPeriod(line);
        FileSize();
        NumUser(line);
        NumPartitions(line);
    }

    public static void WordCount(String [][] line){
        // header("Word count in log file");

        
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
        
    }

    public static void TotalPeriod(String [][] line) throws ParseException{
        String start = line[0][0];
        String end = line[line.length-1][0];

        SimpleDateFormat dateFormat = new SimpleDateFormat("'['yyyy-MM-dd'T'HH:mm:ss.SSS']'");
        Date startTime = dateFormat.parse(start);
        Date endTime = dateFormat.parse(end);
        
        long time = endTime.getTime() - startTime.getTime(); //get the execution time in milliseconds

        DecimalFormat df = new DecimalFormat("#.##");
        d = (double) (time / (1000*60*60*24));
        h = (double) ((time / (1000*60*60)) % 24);
        m = (double) ((time / (1000*60)) % 60);
        s = (time / 1000) % 60 ;
        
    }
    
    public static void FileSize(){  
        Path path = Paths.get("extracted_log.txt");

        try {
            
            // size of a file (in bytes)
            bytes = Files.size(path);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public static void NumPartitions(String [][] line){

        //store all partition into arraylist (unfiltered) 
        for (int i = 0; i < line.length; i++) {
                if(line[i][1].equals("sched:") && line[i][2].equals("Allocate")){
                    String[] hold = line[i][6].split("=");
                    if(hold[0].equals("Partition")){
                        unfiltered_partition.add(hold[1]);
                    }
                }
        }

        //filter arraylist to remove duplicates
        for (int i = 0; i < unfiltered_partition.size(); i++) {
            boolean found = false;
            for (int j = 0; j < filtered_partition.size(); j++) {
                if (unfiltered_partition.get(i).equals(filtered_partition.get(j))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                filtered_partition.add(unfiltered_partition.get(i));
            }
        }
    }
    
    public static void NumUser(String [][] line){
        
        for (int i = 0; i < line.length; i++) { 
            for (int j = 0; j < line[i].length; j++) {
                if (line[i][j].equals("REQUEST_KILL_JOB")) {
                    if (line[i][j + 1].equals("RPC")) {
                        userid.add(line[i][10]);
                    }
                    else {
                        userid.add(line[i][5]);
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
        
    }
}
