package pkg2017.pkg1.q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = input.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = input.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = input.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = input.nextInt();
        
        Essay a = new Essay(grammar, spelling, length, content);
        System.out.println("");
        System.out.println(a);
    }
}