package com.leetcode;

public class MaxMatrixSum {
    public static void main(String[] args) {
//        You are given an n x n integer matrix. You can do the following operation any number of times:
//
//        Choose any two adjacent elements of matrix and multiply each of them by -1.
//        Two elements are considered adjacent if and only if they share a border.
//
//        Your goal is to maximize the summation of the matrix's elements. Return the maximum sum of the matrix's elements using the operation mentioned above.

        int[][] matrix = new int[][]{{1, -1}, {-1, 1}};
        long sum = maxMatrixSum(matrix);
        System.out.println("The sum is: " + sum);
    }

    public static long maxMatrixSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        long sum = 0;
        int negCount = 0;
        for(int[] row: matrix) {
            for(int val: row) {
                sum += Math.abs(val);
                if(val < 0) negCount++;
                min = Math.min(min, Math.abs(val));
            }
        }

        if(negCount % 2 != 0) {
            sum -= 2L * min;
        }
        return sum;
    }
}
