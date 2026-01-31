package com.leetcode.prep;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};

        gameOfLife(board);
        for(int[] row: board) {
            for(int val: row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[][] answer = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 1 && (countLives(board, i, j) < 2 || countLives(board, i, j) > 3)) {
                    answer[i][j] = 0;
                } else if (board[i][j] == 1 && (countLives(board, i, j) == 2 || countLives(board, i, j) ==3) ) {
                    answer[i][j] = 1;
                } else if (board[i][j] == 0 && countLives(board, i, j) == 3) {
                    answer[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                board[i][j] = answer[i][j];
            }
        }
    }

    private static int countLives(int[][] board, int i, int j) {
        int dirs[][] = {{0,-1}, {0,1}, {1, 0}, {-1, 0}, {1,1}, {-1,-1},{1, -1} , {-1, 1}};
        int count = 0;
        for(int[] dir: dirs) {
            int x = dir[0] + i;
            int y = dir[1] + j;
            if(x >= 0 && y >= 0 && x < board.length && y < board[0].length) {
                count += board[x][y];
            }
        }
        return count;
    }
}
