
package pkg2016.pkg2.q5;


public class Q5 {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 2);
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] + array[i][1] + array[i][2] == 3) {
                System.out.println("All 1s on row " + i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[0][i] + array[1][i] + array[2][i] == 3) {
                System.out.println("All 1s on column " + i);
            }
        }
        
        if (array[0][0] + array[1][1] + array[2][2] == 3) {
            System.out.println("All 1s on diagonal");
        }
        if (array[0][2] + array[1][1] + array[2][0] == 3) {
            System.out.println("All 1s on diagonal");
        }
    }

}
