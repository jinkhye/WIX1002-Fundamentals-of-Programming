
package javaapplication162;

import java.util.Arrays;


public class JavaApplication162 {
    
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int[][] matrix2 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        
        int[][] matrixadd = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i].length; k++) {
                    matrixadd[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println(Arrays.deepToString(matrixadd));
    }
    
}
