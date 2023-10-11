
package lab.test;

import java.util.Arrays;

public class LabTest {

    public static void main(String[] args) {

         String [] regno = { "s12345", "s24567","s23789", "s14569", "s18743"};
         String [] name = {"Ali", "Beng", "Carmen", "Dinesh", "Emilia"};
         double [] marks = {10, 20, 30, 40, 50};

         System.out.println("Original data:");

         System.out.print("Reg No.\t\t");
         System.out.print("Name\t\t");
         System.out.print("FOP Marks\t\t");
         System.out.print("\n+-----------------------------------------+");

        for (int i = 0; i < 5; i++) {
            System.out.print("\n" + regno[i] + "\t\t" + name[i] + "\t\t" + marks[i]);
        }

        //sort by id
        System.out.print("\n\nSorted by id (ascending):");
        System.out.print("\nReg No.\t\t");
        System.out.print("Name\t\t");
        System.out.print("FOP Marks\t\t");
        System.out.print("\n+-----------------------------------------+");


        
            int n = regno.length;
            for (int i = 0; i < n - 1; i++){
                for (int j = 0; j < n - i - 1; j++){
                    if (regno[j].compareTo(regno[j + 1])>0) {
                        // swap arr[j+1] and arr[j]
                        String tempid = regno[j];
                        regno[j] = regno[j + 1];
                        regno[j + 1] = tempid;

                        String tempname = name[j];
                        name[j] = name[j + 1];
                        name[j + 1] = tempname;

                        double tempmark = marks[j];
                        marks[j] = marks[j + 1];
                        marks[j + 1] = tempmark;
                    }
                }
            }
        

        for (int i = 0; i < 5; i++) {
            System.out.print("\n" + regno[i] + "\t\t" + name[i] + "\t\t" + marks[i]);
        }



         //sort by name
         System.out.print("\n\nSorted by name (ascending):");
         System.out.print("\nReg No.\t\t");
         System.out.print("Name\t\t");
         System.out.print("FOP Marks\t\t");
         System.out.print("\n+-----------------------------------------+");
 
 
         
             for (int i = 0; i < n - 1; i++){
                 for (int j = 0; j < n - i - 1; j++){
                     if (name[j].compareTo(name[j + 1])>0) {
                         // swap arr[j+1] and arr[j]
                         String tempid = regno[j];
                         regno[j] = regno[j + 1];
                         regno[j + 1] = tempid;
 
                         String tempname = name[j];
                         name[j] = name[j + 1];
                         name[j + 1] = tempname;
 
                         double tempmark = marks[j];
                         marks[j] = marks[j + 1];
                         marks[j + 1] = tempmark;
                     }
                 }
             }
         
 
         for (int i = 0; i < 5; i++) {
             System.out.print("\n" + regno[i] + "\t\t" + name[i] + "\t\t" + marks[i]);
         }




          //sort by marks
        System.out.print("\n\nSorted by marks (descending):");
        System.out.print("\nReg No.\t\t");
        System.out.print("Name\t\t");
        System.out.print("FOP Marks\t\t");
        System.out.print("\n+-----------------------------------------+");


        
            n = regno.length;
            for (int i = 0; i < n - 1; i++){
                for (int j = 0; j < n - i - 1; j++){
                    if (marks[j] < marks [j+1]) {
                        // swap arr[j+1] and arr[j]
                        String tempid = regno[j];
                        regno[j] = regno[j + 1];
                        regno[j + 1] = tempid;

                        String tempname = name[j];
                        name[j] = name[j + 1];
                        name[j + 1] = tempname;

                        double tempmark = marks[j];
                        marks[j] = marks[j + 1];
                        marks[j + 1] = tempmark;
                    }
                }
            }
        

        for (int i = 0; i < 5; i++) {
            System.out.print("\n" + regno[i] + "\t\t" + name[i] + "\t\t" + marks[i]);
        }
    
        System.out.println("");
    }
}