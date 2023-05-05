import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern");
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                if(i%2==0 && j%2==0){
                    System.out.print("*");
                }
                if(i%2==0&&j%2==1){
                    System.out.print("--");
                }

                if(i%2==1&&j%2==1){
                    System.out.print("  ");
                }
                if(i%2==1 && j%2==0){
                    System.out.print("|");
                }

            }
            System.out.println();
        }
    }
}
