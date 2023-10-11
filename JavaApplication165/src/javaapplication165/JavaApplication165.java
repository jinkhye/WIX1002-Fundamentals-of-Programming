
package javaapplication165;

import java.util.Scanner;


public class JavaApplication165 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int n = Integer.parseInt(input.nextLine());
        
        int counter = 0;
        String[] name = new String[n];
        int[] score = new int[n];
        
        while (counter < n) {
            int number = counter + 1;
            System.out.print("Enter team " + number + " name: ");
            name[counter] = input.nextLine();
            System.out.print("Enter team " + number + " score: ");
            score[counter] = Integer.parseInt(input.nextLine());
            counter++;
        }
        
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - i - 1; j++) {
                if (score[j] < score[j + 1]) {
                    int temp = score[j + 1];
                    score[j + 1] = score[j];
                    score[j] = temp; 
                    
                    String temp2 = name[j + 1];
                    name[j + 1] = name[j];
                    name[j] = temp2; 
                }
            }
        }
        
        System.out.println("List of team with the highest team score first");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " (" + score[i] + ") | ");
        }
        System.out.println("");
    }

}
