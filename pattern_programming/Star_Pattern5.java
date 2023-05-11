package pattern_programming;

public class Star_Pattern5 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 9;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(j <= 6-i || j >= 4+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
