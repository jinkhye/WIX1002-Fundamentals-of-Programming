
package pkg2018.pkg1.q4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Q4 {

    public static void main(String[] args) {
        String highname = "", name; double highscore = 0, score;
        try {
            Scanner inputStream = new Scanner(new FileInputStream("Q4.txt"));
            
            while (inputStream.hasNextLine()) {
                double sum = 0;
                String temp = inputStream.nextLine();
                String[] array = temp.split(",");
                name = array[0];
                System.out.print(name + " score ");
                double[] sumarray = new double[5];
                for (int i = 0; i < array.length - 2; i++) {
                   sumarray[i] = Double.parseDouble(array[i + 1]);
                }
                
                for (int i = 0; i < sumarray.length - 1; i++) {
                    for (int j = 0; j < sumarray.length - i - 1; j++) {
                        if (sumarray[j] > sumarray[j + 1]) {
                            double temp2 = sumarray[j + 1];
                            sumarray[j + 1] = sumarray[j];
                            sumarray[j] = temp2;
                        }
                    }
                }
                
                for (int i = 1; i < sumarray.length - 1; i++) {
                    sum += sumarray[i];
                }
                score = sum * Integer.parseInt(array[6]);
                
                if (score > highscore){
                    highname = name;
                    highscore = score;
                }
                System.out.println(score);
            }
            System.out.println(highname + " is the winner");
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
