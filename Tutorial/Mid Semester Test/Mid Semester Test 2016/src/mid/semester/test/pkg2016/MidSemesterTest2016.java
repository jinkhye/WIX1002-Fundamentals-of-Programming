
package mid.semester.test.pkg2016;

import java.util.Scanner;


public class MidSemesterTest2016 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nine digit integer : ");
        String number = input.next();
        String ISBN = number.substring(0, 1) + "-" + number.substring(1, 4) + "-" + number.substring(4) + "-";
        int sum = 0;
        int j = 0;
        int k = 1;
        
        
        for (int i = 1; i < number.length() + 1; i++) {
            sum += Integer.parseInt(number.substring(j, k)) * i;
            j++;
            k++;
        }
        
        int checksum = sum % 11;
        if (checksum == 10) {
            System.out.println("10-digit ISBN : " + ISBN + "X");
        }
        else {
        System.out.println("10-digit ISBN : " + ISBN + Integer.toString(checksum));
        }
    }

}
