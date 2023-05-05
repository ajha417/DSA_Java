import java.util.Scanner;
public class Newton2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        long A = sc.nextLong();
        System.out.println("Enter the value of B:");
        long B = sc.nextLong();
        long X = A;
        long Y = B;
        int count = 0;
        while(true){
            if(X==Y){
                break;
            }
            if(X%Y==0){
                X=Y;
                count++;
            }
            if(Y%X==0){
                Y=X;
                count++;
            }

            if(X<Y){
                X++;
                count++;
            }
            if(Y<X){
                Y++;
                count++;
            }
        }
        System.out.println(count);

    }
}
