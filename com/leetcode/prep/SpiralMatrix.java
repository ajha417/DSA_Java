package com.leetcode.prep;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }

    private static List<Integer> spiralOrder(int[][] ans) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int topWall = 0;
        int m = ans.length;
        int n = ans[0].length;
        int rightWall = n - 1;
        int bottomWall = m - 1;
        int leftWall = 0;

        while (topWall <= bottomWall && leftWall <= rightWall) {
            // Right: left to right along topWall
            for (int col = leftWall; col <= rightWall; col++) {
                list.add(ans[topWall][col]);
            }
            topWall++;

            // Down: top to bottom along rightWall
            for (int row = topWall; row <= bottomWall; row++) {
                list.add(ans[row][rightWall]);
            }
            rightWall--;

            // Left: right to left along bottomWall (if still valid)
            if (topWall <= bottomWall) {
                for (int col = rightWall; col >= leftWall; col--) {
                    list.add(ans[bottomWall][col]);
                }
                bottomWall--;
            }

            // Up: bottom to top along leftWall (if still valid)
            if (leftWall <= rightWall) {
                for (int row = bottomWall; row >= topWall; row--) {
                    list.add(ans[row][leftWall]);
                }
                leftWall++;
            }
        }
        return list;
    }
}
