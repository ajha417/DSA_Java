import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n3;
        System.out.println("Enter the term:");
        int term=sc.nextInt();
        for(int i=0;i<term;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
