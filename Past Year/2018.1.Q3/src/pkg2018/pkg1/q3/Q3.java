
package pkg2018.pkg1.q3;

import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size = Integer.parseInt(input.nextLine());
        System.out.print("Enter font type: ");
        char type = input.nextLine().charAt(0);
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = Integer.parseInt(input.nextLine());
        display(size,type,format);
    }
    
    public static void display(int size, char type, int format) {
        String length = "";
        String space = "";
        if (format == 1) {
            for (int i = 0; i < size + 2; i++) {
                length += type;
            }
            System.out.println(length);
            for (int i = 0; i < size; i++) {
                space += " ";
            }
            for (int i = 0; i < size; i++) {
                System.out.println(type + space + type);
            }
            System.out.println(length);
            for (int i = 0; i < size; i++) {
                System.out.println(type + space + type);
            }
            System.out.println(length);
        }
        
        if (format == 2) {
            for (int i = 0; i < size * 2 + 3; i++) {
                length += type;
            }
            System.out.println(length);
            for (int i = 0; i < size; i++) {
                space += " ";
            }
            for (int i = 0; i < size; i++) {
                System.out.println(type + space + type + space + type);
            }
            System.out.println(length);
            
        }
        
    }

}
