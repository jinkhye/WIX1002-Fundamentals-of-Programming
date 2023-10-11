package pkg2019.pkg2.q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a, b and c: ");
        String values = input.nextLine();
        String[] array = values.split(" ");
        double a = Double.parseDouble(array[0]);
        double b = Double.parseDouble(array[1]);
        double c = Double.parseDouble(array[2]);
        quadraticEquation qe = new quadraticEquation(a, b, c);
        System.out.println("The equation is : " + (int)a + "x(^2) + (" + (int)b + ")x + (" + (int)c + ")");
        System.out.println("Discriminant : " + (int)qe.Discriminant());
        if (qe.Discriminant() < 0) {
            System.out.println("The equation has no roots");
        }
        else if (qe.Discriminant() == 0) {
            System.out.println("Same roots : " + (int)qe.calcRoot2());
        }
        else {
            System.out.println("The roots : " + (int)qe.calcRoot2() + " and " + (int)qe.calcRoot1());
        }
    }
}