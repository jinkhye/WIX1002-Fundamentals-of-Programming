
package l4q8;


public class L4Q8 {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 100);
        String prime = "";
        for (int i = 2; i <= n; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                prime += Integer.toString(i) + ", ";
            }
            
        }
        System.out.println("The first " + n + " prime number are:");
        System.out.println(prime.substring(0, prime.length() - 2));
    }

}
