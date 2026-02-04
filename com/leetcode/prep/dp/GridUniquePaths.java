package com.leetcode.prep.dp;

import java.util.Arrays;

public class GridUniquePaths {
    public static void main(String[] args) {
        // Its like rat maze problem
        // where the rat can either move down or right
        // need to return the number of ways the rat can reach the end of the grid
        int m = 3, n = 7;
        int noOfWays = uniquePaths(m, n);
        System.out.println(noOfWays);
    }

    private static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row: dp) Arrays.fill(row, -1);
        return uniquePathHelper(m - 1, n - 1, dp);
    }

    private static int uniquePathHelper(int i, int j, int[][] dp) {
        if(i < 0 || j < 0) return 0;
        if(i == 0 || j == 0) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = uniquePathHelper(i - 1, j, dp) + uniquePathHelper(i, j - 1, dp);
    }
}
