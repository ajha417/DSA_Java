package pattern_programming;

public class Hollow_Pyramid {
    public static void main(String[] args) {
        int  rows = 5;
        int cols = 9;
        int k = 1;
        for(int i = 1; i <= rows; i++){
            k = 1;
            for(int j = 1; j <= cols; j++){
                if(j >= 6-i && j <= 4+i && k==1){
                    System.out.print("*");
                    k = 0;
                }
                else{
                    System.out.print(" ");
                    k = 1;
                }
            }
            System.out.println();
        }
    }
}
