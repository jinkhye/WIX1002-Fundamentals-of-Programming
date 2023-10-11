package pkg2022.pkg1.q2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("diving.txt"));
            int counter = 0;
            while (inputStream.hasNextLine()) {
                inputStream.nextLine();
                counter++;
            }
            counter = counter / 5;
            Diving[] diving = new Diving[counter];
            
            inputStream = new Scanner(new FileInputStream("diving.txt"));
            int counter2 = 0;
            while (inputStream.hasNextLine()) {
                double[][] scores = new double[3][7];
                double[] rating = new double[3];
                String name = inputStream.nextLine();
                String country = inputStream.nextLine();
                for (int i = 0; i < 3; i++) {
                    String[] temp = inputStream.nextLine().split(" ");
                    for (int j = 0; j < temp.length - 1; j++) {
                        scores[i][j] = Double.parseDouble(temp[j]);
                        rating[i] = Double.parseDouble(temp[7]);
                    }
                }
                diving[counter2] = new Diving(name, country, scores, rating);
                System.out.println(diving[counter2]);
                counter2++;
                System.out.println("");
            }
            winner(diving);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void winner(Diving[] diving) {
        for (int i = 0; i < diving.length - 1; i++) {
            for (int j = 0; j < diving.length - i - 1; j++) {
                if (diving[j].finalscore() > diving[j + 1].finalscore()) {
                    Diving temp = diving[j + 1];
                    diving[j + 1] = diving[j];
                    diving[j] = temp;
                }
            }
        }
        Diving gold = diving[diving.length - 1];
        Diving silver = diving[diving.length - 2];
        Diving bronze = diving[diving.length - 3];
        System.out.println("Gold : " + gold.getName() + " (" + gold.getCountry() + ")");
        System.out.println("Silver : " + silver.getName() + " (" + silver.getCountry() + ")");
        System.out.println("Bronze : " + bronze.getName() + " (" + bronze.getCountry() + ")");
    }
}