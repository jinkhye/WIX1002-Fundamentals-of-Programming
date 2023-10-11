package pkg2020.pkg1.q2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        System.out.println("Enter Location 1");
        String[][] direction1 = request();
        double[] location1 = convert(direction1);
        System.out.println("Enter Location 2");
        String[][] direction2 = request();
        double[] location2 = convert(direction2);
        System.out.printf("Location 1 : %.6f Latitude , %.6f Longitude%n", location1[0], location1[1]);
        System.out.printf("Location 2 : %.6f Latitude , %.6f Longitude%n", location2[0], location2[1]);
        System.out.printf("Distance : %.2f KM%n", distance(location1, location2));
    }
    
    public static String[][] request() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Direction: [N, S, E, W]: ");
        String direction1 = input.nextLine();
        System.out.print("Enter Degree, Minute and Second : ");
        direction1 += " " + input.nextLine();
        String[] array = direction1.split(" ");
        System.out.print("Enter Direction: [N, S, E, W]: ");
        String direction2 = input.nextLine();
        System.out.print("Enter Degree, Minute and Second : ");
        direction2 += " " + input.nextLine();
        String[] array2 = direction2.split(" ");
        
        String[][] multiarray = {array, array2};
        return multiarray;
    }
    
    public static double[] convert(String[][] array) {
        int sign = 1;
        if (array[0][0].equals("S")) sign = -1;
        double latitude = sign * (Double.parseDouble(array[0][1]) + ((Double.parseDouble(array[0][2]) * 60 + Double.parseDouble(array[0][3])) / 3600));
        sign = 1;
        if (array[1][0].equals("W")) sign = -1;
        double longitude = sign * (Double.parseDouble(array[1][1]) + ((Double.parseDouble(array[1][2]) * 60 + Double.parseDouble(array[1][3])) / 3600));
        
        double[] convert = {latitude, longitude};
        return convert;
    }
    
    public static double distance(double[] direction1, double[] direction2) {
        double la1 = Math.toRadians(direction1[0]);
        double long1 = Math.toRadians(direction1[1]);
        double la2 = Math.toRadians(direction2[0]);
        double long2 = Math.toRadians(direction2[1]);
        
        double a = Math.sin((la1-la2)/2) * Math.sin((la1-la2)/2) + Math.cos(la1) 
                * Math.cos(la2) * Math.sin((long1-long2)/2) * Math.sin((long1-long2)/2);        
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt((1 - a)));
        double d = 6371 * c;
        return d;
    }
}