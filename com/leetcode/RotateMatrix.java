package com.leetcode;

public class RotateMatrix {
    public static void main(String[] args) {
        // rotate matrix by 90

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("before rotation:");
        for(int[] row: matrix) {
            for(int val: row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        rotate(matrix);

        System.out.println("after rotation:");

        for(int[] row: matrix) {
            for(int val: row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        // first transpose the matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//        after transpose
        // 1 4 7
        // 2 5 8
        // 3 6 9

        // then flip the matrix
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }
}
