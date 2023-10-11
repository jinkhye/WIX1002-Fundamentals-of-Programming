
package l4q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class L4Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        double average;
        double square = 0;
        
        while (true) {
        System.out.print("Enter a score [negative score to quit]: ");
        int score = input.nextInt();
        numbers.add(score);
        
        if (score < 0){
            numbers.remove(numbers.size() - 1);
            average = sum/ (numbers.size());
            break;
        }
        
        sum += score;
        }
        
        for (int i = 0; i < numbers.size(); i ++) {
            square += Math.pow(numbers.get(i), 2);
        }
        
        double s = Math.sqrt((square - (Math.pow(sum, 2)/ numbers.size()))/(numbers.size() - 1));
        
        Collections.sort(numbers);
        System.out.println("Minimum Score: " + numbers.get(0));
        System.out.println("Maximum Score: " + numbers.get(numbers.size() - 1));
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Standard Deviation: %.2f%n", s);
    }

}
