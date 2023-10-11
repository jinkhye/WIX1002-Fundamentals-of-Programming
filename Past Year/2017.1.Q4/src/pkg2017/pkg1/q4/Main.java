package pkg2017.pkg1.q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First complex number. Enter a number for the real part: ");
        double firstreal = input.nextDouble();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        double firstimaginary = input.nextDouble();
        System.out.print("Second complex number. Enter a number for the real part: ");
        double secondreal = input.nextDouble();
        System.out.print("Second complex number. Enter a number for the real part: ");
        double secondimaginary = input.nextDouble();
    
        System.out.print("First complex number: ");
        Complex a = new Complex(firstreal, firstimaginary);
        System.out.println(a);
        System.out.print("Second complex number: ");
        Complex b = new Complex(secondreal, secondimaginary);
        System.out.println(b);
        System.out.print("Addition of the two complex numbers: ");
        System.out.println(a.addComplexNum(b));
        System.out.print("Subtraction of the two complex numbers: ");
        System.out.println(a.subtractComplexNum(b));
    }
     
}