public class KnightTourProblem {
    static int N=8;
    public static void main(String[] args) {

    }
    static boolean solveKT(){
        int board[][] = new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                board[i][j]=-1;
        int xMove[]={2,1,-1,-2,-2,-1,1,2};
        int yMove[]={1,2,2,1,-1,-2,-2,-1};
        if(!solveKTUtil(0,0,1,board,xMove,yMove)){
            System.out.println("solution doesn't exist");
            return false;
        }
//        printSolution(board);
        return true;

    }
    static boolean solveKTUtil(int x,int y,int move,int board[][],int xmove[],int ymove[]){
        int k,next_x,next_y;
        for( k=0;k<N;k++){
            x = x+xmove[k];
            y = y+ymove[k];

        }
        return true;
    }

}
