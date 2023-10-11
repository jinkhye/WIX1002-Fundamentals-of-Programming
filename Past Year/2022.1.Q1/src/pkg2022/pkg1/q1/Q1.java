package pkg2022.pkg1.q1;

import java.util.Random;

public class Q1 {

    public static void main(String[] args) {
        Random random = new Random();
        double[] array = new double[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(201)  + 100;
        }
        System.out.printf("3 random price values : %.2f %.2f %.2f%n", array[0], array[1], array[2]);
        
        int[] even = new int[5];
        for (int i = 0; i < even.length; i++) {
            int num = random.nextInt(41) + 1990;
            while (num % 2 != 0) {
                num = random.nextInt(41) + 1990;
            }
            even[i] = num;
        }
        System.out.printf("5 random even-numbered years : %d %d %d %d %d%n", even[0], even[1], even[2], even[3], even[4]);
        
        int plate = (int)(Math.random() * 90000 + 10000);
        String platecharacters = "";
        int a = random.nextInt(57) + 65;
        while (a > 90 && a < 97) {
            a = random.nextInt(57) + 65;
        }
        int b = random.nextInt(57) + 65;
        while (b > 90 && b < 97) {
            b = random.nextInt(57) + 65;
        }
        platecharacters += (char)a;
        platecharacters += (char)b;
        //65 - 90 97 - 122
        
        System.out.println("Car Plate Number : " + plate + platecharacters);
        
        String[] word = new String[8];
        for (int i = 0; i < word.length; i++) {
            word[i] = "";
            int c = random.nextInt(57) + 65;
            while (c > 90 && c < 97) {
                c = random.nextInt(57) + 65;
            }
            word[i] += (char)c;
        }
        String result = "";
        for (int i = 0; i < word.length; i++) {
            result += word[i];
        }
        System.out.println("Random Word : " + result);
    }
}