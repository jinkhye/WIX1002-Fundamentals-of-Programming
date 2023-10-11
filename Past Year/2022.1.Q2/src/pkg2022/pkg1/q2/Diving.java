package pkg2022.pkg1.q2;

import java.util.Arrays;

public class Diving {

    public String name, country;
    public double[][] scores; 
    public double[] rating;
    
    public Diving(){
        name = "";
        country = "";
        scores = new double[3][7];
        rating = new double[3];
    }
    
    public Diving (String name, String country, double[][] scores, double[] rating) {
        this.name = name;
        this.country = country;
        this.scores = scores;
        this.rating = rating;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCountry() {
        return country;
    }
    
    public double finalscore() {
        double[] result = new double[3];
        for (int i = 0; i < scores.length; i++) {
            double[] array = scores[i];
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = 0; k < array.length - j - 1; k++) {
                    if (array[k] > array[k + 1]) {
                        double temp = array[k + 1];
                        array[k + 1] = array[k];
                        array[k] = temp;
                    }
                }
            }
            for (int j = 2; j < array.length - 2; j++) {
                result[i] += array[j];
            }
            result[i] *= rating[i];
        }
        double score = result[0] + result[1] + result[2];
        return score;
    }
    
    @Override
    public String toString() {
        String[] array = new String[3];
        for (int i = 0; i < scores.length; i++) {
            array[i] = "";
            for (int j = 0; j < scores[i].length; j++) {
                array[i] += scores[i][j] + " ";
            }
        }
        
        return "Diver : " + name + " (" + country + ")" +
                "\nJudges Scores : " + array[0] +
                "\nDifficulty Rating  : " + rating[0] +
                "\nJudges Scores : " + array[1] +
                "\nDifficulty Rating  : " + rating[1] +
                "\nJudges Scores : " + array[2] +
                "\nDifficulty Rating  : " + rating[2] +
                "\nFinal Score : " + finalscore();
        
    }
}