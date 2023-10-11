package l6q1;


public class L6Q1 {
    
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("The number " + (i + 1) + " triangular number is " + triangularnumber(i) + ".");
        }
    }
    
    public static int triangularnumber(int x) {
            int sum = 0;
            for (int j = 1; j <= x; j++) {
                sum+= j;
            }
            return sum;
    }
}
