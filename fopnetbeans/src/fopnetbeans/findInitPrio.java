package fopnetbeans;


public class findInitPrio {
    
    public static String[] X_DATA;
    public static int[] Y_DATA;
    public static int minInitPrior = Integer.MAX_VALUE;
    public static int maxInitPrior = Integer.MIN_VALUE;
    public static int countr = 0;
    public static double mean;
    
    public static void findInitPrio(String[][] line) {
        
        int sumr = 0;
 
        int[] rangeCounts = new int[7];
 
        for (String[] words : line) {
            for (String word : words) {
                if (word.startsWith("InitPrio=")) {
                    int initPrior = Integer.parseInt(word.substring(9));
                    sumr += initPrior;
                    countr++;
                    minInitPrior = Math.min(minInitPrior, initPrior);
                    maxInitPrior = Math.max(maxInitPrior, initPrior);
 
                if (initPrior >= 0 && initPrior <= 10000) {
                    rangeCounts[0]++;
                } else if (initPrior >=10001 && initPrior <= 20000) {
                    rangeCounts[1]++;
                } else if (initPrior >= 20001 && initPrior <= 30000) {
                    rangeCounts[2]++;
                } else if (initPrior >= 30001 && initPrior <= 40000) {
                    rangeCounts[3]++;
                } else if (initPrior >= 40001 && initPrior <= 50000) {
                    rangeCounts[4]++;
                } else if (initPrior >= 50001 && initPrior <= 60000) {
                    rangeCounts[5]++;
                } else if (initPrior >= 60001 && initPrior <= 70000) {
                    rangeCounts[6]++;
                }
                break;
                }
            }
        }
        mean = (double) sumr / countr;
        
        String [] X = {"0 to 10000", "10001 to 20000", "20001 to 30000", "30001 to 40000", "40001 to 50000", "50001 to 60000", "60001 to 70000"};
        X_DATA = X;
        Y_DATA = rangeCounts;
    }
}
