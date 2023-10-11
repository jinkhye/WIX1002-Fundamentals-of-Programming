package l8q3;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = input.nextInt();
        System.out.print("Input your height: ");
        double height = input.nextDouble();
        WeightCalculator calculator = new WeightCalculator(age, height);
        calculator.displayAll();
    }
}