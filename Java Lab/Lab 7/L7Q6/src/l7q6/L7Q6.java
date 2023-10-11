
package l7q6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class L7Q6 {

    public static void main(String[] args) {
        int[] countarray = count();
        int[] IndexArray = new int[countarray[0]];
        for (int i = 0; i < IndexArray.length; i++) {
            IndexArray[i] = i;
        }
        
        try {
            Scanner inputStream2 = new Scanner(new FileInputStream("product.txt"));
            Scanner inputStream3 = new Scanner(new FileInputStream("order.txt"));
            
            String[] ProductID = new String[countarray[0]];
            String[] ProductName = new String[countarray[0]];
            String[] ProductPrice = new String[countarray[0]];
            
            String[] OrderID = new String[countarray[1]];
            String[] ProductID2 = new String[countarray[1]];
            String[] OrderQuantity = new String[countarray[1]];
            
            int i = 0;
            while (inputStream2.hasNextLine()) {
                String temp = inputStream2.nextLine();
                String[] temparray = temp.split(",");
                ProductID[i] = temparray[0];
                ProductName[i] = temparray[1];
                ProductPrice[i] = temparray[2];
                i++;
            }
            
            int j = 0;
            while (inputStream3.hasNextLine()) {
                String temp2 = inputStream3.nextLine();
                String[] temparray2 = temp2.split(",");
                OrderID[j] = temparray2[0];
                ProductID2[j] = temparray2[1];
                OrderQuantity[j] = temparray2[2];
                j++;
            }
            System.out.printf("%-16s %-15s %-15s %-18s %s%n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
            for (int k = 0; k < ProductID2.length; k++) {
                for (int l = 0; l < ProductID.length; l++) {
                   if(ProductID2[k].equals(ProductID[l])) {
                       double total = Double.parseDouble(OrderQuantity[k]) * Double.parseDouble(ProductPrice[l]);
                       System.out.printf("%-9s %-25s %-18s %-9s %8.2f%n" ,ProductID[l], ProductName[l], OrderQuantity[k], ProductPrice[l], total);
                   }
                }
                
            }
            inputStream2.close();
            inputStream3.close();
            } catch (IOException e) {
                System.out.println("Error");
        }
    }
    
    static int[] count() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("product.txt"));
            Scanner inputStream4 = new Scanner(new FileInputStream("order.txt"));
            
            int[] countarray = new int[2];
            while (inputStream.hasNextLine()) {
                inputStream.nextLine();
                countarray[0]++;
            }
            
            while (inputStream4.hasNextLine()) {
                inputStream4.nextLine();
                countarray[1]++;
            }
            return countarray;
            
        } catch (IOException e) {
            System.out.println("Erorr");
        }
        return null;
    }
}
