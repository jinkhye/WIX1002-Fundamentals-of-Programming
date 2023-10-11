package pkg2019.pkg1.q3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter genome string [quit to stop] : ");
            String s = input.nextLine();
            if (s.equals("quit")) break;
            if (!s.contains("ATG") || !s.contains("TAG") && !s.contains("TAA") & !s.contains("TGA")) {
                System.out.println("No gene is found");
                continue;
            }
            
            boolean hasGene = false;
            
            int n = s.length();
            
            for (int i = 0; i < n - 2; i++) {
                if (s.substring(i, i + 3).equals("ATG")) {
                    int start = i + 3;
                    for (int j = start; j < s.length() - 2; j++) {
                        if (matchedEnding(s.substring(j, j + 3))) {
                            int end = j;
                            String res = s.substring(start, end);
                            if (qualified(res)) {
                                System.out.println(res);
                                hasGene = true;
                            }
                        }
                    }
                }
            }
            if (!hasGene) {
                System.out.println("No gene is found");
            }
         
        }
    }
    
    public static boolean matchedEnding(String s) {
        return s.equals("TAG") || s.equals("TAA") || s.equals("TGA");
    }
    
    public static boolean qualified(String s) {
        return s.length() >=3 && s.length() % 3 == 0 && !s.contains("ATG") && !s.contains("TAG") && !s.contains("TAA") && !s.contains("TGA");
    }
}