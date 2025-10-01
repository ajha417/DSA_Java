
public class Knight_Problem {
    static int N=8;
    static boolean isSafe(int x,int y,int [][]sol){
        return (x>=0 && x<N && y>=0 && y<N && sol[x][y]==-1);
    }

    static void printsolution(int [][]sol){
            for(int i=0;i<N;i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(" "+sol[i][j]+" ");
                }
                System.out.println();
            }

    }

    static boolean solveKT(){
        int sol[][]=new int[8][8];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                sol[i][j]=-1;
        }
        sol[0][0]=0;
        int xMove[]={2,1,-1,-2,-2,-1,1,2};
        int yMove[]={1,2,2,1,-1,-2,-2,-1};
        if(!(solveKTUtil(0,0,1,sol,xMove,yMove))){
            System.out.println("Solution doesn't exist");
            return false;
        }
        else
            printsolution(sol);
        return true;

    }
    static boolean solveKTUtil(int i,int j,int move,int [][]sol,int []xMove,int []yMove){
        int k,next_x,next_y;
        if(move==N*N)
            return true;
        for(k=0;k<N;k++){
            next_x = i+ xMove[k];
            next_y = j + yMove[k];
            if(isSafe(next_x,next_y,sol)){
                sol[next_x][next_y]=move;
                if(solveKTUtil(next_x,next_y,move+1,sol,xMove,yMove)){
                    return true;
                }
                else
                    sol[next_x][next_y]=-1;
            }

        }
        return false;
    }
    public static void main(String[] args) {
            solveKT();
    }
}
