
package tutorial.pkg2;

import java.util.Scanner;


public class Tutorial2 {

    public static void main(String[] args) {
        //Display the sentence Faculty of Computer Science and Information Technology.
        //a. In one line using multiple Java statements
        System.out.print("Faculty of Computer Science ");
        System.out.println("and Information Technology");
        
        //b. In multiple lines using one Java statement
        System.out.println("""
                           Faculty of Computer Science
                           and Information Technology""");
        
        //Write a Java statement that print "SDN" - Software-defined networking
        System.out.println("\"SDN\" - Software-defined networking");
        
        //Correct the error for the following statements.
        System.out.println("Java Programming");
        System.out.println("Introduction to Java!");
        System.out.println("\\t is the horizontal tab character");
        System.out.println("Java is case sensitive!");
        
        //Write statements for each of the following
        String matric;
        int pi;
        boolean M = false;
        long p = 8800000000L;
        char letter = 'U';
        final String PRO = "Java";
        
        //Correct the error for the following statements.
        //a.
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        
        //b.
        String chapter = "Summary";
        System.out.println(chapter);
        
        //c.
        int num = 0;
        num++;
        int num1 = num;
        
        //d.
        double num2 = 3000.00;
        System.out.printf("'%4.2f'%n", num2);
        
        //e.
        String contact;
        Scanner keyboard = new Scanner(System.in);
        contact = keyboard.nextLine();
        
        /*
        Write a java program that print the circumference of a circle. The input of the
        program is diameter. Display the result in three decimal places. (Note  = Math.PI)
        */
        Scanner input = new Scanner(System.in);
        double diameter;
        System.out.print("Enter diameter: ");
        diameter = input.nextDouble();
        double circumference = Math.PI * diameter;
        System.out.print("The circumference of the circle is: ");
        System.out.printf("%.3f%n", circumference);
        /*
        Write a java program that converts inches to meters. (Given 1 inch equals to 2.54
        centimeters). Print the output in two decimal places.
        */
        Scanner input2 = new Scanner(System.in);
        double inches;
        System.out.print("Enter value in inch: ");
        inches = input2.nextDouble();
        double meters = inches * 0.0254;
        System.out.print(inches + " inches = ");
        System.out.printf("%.2f", meters);
        System.out.println(" meters");
        


        
    }

}
