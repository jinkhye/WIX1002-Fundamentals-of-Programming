
package l5q4;


public class L5Q4 {

    public static void main(String[] args) {
        int unsorted[][] = { { 1, 5, 7 },
                             { 3, 6, 9 },
                             { 5, 3, 8 }};
        int[][] sorted = new int[3][3];
        
        //Transpose matrix
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted[i].length; j++) {
                sorted[j][i] = unsorted[i][j];
            }
        }
        
        //Swap first and last column
        for (int i = 0; i < 3; i++) {
            int temp = sorted[i][0];
            sorted[i][0] = sorted[i][2];
            sorted[i][2] = temp;
        }
        
        //Print Matrix
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted[i].length; j++) {
                System.out.print(unsorted[i][j] + "  ");
            }
            System.out.println();
        }
        
        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted[i].length; j++) {
                System.out.print(sorted[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
