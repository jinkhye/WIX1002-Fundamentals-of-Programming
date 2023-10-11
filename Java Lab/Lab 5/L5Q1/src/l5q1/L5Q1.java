
package l5q1;

import java.util.Arrays;


public class L5Q1 {

    public static void main(String[] args) {
        int[] score = new int[100];
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = (int)(Math.random()*101);
            sum += score[i];
        }
        System.out.println("List of score: ");
        for (int i = 1; i <= score.length; i++) {
            if (i % 10 != 0) 
                System.out.printf("%4d,", score[i-1]);
            else
                System.out.printf("%4d %n", score[i-1]);
            }
        
        Arrays.sort(score);
        System.out.println("\nThe highest score: " + score[99]);
        System.out.println("The lowest score: " + score[0]);
        System.out.println("The average score: " + sum / 100);
        }
        
    }


