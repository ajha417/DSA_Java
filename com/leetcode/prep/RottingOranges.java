package com.leetcode.prep;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        // 0 denotes empty cell
        // 1 denotes fresh orange
        // 2 denotes rotten orange
        int findNoOfMinutesToRotAllOranges = orangeRotting(grid);
        System.out.println(findNoOfMinutesToRotAllOranges);
    }
    private static int orangeRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int count_fresh = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if(grid[i][j] == 1) count_fresh++;
            }
        }
        if(count_fresh == 0) return 0;
        int count = 0;
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while(!q.isEmpty()) {
            count++;
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int[] pos = q.poll();
                for(int[] dir: dirs) {
                    int x = pos[0] + dir[0];
                    int y = pos[1] + dir[1];
                    if(x < 0 || y < 0 || x >= grid.length || y >= m || grid[x][y] == 0 || grid[x][y] == 2) continue;
                    grid[x][y] = 2;
                    q.offer(new int[]{x, y});
                    count_fresh--;
                }
            }
        }
        return count_fresh == 0 ? count - 1: -1;
    }
}
