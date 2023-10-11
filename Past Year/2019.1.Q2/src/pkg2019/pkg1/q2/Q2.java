
package pkg2019.pkg1.q2;

import java.util.Arrays;
import java.util.Scanner;


public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = input.nextInt();
        int[][] matrix1 = generateMatrix(N);
        int[][] matrix2 = generateMatrix(N);
        System.out.println("Display matrix: ");
        System.out.println("Matrix 1: ");
        displayMatrix(matrix1);
        System.out.println("Matrix 2: ");
        displayMatrix(matrix2);
        System.out.println("Addition of matrix 1 and matrix 2: ");
        displayMatrix(addMatrix(matrix1, matrix2));
        System.out.println("Multiplication of matrix 1 and matrix 2: ");
        displayMatrix(multiMatrix(matrix1,matrix2));
    }
    
    public static int[][] generateMatrix(int N) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][]addMatrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return addMatrix;
    }
    
    public static int[][] multiMatrix(int[][] matrix1, int[][] matrix2) {
        int[][]multiMatrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    multiMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multiMatrix;
    }

}
