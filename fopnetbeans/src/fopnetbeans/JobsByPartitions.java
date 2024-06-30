package fopnetbeans;


import java.util.ArrayList;
import java.util.Arrays;

public class JobsByPartitions {
    //(b)
    public static String[] X_DATA;
    public static int[] Y_DATA;
    
    public static void JobsByPartitions (String[][] line){
        
        ArrayList<String> unfiltered_partition = new ArrayList<>();
        ArrayList<String> filtered_partition = new ArrayList<>();
        ArrayList<Integer> counter = new ArrayList<>();

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
                    counter.set(j, counter.get(j) + 1);
                    break;
                }
            }
            if (!found) {
                filtered_partition.add(unfiltered_partition.get(i));
                counter.add(1);
            }
        }
        
        
        int[] ret = new int[counter.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = counter.get(i).intValue();
        }
        
        X_DATA = Arrays.copyOf(filtered_partition.toArray(), filtered_partition.size(), String[].class);
        Y_DATA = ret;
    
    }

}
