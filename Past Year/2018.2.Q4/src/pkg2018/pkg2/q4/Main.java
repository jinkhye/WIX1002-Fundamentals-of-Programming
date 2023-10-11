package pkg2018.pkg2.q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values for a, b, c, d, e and f: ");
        String values = input.nextLine();
        String[] array = values.split(" ");
        int a,b,c,d,e,f;
        a = Integer.parseInt(array[0]);
        b = Integer.parseInt(array[1]);
        c = Integer.parseInt(array[2]);
        d = Integer.parseInt(array[3]);
        e = Integer.parseInt(array[4]);
        f = Integer.parseInt(array[5]);
        
        LinearEquation LinearEquation = new LinearEquation(a, b, c, d, e, f);
        System.out.println(LinearEquation);
    }
}