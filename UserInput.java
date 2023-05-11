import java.io.InputStreamReader;
import java.io.BufferedReader;

public class UserInput {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter a number:");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(is);
        int n = Integer.parseInt(br.readLine());
        System.out.println("The number you have entered is "+n);


    }
}
