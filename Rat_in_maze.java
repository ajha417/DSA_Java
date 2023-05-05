package com.company;

import java.util.Scanner;

public class Rat_in_maze {
    static void printsolution(int [][]sol,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int [][]maze,int x,int y,int n){
        if(x<n  && y<n && maze[x][y]==1){
            return true;
        }
        return false;
    }
    public static boolean MazeSolve(int [][]maze,int x,int y,int [][]sol,int n){
        if(MazeSolveUtil(maze,x,y,sol,n)==false){
            System.out.println("Solution doesn't exist");
            return false;
        }
        printsolution(sol,n);
        return true;
    }
    public static boolean MazeSolveUtil(int maze[][],int x,int y,int sol[][],int n){
        if((x==n-1) && (y==n-1) ){
            return true;
        }
        if(isSafe(maze,x,y,n)){
            sol[x][y]=1;
            if(MazeSolveUtil(maze,x+1,y,sol,n)){
                return true;
            }
            if ((MazeSolveUtil(maze,x,y+1,sol,n))){
                return true;}
            sol[x][y]=0;return false;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maze[][] ={
                {1,0,1,0,1},
                {1,1,1,1,1},
                {0,1,0,1,0},
                {1,0,0,1,1},
                {1,1,1,0,1}
        };
        int n=5;
        int sol[][]=new int[5][5];
        for(int i=0;i< sol.length;i++) {
            for (int j = 0; j < sol.length; j++) {
                sol[i][j] = 0;
            }

        }
        MazeSolve(maze,0,0,sol,n);
    }
}
