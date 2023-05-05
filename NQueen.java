package com.company;

public class NQueen
{
    final int N=4;
    void printSolution(int board[][]){
        int i,j;
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }
     boolean isSafe(int board[][],int row,int col){
        int i,j;
        for(i=0;i<col;i++)   //check this row on left side
            if(board[row][i]==1)
                return false;
        for(i=row,j=col;i>=0&&j>=0;i--,j--)  //this is left upper diagonal
            if(board[i][j]==1)
                return false;
        for(i=row,j=col;j>=0 && i<N;i++,j--) //this is for left lower dialgonal
            if(board[i][j]==1)
                return false;

        return true;
     }

    boolean solveNQutil(int board[][],int col){
        if(col>=N)
            return true;
        for(int row=0;row<N;row++){
            if(isSafe(board,row,col)) {
                board[row][col] = 1;
                if (solveNQutil(board, col + 1) == true)
                    return true;
                else
                    board[row][col] = 0;



            }

        }
        return false;

//        return false;
    }
    boolean solveNQ(){
        int board[][]={
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };

    if(solveNQutil(board,0)==false){
        System.out.println("Solution doesn't exist");
    }
        printSolution(board);
        return true;
    }

    public static void main(String[] args) {
        NQueen queen = new NQueen();
        queen.solveNQ();

    }
}
