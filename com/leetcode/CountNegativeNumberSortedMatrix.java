package com.leetcode;

public class CountNegativeNumberSortedMatrix {
    public static void main(String[] args) {
        /*
        *
        *  Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.



            Example 1:

            Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
            Output: 8
            Explanation: There are 8 negatives number in the matrix.
            Example 2:

            Input: grid = [[3,2],[1,0]]
            Output: 0
        *
        * */

        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count = countNegatives(grid);
        System.out.println("Count of negative numbers in matrix is: " + count);
    }

    private static int countNegatives(int[][] grid) {
        //     int count = 0;
        //     for(int i  = 0; i < grid.length; i++) {
        //         for(int j = grid[0].length - 1; j >= 0; j--) {
        //             if(grid[i][j] >= 0) break;
        //             count++;
        //         }
        //     }
        //     return count;

        // optimized solution
        int m = grid.length, n = grid[0].length, r = m - 1, c = 0, cnt = 0;
        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                --r;
                cnt += n - c; // there are n - c negative numbers in current row.
            }else {
                ++c;
            }
        }
        return cnt;
    }
}
