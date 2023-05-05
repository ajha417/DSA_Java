public class Sudoku_Solver2 {

    public static boolean isSafe1(int [][]board,int row,int col,int num){
        //check if the number is present in particular row or not
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num)
                return false;
        }

        //check if the number is present in that column or not
        for(int i=0;i< board.length;i++){
            if(board[i][col]==num)
                return false;

        }
        int startRow = row-row%3;
        int startCol = col-col%3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++)
            {
                if(board[i][j]==num)
                    return false;
            }
        }
        return true;
    }
    public static boolean solveSudoku1(int board[][],int n){
        int row=-1;
        int col=-1;
        boolean isEmpty = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    isEmpty=false;
                    break;
                }
                if(!isEmpty) {
                    break;
                }
            }
        }
        if(isEmpty){
            return  true;
        }
        for(int num=1;num<=n;num++){
            if(isSafe1(board,row,col,num)){
                board[row][col]=num;
                if(solveSudoku1(board,n)){
                    return true;
                }
                else{
                    board[row][col]=0;

                }
            }
        }
        return false;
    }
    public static void printSolution1(int board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] =  new int[][] {
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
        if(solveSudoku1(board,N)){
            printSolution1(board);
        }
        else{
            System.out.println("Solution doesn't exists");
        }
    }
}
