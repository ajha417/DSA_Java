public class Sudoku_Solver1 {
    static int N=9;
    public static boolean solveSudoku(int [][]grid,int row,int col){
        //check if row has  reached its last row
        if(row==N-1 && col==N)
            return true;
        //if col has reached its final limit then increase row and make column 0 to start again
        if(col==N)
        {
            row++;
            col=0;
        }
        if(grid[row][col]!=0)//here we are checking if the current position is already filled with number or not
            //if it is already filled we will check for the next column
            return solveSudoku(grid,row,col+1);

        for(int num=1;num<10;num++){
            if(isSafe(grid,row,col,num)){
                grid[row][col]=num;
                if(solveSudoku(grid,row,col+1)){
                    return true;
                }
            }
            //for backtracking
            grid[row][col]=0;
        }
        return false;
    }
    public static boolean isSafe(int[][]grid,int row,int col,int num){
        //to check whether the number is present in that row or not
        for(int i=0;i<N;i++){
            if(grid[row][i]==num)
                return false;
        }

        //to check whether the number is present in that column or not
        for(int i=0;i<N;i++){
            if(grid[i][col]==num)
                return false;
        }

        //now we have to check whether the number is present in the sub-grid of 3 by 3 matrix or not
        int startRow = row-row%3,startCol=col-col%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i+startRow][j+startCol]==num)
                    return false;
            }
        }
        return true;
    }
    public static void printSolution(int [][]grid){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(" "+grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //The time complexity of this method is much greater which is nearly equals to O(9^(n*n))
        // so we use another method for solving this problem
        int grid[][]={
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
        if(solveSudoku(grid,0,0)){
            printSolution(grid);
        }
        else{
            System.out.println("Solution doesn't exits");
        }

    }

}
