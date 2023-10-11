package pkg2018.pkg2.q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = input.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 30 marks): ");
        int spelling = input.nextInt();
        System.out.print("Enter the marks for Length (maximum 30 marks): ");
        int length = input.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = input.nextInt();
        System.out.println("");
        Essay essay = new Essay(grammar, spelling, length, content);
        System.out.println(essay);
        System.out.println("");
        
        int total = grammar + spelling + length + content;
        essay.setScore(total);
        
        System.out.println("Total score: " + total);
        System.out.println("Essay grade: " + essay.getGrade());
    }
}