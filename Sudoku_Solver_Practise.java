public class Sudoku_Solver_Practise {
    /*static int N=9;
    public static boolean isSafe3(int board[][],int row,int col,int num){
        //now check for row
        for(int i=0;i<N;i++){
            if(board[row][i]==num)
                return false;
        }
        //now check for column
        for(int i=0;i<N;i++){
            if(board[i][col]==num)
                return false;
        }
        //now check for sub-grid
        int startRow=row-row%3,startCol = col-col%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i+startRow][j+startCol]==num)
                    return false;
            }
        }

        return true;
    }
    public static boolean solveSudoku3(int board[][],int row,int col){
        if(row==N-1 && col==N)
            return true;
        if(col==N)
        {
            row++;
            col=0;
        }
        //now check if there is element or not
        if(board[row][col]!=0){
            return solveSudoku3(board,row,col+1);
        }
        for(int num=1;num<=N;num++){
            if(isSafe3(board,row,col,num)){
                board[row][col]=num;
                if(solveSudoku3(board,row,col+1)){
                    return true;
                }
            }
            board[row][col]=0; //this is for backtracking
        }
        return false;
    }
    public static void printSolution3(int board[][]){
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }*/
    public static boolean isSafe3(int [][]board,int row,int col,int num){
        for(int i=0;i< board.length;i++){
            if(board[row][i]==num)
                return false;
        }

        for(int j=0;j< board.length;j++){
            if(board[j][col]==num)
                return false;
        }
        int sqrt = 3;
        int startRow = row-row%sqrt;
        int startCol = col-col%sqrt;
        for(int i=startRow;i<startRow+sqrt;i++){
            for(int j=startCol;j<startCol+sqrt;j++){
                if(board[i][j]==num)
                    return false;

            }
        }
        return true;
    }
    public static boolean solveSudoku3(int [][]board,int n){
        int row=-1;
        int col=-1;
        boolean isEmpty = true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
                if(!isEmpty){
                    break;
                }
            }
        }
        if(isEmpty)
            return true;
        for(int num=1;num<=n;num++){
            if(isSafe3(board,row,col,num)){
                board[row][col]=num;
                if(solveSudoku3(board,n)){
                    return true;
                }
            }
            board[row][col]=0;  //this is for back-tracking

        }
        return false;
    }
    public static void printSolution3(int board[][]){
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int board[][]=new int[][]{
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        int N= board.length;
        if(solveSudoku3(board, N))
            printSolution3(board);
        else
            System.out.println("Solution doesn't exist");

    }
}
