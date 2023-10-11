
package l3q6;

import java.util.Scanner;


public class L3Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = input.nextInt();
        
        System.out.print("Enter a coordinate point (x,y): ");
        String str = input.next();
        String parts[] = str.split(",");

        String part1 = parts[0];
        String part2 = parts[1];
        
        part1 = part1.substring(1, part1.length());
        part2 = part2.substring(0, part2.length()-1);
        
        double x = Double.parseDouble(part1);
        double y = Double.parseDouble(part2);
        System.out.println(x);
        System.out.println(y);
        System.out.println(r);
        if ((x*x + y*y)> r*r) {
            System.out.println("The point is outside the circle.");
        }
        else {
            System.out.println("The point is inside the circle.");
        }
        
        
    }

}
